open Types
open Csv

(* Fonction auxiliaire pour charger un fichier CSV en une liste de listes de chaînes *)
let load_csv file_path =
  Csv.load file_path

(* Fonction auxiliaire pour sauvegarder une liste de listes de chaînes dans un fichier CSV *)
let save_csv file_path data =
  Csv.save file_path data

(* Chemins des fichiers CSV *)
let contrats_file = "../bd/contrats.csv"
let produits_file = "../bd/produits.csv"
let fournisseurs_file = "../bd/fournisseurs.csv"

(* Fonction pour lister tous les contrats *)
let list_contrats () =
  let rows = load_csv contrats_file in
  List.iter (fun row -> print_endline (String.concat ", " row)) rows

(* Fonction pour lister tous les produits *)
let list_produits () =
  let rows = load_csv produits_file in
  List.iter (fun row -> print_endline (String.concat ", " row)) rows

(* Fonction pour lister tous les fournisseurs *)
let list_fournisseurs () =
  let rows = load_csv fournisseurs_file in
  List.iter (fun row -> print_endline (String.concat ", " row)) rows

(* Fonction pour filtrer et supprimer les lignes contenant un mot-clé *)
let filter_and_delete file_path keyword =
  let rows = load_csv file_path in
  let filtered_rows = List.filter (fun row -> not (List.exists ((=) keyword) row)) rows in
  save_csv file_path filtered_rows

(* Fonction pour supprimer des contrats en fonction d’un mot-clé *)
let delete_contrats keyword =
  filter_and_delete contrats_file keyword

(* Fonction pour supprimer des produits en fonction d’un mot-clé *)
let delete_produits keyword =
  filter_and_delete produits_file keyword

(* Fonction pour supprimer des fournisseurs en fonction d’un mot-clé *)
let delete_fournisseurs keyword =
  filter_and_delete fournisseurs_file keyword

(* Fonction pour sauvegarder un fournisseur *)
let save_fournisseur fournisseur =
  let row = [
    fournisseur.num_siret;
    fournisseur.nom_entreprise;
    fournisseur.adresse_mail;
    fournisseur.num_tel;
  ] in
  let rows = load_csv fournisseurs_file in
  save_csv fournisseurs_file (rows @ [row])

(* Fonction pour sauvegarder un produit *)
let save_produit produit =
  let row = match produit with
    | ProduitChimique { nom; qualite; num_ref; etat; dangereux } ->
        ["chimique"; num_ref; nom; string_of_int (Obj.magic qualite); string_of_int (Obj.magic etat); string_of_bool dangereux]
    | ProduitEmballage { nom; qualite; num_ref; matiere } ->
        ["emballage"; num_ref; nom; string_of_int (Obj.magic qualite); string_of_int (Obj.magic matiere)]
  in
  let rows = load_csv produits_file in
  save_csv produits_file (rows @ [row])

(* Fonction pour sauvegarder un contrat *)
let save_contrat contrat =
  let { fournisseur; produit; date_debut; date_fin; frequence; num_contrat } = contrat in
  (* Sauvegarder le fournisseur *)
  save_fournisseur fournisseur;
  (* Sauvegarder le produit *)
  save_produit produit;
  (* Sauvegarder le contrat *)
  let row = [
    num_contrat;
    date_debut;
    date_fin;
    fournisseur.num_tel;
    (match produit with
      | ProduitChimique { num_ref; _ } -> num_ref
      | ProduitEmballage { num_ref; _ } -> num_ref);
    string_of_int (Obj.magic frequence);
  ] in
  let rows = load_csv contrats_file in
  save_csv contrats_file (rows @ [row])
