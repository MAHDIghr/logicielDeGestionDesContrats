package model;

public class Fournisseur {
	private String numSiret;
	private String nomEntreprise;
	private String adresseMail;
	private String numTel;

	public Fournisseur(String numSiret, String nomEntreprise, String adresseMail, String numTel) {
		this.numSiret = numSiret;
		this.nomEntreprise = nomEntreprise;
		this.adresseMail = adresseMail;
		this.numTel = numTel;
	}

	public String getNomEntreprise() {
		return nomEntreprise;
	}

	public String getNumTel() {
		return numTel;
	}

	public String getNumSiret() {
		return numSiret;
	}

	public String getAdresseMail() {
		return adresseMail;
	}

	@Override
	public String toString() {
		return "Fournisseur [numSiret=" + numSiret + ", nomEntreprise=" + nomEntreprise + ", adresseMail=" + adresseMail
				+ ", numTel=" + numTel + "]";
	}

	public String decrireFournisseur() {
		return "Détails du Fournisseur :\n" + "--------------------------------------------------\n" + "Numéro SIRET : "
				+ numSiret + "\n" + "Nom de l'Entreprise : " + nomEntreprise + "\n" + "Adresse Email : " + adresseMail
				+ "\n" + "Numéro de Téléphone : " + numTel + "\n"
				+ "--------------------------------------------------\n"
				+ "Merci de vérifier les informations ci-dessus.";
	}

}
