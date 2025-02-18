package model;

public class Contrat<P extends Produit> {
	private Fournisseur fournisseur;
	private P produit; // chaque produit a un contrat specifique
	private String dateDebut;
	private String dateFin;
	private String numContrat;
	private TypeFrequance typeFrequance;
	private String frequance;

	public Contrat(String numContrat, String dateDebut, String dateFin, String typeFrequance, String frequance) {
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.numContrat = numContrat;
		this.typeFrequance = TypeFrequance.valueOf(typeFrequance);
		this.frequance = frequance;
	}

	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}

	public void setProduit(P produit) {
		this.produit = produit;
	}

	public Fournisseur getFournisseur() {
		return fournisseur;
	}

	public P getProduit() {
		return produit;
	}

	public String getDateDebut() {
		return dateDebut;
	}

	public String getDateFin() {
		return dateFin;
	}

	public String getNumContrat() {
		return numContrat;
	}

	public String decrireContrat() {
		return "Voici les détails du contrat :\n" + "--------------------------------------------------\n"
				+ "Numéro du Contrat : " + numContrat + "\n" + "Date de Début : " + dateDebut + "\n" + "Date de Fin : "
				+ dateFin + "\n" + "Type de Fréquence : " + typeFrequance + "\n" + "Fréquence : " + frequance + "\n"
				+ "--------------------------------------------------\n" + "Fournisseur : \n"
				+ (fournisseur != null ? fournisseur.decrireFournisseur() : "Aucun fournisseur assigné") + "\n"
				+ "Produit : \n" + (produit != null ? produit.decrireProduit() : "Aucun produit assigné") + "\n"
				+ "--------------------------------------------------\n";
	}

}
