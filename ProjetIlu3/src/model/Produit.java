package model;

public abstract class Produit {
	protected String nom;
	protected NiveauQualite niveauDeQualite;
	protected String reference;

	protected Produit(String reference, String nom, String niveauDeQualite) {
		this.nom = nom;
		this.niveauDeQualite = NiveauQualite.valueOf(niveauDeQualite);
		this.reference = reference;
	}

	public String getNom() {
		return nom;
	}

	public String getNiveauDeQualite() {
		return niveauDeQualite.toString();
	}

	public String getReference() {
		return reference;
	}

	public abstract String decrireProduit();

	@Override
	public String toString() {
		return "Produit [nom=" + nom + ", niveauDeQualite=" + niveauDeQualite + ", reference=" + reference + "]";
	}

}
