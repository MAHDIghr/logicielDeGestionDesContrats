/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package presentation;
/**
 *
 * @author PC
 */
public class PresentationJDialogDetailsPage extends javax.swing.JDialog {
    
    public PresentationJDialogDetailsPage(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public void setJDialog(String nomDuPanelConcernee, String detailsTxt) {
        labelDeailPage.setText("Détails " + nomDuPanelConcernee + " :");
        detailsTxtArea.setText(detailsTxt);
        detailsTxtArea.setEditable(false);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        detailsPanel = new javax.swing.JPanel();
        detailsScrollPane = new javax.swing.JScrollPane();
        detailsTxtArea = new javax.swing.JTextArea();
        buttonFermer = new javax.swing.JButton();
        labelDeailPage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        detailsPanel.setBackground(new java.awt.Color(149, 190, 246));

        detailsScrollPane.setBackground(new java.awt.Color(255, 255, 255));

        detailsTxtArea.setColumns(20);
        detailsTxtArea.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        detailsTxtArea.setRows(5);
        detailsScrollPane.setViewportView(detailsTxtArea);

        buttonFermer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonFermer.setText("Fermer");
        buttonFermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFermerActionPerformed(evt);
            }
        });

        labelDeailPage.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        labelDeailPage.setForeground(new java.awt.Color(255, 255, 255));
        labelDeailPage.setText("Détails XX :");

        javax.swing.GroupLayout detailsPanelLayout = new javax.swing.GroupLayout(detailsPanel);
        detailsPanel.setLayout(detailsPanelLayout);
        detailsPanelLayout.setHorizontalGroup(
            detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labelDeailPage, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(detailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailsPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonFermer)
                        .addGap(38, 38, 38))
                    .addGroup(detailsPanelLayout.createSequentialGroup()
                        .addComponent(detailsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        detailsPanelLayout.setVerticalGroup(
            detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailsPanelLayout.createSequentialGroup()
                .addComponent(labelDeailPage, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(detailsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonFermer)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(detailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(detailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonFermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFermerActionPerformed
        setVisible(false);
    }//GEN-LAST:event_buttonFermerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonFermer;
    private javax.swing.JPanel detailsPanel;
    private javax.swing.JScrollPane detailsScrollPane;
    private javax.swing.JTextArea detailsTxtArea;
    private javax.swing.JLabel labelDeailPage;
    // End of variables declaration//GEN-END:variables
}
