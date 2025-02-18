package control;

import model.*;

public class ControlEtablireUnNouveauContrat {
	ControlRechercherUnFournisseur controlRechercherUnFournisseur = new ControlRechercherUnFournisseur();
	ControlRechercherUnProduit controlRechercherUnProduit = new ControlRechercherUnProduit();
	GestionnaireDesContrats gestContrats = new GestionnaireDesContrats();
	GestionnaireDesFournisseurs gestFournisseurs = new GestionnaireDesFournisseurs();
	GestionnaireDesProduits gestProduits = new GestionnaireDesProduits();
	
	
	public boolean sauvgarderUnFournisseur(Fournisseur fournisseur) {
		gestFournisseurs.ajouterAuGestionnaire(fournisseur);
		return true;
	}
	
	public boolean sauvgarderUnProduit(Produit produit) {
		gestProduits.ajouterAuGestionnaire(produit);
		return true;
	}
	
	public boolean sauvgarderUnContrat(Contrat<Produit> contrat, String cleFournisseur, String cleProduit) {
		//rechercher le fournisseur et le produit ensuite  et l associer au contrat 
		Fournisseur[] fournisseurs = controlRechercherUnFournisseur.rechercherUnFournisseurParNumTel(cleFournisseur);
		Produit[] produits = controlRechercherUnProduit.rechercherUnProduitParNumRef(cleProduit);
		
		contrat.setFournisseur(fournisseurs[0]);
		contrat.setProduit(produits[0]);
		
		gestContrats.ajouterAuGestionnaire(contrat);
		
		return true;
	}
	
}
