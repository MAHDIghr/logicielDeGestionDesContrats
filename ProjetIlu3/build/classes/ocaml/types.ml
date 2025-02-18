type etat = Gaz | Liquide | Solide

type matiere = PLASTIQUE | CARTON | METALE | Autre of string

type niveau_qualite = EXCELENTE | BONNE | MOYENNE | MAUVAISE

type frequence = SEMAINE | MOIS | ANNEE

type produit =
  | ProduitChimique of {
      nom: string;
      qualite: niveau_qualite;
      num_ref: string;
      etat: etat;
      dangereux: bool;
    }
  | ProduitEmballage of {
      nom: string;
      qualite: niveau_qualite;
      num_ref: string;
      matiere: matiere;
    }

type fournisseur = {
  nom_entreprise: string;
  num_tel: string;
  adresse_mail: string;
  num_siret: string;
}

type contrat = {
  fournisseur: fournisseur;
  produit: produit;
  date_debut: string;
  date_fin: string;
  frequence: frequence;
  num_contrat: string;
}
