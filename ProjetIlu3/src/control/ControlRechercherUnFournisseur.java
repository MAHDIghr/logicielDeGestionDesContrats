package control;

import model.Fournisseur;
import model.GestionnaireDesFournisseurs;

public class ControlRechercherUnFournisseur {
	GestionnaireDesFournisseurs gestionnaireDesFournisseurs = new GestionnaireDesFournisseurs();
	
	public Fournisseur[] rechercherUnFournisseurParNumTel(String numTelFournisseur) {
		return gestionnaireDesFournisseurs.rechercherParNumTel(numTelFournisseur).toArray(new Fournisseur[0]);
	}
	
	public Fournisseur[] rechercherUnFournisseurParNomEntreprise(String nomEntreprise) {
		return gestionnaireDesFournisseurs.rechercherParNomEntreprise(nomEntreprise).toArray(new Fournisseur[0]);
	}
}
