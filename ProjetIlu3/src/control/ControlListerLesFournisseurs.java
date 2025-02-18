package control;

import model.Fournisseur;
import model.GestionnaireDesFournisseurs;

public class ControlListerLesFournisseurs {
	GestionnaireDesFournisseurs gestDesFournisseurs = new GestionnaireDesFournisseurs();
	
	public Fournisseur[] listerLesFournisseurs() {
		return gestDesFournisseurs.listerContenuDuGestionnaire();
	}
}
