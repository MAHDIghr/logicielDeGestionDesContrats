package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GestionnaireDesFournisseurs implements Gestionnaire<Fournisseur>, Iterable<Fournisseur> {
	private CallOcaml callOcaml = new CallOcaml();
	private List<Fournisseur> fournisseurs = new ArrayList<>();

	public GestionnaireDesFournisseurs() {
		initGestionnaire();
	}

	@Override
	public void ajouterAuGestionnaire(Fournisseur element) {
		callOcaml.callOcamlAvecArgs("ajouter", "fournisseur", element.getNumSiret(), element.getNomEntreprise(),
				element.getAdresseMail(), element.getNumTel());
		fournisseurs.add(element);
	}

	@Override
	public Fournisseur[] listerContenuDuGestionnaire() {
		String[][] fournisseursStrings = callOcaml.callOcamlAvecArgs("lister", "fournisseurs");
		fournisseurs.clear();

		for (String[] fournisseurString : fournisseursStrings) {
			Fournisseur fournisseur = new Fournisseur(fournisseurString[0], fournisseurString[1], fournisseurString[2],
					fournisseurString[3]);
			fournisseurs.add(fournisseur);
		}

		return fournisseurs.toArray(new Fournisseur[0]);
	}

	@Override
	public void viderLeGestionnaire() {
		callOcaml.callOcamlAvecArgs("vider", "fournisseurs");
		fournisseurs.clear();
	}

	@Override
	public boolean supprimer(String motCle) {
		callOcaml.callOcamlAvecArgs("supprimer", "fournisseur", motCle);
		return fournisseurs.removeIf(fournisseur -> fournisseur.getNumSiret().equals(motCle));
	}

	@Override
	public Iterator<Fournisseur> iterator() {
		return fournisseurs.iterator();
	}

	public List<Fournisseur> rechercherParNumTel(String numTel) {
		List<Fournisseur> resultats = new ArrayList<>();
		for (Fournisseur fournisseur : fournisseurs) {
			if (fournisseur.getNumTel().equals(numTel)) {
				resultats.add(fournisseur);
			}
		}
		return resultats;
	}

	public List<Fournisseur> rechercherParNomEntreprise(String nomEntreprise) {
		List<Fournisseur> resultats = new ArrayList<>();
		for (Fournisseur fournisseur : fournisseurs) {
			if (fournisseur.getNomEntreprise().equalsIgnoreCase(nomEntreprise)) {
				resultats.add(fournisseur);
			}
		}
		return resultats;
	}

	@Override
	public void initGestionnaire() {
		listerContenuDuGestionnaire();

	}
}
