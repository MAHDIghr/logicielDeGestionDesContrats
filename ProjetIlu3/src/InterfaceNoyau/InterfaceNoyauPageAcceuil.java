/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaceNoyau;

import model.*;
import control.*;

/**
 *
 * @author PC
 */
public class InterfaceNoyauPageAcceuil {
	private ControlListerLesContrats controlListerLesContrats = new ControlListerLesContrats();
	private ControlListerLesFournisseurs controlListerLesFournisseurs = new ControlListerLesFournisseurs();
	private ControlListerLesProduits controlListerLesProduits = new ControlListerLesProduits();
	private ControlAfficherDetailContrat controlAfficherDetailContrat = new ControlAfficherDetailContrat();
	private ControlAfficherDetailFournisseur controlAfficherDetailFournisseur = new ControlAfficherDetailFournisseur();
	private ControlAfficherDetailProduit controlAfficherDetailProduit = new ControlAfficherDetailProduit();
	private ControlResilierUnContrat controlResilierUnContrat = new ControlResilierUnContrat();
	private ControlRechercherUnProduit controlRechercherUnProduit = new ControlRechercherUnProduit();
	private ControlRechercherUnFournisseur controlRechercherUnFournisseur = new ControlRechercherUnFournisseur();
	private ControlRechercherUnContrat controlRechercherUnContrat = new ControlRechercherUnContrat();
	
	/* Interface pour la page Mes contrats */
	public String[][] listerLesContrats() {
		Contrat<Produit>[] tabDesContrats = controlListerLesContrats.listerLesContrats();

		String[][] infoDesContrats = new String[tabDesContrats.length][4];
		for (int i = 0; i < tabDesContrats.length; i++) {
			infoDesContrats[i][0] = tabDesContrats[i].getNumContrat();
			infoDesContrats[i][1] = tabDesContrats[i].getDateDebut();
			infoDesContrats[i][2] = tabDesContrats[i].getDateFin();
			infoDesContrats[i][3] = tabDesContrats[i].getFournisseur().getNomEntreprise();
		}

		return infoDesContrats;
	}

	public String[][] rechercherUnContratParMotCle(String motCle, String typeDeRecherche) {
	    Contrat<Produit>[] contrats = new Contrat[0];
	    String[][] infoDesContrats;

	    // Vérification du type de recherche
	    if (typeDeRecherche.equals("numContrat")) {
	        contrats = controlRechercherUnContrat.rechercherContratsParNumContrat(motCle);
	    } else if (typeDeRecherche.equals("dateDebutContrat")) {
	        contrats = controlRechercherUnContrat.rechercherContratsParDateDebut(motCle);
	    } else if (typeDeRecherche.equals("Fournisseur")) {
	        contrats = controlRechercherUnContrat.rechercherContratsParFournisseur(motCle);
	    } else {
	        // Type de recherche invalide
	        return new String[][] { { "Aucun contrat trouvé", "", "", "" } };
	    }

	    // Initialisation de infoDesContrats en fonction du résultat de la recherche
	    infoDesContrats = new String[contrats.length][4];
	    for (int i = 0; i < contrats.length; i++) {
	        infoDesContrats[i][0] = contrats[i].getNumContrat();
	        infoDesContrats[i][1] = contrats[i].getDateDebut();
	        infoDesContrats[i][2] = contrats[i].getDateFin();
	        infoDesContrats[i][3] = contrats[i].getFournisseur().getNomEntreprise();
	    }
	    return infoDesContrats;
	}


	public String recupererDetailsDuContratEnString(String numContrat) {
		return controlAfficherDetailContrat.recupererDetailContrat(numContrat);
	}

	public boolean resilierContrat(String numContrat) {
		return controlResilierUnContrat.supprimerUnContrat(numContrat);
	}

	/* Interface pour la page Mes Fournisseurs */
	public String[][] listerLesFournisseurs() {
		Fournisseur[] tabDesFournisseurs = controlListerLesFournisseurs.listerLesFournisseurs();

		String[][] infosDesFournisseurs = new String[tabDesFournisseurs.length][3];
		for (int i = 0; i < tabDesFournisseurs.length; i++) {
			infosDesFournisseurs[i][0] = tabDesFournisseurs[i].getNumTel();
			infosDesFournisseurs[i][1] = tabDesFournisseurs[i].getNumSiret();
			infosDesFournisseurs[i][2] = tabDesFournisseurs[i].getNomEntreprise();
		}

		return infosDesFournisseurs;
	}

	public String recupererDetailsDuFournisseurEnString(String numTelFournisseur) {
		return controlAfficherDetailFournisseur.recupererDetailFournisseur(numTelFournisseur);
	}

	public String[][] rechercherUnFournisseurParMotCle(String motCle, String typeDeRecherche) {
	    Fournisseur[] fournisseurs = new Fournisseur[0];
	    String[][] infosDesFournisseurs;

	    // Vérification du type de recherche
	    if (typeDeRecherche.equals("Nom fournisseur")) {
	        fournisseurs = controlRechercherUnFournisseur.rechercherUnFournisseurParNomEntreprise(motCle);
	    } else if (typeDeRecherche.equals("Num tel")) {
	        fournisseurs = controlRechercherUnFournisseur.rechercherUnFournisseurParNumTel(motCle);
	    } else {
	        // Type de recherche invalide
	        return new String[][] { { "Aucun Fournisseur trouvé", "", "", "" } };
	    }

	    // Initialisation de infosDesFournisseurs en fonction du résultat de la recherche
	    infosDesFournisseurs = new String[fournisseurs.length][3];
	    for (int i = 0; i < fournisseurs.length; i++) {
	        infosDesFournisseurs[i][0] = fournisseurs[i].getNumTel();
	        infosDesFournisseurs[i][1] = fournisseurs[i].getNumSiret();
	        infosDesFournisseurs[i][2] = fournisseurs[i].getNomEntreprise();
	    }
	    return infosDesFournisseurs;
	}


	/* Interface pour la page Mes produist */
	public String[][] listerLesProduits() {
		Produit[] tabDesProduits = controlListerLesProduits.listerLesProduits();
		
		
		String[][] infosDesProduits = new String[tabDesProduits.length][2];
		for (int i = 0; i < tabDesProduits.length; i++) {
			infosDesProduits[i][0] = tabDesProduits[i].getNom();
			infosDesProduits[i][1] = tabDesProduits[i].getReference();
		}
		return infosDesProduits;
	}

	public String recupererDetailsDuProduitEnString(String refProduit) {
		return controlAfficherDetailProduit.recupererDetailProduit(refProduit);
	}

	public String[][] rechercherUnProduitParMotCle(String motCle, String typeDeRecherche) {
	    Produit[] produits = new Produit[0];
	    String[][] infosDesProduits;

	    // Vérification du type de recherche
	    if (typeDeRecherche.equals("Nom produit")) {
	        produits = controlRechercherUnProduit.rechercherUnProduitParNom(motCle);
	    } else if (typeDeRecherche.equals("Num ref")) {
	        produits = controlRechercherUnProduit.rechercherUnProduitParNumRef(motCle);
	    } else {
	        // Type de recherche invalide
	        return new String[][] { { "Aucun Produit trouvé", "", "" } };
	    }

	    // Initialisation de infosDesProduits en fonction du résultat de la recherche
	    infosDesProduits = new String[produits.length][2];
	    for (int i = 0; i < produits.length; i++) {
	        infosDesProduits[i][0] = produits[i].getNom();
	        infosDesProduits[i][1] = produits[i].getReference();
	    }
	    return infosDesProduits;
	}

}
