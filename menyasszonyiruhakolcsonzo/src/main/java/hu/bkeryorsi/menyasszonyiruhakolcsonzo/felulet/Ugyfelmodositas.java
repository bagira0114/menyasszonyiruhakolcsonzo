/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.bkeryorsi.menyasszonyiruhakolcsonzo.felulet;

import hu.bkeryorsi.menyasszonyiruhakolcsonzo.SQL;
import hu.bkeryorsi.menyasszonyiruhakolcsonzo.adatbazis.Ugyfel;

/**
 *
 * @author keryo
 */
public class Ugyfelmodositas extends javax.swing.JPanel {

    /**
     * Creates new form Ugyfelmodositas
     */
    private FoPanel szulo;
    private final Ugyfel ugyfel;
    public Ugyfelmodositas(FoPanel szulo, Ugyfel ugyfel) {
       this.szulo = szulo;
       this.ugyfel = ugyfel;
        initComponents();
        
        vezeteknev.setText(ugyfel.getVezeteknev());
        keresztnev.setText(ugyfel.getKeresztnev());
        emailcim.setText(ugyfel.getEmailcim());
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        vezeteknev = new javax.swing.JTextField();
        keresztnev = new javax.swing.JTextField();
        emailcim = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        kolcsonzesek = new javax.swing.JTextArea();
        szerkesztes_gomb = new javax.swing.JButton();
        megse_gomb = new javax.swing.JButton();
        torles_gomb = new javax.swing.JButton();
        mentes_gomb = new javax.swing.JButton();
        bezar_gomb = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(890, 600));

        jLabel1.setText("Kijelölt ügyfél megtekintése. Módosítás, törlés");

        jLabel2.setText("Vezetéknév:");

        jLabel3.setText("Keresztnév:");

        jLabel4.setText("E-mail cím:");

        jLabel5.setText("Kölcsönzések:");

        kolcsonzesek.setColumns(20);
        kolcsonzesek.setRows(5);
        jScrollPane1.setViewportView(kolcsonzesek);

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

        mentes_gomb.setText("Mentés");
        mentes_gomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mentes_gombActionPerformed(evt);
            }
        });

        bezar_gomb.setText("Bezár");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(keresztnev)
                            .addComponent(vezeteknev)
                            .addComponent(emailcim)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(154, 154, 154)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(szerkesztes_gomb)
                            .addComponent(torles_gomb))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mentes_gomb)
                            .addComponent(megse_gomb)
                            .addComponent(bezar_gomb))))
                .addContainerGap(163, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(vezeteknev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(keresztnev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(szerkesztes_gomb)
                            .addComponent(megse_gomb))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(emailcim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(torles_gomb)
                            .addComponent(mentes_gomb))))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(bezar_gomb)
                .addGap(154, 154, 154))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void szerkesztes_gombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_szerkesztes_gombActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_szerkesztes_gombActionPerformed

    private void megse_gombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_megse_gombActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_megse_gombActionPerformed

    private void mentes_gombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mentes_gombActionPerformed
SQL sql = new SQL();
 this.ugyfel.setVezeteknev(vezeteknev.getText());
 this.ugyfel.setKeresztnev(keresztnev.getText());
 this.ugyfel.setEmailcim(emailcim.getText());
 sql.updateUgyfel(this.ugyfel);
    }//GEN-LAST:event_mentes_gombActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bezar_gomb;
    private javax.swing.JTextField emailcim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField keresztnev;
    private javax.swing.JTextArea kolcsonzesek;
    private javax.swing.JButton megse_gomb;
    private javax.swing.JButton mentes_gomb;
    private javax.swing.JButton szerkesztes_gomb;
    private javax.swing.JButton torles_gomb;
    private javax.swing.JTextField vezeteknev;
    // End of variables declaration//GEN-END:variables
}
