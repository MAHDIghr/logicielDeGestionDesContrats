/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package presentation;


import dialog.DialogNouveauContrat;

public class PresentationJDialogNouveauContrat extends javax.swing.JDialog {
	DialogNouveauContrat dialog = new DialogNouveauContrat();

	public PresentationJDialogNouveauContrat(java.awt.Frame parent, boolean modal) {
		super(parent, modal);
		initComponents();
	}

	public void setJDialog(String numContratAutomatique) {
		setLocationRelativeTo(null);
		// griser les composantes
		numContrat.setText(numContratAutomatique);
		ajouterBtn.setEnabled(false);
		numSiretTxtField.setEnabled(false);
		nomEntrepriseTxtField.setEnabled(false);
		numTelFournisseurTxtField.setEnabled(false);
                adresseMailFournisseurTxtField.setEnabled(false);
		choixFournisseurComboBox.setEnabled(false);
		nomProduitTxtField.setEnabled(false);
		choixNiveauQualiteComboBox.setEnabled(false);
		numRefTxtField.setEnabled(false);
		choixEtatProdChemComboBox.setEnabled(false);
		choixEstProduitDangereuComboBox.setEnabled(false);
		choixMatiereComboBox.setEnabled(false);
		choixTypeFrequanceComboBox.setEnabled(false);
		frequanceTxtField.setEnabled(false);
	}

	public void initDialog(DialogNouveauContrat dialog) {
		this.dialog = dialog;
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDetailsFournisseur = new javax.swing.JPanel();
        labelAcceuil4 = new javax.swing.JLabel();
        labelDetailsDuFournisseur = new javax.swing.JLabel();
        nomEntrepriseTxtField = new javax.swing.JTextField();
        numTelFournisseurTxtField = new javax.swing.JTextField();
        numSiretTxtField = new javax.swing.JTextField();
        labelNumSiret = new javax.swing.JLabel();
        labelNomEntreprise = new javax.swing.JLabel();
        labelNumTelFournisseur = new javax.swing.JLabel();
        nouveauFournisseurRadio = new javax.swing.JRadioButton();
        fournisseurExistantRadioBtn = new javax.swing.JRadioButton();
        choixFournisseurComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        labelNumContrat = new javax.swing.JLabel();
        numContrat = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        adresseMailFournisseurTxtField = new javax.swing.JTextField();
        labelAdresseMailFournisseur = new javax.swing.JLabel();
        panelDetailsPrduit = new javax.swing.JPanel();
        labelNumLivraison1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nomProduitTxtField = new javax.swing.JTextField();
        choixNiveauQualiteComboBox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        numRefTxtField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        produitChemiRadioBtn = new javax.swing.JRadioButton();
        produitEmballageRadioBtn = new javax.swing.JRadioButton();
        choixMatiereComboBox = new javax.swing.JComboBox<>();
        labelMatiere = new javax.swing.JLabel();
        choixEtatProdChemComboBox = new javax.swing.JComboBox<>();
        labelMatiere1 = new javax.swing.JLabel();
        choixEstProduitDangereuComboBox = new javax.swing.JComboBox<>();
        labelMatiere2 = new javax.swing.JLabel();
        panelDetailContrat = new javax.swing.JPanel();
        panelDetailsContrat = new javax.swing.JLabel();
        choixTypeFrequanceComboBox = new javax.swing.JComboBox<>();
        frequanceTxtField = new javax.swing.JTextField();
        ajouterBtn = new javax.swing.JButton();
        annulerBoutton = new javax.swing.JButton();
        labelDateDebutContrat = new javax.swing.JLabel();
        labelDateFinContrat = new javax.swing.JLabel();
        labelTypeFrequance = new javax.swing.JLabel();
        labelFrequance = new javax.swing.JLabel();
        dateDebutContratFormattedTextField = new javax.swing.JFormattedTextField();
        dateFinContratFormattedTextField = new javax.swing.JFormattedTextField();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelDetailsFournisseur.setBackground(new java.awt.Color(149, 190, 246));

        labelAcceuil4.setBackground(new java.awt.Color(255, 255, 255));
        labelAcceuil4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 31)); // NOI18N
        labelAcceuil4.setForeground(new java.awt.Color(255, 255, 255));
        labelAcceuil4.setText("Nouveau contrat ");
        labelAcceuil4.setToolTipText("");

        labelDetailsDuFournisseur.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        labelDetailsDuFournisseur.setForeground(new java.awt.Color(255, 255, 255));
        labelDetailsDuFournisseur.setText("Détails du fournisseur :");

        numSiretTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numSiretTxtFieldActionPerformed(evt);
            }
        });

        labelNumSiret.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelNumSiret.setForeground(new java.awt.Color(255, 255, 255));
        labelNumSiret.setText("Num de siret :");

        labelNomEntreprise.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelNomEntreprise.setForeground(new java.awt.Color(255, 255, 255));
        labelNomEntreprise.setText("Nom d'entreprise (Marque) : ");

        labelNumTelFournisseur.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelNumTelFournisseur.setForeground(new java.awt.Color(255, 255, 255));
        labelNumTelFournisseur.setText("Numéro de téléphone :");

        nouveauFournisseurRadio.setBackground(new java.awt.Color(149, 190, 246));
        nouveauFournisseurRadio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nouveauFournisseurRadio.setForeground(new java.awt.Color(255, 255, 255));
        nouveauFournisseurRadio.setText("Nouveau fournisseur");
        nouveauFournisseurRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nouveauFournisseurRadioActionPerformed(evt);
            }
        });

        fournisseurExistantRadioBtn.setBackground(new java.awt.Color(149, 190, 246));
        fournisseurExistantRadioBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fournisseurExistantRadioBtn.setForeground(new java.awt.Color(255, 255, 255));
        fournisseurExistantRadioBtn.setText("Fournisseur Existant");
        fournisseurExistantRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fournisseurExistantRadioBtnActionPerformed(evt);
            }
        });

        choixFournisseurComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "itel1", "item2" }));
        choixFournisseurComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choixFournisseurComboBoxActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Choisir le fournisseur :");

        labelNumContrat.setBackground(new java.awt.Color(149, 190, 246));
        labelNumContrat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelNumContrat.setForeground(new java.awt.Color(255, 255, 255));
        labelNumContrat.setText("Num Contrat (automatique) : ");

        numContrat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        numContrat.setText("   ");

        labelAdresseMailFournisseur.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelAdresseMailFournisseur.setForeground(new java.awt.Color(255, 255, 255));
        labelAdresseMailFournisseur.setText("Adresse mail :");

        javax.swing.GroupLayout panelDetailsFournisseurLayout = new javax.swing.GroupLayout(panelDetailsFournisseur);
        panelDetailsFournisseur.setLayout(panelDetailsFournisseurLayout);
        panelDetailsFournisseurLayout.setHorizontalGroup(
            panelDetailsFournisseurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDetailsFournisseurLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelDetailsFournisseurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDetailsDuFournisseur, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNumSiret, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numSiretTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelDetailsFournisseurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelDetailsFournisseurLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(panelDetailsFournisseurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomEntrepriseTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNomEntreprise, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(panelDetailsFournisseurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numTelFournisseurTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNumTelFournisseur, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelDetailsFournisseurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelAdresseMailFournisseur, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adresseMailFournisseurTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelDetailsFournisseurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(choixFournisseurComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59))
                    .addGroup(panelDetailsFournisseurLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(nouveauFournisseurRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fournisseurExistantRadioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))
                    .addGroup(panelDetailsFournisseurLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelDetailsFournisseurLayout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(labelNumContrat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numContrat, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(18, Short.MAX_VALUE))))
            .addGroup(panelDetailsFournisseurLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(labelAcceuil4, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelDetailsFournisseurLayout.setVerticalGroup(
            panelDetailsFournisseurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDetailsFournisseurLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelAcceuil4)
                .addGap(19, 19, 19)
                .addGroup(panelDetailsFournisseurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelDetailsFournisseurLayout.createSequentialGroup()
                        .addGroup(panelDetailsFournisseurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDetailsFournisseurLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(fournisseurExistantRadioBtn))
                            .addGroup(panelDetailsFournisseurLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(labelDetailsDuFournisseur, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25)
                        .addComponent(labelNumSiret)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numSiretTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDetailsFournisseurLayout.createSequentialGroup()
                        .addGroup(panelDetailsFournisseurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNumContrat)
                            .addComponent(numContrat))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nouveauFournisseurRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelDetailsFournisseurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNumTelFournisseur)
                            .addComponent(labelNomEntreprise)
                            .addComponent(jLabel4)
                            .addComponent(labelAdresseMailFournisseur))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelDetailsFournisseurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(choixFournisseurComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelDetailsFournisseurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nomEntrepriseTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(numTelFournisseurTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(adresseMailFournisseurTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        panelDetailsPrduit.setBackground(new java.awt.Color(149, 190, 246));

        labelNumLivraison1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        labelNumLivraison1.setForeground(new java.awt.Color(255, 255, 255));
        labelNumLivraison1.setText("Détails du produit :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nom :");

        choixNiveauQualiteComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EXCELENTE", "BONNE", "MOYENNE", "MAUVAISE" }));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Niveau de qualite :");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Numéro de référence  :");

        produitChemiRadioBtn.setBackground(new java.awt.Color(149, 190, 246));
        produitChemiRadioBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        produitChemiRadioBtn.setForeground(new java.awt.Color(255, 255, 255));
        produitChemiRadioBtn.setText("Produit chemique ");
        produitChemiRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produitChemiRadioBtnActionPerformed(evt);
            }
        });

        produitEmballageRadioBtn.setBackground(new java.awt.Color(149, 190, 246));
        produitEmballageRadioBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        produitEmballageRadioBtn.setForeground(new java.awt.Color(255, 255, 255));
        produitEmballageRadioBtn.setText("Produit d'amballage");
        produitEmballageRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produitEmballageRadioBtnActionPerformed(evt);
            }
        });

        choixMatiereComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PLASTIQUE", "CARTON", "METALE", "AUTRE" }));

        labelMatiere.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelMatiere.setForeground(new java.awt.Color(255, 255, 255));
        labelMatiere.setText("Matière :");

        choixEtatProdChemComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GAZE", "LIQUIDE", "SOLIDE" }));

        labelMatiere1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelMatiere1.setForeground(new java.awt.Color(255, 255, 255));
        labelMatiere1.setText("Etat :");

        choixEstProduitDangereuComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "oui", "non" }));

        labelMatiere2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelMatiere2.setForeground(new java.awt.Color(255, 255, 255));
        labelMatiere2.setText("Produit dangereu :");

        javax.swing.GroupLayout panelDetailsPrduitLayout = new javax.swing.GroupLayout(panelDetailsPrduit);
        panelDetailsPrduit.setLayout(panelDetailsPrduitLayout);
        panelDetailsPrduitLayout.setHorizontalGroup(
            panelDetailsPrduitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDetailsPrduitLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(labelMatiere1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149)
                .addComponent(labelMatiere, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDetailsPrduitLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelDetailsPrduitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNumLivraison1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelDetailsPrduitLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(panelDetailsPrduitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomProduitTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(panelDetailsPrduitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(panelDetailsPrduitLayout.createSequentialGroup()
                                .addComponent(choixNiveauQualiteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(numRefTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelDetailsPrduitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelMatiere2)
                    .addGroup(panelDetailsPrduitLayout.createSequentialGroup()
                        .addGroup(panelDetailsPrduitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(produitChemiRadioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(choixEtatProdChemComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(choixEstProduitDangereuComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75)
                        .addGroup(panelDetailsPrduitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(choixMatiereComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(produitEmballageRadioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26))
        );
        panelDetailsPrduitLayout.setVerticalGroup(
            panelDetailsPrduitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDetailsPrduitLayout.createSequentialGroup()
                .addGroup(panelDetailsPrduitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNumLivraison1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelDetailsPrduitLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(panelDetailsPrduitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(produitChemiRadioBtn)
                            .addComponent(produitEmballageRadioBtn))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDetailsPrduitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDetailsPrduitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelMatiere1)
                        .addComponent(jLabel7)
                        .addComponent(jLabel6)
                        .addComponent(jLabel5))
                    .addComponent(labelMatiere))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDetailsPrduitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(numRefTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelDetailsPrduitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(choixNiveauQualiteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(choixMatiereComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(choixEtatProdChemComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(nomProduitTxtField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelMatiere2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(choixEstProduitDangereuComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        panelDetailContrat.setBackground(new java.awt.Color(149, 190, 246));

        panelDetailsContrat.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        panelDetailsContrat.setForeground(new java.awt.Color(255, 255, 255));
        panelDetailsContrat.setText("Détails du contrat :");

        choixTypeFrequanceComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SEMAINE", "MOIS", "ANNEE" }));

        ajouterBtn.setBackground(new java.awt.Color(153, 255, 153));
        ajouterBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ajouterBtn.setForeground(new java.awt.Color(255, 255, 255));
        ajouterBtn.setText("Ajouter");
        ajouterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterBtnActionPerformed(evt);
            }
        });

        annulerBoutton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        annulerBoutton.setText("Annuler");
        annulerBoutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerBouttonActionPerformed(evt);
            }
        });

        labelDateDebutContrat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelDateDebutContrat.setForeground(new java.awt.Color(255, 255, 255));
        labelDateDebutContrat.setText("Date de début :");

        labelDateFinContrat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelDateFinContrat.setForeground(new java.awt.Color(255, 255, 255));
        labelDateFinContrat.setText("Date de fin :");

        labelTypeFrequance.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelTypeFrequance.setForeground(new java.awt.Color(255, 255, 255));
        labelTypeFrequance.setText("type de fréquance :");

        labelFrequance.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelFrequance.setForeground(new java.awt.Color(255, 255, 255));
        labelFrequance.setText("Fréquance :");

        dateDebutContratFormattedTextField.setText("JJ/MM/AAAA");
        dateDebutContratFormattedTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dateDebutContratFormattedTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dateDebutContratFormattedTextFieldFocusLost(evt);
            }
        });
        dateDebutContratFormattedTextField.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                dateDebutContratFormattedTextFieldInputMethodTextChanged(evt);
            }
        });

        dateFinContratFormattedTextField.setText("JJ/MM/AAAA");
        dateFinContratFormattedTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dateFinContratFormattedTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dateFinContratFormattedTextFieldFocusLost(evt);
            }
        });

        javax.swing.GroupLayout panelDetailContratLayout = new javax.swing.GroupLayout(panelDetailContrat);
        panelDetailContrat.setLayout(panelDetailContratLayout);
        panelDetailContratLayout.setHorizontalGroup(
            panelDetailContratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDetailContratLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelDetailContratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDetailContratLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(panelDetailContratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDateDebutContrat)
                            .addComponent(dateDebutContratFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(95, 95, 95)
                        .addGroup(panelDetailContratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateFinContratFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelDateFinContrat))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelDetailContratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDetailContratLayout.createSequentialGroup()
                                .addComponent(frequanceTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelDetailContratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDetailContratLayout.createSequentialGroup()
                                        .addComponent(annulerBoutton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ajouterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDetailContratLayout.createSequentialGroup()
                                        .addGroup(panelDetailContratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(labelTypeFrequance)
                                            .addComponent(choixTypeFrequanceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(57, 57, 57))))
                            .addGroup(panelDetailContratLayout.createSequentialGroup()
                                .addComponent(labelFrequance)
                                .addGap(288, 288, 288))))
                    .addGroup(panelDetailContratLayout.createSequentialGroup()
                        .addComponent(panelDetailsContrat, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addComponent(jSeparator2)
        );
        panelDetailContratLayout.setVerticalGroup(
            panelDetailContratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDetailContratLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDetailsContrat, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(panelDetailContratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDateDebutContrat)
                    .addComponent(labelDateFinContrat)
                    .addComponent(labelFrequance)
                    .addComponent(labelTypeFrequance))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDetailContratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(choixTypeFrequanceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(frequanceTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateFinContratFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateDebutContratFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(panelDetailContratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ajouterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(annulerBoutton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDetailsFournisseur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelDetailsPrduit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelDetailContrat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelDetailsFournisseur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDetailsPrduit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDetailContrat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dateDebutContratFormattedTextFieldInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_dateDebutContratFormattedTextFieldInputMethodTextChanged
        
    }//GEN-LAST:event_dateDebutContratFormattedTextFieldInputMethodTextChanged

    private void dateFinContratFormattedTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dateFinContratFormattedTextFieldFocusGained
        if (dateFinContratFormattedTextField.getText().equals("JJ/MM/AAAA") && dateFinContratFormattedTextField.isEnabled()) {
            dateFinContratFormattedTextField.setText("");
        }
    }//GEN-LAST:event_dateFinContratFormattedTextFieldFocusGained

    private void dateFinContratFormattedTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dateFinContratFormattedTextFieldFocusLost
        if (dateFinContratFormattedTextField.getText().equals("") && dateFinContratFormattedTextField.isEnabled()) {
            dateFinContratFormattedTextField.setText("JJ/MM/AAAA");
        }
    }//GEN-LAST:event_dateFinContratFormattedTextFieldFocusLost

    private void dateDebutContratFormattedTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dateDebutContratFormattedTextFieldFocusGained
        if (dateDebutContratFormattedTextField.getText().equals("JJ/MM/AAAA") && dateDebutContratFormattedTextField.isEnabled()) {
            dateDebutContratFormattedTextField.setText("");
        }
    }//GEN-LAST:event_dateDebutContratFormattedTextFieldFocusGained

    private void dateDebutContratFormattedTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dateDebutContratFormattedTextFieldFocusLost
        if (dateDebutContratFormattedTextField.getText().equals("") && dateDebutContratFormattedTextField.isEnabled()) {
            dateDebutContratFormattedTextField.setText("JJ/MM/AAAA");
        }
    }//GEN-LAST:event_dateDebutContratFormattedTextFieldFocusLost

	private void fournisseurExistantRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_fournisseurExistantRadioBtnActionPerformed
		if (fournisseurExistantRadioBtn.isSelected()) {
			choixFournisseurComboBox.setEnabled(true);
			nomProduitTxtField.setEnabled(true);
			choixNiveauQualiteComboBox.setEnabled(true);
			numRefTxtField.setEnabled(true);
			nouveauFournisseurRadio.setSelected(false);
			numSiretTxtField.setEnabled(false);
			nomEntrepriseTxtField.setEnabled(false);
			numTelFournisseurTxtField.setEnabled(false);
                        adresseMailFournisseurTxtField.setEnabled(false);
		} else {
			nomProduitTxtField.setEnabled(false);
			choixNiveauQualiteComboBox.setEnabled(false);
			numRefTxtField.setEnabled(false);
			choixFournisseurComboBox.setEnabled(false);
		}
	}// GEN-LAST:event_fournisseurExistantRadioBtnActionPerformed
	
	private void produitChemiRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_produitChemiRadioBtnActionPerformed
		if (produitChemiRadioBtn.isSelected()) {
			produitEmballageRadioBtn.setSelected(false);
			choixEtatProdChemComboBox.setEnabled(true);
			choixEstProduitDangereuComboBox.setEnabled(true);
			frequanceTxtField.setEnabled(true);
			choixTypeFrequanceComboBox.setEnabled(true);
			ajouterBtn.setEnabled(true);
			choixMatiereComboBox.setEnabled(false);
		} else {
			choixEtatProdChemComboBox.setEnabled(false);
			choixEstProduitDangereuComboBox.setEnabled(false);
			frequanceTxtField.setEnabled(false);
			choixTypeFrequanceComboBox.setEnabled(false);
			ajouterBtn.setEnabled(false);
		}
	}// GEN-LAST:event_produitChemiRadioBtnActionPerformed
	
	private void numSiretTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_numSiretTxtFieldActionPerformed
		
	}// GEN-LAST:event_numSiretTxtFieldActionPerformed

	private void produitEmballageRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_produitEmballageRadioBtnActionPerformed
		if (produitEmballageRadioBtn.isSelected()) {
			produitChemiRadioBtn.setSelected(false);
			choixMatiereComboBox.setEnabled(true);
			dateDebutContratFormattedTextField.setEnabled(true);
			dateFinContratFormattedTextField.setEnabled(true);
			frequanceTxtField.setEnabled(true);
			choixTypeFrequanceComboBox.setEnabled(true);
			ajouterBtn.setEnabled(true);
			choixEtatProdChemComboBox.setEnabled(false);
			choixEstProduitDangereuComboBox.setEnabled(false);
		} else {
			choixMatiereComboBox.setEnabled(false);
			dateDebutContratFormattedTextField.setEnabled(false);
			dateFinContratFormattedTextField.setEnabled(false);
			frequanceTxtField.setEnabled(false);
			choixTypeFrequanceComboBox.setEnabled(false);
			ajouterBtn.setEnabled(false);
		}
	}// GEN-LAST:event_produitEmballageRadioBtnActionPerformed
        private void choixFournisseurComboBoxActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_annulerBouttonActionPerformed
	
	}// GEN-LAST:event_annulerBouttonActionPerformed
        
	private void ajouterBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ajouterBtnActionPerformed

		// infos fournisseur
		String numSiret = numSiretTxtField.getText();
		String nomEntreprise = nomEntrepriseTxtField.getText();
		String numtelFournisseur = numTelFournisseurTxtField.getText();
                String adresseMail = adresseMailFournisseurTxtField.getText();
		String cleFournisseurExistant = choixFournisseurComboBox.getSelectedItem().toString();

		// infos produit
		String nomProduit = nomProduitTxtField.getText();
		String niveauQualite = choixNiveauQualiteComboBox.getSelectedItem().toString();
		String numRef = numRefTxtField.getText();
		String etatProduit = choixEtatProdChemComboBox.getSelectedItem().toString();
		String estDangereu = choixEstProduitDangereuComboBox.getSelectedItem().toString();
		String matiere = choixMatiereComboBox.getSelectedItem().toString();

		// infos contrat
		String dateDebut = dateDebutContratFormattedTextField.getText();
		String dateFin = dateFinContratFormattedTextField.getText();
		String frequance = frequanceTxtField.getText();
		String typeDeFrequance = choixTypeFrequanceComboBox.getSelectedItem().toString();
		String numContratAutomatique = numContrat.getText();

                
                if (produitChemiRadioBtn.isSelected()) {
                    dialog.ajouterUnProduit(nomProduit, niveauQualite, numRef,null, etatProduit,estDangereu);
                } else {
                    dialog.ajouterUnProduit(nomProduit, niveauQualite, numRef, matiere, null, null);
                }
			
                if (!fournisseurExistantRadioBtn.isSelected()) {
                    dialog.ajouterUnNouveauFournisseur(numtelFournisseur, nomEntreprise, adresseMail, numSiret);
                    dialog.handelEventBoutonAjouterUnNouveauContrat(numContratAutomatique, numtelFournisseur, numRef, dateDebut,
					dateFin, frequance, typeDeFrequance);
		} else {
                    dialog.handelEventBoutonAjouterUnNouveauContrat(numContratAutomatique, cleFournisseurExistant, numRef, dateDebut,
					dateFin, frequance, typeDeFrequance);
                }

		setVisible(false);
	}// GEN-LAST:event_ajouterBtnActionPerformed

	private void annulerBouttonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_annulerBouttonActionPerformed
		dialog.handelEventBoutonAnnuler();
	}// GEN-LAST:event_annulerBouttonActionPerformed
        
	private void nouveauFournisseurRadioActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_nouveauFournisseurRadioActionPerformed
		if (nouveauFournisseurRadio.isSelected()) {
			fournisseurExistantRadioBtn.setSelected(false);
			numSiretTxtField.setEnabled(true);
			nomEntrepriseTxtField.setEnabled(true);
			numTelFournisseurTxtField.setEnabled(true);
                        adresseMailFournisseurTxtField.setEnabled(true);
			nomProduitTxtField.setEnabled(true);
			choixNiveauQualiteComboBox.setEnabled(true);
			numRefTxtField.setEnabled(true);
			choixFournisseurComboBox.setEnabled(false);
		} else {
			numSiretTxtField.setEnabled(false);
			nomEntrepriseTxtField.setEnabled(false);
			numTelFournisseurTxtField.setEnabled(false);
                        adresseMailFournisseurTxtField.setEnabled(false);
			nomProduitTxtField.setEnabled(false);
			choixNiveauQualiteComboBox.setEnabled(false);
			numRefTxtField.setEnabled(false);
		}

	}// GEN-LAST:event_nouveauFournisseurRadioActionPerformed

	private void nomFournisseurTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_nomFournisseurTxtFieldActionPerformed

	}// GEN-LAST:event_nomFournisseurTxtFieldActionPerformed

	

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adresseMailFournisseurTxtField;
    private javax.swing.JButton ajouterBtn;
    private javax.swing.JButton annulerBoutton;
    private javax.swing.JComboBox<String> choixEstProduitDangereuComboBox;
    private javax.swing.JComboBox<String> choixEtatProdChemComboBox;
    private javax.swing.JComboBox<String> choixFournisseurComboBox;
    private javax.swing.JComboBox<String> choixMatiereComboBox;
    private javax.swing.JComboBox<String> choixNiveauQualiteComboBox;
    private javax.swing.JComboBox<String> choixTypeFrequanceComboBox;
    private javax.swing.JFormattedTextField dateDebutContratFormattedTextField;
    private javax.swing.JFormattedTextField dateFinContratFormattedTextField;
    private javax.swing.JRadioButton fournisseurExistantRadioBtn;
    private javax.swing.JTextField frequanceTxtField;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelAcceuil4;
    private javax.swing.JLabel labelAdresseMailFournisseur;
    private javax.swing.JLabel labelDateDebutContrat;
    private javax.swing.JLabel labelDateFinContrat;
    private javax.swing.JLabel labelDetailsDuFournisseur;
    private javax.swing.JLabel labelFrequance;
    private javax.swing.JLabel labelMatiere;
    private javax.swing.JLabel labelMatiere1;
    private javax.swing.JLabel labelMatiere2;
    private javax.swing.JLabel labelNomEntreprise;
    private javax.swing.JLabel labelNumContrat;
    private javax.swing.JLabel labelNumLivraison1;
    private javax.swing.JLabel labelNumSiret;
    private javax.swing.JLabel labelNumTelFournisseur;
    private javax.swing.JLabel labelTypeFrequance;
    private javax.swing.JTextField nomEntrepriseTxtField;
    private javax.swing.JTextField nomProduitTxtField;
    private javax.swing.JRadioButton nouveauFournisseurRadio;
    private javax.swing.JLabel numContrat;
    private javax.swing.JTextField numRefTxtField;
    private javax.swing.JTextField numSiretTxtField;
    private javax.swing.JTextField numTelFournisseurTxtField;
    private javax.swing.JPanel panelDetailContrat;
    private javax.swing.JLabel panelDetailsContrat;
    private javax.swing.JPanel panelDetailsFournisseur;
    private javax.swing.JPanel panelDetailsPrduit;
    private javax.swing.JRadioButton produitChemiRadioBtn;
    private javax.swing.JRadioButton produitEmballageRadioBtn;
    // End of variables declaration//GEN-END:variables
}
