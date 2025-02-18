package control;

import model.GestionnaireDesProduits;
import model.Produit;

public class ControlRechercherUnProduit {
	GestionnaireDesProduits gestionnaireDesProduits = new GestionnaireDesProduits();

	public Produit[] rechercherUnProduitParNumRef(String numRef) {
		return gestionnaireDesProduits.rechercherParNumRef(numRef);
	}

	public Produit[] rechercherUnProduitParNom(String nomProduit) {
		return gestionnaireDesProduits.rechercherParNom(nomProduit);
	}
}
