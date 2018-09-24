/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.bkeryorsi.menyasszonyiruhakolcsonzo.felulet;

import hu.bkeryorsi.menyasszonyiruhakolcsonzo.SQL;
import hu.bkeryorsi.menyasszonyiruhakolcsonzo.adatbazis.Kesztyu;
import hu.bkeryorsi.menyasszonyiruhakolcsonzo.adatbazis.Ugyfel;
import hu.bkeryorsi.menyasszonyiruhakolcsonzo.felulet.eszkozok.SzamFilter;
import javax.swing.text.PlainDocument;

/**
 *
 * @author keryo
 */
public class Kesztyufelvetel extends javax.swing.JPanel {

    /**
     * Creates new form Kesztyufelvetel
    
     */
     private FoPanel szulo;
   public Kesztyufelvetel(FoPanel szulo) {
       this.szulo = szulo;
   
        initComponents();
        PlainDocument doc = (PlainDocument) ar.getDocument();
        doc.setDocumentFilter(new SzamFilter());
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
        ar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        megjegyzes = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bongeszes_gomb = new javax.swing.JButton();
        megse_gomb = new javax.swing.JButton();
        mentes_gomb = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(890, 600));

        jLabel1.setText("Új kesztyű felvétele az adatbázisba");

        jLabel2.setText("Ár:");

        ar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arActionPerformed(evt);
            }
        });

        jLabel3.setText("Megjegyzés:");

        megjegyzes.setColumns(20);
        megjegyzes.setRows(5);
        jScrollPane1.setViewportView(megjegyzes);

        jLabel4.setText("Kép");

        jLabel5.setText("Feltöltendő kép kiválasztása");

        bongeszes_gomb.setText("Böngészés");

        megse_gomb.setText("Mégse");
        megse_gomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                megse_gombActionPerformed(evt);
            }
        });

        mentes_gomb.setText("Mentés");
        mentes_gomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mentes_gombActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(megse_gomb)
                        .addGap(101, 101, 101)
                        .addComponent(mentes_gomb))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel1)))
                        .addGap(147, 147, 147)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(bongeszes_gomb))))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(49, 49, 49)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(ar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(160, 160, 160)
                                    .addComponent(jLabel3)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel5)
                        .addGap(42, 42, 42)
                        .addComponent(bongeszes_gomb)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(megse_gomb)
                    .addComponent(mentes_gomb))
                .addContainerGap(194, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void arActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arActionPerformed

    private void mentes_gombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mentes_gombActionPerformed
       SQL sql = new SQL();
        Kesztyu k = new Kesztyu();
        k.setKep(jLabel4.getText());
        k.setAr(Integer.parseInt(ar.getText()));
        k.setAllapot("kölcsönözhető");
        k.setMegjegyzes(megjegyzes.getText());
        sql.addKesztyu(k);
        Kesztyuk kesztyuk = new Kesztyuk(szulo);
          szulo.panelmutat(kesztyuk);
    }//GEN-LAST:event_mentes_gombActionPerformed

    private void megse_gombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_megse_gombActionPerformed
Kesztyuk kesztyuk = new Kesztyuk(szulo);
          szulo.panelmutat(kesztyuk);         // TODO add your handling code here:
    }//GEN-LAST:event_megse_gombActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ar;
    private javax.swing.JButton bongeszes_gomb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea megjegyzes;
    private javax.swing.JButton megse_gomb;
    private javax.swing.JButton mentes_gomb;
    // End of variables declaration//GEN-END:variables
}
