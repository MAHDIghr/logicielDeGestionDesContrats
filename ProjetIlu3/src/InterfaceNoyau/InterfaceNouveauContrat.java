/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaceNoyau;

import java.util.Random;

import control.*;
import model.*;

public class InterfaceNouveauContrat {
	ControlEtablireUnNouveauContrat controlEtablireUnNouveauContrat = new ControlEtablireUnNouveauContrat();

	public boolean enregistrerUnNouveauProduitEmballage(String nomProduit, String niveauQualite, String numRef,
			String matiere) {
		ProduitEmballage nouveauProduitDemballage = new ProduitEmballage(numRef, nomProduit, niveauQualite, matiere);

		return controlEtablireUnNouveauContrat.sauvgarderUnProduit(nouveauProduitDemballage);
	}

	public boolean enregistrerUnNouveauProduitChemique(String nomProduit, String niveauQualite, String numRef,
			String etat, String estDangereu) {
		ProduitChemique nouveauProduitChemique = new ProduitChemique(numRef, nomProduit, niveauQualite, etat,
				estDangereu);

		return controlEtablireUnNouveauContrat.sauvgarderUnProduit(nouveauProduitChemique);
	}

	public boolean enregistrerUnNouveauFournisseur(String numTelFournisseur, String nomEntreprise, String adresseMail,
			String numSiret) {
		Fournisseur nouveauFournisseur = new Fournisseur(numSiret, nomEntreprise, adresseMail, numTelFournisseur);
		return controlEtablireUnNouveauContrat.sauvgarderUnFournisseur(nouveauFournisseur);
	}

	public String genererUnNumeDeContratAutomatique() {
		Random random = new Random();
		long number = 100000000000L + (long) (random.nextDouble() * 900000000000L); // Entre 100000000000 et
																					// 999999999999
		// Convertir le nombre en chaîne de caractères
		return String.valueOf(number);
	}

	public boolean enregistrerUnNouveauContrat(String numContratAutomatique, String cleFournisseur, String cleProduit,
			String dateDebut, String dateFin, String frequance, String typeDeFrequance) {
		Contrat<Produit> nouveauContrat = new Contrat<Produit>(numContratAutomatique, dateDebut, dateFin,
				frequance, typeDeFrequance);
		return controlEtablireUnNouveauContrat.sauvgarderUnContrat(nouveauContrat, cleFournisseur, cleProduit);
	}
}
