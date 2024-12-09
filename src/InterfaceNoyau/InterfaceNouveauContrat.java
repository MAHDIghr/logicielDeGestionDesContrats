/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaceNoyau;

public class InterfaceNouveauContrat {


	public void enregistrerUnNouveauProduitEmballage(String nomProduit, String niveauQualite, String numRef,
			String matiere) {
		//Sauvgarder le produit
	}

	public void enregistrerUnNouveauProduitChemique(String nomProduit, String niveauQualite, String numRef, String etat,
			String estDangereu) {
		//sauvgarder le produit
	}

	public void enregistrerUnNouveauFournisseur(String numTelFournisseur, String nomFournisseur, String nomEntreprise) {
		//sauvgarder le fournisseur
	}
	
	
	public String genererUnNumeDeContratAutomatique() {
            StringBuilder numContrat = new StringBuilder();
            return numContrat.append("TESTE NUM COntart AUTOMATIQUE OK").toString();
	}


	public void enregistrerUnNouveauContrat(String numContratAutomatique, String cleFournisseurExistant, String cleProduit, String dateDebut, String dateFin,
			String frequance, String typeDeFrequance) {
		//Sauvgarder le contrat
	}
	
	
}
