/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.bkeryorsi.menyasszonyiruhakolcsonzo.felulet;

import hu.bkeryorsi.menyasszonyiruhakolcsonzo.SQL;
import hu.bkeryorsi.menyasszonyiruhakolcsonzo.adatbazis.Fatyol;
import java.awt.Color;

/**
 *
 * @author keryo
 */
public class Fatyolmodositas extends javax.swing.JPanel {

    /**
     * Creates new form Fatyolmodositas
     */
    private FoPanel szulo;
    private final Fatyol fatyol;
    public Fatyolmodositas(FoPanel szulo, Fatyol fatyol) {
        this.szulo = szulo;
        this.fatyol = fatyol;
        initComponents();
        azonosito.setEditable(false);
        azonosito.setBackground(Color.LIGHT_GRAY);
        ar.setEditable(false);
        ar.setBackground(Color.LIGHT_GRAY);
        allapot.setEditable(false);
        allapot.setBackground(Color.LIGHT_GRAY);
        fazon.setEditable(false);
        fazon.setBackground(Color.LIGHT_GRAY);
        fazonComboBox1.setSelectedItem(fatyol.getFazon());
        fazonComboBox1.setEnabled(false);
        fazonComboBox1.setBackground(Color.LIGHT_GRAY);
        allapotComboBox1.setSelectedItem(fatyol.getAllapot());
        allapotComboBox1.setEnabled(false);
        allapotComboBox1.setBackground(Color.LIGHT_GRAY);
        megjegyzes.setEditable(false);
        megjegyzes.setBackground(Color.LIGHT_GRAY);
        bongeszes_gomb.setEnabled(false);
        mentes_gomb.setEnabled(false);
        megse_gomb.setEnabled(false);
        
        azonosito.setText(String.valueOf(fatyol.getId()));
        ar.setText(String.valueOf(fatyol.getAr()));
        fazon.setText(String.valueOf(fatyol.getFazon()));
        allapot.setText(fatyol.getAllapot());
        megjegyzes.setText(fatyol.getMegjegyzes());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        azonosito = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fazon = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fazonComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        ar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        allapot = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        allapotComboBox1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        megjegyzes = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        bongeszes_gomb = new javax.swing.JButton();
        szerkesztes_gomb = new javax.swing.JButton();
        megse_gomb = new javax.swing.JButton();
        torles_gomb = new javax.swing.JButton();
        mentes_gomb = new javax.swing.JButton();
        bezar_gomb = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(890, 600));

        jLabel1.setText("Kijelölt fátyol megtekintése. Módosítás, törlés");

        jLabel2.setText("Azonosító:");

        jLabel3.setText("Fazon:");

        fazon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fazonActionPerformed(evt);
            }
        });

        jLabel4.setText("Fazon megváltoztatása:");

        fazonComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "rövid", "hosszú", "pironkodó" }));

        jLabel5.setText("Ár:");

        jLabel6.setText("Állapot:");

        allapot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allapotActionPerformed(evt);
            }
        });

        jLabel7.setText("Állapot megváltoztatása:");

        allapotComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "kölcsönözhető", "kölcsönözve", "tisztító", "sérült" }));
        allapotComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allapotComboBox1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Megjegyzés:");

        megjegyzes.setColumns(20);
        megjegyzes.setRows(5);
        jScrollPane1.setViewportView(megjegyzes);

        jLabel9.setText("Kép");

        jLabel10.setText("Kép módosítása");

        bongeszes_gomb.setText("Böngészés");
        bongeszes_gomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bongeszes_gombActionPerformed(evt);
            }
        });

        szerkesztes_gomb.setText("Szerkesztés");
        szerkesztes_gomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                szerkesztes_gombActionPerformed(evt);
            }
        });

        megse_gomb.setText("Mégse");
        megse_gomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                megse_gombActionPerformed(evt);
            }
        });

        torles_gomb.setText("Törlés");
        torles_gomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                torles_gombActionPerformed(evt);
            }
        });

        mentes_gomb.setText("Mentés");
        mentes_gomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mentes_gombActionPerformed(evt);
            }
        });

        bezar_gomb.setText("Bezár");
        bezar_gomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bezar_gombActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(azonosito)
                                    .addComponent(fazon)
                                    .addComponent(fazonComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ar)
                                    .addComponent(allapotComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(allapot, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(214, 214, 214)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(67, 67, 67)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10)
                                        .addComponent(bongeszes_gomb)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(szerkesztes_gomb)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(megse_gomb))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(torles_gomb)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(mentes_gomb)))
                            .addComponent(bezar_gomb))))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(azonosito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(fazon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(fazonComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(allapot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(szerkesztes_gomb)
                                    .addComponent(megse_gomb))))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(allapotComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(torles_gomb)
                            .addComponent(mentes_gomb)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel10)
                        .addGap(46, 46, 46)
                        .addComponent(bongeszes_gomb)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bezar_gomb)
                        .addGap(18, 18, 18)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void allapotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allapotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_allapotActionPerformed

    private void allapotComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allapotComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_allapotComboBox1ActionPerformed

    private void bongeszes_gombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bongeszes_gombActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bongeszes_gombActionPerformed

    private void szerkesztes_gombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_szerkesztes_gombActionPerformed
      mentes_gomb.setEnabled(true);
        megse_gomb.setEnabled(true);
        bongeszes_gomb.setEnabled(true);
        ar.setEditable(true);
        ar.setBackground(Color.WHITE);
        allapotComboBox1.setEnabled(true);
        allapotComboBox1.setBackground(Color.WHITE);
        fazonComboBox1.setEnabled(true);
        fazonComboBox1.setBackground(Color.WHITE);
        megjegyzes.setEditable(true);
        megjegyzes.setBackground(Color.WHITE);
    }//GEN-LAST:event_szerkesztes_gombActionPerformed

    private void fazonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fazonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fazonActionPerformed

    private void torles_gombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_torles_gombActionPerformed
            SQL sql = new SQL();

        this.fatyol.getId();

        sql.deleteFatyol(this.fatyol);
        Fatylak fatylak = new Fatylak(szulo);
        szulo.panelmutat(fatylak);
    }//GEN-LAST:event_torles_gombActionPerformed

    private void mentes_gombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mentes_gombActionPerformed
  SQL sql = new SQL();
        this.fatyol.setKep(jLabel9.getText());
        this.fatyol.setAr((Integer.parseInt(ar.getText())));
        this.fatyol.setFazon((String)fazonComboBox1.getSelectedItem());
        this.fatyol.setAllapot((String)allapotComboBox1.getSelectedItem());
        this.fatyol.setMegjegyzes(megjegyzes.getText());
        sql.updateFatyol(this.fatyol);
        Fatylak fatylak = new Fatylak(szulo);
        szulo.panelmutat(fatylak);
    }//GEN-LAST:event_mentes_gombActionPerformed

    private void megse_gombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_megse_gombActionPerformed
      ar.setText(String.valueOf(fatyol.getAr()));
        allapot.setText(fatyol.getAllapot());
        fazonComboBox1.setEnabled(false);
        allapotComboBox1.setEnabled(false);
        megjegyzes.setText(fatyol.getMegjegyzes());
        bongeszes_gomb.setEnabled(false);
        ar.setEditable(false);
        ar.setBackground(Color.LIGHT_GRAY);
        megjegyzes.setEditable(false);
        megjegyzes.setBackground(Color.LIGHT_GRAY);
        megse_gomb.setEnabled(false);
        mentes_gomb.setEnabled(false);
    }//GEN-LAST:event_megse_gombActionPerformed

    private void bezar_gombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bezar_gombActionPerformed
        Fatylak fatylak = new Fatylak(szulo);
        szulo.panelmutat(fatylak); 
    }//GEN-LAST:event_bezar_gombActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField allapot;
    private javax.swing.JComboBox<String> allapotComboBox1;
    private javax.swing.JTextField ar;
    private javax.swing.JTextField azonosito;
    private javax.swing.JButton bezar_gomb;
    private javax.swing.JButton bongeszes_gomb;
    private javax.swing.JTextField fazon;
    private javax.swing.JComboBox<String> fazonComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea megjegyzes;
    private javax.swing.JButton megse_gomb;
    private javax.swing.JButton mentes_gomb;
    private javax.swing.JButton szerkesztes_gomb;
    private javax.swing.JButton torles_gomb;
    // End of variables declaration//GEN-END:variables
}
