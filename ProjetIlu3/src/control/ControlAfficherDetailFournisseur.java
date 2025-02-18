package control;

import model.Fournisseur;

public class ControlAfficherDetailFournisseur {
	ControlRechercherUnFournisseur controlRechercherUnFournisseur = new ControlRechercherUnFournisseur();
	
	public String recupererDetailFournisseur(String cleFournisseur) {
		Fournisseur fournisseur = controlRechercherUnFournisseur.rechercherUnFournisseurParNumTel(cleFournisseur)[0];
		return fournisseur.decrireFournisseur();
	}
}
