package model;

public enum Etat {
	GAZE("GAZ"), LIQUIDE("LIQUIDE"), SOLIDE("SOLIDE");

	private String etat;

	private Etat(String etat) {
		this.etat = etat;
	}

	@Override
	public String toString() {
		return etat;
	}
}
