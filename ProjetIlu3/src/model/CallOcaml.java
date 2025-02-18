package model;

/*import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;*/

public class CallOcaml {
	// Chemin vers l'exécutable OCaml (dans le même répertoire que la classe Java)
	private String executablePath;
	private ProcessBuilder processBuilder;

	public CallOcaml() {
		executablePath = "C:\\Users\\PC\\OneDrive\\Desktop\\L3 informatique\\ILU3\\workspace\\ProjetIlu3\\bin\\model\\main.exe";
		processBuilder = new ProcessBuilder(executablePath);
	}

	/*
	 * public String[][] callOcamlAvecArgs(String... args) { // Ajouter les
	 * arguments au ProcessBuilder
	 * processBuilder.command().addAll(Arrays.asList(args));
	 * 
	 * try { // Démarrer le processus Process process = processBuilder.start();
	 * 
	 * // Lire la sortie standard BufferedReader reader = new BufferedReader(new
	 * InputStreamReader(process.getInputStream())); List<String[]> output = new
	 * ArrayList<>(); String line;
	 * 
	 * while ((line = reader.readLine()) != null) { // Découper chaque ligne en mots
	 * et les ajouter à la liste output.add(line.split(" ")); }
	 * 
	 * // Attendre la fin du processus process.waitFor();
	 * 
	 * // Retourner la sortie sous forme de tableau de tableaux de chaînes return
	 * output.toArray(new String[0][]);
	 * 
	 * } catch (IOException | InterruptedException e) { e.printStackTrace(); return
	 * new String[][] { { "Erreur lors de l'exécution de l'exécutable OCaml" } }; }
	 * }
	 */

	// Pour le test
	public String[][] callOcamlAvecArgs(String... args) {
		switch (args[0]) {
		case "ajouter":
			if (args[1].equals("produit")) {
				return new String[][] { { "Produit ajouté", args[2], args[3], args[4], args[5] } };
			} else if (args[1].equals("fournisseur")) {
				return new String[][] { { "Fournisseur ajouté", args[2], args[3], args[4], args[5] } };
			} else if (args[1].equals("contrat")) {
				return new String[][] { { "Contrat ajouté", args[2], args[3], args[4], args[5], args[6] } };
			}
			break;

		case "lister":
			if (args[1].equals("produits")) {
				return new String[][] { { "1", "Produit A", "emballage", "REF001", "Produit 1", "BONNE", "PLASTIQUE" },
						{ "2", "Produit B", "chimique", "REF002", "Produit 2", "EXCELENTE", "LIQUIDE", "oui" },
						{ "3", "Produit C", "chimique", "REF003", "Produit 3", "MOYENNE", "GAZE", "non" },
						{ "4", "Produit D", "emballage", "REF004", "Produit 4", "MAUVAISE", "METALE" },
						{ "5", "Produit E", "emballage", "REF005", "Produit 5", "BONNE", "CARTON" },
						{ "6", "Produit F", "chimique", "REF006", "Produit 6", "EXCELENTE", "SOLIDE", "oui" },
						{ "7", "Produit G", "chimique", "REF007", "Produit 7", "MOYENNE", "LIQUIDE", "non" },
						{ "8", "Produit H", "emballage", "REF008", "Produit 8", "MAUVAISE", "PLASTIQUE" },
						{ "9", "Produit I", "emballage", "REF009", "Produit 9", "BONNE", "METALE" },
						{ "10", "Produit J", "chimique", "REF010", "Produit 10", "EXCELENTE", "GAZE", "oui" },
						{ "11", "Produit K", "chimique", "REF011", "Produit 11", "MOYENNE", "SOLIDE", "non" },
						{ "12", "Produit L", "emballage", "REF012", "Produit 12", "MAUVAISE", "CARTON" } };
			} else if (args[1].equals("fournisseurs")) {
				return new String[][] { { "123456789", "Entreprise A", "emailA@example.com", "0101010101" },
						{ "987654321", "Entreprise B", "emailB@example.com", "0202020202" },
						{ "543216789", "Entreprise C", "emailC@example.com", "0303030303" },
						{ "876543210", "Entreprise D", "emailD@example.com", "0404040404" },
						{ "112233445", "Entreprise E", "emailE@example.com", "0505050505" },
						{ "556677889", "Entreprise F", "emailF@example.com", "0606060606" },
						{ "998877665", "Entreprise G", "emailG@example.com", "0707070707" },
						{ "334455667", "Entreprise H", "emailH@example.com", "0808080808" },
						{ "776655443", "Entreprise I", "emailI@example.com", "0909090909" },
						{ "445566778", "Entreprise J", "emailJ@example.com", "1010101010" } };
			} else if (args[1].equals("contrats")) {
				return new String[][] { { "CNT001", "2025-01-01", "2025-12-31", "MOIS", "0101010101", "REF001" },
						{ "CNT002", "2025-02-01", "2025-11-30", "MOIS", "0202020202", "REF002" },
						{ "CNT003", "2025-03-01", "2025-10-31", "MOIS", "0303030303", "REF003" },
						{ "CNT004", "2025-04-01", "2025-09-30", "MOIS", "0404040404", "REF004" },
						{ "CNT005", "2025-01-01", "2025-12-31", "MOIS", "0101010101", "REF005" },
						{ "CNT006", "2025-02-01", "2025-11-30", "MOIS", "0202020202", "REF006" },
						{ "CNT007", "2025-03-01", "2025-10-31", "MOIS", "0303030303", "REF007" },
						{ "CNT008", "2025-04-01", "2025-09-30", "MOIS", "0404040404", "REF008" },
						{ "CNT009", "2025-05-01", "2025-08-31", "MOIS", "0505050505", "REF009" },
						{ "CNT010", "2025-06-01", "2025-07-31", "MOIS", "0606060606", "REF010" },
						{ "CNT011", "2025-02-01", "2025-11-30", "MOIS", "0202020202", "REF011" },
						{ "CNT012", "2025-03-01", "2025-10-31", "MOIS", "0303030303", "REF012" } };
			}
			break;

		case "vider":
			if (args[1].equals("produits")) {
				return new String[][] { { "Tous les produits ont été supprimés" } };
			} else if (args[1].equals("fournisseurs")) {
				return new String[][] { { "Tous les fournisseurs ont été supprimés" } };
			} else if (args[1].equals("contrats")) {
				return new String[][] { { "Tous les contrats ont été supprimés" } };
			}
			break;

		case "supprimer":
			if (args[1].equals("produit")) {
				return new String[][] { { "Produit supprimé", args[2] } };
			} else if (args[1].equals("fournisseur")) {
				return new String[][] { { "Fournisseur supprimé", args[2] } };
			} else if (args[1].equals("contrat")) {
				return new String[][] { { "Contrat supprimé", args[2] } };
			}
			break;

		default:
			return new String[][] { { "Commande inconnue" } };
		}

		return new String[][] { { "Erreur inconnue" } };
	}

}
