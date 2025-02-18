package model;

public class ProduitChemique extends Produit {
	private Etat etat;
	private boolean estDangereu;

	public ProduitChemique(String reference, String nom, String niveauDeQualite, String etat, String estDangereu) {
		super(reference, nom, niveauDeQualite);
		this.etat = Etat.valueOf(etat);
		if (estDangereu.equals("oui")) {
			this.estDangereu = true;
		} else {
			this.estDangereu = false;
		}
	}

	@Override
	public String decrireProduit() {
	    String dangereuOuNon;
	    if (estDangereu) {
	        dangereuOuNon = "Attention : Ce produit est dangereux !";
	    } else {
	        dangereuOuNon = "Ce produit n'est pas dangereux.";
	    }
	    return "--------------------------------------------------\n" +
	           "Détails du Produit Chimique :\n" +
	           "--------------------------------------------------\n" +
	           "Intitulé : " + nom + "\n" +
	           "Référence : " + reference + "\n" +
	           "Niveau de Qualité : " + niveauDeQualite + "\n" +
	           "État : " + etat + "\n" +
	           "Catégorie : Produit Chimique\n" +
	           dangereuOuNon + "\n" +
	           "--------------------------------------------------\n" +
	           "Merci de vérifier les informations ci-dessus.";
	}

	public String getEtat() {
		return etat.toString();
	}

	public String estDangereu() {
		if (estDangereu)
			return "oui";
		else
			return "non";
	}
	
}
