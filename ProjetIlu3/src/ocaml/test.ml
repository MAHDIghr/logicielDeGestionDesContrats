(* ce test a ete genere par CHATGPT*)
open Types
open Utils

(* 📋 Test 1 : Ajouter un contrat *)
let test_ajouter_contrat () =
  let fournisseur = {
    nom_entreprise = "EntrepriseTest";
    num_tel = "0600000000";
    adresse_mail = "test@entreprise.com";
    num_siret = "987654321";
  } in
  let produit = ProduitChimique {
    nom = "AcideTest";
    qualite = EXCELENTE;
    num_ref = "P999";
    etat = Liquide;
    dangereux = true;
  } in
  let contrat = {
    fournisseur;
    produit;
    date_debut = "2024-01-01";
    date_fin = "2026-01-01";
    frequence = MOIS;
    num_contrat = "C999";
  } in
  save_contrat contrat;
  print_endline "✅ Contrat ajouté avec succès."

(* 📋 Test 2 : Lister les contrats *)
let test_lister_contrats () =
  print_endline "📋 Liste des contrats :";
  list_contrats ()

(* 📋 Test 3 : Supprimer un contrat *)
let test_supprimer_contrat () =
  delete_contrats "C001";
  print_endline "🗑️ Contrat supprimé avec succès."

(* 📋 Test 4 : Ajouter un produit chimique *)
let test_ajouter_produit_chimique () =
  let produit = ProduitChimique {
    nom = "NouveauProduit";
    qualite = BONNE;
    num_ref = "P888";
    etat = Solide;
    dangereux = false;
  } in
  save_produit produit;
  print_endline "✅ Produit chimique ajouté avec succès."

(* 📋 Test 5 : Ajouter un fournisseur *)
let test_ajouter_fournisseur () =
  let fournisseur = {
    nom_entreprise = "FournisseurTest";
    num_tel = "0700000000";
    adresse_mail = "fournisseur@test.com";
    num_siret = "1122334455";
  } in
  save_fournisseur fournisseur;
  print_endline "✅ Fournisseur ajouté avec succès."

(* 📋 Test 6 : Lister les produits *)
let test_lister_produits () =
  print_endline "📋 Liste des produits :";
  list_produits ()

(* 📋 Test 7 : Lister les fournisseurs *)
let test_lister_fournisseurs () =
  print_endline "📋 Liste des fournisseurs :";
  list_fournisseurs ()

(* 📋 Test 8 : Supprimer un fournisseur *)
let test_supprimer_fournisseur () =
  delete_fournisseurs "EntrepriseTest";
  print_endline "🗑️ Fournisseur supprimé avec succès."

(* 🧪 Lancer les tests *)
let () =
  print_endline "🔍 Démarrage des tests...";
  test_ajouter_contrat ();
  test_lister_contrats ();
  test_supprimer_contrat ();
  test_ajouter_produit_chimique ();
  test_lister_produits ();
  test_ajouter_fournisseur ();
  test_lister_fournisseurs ();
  test_supprimer_fournisseur ();
  print_endline "✅ Tests terminés."
