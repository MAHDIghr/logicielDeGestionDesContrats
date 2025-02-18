package control;

import model.Produit;

public class ControlAfficherDetailProduit {
	ControlRechercherUnProduit controControlRechercherUnProduit = new ControlRechercherUnProduit();
	
	public String recupererDetailProduit(String cleProduit) {
		Produit produit = controControlRechercherUnProduit.rechercherUnProduitParNumRef(cleProduit)[0];
		return produit.decrireProduit();
	}
}
