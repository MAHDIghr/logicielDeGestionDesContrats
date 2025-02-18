package model;

public enum Matiere {
	PLASTIQUE("PLASTIQUE"), CARTON("CARTON"), METALE("METALE"), AUTRE("AUTRE");

	private String nomMatiere;

	private Matiere(String nomMatiere) {
		this.nomMatiere = nomMatiere;
	}

	@Override
	public String toString() {
		return nomMatiere;
	}
}
