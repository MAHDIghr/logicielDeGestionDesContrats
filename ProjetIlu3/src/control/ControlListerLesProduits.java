package control;

import model.GestionnaireDesProduits;
import model.Produit;

public class ControlListerLesProduits {
	GestionnaireDesProduits gestDesProduits = new GestionnaireDesProduits();

	public Produit[] listerLesProduits() {
		return gestDesProduits.listerContenuDuGestionnaire();
	}
}
