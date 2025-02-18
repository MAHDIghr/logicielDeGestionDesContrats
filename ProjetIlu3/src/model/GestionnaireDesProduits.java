package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GestionnaireDesProduits implements Gestionnaire<Produit>, Iterable<Produit> {
	private CallOcaml callOcaml = new CallOcaml();
	private List<Produit> produits = new ArrayList<>();

	public GestionnaireDesProduits() {
		initGestionnaire();
	}

	@Override
	public void ajouterAuGestionnaire(Produit produit) {
		if (produit instanceof ProduitEmballage) {
			// Produit d'emballage
			ProduitEmballage produitEmballage = (ProduitEmballage) produit;
			callOcaml.callOcamlAvecArgs("ajouter", "produit", "emballage", produitEmballage.getReference(),
					produitEmballage.getNom(), produitEmballage.getNiveauDeQualite(), produitEmballage.getMatiere());
		} else {
			// Produit chimique
			ProduitChemique produitChemique = (ProduitChemique) produit;
			callOcaml.callOcamlAvecArgs("ajouter", "produit", "chimique", produitChemique.getReference(),
					produitChemique.getNom(), produitChemique.getNiveauDeQualite(), produitChemique.getEtat(),
					produitChemique.estDangereu());
		}
		produits.add(produit);
	}

	@Override
	public Produit[] listerContenuDuGestionnaire() {
		String[][] produitsStrings = callOcaml.callOcamlAvecArgs("lister", "produits");
		produits.clear();
		for (String[] produitString : produitsStrings) {
			if (produitString[2].equals("emballage")) {
				produits.add(
						new ProduitEmballage(produitString[3], produitString[4], produitString[5], produitString[6]));
			} else {
				produits.add(new ProduitChemique(produitString[3], produitString[4], produitString[5], produitString[6],
						produitString[7]));
			}
		}
		return produits.toArray(new Produit[0]);
	}

	@Override
	public void viderLeGestionnaire() {
		callOcaml.callOcamlAvecArgs("vider", "produits");
		produits.clear();
	}

	@Override
	public boolean supprimer(String motCle) {
		callOcaml.callOcamlAvecArgs("supprimer", "produit", motCle);
		return produits.removeIf(produit -> produit.getReference().equals(motCle));
	}

	@Override
	public Iterator<Produit> iterator() {
		return produits.iterator();
	}

	public Produit[] rechercherParNom(String nom) {
		List<Produit> resultats = new ArrayList<>();
		for (Produit produit : produits) {
			if (produit.getNom().equalsIgnoreCase(nom)) {
				resultats.add(produit);
			}
		}
		return resultats.toArray(new Produit[0]);
	}

	public Produit[] rechercherParNumRef(String numRef) {
		List<Produit> resultats = new ArrayList<>();
		for (Produit produit : produits) {
			if (produit.getReference().equalsIgnoreCase(numRef)) {
				resultats.add(produit);
			}
		}
		return resultats.toArray(new Produit[0]);
	}

	@Override
	public void initGestionnaire() {
		listerContenuDuGestionnaire();

	}
}
