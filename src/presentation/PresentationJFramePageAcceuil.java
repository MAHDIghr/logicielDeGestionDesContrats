/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentation;

import dialog.DialogPageAcceuil;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class PresentationJFramePageAcceuil extends javax.swing.JFrame {
    private DialogPageAcceuil dialog = new DialogPageAcceuil();
    
    public PresentationJFramePageAcceuil() {
        initComponents();
    }

    public void initDialog(DialogPageAcceuil dialog) {
            this.dialog = dialog;
    }

    public void setFrame() {
            setLocationRelativeTo(null);
            setVisible(true);
            setResizable(false);
            setRadioButtonsDeLaPageDesContrats();
            setBaresDeRechreches();
            buttonEffacerFiltresContrat.setVisible(false);
            buttonEffacerFiltresProduit.setVisible(false);
            buttonEffacerFiltresFournisseur.setVisible(false);
    }
    /*--------------------------------------------------------------------------
       Méthode d'initialisation d'etats des composantes
    ----------------------------------------------------------------------------*/
    private void setRadioButtonsDeLaPageDesContrats(){
        radioButtonDateDebut.setSelected(false);
        radioButtonDateFin.setSelected(false);
        radioButtonNumContrat.setSelected(false);
        radioButtonNomFournisseur.setSelected(false);
        radioButtonNumTelFournisseur.setSelected(false);
        radioButtonProduitParNomFournisseur.setSelected(false);
        radioButtonProduitParNom.setSelected(false);
    }
    
    private void setBaresDeRechreches(){
        fieldrchercheAvecdateDebuContrat.setEnabled(false);
        fieldrchercheAvecNumContrat.setEnabled(false);
        fieldrchercheAvecDateFinContart.setEnabled(false);
        fieldrchercheAvecNumTelFournisseur.setEnabled(false);
        fieldrchercheAvecNomFournisseur.setEnabled(false);
        fieldRechercheProduitParNom.setEnabled(false);
        comboBoxRechercheProduitParFournisseur.setEnabled(false);
    }
    /*--------------------------------------------------------------------------
       Méthode d'initialisation de l'interface graphique avec les données
    ----------------------------------------------------------------------------*/
    public void setTableDesContrats(String[][] infosDesContrats){
        if (infosDesContrats == null) {
			labelMsgImportantMesContrats.setText("Aucun contrat n'a été etablie !");
		} else {
			DefaultTableModel model = (DefaultTableModel) tableDesContrats.getModel();
                         model.setRowCount(0);
			for (int i = 0; i < infosDesContrats.length; i++) {
				Object[] ligne = { infosDesContrats[i][0], infosDesContrats[i][1], infosDesContrats[i][2],
						infosDesContrats[i][3] };
				model.insertRow(i, ligne);
			}
		}
		buttonDetailsContart.setEnabled(false);
    }
    
    public void setTableDesFournisseurs(String[][] infosFournisseurs){
        if (infosFournisseurs == null) {
			labelMsgImportantMesFournisseurs.setText("Aucun fournisseur existant !");
		} else {
			DefaultTableModel model = (DefaultTableModel) tableDesFournisseurs.getModel();
                         model.setRowCount(0);
			for (int i = 0; i < infosFournisseurs.length; i++) {
				Object[] ligne = { infosFournisseurs[i][0], infosFournisseurs[i][1], infosFournisseurs[i][2]};
				model.insertRow(i, ligne);
			}
		}
		buttonDetailsFournisseur.setEnabled(false);
    }
    
    public void setTableDesProduits(String[][] infosProduits){
        if (infosProduits == null) {
			labelMsgImportantMesProduits.setText("Aucun produit existant !");
		} else {
			DefaultTableModel model = (DefaultTableModel) tableDesProduits.getModel();
                         model.setRowCount(0);
			for (int i = 0; i < infosProduits.length; i++) {
				Object[] ligne = { infosProduits[i][0], infosProduits[i][1], infosProduits[i][2]};
				model.insertRow(i, ligne);
			}
		}
		buttonDetailsProduit.setEnabled(false);
    }
    
    public void setComboBoxDesFournisseurs(String[][] infosFournisseurs) {
        // Vider la comboBox avant de la remplir
        comboBoxRechercheProduitParFournisseur.removeAllItems();

        // Remplir la comboBox avec les données des fournisseurs
        for (int i = 0; i < infosFournisseurs.length; i++) {
            if (infosFournisseurs[i].length > 1) { // Vérifie que la colonne 1 existe
                comboBoxRechercheProduitParFournisseur.addItem(infosFournisseurs[i][1]);
            }
        }
    }

    /*--------------------------------------------------------------------------
    ----------------------------------------------------------------------------*/
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabPane = new javax.swing.JTabbedPane();
        panelPageAcceuil = new javax.swing.JPanel();
        panelHeadPageAcceuil = new javax.swing.JPanel();
        labelTitrePageAcceuil = new javax.swing.JLabel();
        buttonMesContrats = new javax.swing.JButton();
        buttonMesLivraisons = new javax.swing.JButton();
        buttonMesFournisseurs = new javax.swing.JButton();
        panelMesContarts = new javax.swing.JPanel();
        panelHeadPageAcceuil1 = new javax.swing.JPanel();
        fieldrchercheAvecNumContrat = new javax.swing.JTextField();
        buttonRechercher = new javax.swing.JButton();
        labelMesFournisseurs1 = new javax.swing.JLabel();
        buttonRetour1 = new javax.swing.JButton();
        fieldrchercheAvecdateDebuContrat = new javax.swing.JTextField();
        radioButtonDateFin = new javax.swing.JRadioButton();
        radioButtonDateDebut = new javax.swing.JRadioButton();
        radioButtonNumContrat = new javax.swing.JRadioButton();
        fieldrchercheAvecDateFinContart = new javax.swing.JTextField();
        buttonNouveauContrat = new javax.swing.JButton();
        buttonDetailsContart = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDesContrats = new javax.swing.JTable();
        labelMsgImportantMesContrats = new javax.swing.JLabel();
        buttonEffacerFiltresContrat = new javax.swing.JButton();
        panelPageMesFournisseurs = new javax.swing.JPanel();
        panelHeadPageAcceuil2 = new javax.swing.JPanel();
        fieldrchercheAvecNumTelFournisseur = new javax.swing.JTextField();
        buttonRechercher1 = new javax.swing.JButton();
        labelMesFournisseurs = new javax.swing.JLabel();
        buttonRetour2 = new javax.swing.JButton();
        radioButtonNumTelFournisseur = new javax.swing.JRadioButton();
        radioButtonNomFournisseur = new javax.swing.JRadioButton();
        fieldrchercheAvecNomFournisseur = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableDesFournisseurs = new javax.swing.JTable();
        labelMsgImportantMesFournisseurs = new javax.swing.JLabel();
        buttonDetailsFournisseur = new javax.swing.JButton();
        buttonEffacerFiltresFournisseur = new javax.swing.JButton();
        panelMesLivraisons = new javax.swing.JPanel();
        panelHeadPageAcceuil3 = new javax.swing.JPanel();
        fieldRechercheProduitParNom = new javax.swing.JTextField();
        buttonRechercher2 = new javax.swing.JButton();
        labelMesFournisseurs2 = new javax.swing.JLabel();
        buttonRetour3 = new javax.swing.JButton();
        radioButtonProduitParNom = new javax.swing.JRadioButton();
        radioButtonProduitParNomFournisseur = new javax.swing.JRadioButton();
        comboBoxRechercheProduitParFournisseur = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableDesProduits = new javax.swing.JTable();
        buttonDetailsProduit = new javax.swing.JButton();
        labelMsgImportantMesProduits = new javax.swing.JLabel();
        buttonEffacerFiltresProduit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        panelPageAcceuil.setBackground(new java.awt.Color(255, 255, 255));

        panelHeadPageAcceuil.setBackground(new java.awt.Color(149, 190, 246));

        labelTitrePageAcceuil.setBackground(new java.awt.Color(255, 255, 255));
        labelTitrePageAcceuil.setFont(new java.awt.Font("Segoe UI Semibold", 1, 31)); // NOI18N
        labelTitrePageAcceuil.setForeground(new java.awt.Color(255, 255, 255));
        labelTitrePageAcceuil.setText("Bienvenue sur votre espace de gestion");

        javax.swing.GroupLayout panelHeadPageAcceuilLayout = new javax.swing.GroupLayout(panelHeadPageAcceuil);
        panelHeadPageAcceuil.setLayout(panelHeadPageAcceuilLayout);
        panelHeadPageAcceuilLayout.setHorizontalGroup(
            panelHeadPageAcceuilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeadPageAcceuilLayout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(labelTitrePageAcceuil, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
                .addGap(213, 213, 213))
        );
        panelHeadPageAcceuilLayout.setVerticalGroup(
            panelHeadPageAcceuilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeadPageAcceuilLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(labelTitrePageAcceuil, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        buttonMesContrats.setBackground(new java.awt.Color(149, 190, 246));
        buttonMesContrats.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonMesContrats.setForeground(new java.awt.Color(255, 255, 255));
        buttonMesContrats.setText("Mes contrats");
        buttonMesContrats.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonMesContrats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMesContratsActionPerformed(evt);
            }
        });

        buttonMesLivraisons.setBackground(new java.awt.Color(149, 190, 246));
        buttonMesLivraisons.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonMesLivraisons.setForeground(new java.awt.Color(255, 255, 255));
        buttonMesLivraisons.setText("Mes produits");
        buttonMesLivraisons.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonMesLivraisons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMesLivraisonsActionPerformed(evt);
            }
        });

        buttonMesFournisseurs.setBackground(new java.awt.Color(149, 190, 246));
        buttonMesFournisseurs.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonMesFournisseurs.setForeground(new java.awt.Color(255, 255, 255));
        buttonMesFournisseurs.setText("Mes fournisseurs");
        buttonMesFournisseurs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonMesFournisseurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMesFournisseursActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPageAcceuilLayout = new javax.swing.GroupLayout(panelPageAcceuil);
        panelPageAcceuil.setLayout(panelPageAcceuilLayout);
        panelPageAcceuilLayout.setHorizontalGroup(
            panelPageAcceuilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHeadPageAcceuil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelPageAcceuilLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(buttonMesContrats, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136)
                .addComponent(buttonMesFournisseurs)
                .addGap(124, 124, 124)
                .addComponent(buttonMesLivraisons, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPageAcceuilLayout.setVerticalGroup(
            panelPageAcceuilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPageAcceuilLayout.createSequentialGroup()
                .addComponent(panelHeadPageAcceuil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(204, 204, 204)
                .addGroup(panelPageAcceuilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonMesContrats, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonMesFournisseurs, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonMesLivraisons, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 236, Short.MAX_VALUE))
        );

        tabPane.addTab("Acceuil", panelPageAcceuil);

        panelMesContarts.setBackground(new java.awt.Color(255, 255, 255));
        panelMesContarts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMesContartsMouseClicked(evt);
            }
        });

        panelHeadPageAcceuil1.setBackground(new java.awt.Color(149, 190, 246));
        panelHeadPageAcceuil1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelHeadPageAcceuil1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelHeadPageAcceuil1MouseClicked(evt);
            }
        });

        fieldrchercheAvecNumContrat.setText("Num contrat ...");
        fieldrchercheAvecNumContrat.setToolTipText("");
        fieldrchercheAvecNumContrat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldrchercheAvecNumContratFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldrchercheAvecNumContratFocusLost(evt);
            }
        });
        fieldrchercheAvecNumContrat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fieldrchercheAvecNumContratMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                fieldrchercheAvecNumContratMouseReleased(evt);
            }
        });

        buttonRechercher.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonRechercher.setText("Rechercher");
        buttonRechercher.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonRechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRechercherActionPerformed(evt);
            }
        });

        labelMesFournisseurs1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelMesFournisseurs1.setForeground(new java.awt.Color(255, 255, 255));
        labelMesFournisseurs1.setText("Mes contrats");

        buttonRetour1.setBackground(new java.awt.Color(255, 102, 102));
        buttonRetour1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonRetour1.setForeground(new java.awt.Color(255, 255, 255));
        buttonRetour1.setText("Retour");
        buttonRetour1.setBorder(null);
        buttonRetour1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonRetour1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRetour1ActionPerformed(evt);
            }
        });

        fieldrchercheAvecdateDebuContrat.setText("Date de début ...");
        fieldrchercheAvecdateDebuContrat.setToolTipText("");
        fieldrchercheAvecdateDebuContrat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldrchercheAvecdateDebuContratFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldrchercheAvecdateDebuContratFocusLost(evt);
            }
        });

        radioButtonDateFin.setBackground(new java.awt.Color(149, 190, 246));
        radioButtonDateFin.setForeground(new java.awt.Color(255, 255, 255));
        radioButtonDateFin.setText("Recherche par date de fin");
        radioButtonDateFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonDateFinActionPerformed(evt);
            }
        });

        radioButtonDateDebut.setBackground(new java.awt.Color(149, 190, 246));
        radioButtonDateDebut.setForeground(new java.awt.Color(255, 255, 255));
        radioButtonDateDebut.setText("Recherche par date de début");
        radioButtonDateDebut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonDateDebutActionPerformed(evt);
            }
        });

        radioButtonNumContrat.setBackground(new java.awt.Color(149, 190, 246));
        radioButtonNumContrat.setForeground(new java.awt.Color(255, 255, 255));
        radioButtonNumContrat.setText("Recherche par Num Contrat");
        radioButtonNumContrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonNumContratActionPerformed(evt);
            }
        });

        fieldrchercheAvecDateFinContart.setText("Date de fin ...");
        fieldrchercheAvecDateFinContart.setToolTipText("");
        fieldrchercheAvecDateFinContart.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldrchercheAvecDateFinContartFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldrchercheAvecDateFinContartFocusLost(evt);
            }
        });
        fieldrchercheAvecDateFinContart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldrchercheAvecDateFinContartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelHeadPageAcceuil1Layout = new javax.swing.GroupLayout(panelHeadPageAcceuil1);
        panelHeadPageAcceuil1.setLayout(panelHeadPageAcceuil1Layout);
        panelHeadPageAcceuil1Layout.setHorizontalGroup(
            panelHeadPageAcceuil1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeadPageAcceuil1Layout.createSequentialGroup()
                .addGroup(panelHeadPageAcceuil1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHeadPageAcceuil1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(labelMesFournisseurs1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonRetour1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelHeadPageAcceuil1Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addGroup(panelHeadPageAcceuil1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(radioButtonNumContrat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fieldrchercheAvecNumContrat))
                        .addGap(90, 90, 90)
                        .addGroup(panelHeadPageAcceuil1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(radioButtonDateDebut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fieldrchercheAvecdateDebuContrat))
                        .addGap(89, 89, 89)
                        .addGroup(panelHeadPageAcceuil1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(radioButtonDateFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fieldrchercheAvecDateFinContart))
                        .addGap(0, 168, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panelHeadPageAcceuil1Layout.createSequentialGroup()
                .addGap(437, 437, 437)
                .addComponent(buttonRechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelHeadPageAcceuil1Layout.setVerticalGroup(
            panelHeadPageAcceuil1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeadPageAcceuil1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHeadPageAcceuil1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMesFournisseurs1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonRetour1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addGroup(panelHeadPageAcceuil1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioButtonDateFin)
                    .addComponent(radioButtonDateDebut)
                    .addComponent(radioButtonNumContrat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelHeadPageAcceuil1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldrchercheAvecNumContrat, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldrchercheAvecdateDebuContrat, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldrchercheAvecDateFinContart, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(buttonRechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        buttonNouveauContrat.setBackground(new java.awt.Color(149, 190, 246));
        buttonNouveauContrat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonNouveauContrat.setForeground(new java.awt.Color(255, 255, 255));
        buttonNouveauContrat.setText("Etablir un nouveau contart (+)");
        buttonNouveauContrat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonNouveauContrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNouveauContratActionPerformed(evt);
            }
        });

        buttonDetailsContart.setBackground(new java.awt.Color(149, 190, 246));
        buttonDetailsContart.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonDetailsContart.setForeground(new java.awt.Color(255, 255, 255));
        buttonDetailsContart.setText("Afficher les details du contrat");
        buttonDetailsContart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonDetailsContart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDetailsContartActionPerformed(evt);
            }
        });

        tableDesContrats.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num Contrat", "Debut", "Fin ", "num tél du fournisseur"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableDesContrats.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tableDesContratsFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tableDesContratsFocusLost(evt);
            }
        });
        tableDesContrats.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDesContratsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableDesContrats);

        labelMsgImportantMesContrats.setForeground(new java.awt.Color(255, 51, 51));

        buttonEffacerFiltresContrat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonEffacerFiltresContrat.setText("Effacer les filtres");
        buttonEffacerFiltresContrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEffacerFiltresContratActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMesContartsLayout = new javax.swing.GroupLayout(panelMesContarts);
        panelMesContarts.setLayout(panelMesContartsLayout);
        panelMesContartsLayout.setHorizontalGroup(
            panelMesContartsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHeadPageAcceuil1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelMesContartsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMesContartsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMesContartsLayout.createSequentialGroup()
                        .addComponent(buttonNouveauContrat)
                        .addGroup(panelMesContartsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMesContartsLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(labelMsgImportantMesContrats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMesContartsLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonEffacerFiltresContrat)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonDetailsContart))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        panelMesContartsLayout.setVerticalGroup(
            panelMesContartsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMesContartsLayout.createSequentialGroup()
                .addComponent(panelHeadPageAcceuil1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelMesContartsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMesContartsLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(panelMesContartsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMesContartsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(buttonDetailsContart)
                                .addComponent(buttonEffacerFiltresContrat, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(buttonNouveauContrat))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMesContartsLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(labelMsgImportantMesContrats, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE))
        );

        tabPane.addTab("Mes Contrats", panelMesContarts);

        panelPageMesFournisseurs.setBackground(new java.awt.Color(255, 255, 255));

        panelHeadPageAcceuil2.setBackground(new java.awt.Color(149, 190, 246));

        fieldrchercheAvecNumTelFournisseur.setText("064192.....");
        fieldrchercheAvecNumTelFournisseur.setToolTipText("");
        fieldrchercheAvecNumTelFournisseur.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldrchercheAvecNumTelFournisseurFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldrchercheAvecNumTelFournisseurFocusLost(evt);
            }
        });

        buttonRechercher1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonRechercher1.setText("Rechercher");
        buttonRechercher1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRechercher1ActionPerformed(evt);
            }
        });

        labelMesFournisseurs.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelMesFournisseurs.setForeground(new java.awt.Color(255, 255, 255));
        labelMesFournisseurs.setText("Mes fournisseurs");

        buttonRetour2.setBackground(new java.awt.Color(255, 102, 102));
        buttonRetour2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonRetour2.setForeground(new java.awt.Color(255, 255, 255));
        buttonRetour2.setText("Retour");
        buttonRetour2.setBorder(null);
        buttonRetour2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonRetour2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRetour2ActionPerformed(evt);
            }
        });

        radioButtonNumTelFournisseur.setBackground(new java.awt.Color(149, 190, 246));
        radioButtonNumTelFournisseur.setForeground(new java.awt.Color(255, 255, 255));
        radioButtonNumTelFournisseur.setText("recherche par num tel");
        radioButtonNumTelFournisseur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonNumTelFournisseurActionPerformed(evt);
            }
        });

        radioButtonNomFournisseur.setBackground(new java.awt.Color(149, 190, 246));
        radioButtonNomFournisseur.setForeground(new java.awt.Color(255, 255, 255));
        radioButtonNomFournisseur.setText("Recherche par nom du fournisseur");
        radioButtonNomFournisseur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonNomFournisseurActionPerformed(evt);
            }
        });

        fieldrchercheAvecNomFournisseur.setText("Nom ...");
        fieldrchercheAvecNomFournisseur.setToolTipText("");
        fieldrchercheAvecNomFournisseur.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldrchercheAvecNomFournisseurFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldrchercheAvecNomFournisseurFocusLost(evt);
            }
        });

        javax.swing.GroupLayout panelHeadPageAcceuil2Layout = new javax.swing.GroupLayout(panelHeadPageAcceuil2);
        panelHeadPageAcceuil2.setLayout(panelHeadPageAcceuil2Layout);
        panelHeadPageAcceuil2Layout.setHorizontalGroup(
            panelHeadPageAcceuil2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeadPageAcceuil2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(labelMesFournisseurs, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 634, Short.MAX_VALUE)
                .addComponent(buttonRetour2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(panelHeadPageAcceuil2Layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addGroup(panelHeadPageAcceuil2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldrchercheAvecNumTelFournisseur, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioButtonNumTelFournisseur))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelHeadPageAcceuil2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldrchercheAvecNomFournisseur, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioButtonNomFournisseur, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(152, 152, 152))
            .addGroup(panelHeadPageAcceuil2Layout.createSequentialGroup()
                .addGap(437, 437, 437)
                .addComponent(buttonRechercher1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelHeadPageAcceuil2Layout.setVerticalGroup(
            panelHeadPageAcceuil2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeadPageAcceuil2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHeadPageAcceuil2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMesFournisseurs, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonRetour2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(radioButtonNumTelFournisseur)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldrchercheAvecNumTelFournisseur, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeadPageAcceuil2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(radioButtonNomFournisseur)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldrchercheAvecNomFournisseur, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(buttonRechercher1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        tableDesFournisseurs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num de telephone", "Nom du fournisseur", "Nom d'entreprise"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableDesFournisseurs.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tableDesFournisseursFocusGained(evt);
            }
        });
        tableDesFournisseurs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDesFournisseursMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableDesFournisseurs);

        labelMsgImportantMesFournisseurs.setForeground(new java.awt.Color(255, 51, 51));

        buttonDetailsFournisseur.setBackground(new java.awt.Color(149, 190, 246));
        buttonDetailsFournisseur.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonDetailsFournisseur.setForeground(new java.awt.Color(255, 255, 255));
        buttonDetailsFournisseur.setText("Afficher les details du contrat");
        buttonDetailsFournisseur.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonDetailsFournisseur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDetailsFournisseurActionPerformed(evt);
            }
        });

        buttonEffacerFiltresFournisseur.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonEffacerFiltresFournisseur.setText("Effacer les filtres");
        buttonEffacerFiltresFournisseur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEffacerFiltresFournisseurActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPageMesFournisseursLayout = new javax.swing.GroupLayout(panelPageMesFournisseurs);
        panelPageMesFournisseurs.setLayout(panelPageMesFournisseursLayout);
        panelPageMesFournisseursLayout.setHorizontalGroup(
            panelPageMesFournisseursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHeadPageAcceuil2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelPageMesFournisseursLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPageMesFournisseursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPageMesFournisseursLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelMsgImportantMesFournisseurs, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(buttonEffacerFiltresFournisseur)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonDetailsFournisseur)))
                .addContainerGap())
        );
        panelPageMesFournisseursLayout.setVerticalGroup(
            panelPageMesFournisseursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPageMesFournisseursLayout.createSequentialGroup()
                .addComponent(panelHeadPageAcceuil2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelPageMesFournisseursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelMsgImportantMesFournisseurs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPageMesFournisseursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonDetailsFournisseur)
                        .addComponent(buttonEffacerFiltresFournisseur, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabPane.addTab("Mes Fournisseurs", panelPageMesFournisseurs);

        panelMesLivraisons.setBackground(new java.awt.Color(255, 255, 255));

        panelHeadPageAcceuil3.setBackground(new java.awt.Color(149, 190, 246));
        panelHeadPageAcceuil3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        fieldRechercheProduitParNom.setText("Nom produit ...");
        fieldRechercheProduitParNom.setToolTipText("");
        fieldRechercheProduitParNom.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldRechercheProduitParNomFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldRechercheProduitParNomFocusLost(evt);
            }
        });
        fieldRechercheProduitParNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldRechercheProduitParNomActionPerformed(evt);
            }
        });

        buttonRechercher2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonRechercher2.setText("Rechercher");
        buttonRechercher2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonRechercher2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRechercher2ActionPerformed(evt);
            }
        });

        labelMesFournisseurs2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelMesFournisseurs2.setForeground(new java.awt.Color(255, 255, 255));
        labelMesFournisseurs2.setText("Mes produits");

        buttonRetour3.setBackground(new java.awt.Color(255, 102, 102));
        buttonRetour3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonRetour3.setForeground(new java.awt.Color(255, 255, 255));
        buttonRetour3.setText("Retour");
        buttonRetour3.setBorder(null);
        buttonRetour3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonRetour3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRetour3ActionPerformed(evt);
            }
        });

        radioButtonProduitParNom.setBackground(new java.awt.Color(149, 190, 246));
        radioButtonProduitParNom.setForeground(new java.awt.Color(255, 255, 255));
        radioButtonProduitParNom.setText("Recherche par nom du produit");
        radioButtonProduitParNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonProduitParNomActionPerformed(evt);
            }
        });

        radioButtonProduitParNomFournisseur.setBackground(new java.awt.Color(149, 190, 246));
        radioButtonProduitParNomFournisseur.setForeground(new java.awt.Color(255, 255, 255));
        radioButtonProduitParNomFournisseur.setText("Recherche par nom du fournisseur");
        radioButtonProduitParNomFournisseur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonProduitParNomFournisseurActionPerformed(evt);
            }
        });

        comboBoxRechercheProduitParFournisseur.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout panelHeadPageAcceuil3Layout = new javax.swing.GroupLayout(panelHeadPageAcceuil3);
        panelHeadPageAcceuil3.setLayout(panelHeadPageAcceuil3Layout);
        panelHeadPageAcceuil3Layout.setHorizontalGroup(
            panelHeadPageAcceuil3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeadPageAcceuil3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labelMesFournisseurs2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonRetour3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(panelHeadPageAcceuil3Layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addGroup(panelHeadPageAcceuil3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldRechercheProduitParNom, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioButtonProduitParNom))
                .addGap(232, 232, 232)
                .addGroup(panelHeadPageAcceuil3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(radioButtonProduitParNomFournisseur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboBoxRechercheProduitParFournisseur, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeadPageAcceuil3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonRechercher2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(419, 419, 419))
        );
        panelHeadPageAcceuil3Layout.setVerticalGroup(
            panelHeadPageAcceuil3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeadPageAcceuil3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHeadPageAcceuil3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMesFournisseurs2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonRetour3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(panelHeadPageAcceuil3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioButtonProduitParNom)
                    .addComponent(radioButtonProduitParNomFournisseur))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelHeadPageAcceuil3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldRechercheProduitParNom, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxRechercheProduitParFournisseur, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(buttonRechercher2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        tableDesProduits.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nom du produit", "Num de référence ", "Fournisseur"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableDesProduits.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tableDesProduitsFocusGained(evt);
            }
        });
        tableDesProduits.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDesProduitsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableDesProduits);

        buttonDetailsProduit.setBackground(new java.awt.Color(149, 190, 246));
        buttonDetailsProduit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonDetailsProduit.setForeground(new java.awt.Color(255, 255, 255));
        buttonDetailsProduit.setText("Afficher les details du produit");
        buttonDetailsProduit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonDetailsProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDetailsProduitActionPerformed(evt);
            }
        });

        labelMsgImportantMesProduits.setForeground(new java.awt.Color(255, 51, 51));

        buttonEffacerFiltresProduit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonEffacerFiltresProduit.setText("Effacer les filtres");
        buttonEffacerFiltresProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEffacerFiltresProduitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMesLivraisonsLayout = new javax.swing.GroupLayout(panelMesLivraisons);
        panelMesLivraisons.setLayout(panelMesLivraisonsLayout);
        panelMesLivraisonsLayout.setHorizontalGroup(
            panelMesLivraisonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHeadPageAcceuil3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelMesLivraisonsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelMsgImportantMesProduits, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonEffacerFiltresProduit, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonDetailsProduit, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMesLivraisonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        panelMesLivraisonsLayout.setVerticalGroup(
            panelMesLivraisonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMesLivraisonsLayout.createSequentialGroup()
                .addComponent(panelHeadPageAcceuil3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelMesLivraisonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMesLivraisonsLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(labelMsgImportantMesProduits, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMesLivraisonsLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelMesLivraisonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonDetailsProduit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonEffacerFiltresProduit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabPane.addTab("Mes Produits", panelMesLivraisons);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabPane, javax.swing.GroupLayout.DEFAULT_SIZE, 997, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonMesContratsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMesContratsActionPerformed
        tabPane.setSelectedIndex(1);
    }//GEN-LAST:event_buttonMesContratsActionPerformed

    private void buttonMesFournisseursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMesFournisseursActionPerformed
        tabPane.setSelectedIndex(2);
    }//GEN-LAST:event_buttonMesFournisseursActionPerformed

    private void buttonMesLivraisonsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMesLivraisonsActionPerformed
        tabPane.setSelectedIndex(3);
    }//GEN-LAST:event_buttonMesLivraisonsActionPerformed

    private void buttonRetour3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRetour3ActionPerformed
        tabPane.setSelectedIndex(0);
    }//GEN-LAST:event_buttonRetour3ActionPerformed

    private void buttonNouveauContratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNouveauContratActionPerformed
        dialog.handelEventBoutonEtablirNouveauContrat();
    }//GEN-LAST:event_buttonNouveauContratActionPerformed

    private void buttonDetailsContartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDetailsContartActionPerformed
        int numLigneSelectionee = tableDesContrats.getSelectedRow();
	String cleContrat = tableDesContrats.getValueAt(numLigneSelectionee, 0).toString();
	dialog.handelEventBoutonAfficherDetailsContrat(cleContrat);
    }//GEN-LAST:event_buttonDetailsContartActionPerformed

    private void tableDesFournisseursMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDesFournisseursMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tableDesFournisseursMouseClicked

    private void tableDesProduitsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDesProduitsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tableDesProduitsMouseClicked

    private void tableDesContratsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDesContratsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tableDesContratsMouseClicked

    private void buttonDetailsProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDetailsProduitActionPerformed
         int numLigneSelectionee = tableDesProduits.getSelectedRow();
	String refProduit = tableDesFournisseurs.getValueAt(numLigneSelectionee, 1).toString();
	dialog.handelEventBoutonAfficherDetailsProduit(refProduit);
    }//GEN-LAST:event_buttonDetailsProduitActionPerformed

    private void buttonRetour1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRetour1ActionPerformed
        tabPane.setSelectedIndex(0);
    }//GEN-LAST:event_buttonRetour1ActionPerformed

    private void buttonRechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRechercherActionPerformed
        String motCle = null;
        if (radioButtonNumContrat.isSelected() && 
                !(motCle = fieldrchercheAvecNumContrat.getText()).equals("") &&
                !(motCle = fieldrchercheAvecNumContrat.getText()).equals("Num contrat ...")) {
            dialog.handleEventButtonRechercherContart(motCle, "numContrat");
            buttonEffacerFiltresContrat.setVisible(true);
        } else if (radioButtonDateDebut.isSelected()&&
                !(motCle = fieldrchercheAvecdateDebuContrat.getText()).equals("") &&
                !(motCle = fieldrchercheAvecdateDebuContrat.getText()).equals("Date de début ...")){
            dialog.handleEventButtonRechercherContart(motCle, "dateDebutContrat");
            buttonEffacerFiltresContrat.setVisible(true);
        } else if (radioButtonDateFin.isSelected() &&
                !(motCle = fieldrchercheAvecDateFinContart.getText()).equals("") &&
                !(motCle = fieldrchercheAvecDateFinContart.getText()).equals("Date de fin ...")){
            dialog.handleEventButtonRechercherContart(motCle, "dateFinContrat");
            buttonEffacerFiltresContrat.setVisible(true);
        } else {
            //ne rien faire
        }
        
    }//GEN-LAST:event_buttonRechercherActionPerformed

    private void radioButtonDateDebutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonDateDebutActionPerformed
        fieldrchercheAvecDateFinContart.setEnabled(false);
        fieldrchercheAvecdateDebuContrat.setEnabled(true);
        fieldrchercheAvecNumContrat.setEnabled(false);
        radioButtonNumContrat.setSelected(false);
        radioButtonDateFin.setSelected(false);
        
        if (!radioButtonDateDebut.isSelected()) {
            fieldrchercheAvecdateDebuContrat.setEnabled(false);
        }
    }//GEN-LAST:event_radioButtonDateDebutActionPerformed

    private void radioButtonNumContratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonNumContratActionPerformed
        fieldrchercheAvecDateFinContart.setEnabled(false);
        fieldrchercheAvecdateDebuContrat.setEnabled(false);
        fieldrchercheAvecNumContrat.setEnabled(true);
        radioButtonDateDebut.setSelected(false);
        radioButtonDateFin.setSelected(false);
        
        if (!radioButtonNumContrat.isSelected()) {
            fieldrchercheAvecNumContrat.setEnabled(false);
        }
    }//GEN-LAST:event_radioButtonNumContratActionPerformed

    private void fieldrchercheAvecDateFinContartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldrchercheAvecDateFinContartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldrchercheAvecDateFinContartActionPerformed

    private void radioButtonDateFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonDateFinActionPerformed
        fieldrchercheAvecDateFinContart.setEnabled(true);
        fieldrchercheAvecdateDebuContrat.setEnabled(false);
        fieldrchercheAvecNumContrat.setEnabled(false);
        radioButtonDateDebut.setSelected(false);
        radioButtonNumContrat.setSelected(false);
        
        if (!radioButtonDateFin.isSelected()) {
            fieldrchercheAvecDateFinContart.setEnabled(false);
        }
    }//GEN-LAST:event_radioButtonDateFinActionPerformed

    private void fieldrchercheAvecNumContratMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldrchercheAvecNumContratMouseClicked
 
    }//GEN-LAST:event_fieldrchercheAvecNumContratMouseClicked

    private void fieldrchercheAvecNumContratMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldrchercheAvecNumContratMouseReleased
        
    }//GEN-LAST:event_fieldrchercheAvecNumContratMouseReleased

    private void fieldrchercheAvecNumContratFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldrchercheAvecNumContratFocusGained
        if (fieldrchercheAvecNumContrat.getText().equals("Num contrat ...") && fieldrchercheAvecNumContrat.isEnabled()) {
            fieldrchercheAvecNumContrat.setText("");
        }
    }//GEN-LAST:event_fieldrchercheAvecNumContratFocusGained

    private void fieldrchercheAvecNumContratFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldrchercheAvecNumContratFocusLost
        if (fieldrchercheAvecNumContrat.getText().equals("")) {
            fieldrchercheAvecNumContrat.setText("Num contrat ...");
        }
    }//GEN-LAST:event_fieldrchercheAvecNumContratFocusLost

    private void fieldrchercheAvecdateDebuContratFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldrchercheAvecdateDebuContratFocusGained
        if (fieldrchercheAvecdateDebuContrat.getText().equals("Date de début ...") && fieldrchercheAvecdateDebuContrat.isEnabled()) {
            fieldrchercheAvecdateDebuContrat.setText("");
        }
    }//GEN-LAST:event_fieldrchercheAvecdateDebuContratFocusGained

    private void fieldrchercheAvecdateDebuContratFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldrchercheAvecdateDebuContratFocusLost
        if (fieldrchercheAvecdateDebuContrat.getText().equals("") && fieldrchercheAvecdateDebuContrat.isEnabled()) {
            fieldrchercheAvecdateDebuContrat.setText("Date de début ...");
        }
    }//GEN-LAST:event_fieldrchercheAvecdateDebuContratFocusLost

    private void fieldrchercheAvecDateFinContartFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldrchercheAvecDateFinContartFocusGained
        if (fieldrchercheAvecDateFinContart.getText().equals("Date de fin ...") && fieldrchercheAvecDateFinContart.isEnabled()) {
            fieldrchercheAvecDateFinContart.setText("");
        }
    }//GEN-LAST:event_fieldrchercheAvecDateFinContartFocusGained

    private void fieldrchercheAvecDateFinContartFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldrchercheAvecDateFinContartFocusLost
        if (fieldrchercheAvecDateFinContart.getText().equals("") && fieldrchercheAvecDateFinContart.isEnabled()) {
            fieldrchercheAvecDateFinContart.setText("Date de fin ...");
        }
    }//GEN-LAST:event_fieldrchercheAvecDateFinContartFocusLost

    private void buttonEffacerFiltresContratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEffacerFiltresContratActionPerformed
        dialog.setTableDesContarts();
        buttonEffacerFiltresContrat.setVisible(false);
        fieldrchercheAvecNumContrat.setText("Num contrat ...");
        fieldrchercheAvecdateDebuContrat.setText("Date de début ...");
        fieldrchercheAvecDateFinContart.setText("Date de fin ...");
    }//GEN-LAST:event_buttonEffacerFiltresContratActionPerformed

    private void tableDesContratsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tableDesContratsFocusGained
        buttonDetailsContart.setEnabled(true);
    }//GEN-LAST:event_tableDesContratsFocusGained

    private void tableDesContratsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tableDesContratsFocusLost
       
    }//GEN-LAST:event_tableDesContratsFocusLost

    private void panelHeadPageAcceuil1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHeadPageAcceuil1MouseClicked
      
    }//GEN-LAST:event_panelHeadPageAcceuil1MouseClicked

    private void panelMesContartsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMesContartsMouseClicked
        
    }//GEN-LAST:event_panelMesContartsMouseClicked

    private void buttonDetailsFournisseurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDetailsFournisseurActionPerformed
        int numLigneSelectionee = tableDesFournisseurs.getSelectedRow();
	String numTelFournisseur = tableDesFournisseurs.getValueAt(numLigneSelectionee, 0).toString();
	dialog.handelEventBoutonAfficherDetailsFournisseur(numTelFournisseur);
    }//GEN-LAST:event_buttonDetailsFournisseurActionPerformed

    private void tableDesFournisseursFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tableDesFournisseursFocusGained
        buttonDetailsFournisseur.setEnabled(true);
    }//GEN-LAST:event_tableDesFournisseursFocusGained

    private void tableDesProduitsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tableDesProduitsFocusGained
        buttonDetailsProduit.setEnabled(true);
    }//GEN-LAST:event_tableDesProduitsFocusGained

    private void buttonRetour2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRetour2ActionPerformed
        tabPane.setSelectedIndex(0);
    }//GEN-LAST:event_buttonRetour2ActionPerformed

    private void buttonEffacerFiltresFournisseurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEffacerFiltresFournisseurActionPerformed
        dialog.setTableDesFournisseurs();
        buttonEffacerFiltresFournisseur.setVisible(false);
        fieldrchercheAvecNomFournisseur.setText("Nom ...");
        fieldrchercheAvecNumTelFournisseur.setText("064192.....");
    }//GEN-LAST:event_buttonEffacerFiltresFournisseurActionPerformed

    private void buttonEffacerFiltresProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEffacerFiltresProduitActionPerformed
        dialog.setTableDesProduits();
        buttonEffacerFiltresProduit.setVisible(false);
        comboBoxRechercheProduitParFournisseur.setSelectedIndex(0);
        fieldRechercheProduitParNom.setText("Nom produit ...");
    }//GEN-LAST:event_buttonEffacerFiltresProduitActionPerformed

    private void radioButtonNumTelFournisseurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonNumTelFournisseurActionPerformed
        fieldrchercheAvecNomFournisseur.setEnabled(false);
        fieldrchercheAvecNumTelFournisseur.setEnabled(true);
        radioButtonNomFournisseur.setSelected(false);
        
        if (!radioButtonNumTelFournisseur.isSelected()) {
            fieldrchercheAvecNumTelFournisseur.setEnabled(false);
        }
    }//GEN-LAST:event_radioButtonNumTelFournisseurActionPerformed

    private void radioButtonNomFournisseurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonNomFournisseurActionPerformed
        fieldrchercheAvecNomFournisseur.setEnabled(true);
        fieldrchercheAvecNumTelFournisseur.setEnabled(false);
        radioButtonNumTelFournisseur.setSelected(false);
        
        if (!radioButtonNomFournisseur.isSelected()) {
            fieldrchercheAvecNomFournisseur.setEnabled(false);
        }
    }//GEN-LAST:event_radioButtonNomFournisseurActionPerformed

    private void fieldrchercheAvecNumTelFournisseurFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldrchercheAvecNumTelFournisseurFocusGained
        if (fieldrchercheAvecNumTelFournisseur.getText().equals("064192.....") && radioButtonNumTelFournisseur.isSelected()) {
            fieldrchercheAvecNumTelFournisseur.setText("");
        }
    }//GEN-LAST:event_fieldrchercheAvecNumTelFournisseurFocusGained

    private void fieldrchercheAvecNumTelFournisseurFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldrchercheAvecNumTelFournisseurFocusLost
        if (fieldrchercheAvecNumTelFournisseur.getText().equals("")) {
            fieldrchercheAvecNumTelFournisseur.setText("064192.....");
        }
    }//GEN-LAST:event_fieldrchercheAvecNumTelFournisseurFocusLost

    private void fieldrchercheAvecNomFournisseurFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldrchercheAvecNomFournisseurFocusGained
        if (fieldrchercheAvecNomFournisseur.getText().equals("Nom ...") && radioButtonNomFournisseur.isSelected()) {
            fieldrchercheAvecNomFournisseur.setText("");
        }
    }//GEN-LAST:event_fieldrchercheAvecNomFournisseurFocusGained

    private void fieldrchercheAvecNomFournisseurFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldrchercheAvecNomFournisseurFocusLost
        if (fieldrchercheAvecNomFournisseur.getText().equals("")) {
            fieldrchercheAvecNomFournisseur.setText("Nom ...");
        }
    }//GEN-LAST:event_fieldrchercheAvecNomFournisseurFocusLost

    private void buttonRechercher1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRechercher1ActionPerformed
        String motCle = null;
        if (radioButtonNumTelFournisseur.isSelected() && 
                !(motCle = fieldrchercheAvecNumTelFournisseur.getText()).equals("") &&
                !(motCle = fieldrchercheAvecNumTelFournisseur.getText()).equals("064192.....")) {
            dialog.handleEventButtonRechercherFournisseur(motCle, "Num tel");
            buttonEffacerFiltresFournisseur.setVisible(true);
        } else if (radioButtonNomFournisseur.isSelected()&&
                !(motCle = fieldrchercheAvecNomFournisseur.getText()).equals("") &&
                !(motCle = fieldrchercheAvecNomFournisseur.getText()).equals("Nom ...")){
            dialog.handleEventButtonRechercherFournisseur(motCle, "Nom fournisseur");
            buttonEffacerFiltresFournisseur.setVisible(true);
        } else {
            //ne rien faire
        }
    }//GEN-LAST:event_buttonRechercher1ActionPerformed

    private void radioButtonProduitParNomFournisseurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonProduitParNomFournisseurActionPerformed
        radioButtonProduitParNom.setSelected(false);
        comboBoxRechercheProduitParFournisseur.setEnabled(true);
        fieldRechercheProduitParNom.setEnabled(false);
        
        if (!radioButtonProduitParNomFournisseur.isSelected()) {
            comboBoxRechercheProduitParFournisseur.setEnabled(false);
        }
    }//GEN-LAST:event_radioButtonProduitParNomFournisseurActionPerformed

    private void radioButtonProduitParNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonProduitParNomActionPerformed
        radioButtonProduitParNomFournisseur.setSelected(false);
        comboBoxRechercheProduitParFournisseur.setEnabled(false);
        fieldRechercheProduitParNom.setEnabled(true); 
        
        if (!radioButtonProduitParNom.isSelected()) {
            fieldRechercheProduitParNom.setEnabled(false);
        }
    }//GEN-LAST:event_radioButtonProduitParNomActionPerformed

    private void buttonRechercher2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRechercher2ActionPerformed
        String motCle = null;
        if (radioButtonProduitParNom.isSelected() && 
                !(motCle = fieldRechercheProduitParNom.getText()).equals("") &&
                !(motCle = fieldRechercheProduitParNom.getText()).equals("Nom produit ...")) {
            dialog.handleEventButtonRechercherProduit(motCle, "Nom produit");
            buttonEffacerFiltresProduit.setVisible(true);
        } else if (radioButtonProduitParNomFournisseur.isSelected()){
            dialog.handleEventButtonRechercherProduit(motCle, "Nom fournisseur");
            buttonEffacerFiltresProduit.setVisible(true);
        } else {
            //ne rien faire
        }
    }//GEN-LAST:event_buttonRechercher2ActionPerformed

    private void fieldRechercheProduitParNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldRechercheProduitParNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldRechercheProduitParNomActionPerformed

    private void fieldRechercheProduitParNomFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldRechercheProduitParNomFocusGained
        if (fieldRechercheProduitParNom.getText().equals("Nom produit ...")) {
            fieldRechercheProduitParNom.setText("");
        }
    }//GEN-LAST:event_fieldRechercheProduitParNomFocusGained

    private void fieldRechercheProduitParNomFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldRechercheProduitParNomFocusLost
        if (fieldRechercheProduitParNom.getText().equals("")) {
            fieldRechercheProduitParNom.setText("Nom produit ...");
        }
    }//GEN-LAST:event_fieldRechercheProduitParNomFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDetailsContart;
    private javax.swing.JButton buttonDetailsFournisseur;
    private javax.swing.JButton buttonDetailsProduit;
    private javax.swing.JButton buttonEffacerFiltresContrat;
    private javax.swing.JButton buttonEffacerFiltresFournisseur;
    private javax.swing.JButton buttonEffacerFiltresProduit;
    private javax.swing.JButton buttonMesContrats;
    private javax.swing.JButton buttonMesFournisseurs;
    private javax.swing.JButton buttonMesLivraisons;
    private javax.swing.JButton buttonNouveauContrat;
    private javax.swing.JButton buttonRechercher;
    private javax.swing.JButton buttonRechercher1;
    private javax.swing.JButton buttonRechercher2;
    private javax.swing.JButton buttonRetour1;
    private javax.swing.JButton buttonRetour2;
    private javax.swing.JButton buttonRetour3;
    private javax.swing.JComboBox<String> comboBoxRechercheProduitParFournisseur;
    private javax.swing.JTextField fieldRechercheProduitParNom;
    private javax.swing.JTextField fieldrchercheAvecDateFinContart;
    private javax.swing.JTextField fieldrchercheAvecNomFournisseur;
    private javax.swing.JTextField fieldrchercheAvecNumContrat;
    private javax.swing.JTextField fieldrchercheAvecNumTelFournisseur;
    private javax.swing.JTextField fieldrchercheAvecdateDebuContrat;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelMesFournisseurs;
    private javax.swing.JLabel labelMesFournisseurs1;
    private javax.swing.JLabel labelMesFournisseurs2;
    private javax.swing.JLabel labelMsgImportantMesContrats;
    private javax.swing.JLabel labelMsgImportantMesFournisseurs;
    private javax.swing.JLabel labelMsgImportantMesProduits;
    private javax.swing.JLabel labelTitrePageAcceuil;
    private javax.swing.JPanel panelHeadPageAcceuil;
    private javax.swing.JPanel panelHeadPageAcceuil1;
    private javax.swing.JPanel panelHeadPageAcceuil2;
    private javax.swing.JPanel panelHeadPageAcceuil3;
    private javax.swing.JPanel panelMesContarts;
    private javax.swing.JPanel panelMesLivraisons;
    private javax.swing.JPanel panelPageAcceuil;
    private javax.swing.JPanel panelPageMesFournisseurs;
    private javax.swing.JRadioButton radioButtonDateDebut;
    private javax.swing.JRadioButton radioButtonDateFin;
    private javax.swing.JRadioButton radioButtonNomFournisseur;
    private javax.swing.JRadioButton radioButtonNumContrat;
    private javax.swing.JRadioButton radioButtonNumTelFournisseur;
    private javax.swing.JRadioButton radioButtonProduitParNom;
    private javax.swing.JRadioButton radioButtonProduitParNomFournisseur;
    private javax.swing.JTabbedPane tabPane;
    private javax.swing.JTable tableDesContrats;
    private javax.swing.JTable tableDesFournisseurs;
    private javax.swing.JTable tableDesProduits;
    // End of variables declaration//GEN-END:variables
}
