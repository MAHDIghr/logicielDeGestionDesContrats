package control;

import model.Contrat;
import model.GestionnaireDesContrats;
import model.Produit;

public class ControlRechercherUnContrat {
	private GestionnaireDesContrats gestionnaireDesContrats = new GestionnaireDesContrats();
	
	@SuppressWarnings("unchecked")
	public Contrat<Produit>[] rechercherContratsParNumContrat(String numContrat) {
		return gestionnaireDesContrats.rechercherParNumContrat(numContrat).toArray(new Contrat[0]);
	}
	
	@SuppressWarnings("unchecked")
	public Contrat<Produit>[] rechercherContratsParDateDebut(String dateDebut) {
		return gestionnaireDesContrats.rechercherParDateDebut(dateDebut).toArray(new Contrat[0]);
	}
	
	@SuppressWarnings("unchecked")
	public Contrat<Produit>[] rechercherContratsParFournisseur(String numTelFournisseur) {
		return gestionnaireDesContrats.rechercherParNumTelFournisseur(numTelFournisseur).toArray(new Contrat[0]);
	}
}
