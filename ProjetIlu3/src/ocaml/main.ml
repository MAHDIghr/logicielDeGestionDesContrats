open Utils
open Types

(* Fonction principale *)
let () =
  let args = Array.to_list Sys.argv in
  match args with
  | [_; "ajouter"; "contrat"; num_contrat; date_debut; date_fin; num_tel_fournisseur; num_ref_produit] ->
      let fournisseur = { 
        nom_entreprise = ""; 
        num_tel = num_tel_fournisseur; 
        adresse_mail = ""; 
        num_siret = "" 
      } in
      let produit = ProduitChimique {
        nom = ""; 
        qualite = EXCELENTE; 
        num_ref = num_ref_produit; 
        etat = Gaz; 
        dangereux = false
      } in
      let contrat = {
        fournisseur;
        produit;
        date_debut;
        date_fin;
        frequence = ANNEE;
        num_contrat
      } in
      save_contrat contrat

  | [_; "ajouter"; "fournisseur"; num_siret; nom_entreprise; adresse_mail; num_tel] ->
      let fournisseur = { 
        num_siret; 
        nom_entreprise; 
        adresse_mail; 
        num_tel 
      } in
      save_fournisseur fournisseur

  | [_; "ajouter"; "produit"; "chimique"; num_ref; nom; qualite; etat; dangereux] ->
      let produit = ProduitChimique {
        nom; 
        qualite = (match qualite with
                   | "EXCELENTE" -> EXCELENTE
                   | "BONNE" -> BONNE
                   | "MOYENNE" -> MOYENNE
                   | "MAUVAISE" -> MAUVAISE
                   | _ -> failwith "Qualité invalide");
        num_ref;
        etat = (match etat with
                | "Gaz" -> Gaz
                | "Liquide" -> Liquide
                | "Solide" -> Solide
                | _ -> failwith "État invalide");
        dangereux = bool_of_string dangereux
      } in
      save_produit produit

  | [_; "ajouter"; "produit"; "emballage"; num_ref; nom; qualite; matiere] ->
      let produit = ProduitEmballage {
        nom; 
        qualite = (match qualite with
                   | "EXCELENTE" -> EXCELENTE
                   | "BONNE" -> BONNE
                   | "MOYENNE" -> MOYENNE
                   | "MAUVAISE" -> MAUVAISE
                   | _ -> failwith "Qualité invalide");
        num_ref;
        matiere = (match matiere with
                   | "PLASTIQUE" -> PLASTIQUE
                   | "CARTON" -> CARTON
                   | "METALE" -> METALE
                   | _ -> Autre matiere)
      } in
      save_produit produit

  | [_; "lister"; "contrats"] ->
      list_contrats ()

  | [_; "lister"; "produits"] ->
      list_produits ()

  | [_; "lister"; "fournisseurs"] ->
      list_fournisseurs ()

  | [_; "supprimer"; "contrat"; mot_cle] ->
      delete_contrats mot_cle

  | [_; "supprimer"; "produit"; mot_cle] ->
      delete_produits mot_cle

  | [_; "supprimer"; "fournisseur"; mot_cle] ->
      delete_fournisseurs mot_cle

  | _ -> ()
