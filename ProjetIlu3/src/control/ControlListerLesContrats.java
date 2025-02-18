package control;

import model.Contrat;
import model.GestionnaireDesContrats;
import model.Produit;

public class ControlListerLesContrats {
	GestionnaireDesContrats gestDesContrats = new GestionnaireDesContrats();
	
	public Contrat<Produit>[] listerLesContrats() {
		return gestDesContrats.listerContenuDuGestionnaire();
	}
}
