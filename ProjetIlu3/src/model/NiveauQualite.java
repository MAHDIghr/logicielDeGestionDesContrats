package model;

public enum NiveauQualite {
	MAUVAISE("MAUVAISE"), MOYENNE("MOYENNE"), BONNE("BONNE"), EXCELENTE("EXCELENTE");

	private String niveau;

	private NiveauQualite(String niveau) {
		this.niveau = niveau;
	}
	
	@Override
	public String toString() {
		return niveau;
	}
	
}
