/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dialog;

import presentation.PresentationJDialogNouveauContrat;
import presentation.PresentationJFramePageAcceuil;
import InterfaceNoyau.*;

public class DialogNouveauContrat {
	private PresentationJDialogNouveauContrat presentationJDialogNouveauContrat;
	private InterfaceNouveauContrat intrfNouveauContrat;
        private DialogPageAcceuil dialogPageAcceuil;

	public void setDialog(PresentationJFramePageAcceuil frameParente, DialogPageAcceuil dialogPageAcceuil) {
		intrfNouveauContrat = new InterfaceNouveauContrat();
                this.dialogPageAcceuil = dialogPageAcceuil;
		presentationJDialogNouveauContrat = new PresentationJDialogNouveauContrat(frameParente, true);
		presentationJDialogNouveauContrat.setJDialog(intrfNouveauContrat.genererUnNumeDeContratAutomatique());
		presentationJDialogNouveauContrat.initDialog(this);
		presentationJDialogNouveauContrat.setVisible(true);
	}

	public void handelEventBoutonAnnuler() {
            presentationJDialogNouveauContrat.setVisible(false);
	}

	/*
	 * ajout d un nouveau contrat = ajout un nouveau Fournisseur (ou bien associer
	 * un fournisseur existant a un nouveau contrat + ajout d un nouveau produit
	 * soit chemique ou d'emballage + enregistrement des infos du nouveau contrat
	 */
	public void ajouterUnNouveauFournisseur(String numTelFournisseur, String nomEntreprise, String adresseMail, String numSiret) {
		intrfNouveauContrat.enregistrerUnNouveauFournisseur(numTelFournisseur, nomEntreprise, adresseMail, numSiret);
                //Actualiser la table des Fournisseurs 
                dialogPageAcceuil.setTableDesFournisseurs();
	}

	public void ajouterUnProduit(String nomProduit, String niveauQualite, String numRef,
			String matiere, String etat, String estDangereu) {
            if (matiere == null) {
                //C est un produit chemique alors
                intrfNouveauContrat.enregistrerUnNouveauProduitChemique(nomProduit, niveauQualite, numRef, etat, estDangereu);
            } else {
                //C'est un produit d'emballage alors 
                intrfNouveauContrat.enregistrerUnNouveauProduitEmballage(nomProduit, niveauQualite, numRef, matiere);
            }                
                        
            //Actualiser la table des produits
            dialogPageAcceuil.setTableDesProduits();
	}


	public void handelEventBoutonAjouterUnNouveauContrat(String numContrat, String cleFournisseur, String cleProduit,
			String dateDebut, String dateFin, String frequance, String typeDeFrequance) {
		intrfNouveauContrat.enregistrerUnNouveauContrat(numContrat, cleFournisseur, cleProduit, dateDebut, dateFin,
				 frequance, typeDeFrequance);
		// Actualiser la table des contarts
                dialogPageAcceuil.setTableDesContarts();
	}
}
