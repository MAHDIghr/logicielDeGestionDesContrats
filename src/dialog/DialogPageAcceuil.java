/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dialog;

import presentation.*;
import InterfaceNoyau.*;
/**
 *
 * @author PC
 */
public class DialogPageAcceuil {
    
    private PresentationJFramePageAcceuil frameAcceuil;
    private final InterfaceNoyauPageAcceuil interfacePageAcceuil = new InterfaceNoyauPageAcceuil();
    private PresentationJDialogDetailsPage pageDeDetails;
    private final DialogNouveauContrat dialogNouveauContrat = new DialogNouveauContrat();
    
    public void setDialog() {
            frameAcceuil = new PresentationJFramePageAcceuil();
            frameAcceuil.initDialog(this);
            frameAcceuil.setFrame();
            /*Initialisation des donnée*/
            setTableDesContarts();
            setTableDesFournisseurs();
            setTableDesProduits();
    }
    
     /*--------------------------------------------------------------------------
       Méthode d'initialisation de l'interface graphique avec les données
    ----------------------------------------------------------------------------*/
    public void setTableDesContarts(){
        String[][] infoDesContarts = interfacePageAcceuil.listerLesContrats();
        frameAcceuil.setTableDesContrats(infoDesContarts);
    }
    
    public void setTableDesFournisseurs(){
        String[][] infosDesFournisseurs = interfacePageAcceuil.listerLesFournisseurs();
        frameAcceuil.setTableDesFournisseurs(infosDesFournisseurs);
        frameAcceuil.setComboBoxDesFournisseurs(infosDesFournisseurs);
    }
    
    public void setTableDesProduits(){
        String[][] infoProduits = interfacePageAcceuil.listerLesProduits();
        frameAcceuil.setTableDesProduits(infoProduits);
    }
    /*--------------------------------------------------------------------------
    ----------------------------------------------------------------------------*/
    
     /*--------------------------------------------------------------------------
       Events handler pour la page Mes Contrats
    ----------------------------------------------------------------------------*/
    public void handleEventButtonRechercherContart(String motCle, String typeDeRecherche){ 
        String[][] infoDesContartsTrouves = interfacePageAcceuil.rechercherUnContratParMotCle(motCle, typeDeRecherche);
        frameAcceuil.setTableDesContrats(infoDesContartsTrouves);
    }
    
    public void handelEventBoutonAfficherDetailsContrat(String cleContrat) {
	pageDeDetails = new PresentationJDialogDetailsPage(frameAcceuil, true);
	pageDeDetails.setJDialog("Contrat", interfacePageAcceuil.recupererDetailsDuContratEnString(cleContrat));
    }
    
    public void handelEventBoutonEtablirNouveauContrat() {
        dialogNouveauContrat.setDialog(frameAcceuil);
    }
    
    /*--------------------------------------------------------------------------
    ----------------------------------------------------------------------------*/
    
     /*--------------------------------------------------------------------------
       Events handler pour la page Mes Fournisseur
    ----------------------------------------------------------------------------*/
    public void handelEventBoutonAfficherDetailsFournisseur(String numTelFournisseur) {
	pageDeDetails = new PresentationJDialogDetailsPage(frameAcceuil, true);
	pageDeDetails.setJDialog("Fournisseur", interfacePageAcceuil.recupererDetailsDuFournisseurEnString(numTelFournisseur));
    }
    
    public void handleEventButtonRechercherFournisseur(String motCle, String typeDeRecherche){ 
        String[][] infoDesFournisseursTrouves = interfacePageAcceuil.rechercherUnFournisseurParMotCle(motCle, typeDeRecherche);
        frameAcceuil.setTableDesFournisseurs(infoDesFournisseursTrouves);
    }
    /*--------------------------------------------------------------------------
    ----------------------------------------------------------------------------*/
    
     /*--------------------------------------------------------------------------
       Events handler pour la page Mes Produits
    ----------------------------------------------------------------------------*/
    public void handelEventBoutonAfficherDetailsProduit(String refProduit) {
	pageDeDetails = new PresentationJDialogDetailsPage(frameAcceuil, true);
	pageDeDetails.setJDialog("Produit", interfacePageAcceuil.recupererDetailsDuProduitEnString(refProduit));
    }
    
    public void handleEventButtonRechercherProduit(String motCle, String typeDeRecherche){ 
        String[][] infoDesProduitsTrouves = interfacePageAcceuil.rechercherUnProduitParMotCle(motCle, typeDeRecherche);
        frameAcceuil.setTableDesProduits(infoDesProduitsTrouves);
    }
    
    // fonction pricipale
    public static void main(String[] args) {
            DialogPageAcceuil dialogPageAcceuil = new DialogPageAcceuil();
            dialogPageAcceuil.setDialog();
    }
    
    
    
}
