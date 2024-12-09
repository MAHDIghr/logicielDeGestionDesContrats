/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaceNoyau;

/**
 *
 * @author PC
 */
public class InterfaceNoyauPageAcceuil {
    /* Interface pour la page Mes contrats*/
    public String[][] listerLesContrats(){
        /* Returner la liste des contarts sous form d'un tableau de tabelaux 
        qui va contenir le informations du contart à difusé sur tableau des contrats*/
        String[][] infoDesContrats = {{"111", "12/12/2024", "12/12/2024", "111111"}, 
                {"222", "12/12/2024", "12/12/2024", "2222"}, 
                {"222", "12/12/2024", "12/12/2024", "23333"}};
        return infoDesContrats;
    }
    
    public String[][] rechercherUnContratParMotCle(String motCle, String typeDeRecherche) {
        String[][] infoDesContrats;

        // Vérification du type de recherche
        if (typeDeRecherche.equals("numContrat")) {
            infoDesContrats = new String[][] {{"111", "12/12/2024", "12/12/2024", "num contrat réussi"}};
        } else if (typeDeRecherche.equals("dateDebutContrat")) {
            infoDesContrats = new String[][] {{"222", "01/01/2023", "31/12/2023", "date début réussi"}};
        } else if (typeDeRecherche.equals("dateFinContrat")) {
            infoDesContrats = new String[][] {{"333", "01/06/2022", "30/06/2023", "date fin réussi"}};
        } else {
            // Type de recherche invalide
            infoDesContrats = new String[][] {{"Aucun contrat trouvé", "", "", ""}};
        }

        return infoDesContrats;
    }
    
    public String recupererDetailsDuContratEnString(String numContrat){
        StringBuilder detailsDuContrat = new StringBuilder();
        detailsDuContrat.append("Teste affichage details contrat Ok!");
        return detailsDuContrat.toString();
    }
    
    
    /* Interface pour la page Mes Fournisseurs*/
    public String[][] listerLesFournisseurs(){
        /* Returner la liste des contarts sous form d'un tableau de tabelaux 
        qui va contenir le informations du contart à difusé sur tableau des contrats*/
        String[][] infosDesFournisseurs = {{"111", "Fournisseur 1", "12/12/2024"}, 
                {"222", "Fournisseur 2", "12/12/2024"}, 
                {"222", "Fournisseur 3", "test fournisseurs ok"}};
        return infosDesFournisseurs;
    }
    
    public String recupererDetailsDuFournisseurEnString(String numTelFournisseur){
        StringBuilder detailsDuFournisseur = new StringBuilder();
        detailsDuFournisseur.append("Teste affichage details fournisseur Ok!");
        return detailsDuFournisseur.toString();
    }
    
    public String[][] rechercherUnFournisseurParMotCle(String motCle, String typeDeRecherche){
        String[][] infosDesFournisseurs;

        // Vérification du type de recherche
        if (typeDeRecherche.equals("Nom fournisseur")) {
            infosDesFournisseurs = new String[][] {{"111", "12/12/2024", "test rech nom fournisseur ok"}};
        } else if (typeDeRecherche.equals("Num tel")) {
            infosDesFournisseurs = new String[][] {{"222", "01/01/2023", "test rech numtel fournisseur ok"}};
        } else {
            // Type de recherche invalide
            infosDesFournisseurs = new String[][] {{"Aucun Fournisseur trouvé", "", "", ""}};
        }

        return infosDesFournisseurs;
    }
    
    /* Interface pour la page Mes produist*/
    public String[][] listerLesProduits(){
        /* Returner la liste des contarts sous form d'un tableau de tabelaux 
        qui va contenir le informations du contart à difusé sur tableau des contrats*/
        String[][] infosDesProduits = {{"111", "12/12/2024", "12/12/2024"}, 
                {"222", "12/12/2024", "12/12/2024"}, 
                {"222", "12/12/2024", "test produits ok"}};
        return infosDesProduits;
    }
    
    public String recupererDetailsDuProduitEnString(String refProduit){
        StringBuilder detailsProduit = new StringBuilder();
        detailsProduit.append("Teste affichage produit contrat Ok!");
        return detailsProduit.toString();
    }
    
    public String[][] rechercherUnProduitParMotCle(String motCle, String typeDeRecherche){
        String[][] infosDesProduits;

        // Vérification du type de recherche
        if (typeDeRecherche.equals("Nom produit")) {
            infosDesProduits = new String[][] {{"111", "12/12/2024", "test rech nom produit ok"}};
        } else if (typeDeRecherche.equals("Nom fournisseur")) {
            infosDesProduits = new String[][] {{"222", "01/01/2023", "test rech Nom fournisseur ok"}};
        } else {
            // Type de recherche invalide
            infosDesProduits = new String[][] {{"Aucun Produit trouvé", "", "", ""}};
        }

        return infosDesProduits;
    }
}
