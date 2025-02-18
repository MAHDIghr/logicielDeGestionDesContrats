package control;

import model.Contrat;
import model.Produit;

public class ControlAfficherDetailContrat {
	ControlRechercherUnContrat controlRechercherUnContrat = new ControlRechercherUnContrat();
	
	public String recupererDetailContrat(String cleContrat) {
		///trouver le contrat
		Contrat<Produit> contrat = controlRechercherUnContrat.rechercherContratsParNumContrat(cleContrat)[0];
		return contrat.decrireContrat();
	}
}
