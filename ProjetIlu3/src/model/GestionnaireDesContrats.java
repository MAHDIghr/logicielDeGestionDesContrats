package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GestionnaireDesContrats implements Gestionnaire<Contrat<Produit>> {
	private CallOcaml callOcaml = new CallOcaml();
	private List<Contrat<Produit>> contrats = new ArrayList<>();
	private Map<Contrat<Produit>, Fournisseur> associationContratsFournisseurs = new HashMap<>();

	public GestionnaireDesContrats() {
		initGestionnaire();
	}

	@Override
	public void ajouterAuGestionnaire(Contrat<Produit> contrat) {
		callOcaml.callOcamlAvecArgs("ajouter", "contrat", contrat.getNumContrat(), contrat.getDateDebut(),
				contrat.getDateFin(), contrat.getFournisseur().getNumTel(), contrat.getProduit().getReference());
		contrats.add(contrat);
		associationContratsFournisseurs.put(contrat, contrat.getFournisseur());
	}

	@Override
	public Contrat<Produit>[] listerContenuDuGestionnaire() {
		String[][] contratsStrings = callOcaml.callOcamlAvecArgs("lister", "contrats");
		contrats.clear();

		GestionnaireDesFournisseurs gestionnaireDesFournisseurs = new GestionnaireDesFournisseurs();
		GestionnaireDesProduits gestionnaireDesProduits = new GestionnaireDesProduits();

		for (String[] contratString : contratsStrings) {
			Contrat<Produit> contrat = new Contrat<>(contratString[0], contratString[1], contratString[2],
					contratString[3], contratString[4]);

			// juste pour les initialisee
			gestionnaireDesFournisseurs.listerContenuDuGestionnaire();
			gestionnaireDesProduits.listerContenuDuGestionnaire();

			List<Fournisseur> fournisseurs = gestionnaireDesFournisseurs.rechercherParNumTel(contratString[4]);
			if (!fournisseurs.isEmpty()) {
				contrat.setFournisseur(fournisseurs.get(0));
			}
			Produit[] produits = gestionnaireDesProduits.rechercherParNumRef(contratString[5]);
			if (produits.length > 0) {
				contrat.setProduit(produits[0]);
			}

			contrats.add(contrat);
			associationContratsFournisseurs.put(contrat, contrat.getFournisseur());
		}

		@SuppressWarnings("unchecked")
		Contrat<Produit>[] contratsArray = contrats.toArray(new Contrat[0]);
		return contratsArray;
	}

	@Override
	public void viderLeGestionnaire() {
		callOcaml.callOcamlAvecArgs("vider", "contrats");
		contrats.clear();
		associationContratsFournisseurs.clear();
	}

	@Override
	public boolean supprimer(String motCle) {
		callOcaml.callOcamlAvecArgs("supprimer", "contrat", motCle);
		return contrats.removeIf(contrat -> contrat.getNumContrat().equals(motCle));
	}

	public List<Contrat<Produit>> rechercherParNumTelFournisseur(String numTelFournisseur) {
		List<Contrat<Produit>> resultats = new ArrayList<>();
		for (Map.Entry<Contrat<Produit>, Fournisseur> entry : associationContratsFournisseurs.entrySet()) {
			if (entry.getValue().getNumTel().equals(numTelFournisseur)) {
				resultats.add(entry.getKey());
			}
		}
		return resultats;
	}

	public List<Contrat<Produit>> rechercherParDateDebut(String dateDebut) {
		List<Contrat<Produit>> resultats = new ArrayList<>();
		for (Contrat<Produit> contrat : contrats) {
			if (contrat.getDateDebut().equals(dateDebut)) {
				resultats.add(contrat);
			}
		}
		return resultats;
	}

	public List<Contrat<Produit>> rechercherParNumContrat(String numContrat) {
		List<Contrat<Produit>> resultats = new ArrayList<>();
		for (Contrat<Produit> contrat : contrats) {
			if (contrat.getNumContrat().equals(numContrat)) {
				resultats.add(contrat);
			}
		}
		return resultats;
	}

	@Override
	public void initGestionnaire() {
		listerContenuDuGestionnaire();
	}
}
