package model;

public class ProduitEmballage extends Produit {

	private Matiere matiere;

	public ProduitEmballage(String reference, String nom, String niveauDeQualite, String matiere) {
		super(reference, nom, niveauDeQualite);
		this.matiere = Matiere.valueOf(matiere);
	}

	@Override
	public String decrireProduit() {
	    return "--------------------------------------------------\n" +
	           "Détails du Produit d'Emballage :\n" +
	           "--------------------------------------------------\n" +
	           "Intitulé : " + nom + "\n" +
	           "Référence : " + reference + "\n" +
	           "Niveau de Qualité : " + niveauDeQualite + "\n" +
	           "Matière : " + matiere + "\n" +
	           "Catégorie : Produit d'Emballage\n" +
	           "--------------------------------------------------\n" +
	           "Merci de vérifier les informations ci-dessus. ";
	}


	public String getMatiere() {
		return matiere.toString();
	}

}
