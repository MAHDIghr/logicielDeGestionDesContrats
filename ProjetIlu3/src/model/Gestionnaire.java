package model;

public interface Gestionnaire<T> {

	// les donnees sont sauvgarde sous forme de String dans les fichiers CSV
	void initGestionnaire();

	// Ajouter un element au gestionnaire
	void ajouterAuGestionnaire(T element);

	// Suppression du gestionnaire
	boolean supprimer(String motCle);

	// Lister le contenu du gestionnaire
	T[] listerContenuDuGestionnaire();

	// vider le gestionnaires
	void viderLeGestionnaire();
}
