package model;

public enum TypeFrequance {
	
	SEMAINE("SEMAINE"), MOIS("MOIS"), ANNEE("ANNEE");
	
	private String typeDeFrequance;

	private TypeFrequance(String typeDeFrequance) {
		this.typeDeFrequance = typeDeFrequance;
	}
	
	@Override
	public String toString() {
		return typeDeFrequance;
	}
}
