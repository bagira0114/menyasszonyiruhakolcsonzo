/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.bkeryorsi.menyasszonyiruhakolcsonzo.felulet;

import hu.bkeryorsi.menyasszonyiruhakolcsonzo.SQL;
import hu.bkeryorsi.menyasszonyiruhakolcsonzo.adatbazis.Fatyol;
import hu.bkeryorsi.menyasszonyiruhakolcsonzo.adatbazis.Kesztyu;
import hu.bkeryorsi.menyasszonyiruhakolcsonzo.felulet.eszkozok.SzamFilter;
import javax.swing.text.PlainDocument;
import sun.net.www.content.text.plain;

/**
 *
 * @author keryo
 */
public class Fatyolfelvetel extends javax.swing.JPanel {

    /**
     * Creates new form Fatyolfelvetel
     */
    private FoPanel szulo;

    public Fatyolfelvetel(FoPanel szulo) {
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
        fazonComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        ar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        megjegyzes = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bongeszes_gomb = new javax.swing.JButton();
        megse_gomb = new javax.swing.JButton();
        mentes_gomb = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(890, 600));

        jLabel1.setText("Új fátyol felvétele az adatbázisba");

        jLabel2.setText("Fazon:");

        fazonComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rövid", "Hosszú", "Pironkodó" }));

        jLabel3.setText("Ár:");

        ar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arActionPerformed(evt);
            }
        });

        jLabel4.setText("Megjegyzés:");

        megjegyzes.setColumns(20);
        megjegyzes.setRows(5);
        jScrollPane1.setViewportView(megjegyzes);

        jLabel5.setText("Kép");

        jLabel6.setText("Feltöltendő kép kiválasztása");

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
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(fazonComboBox1, 0, 146, Short.MAX_VALUE)
                                .addComponent(ar)))
                        .addGap(201, 201, 201)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(megse_gomb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mentes_gomb))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(bongeszes_gomb))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel6)))))))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(fazonComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(ar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(55, 55, 55)
                                .addComponent(bongeszes_gomb))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(megse_gomb)
                    .addComponent(mentes_gomb))
                .addGap(105, 105, 105))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void mentes_gombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mentes_gombActionPerformed
        SQL sql = new SQL();
        Fatyol k = new Fatyol();
        k.setKep(jLabel5.getText());
        k.setAr(Integer.parseInt(ar.getText()));
        k.setFazon(String.valueOf(fazonComboBox1.getSelectedItem()));
        k.setAllapot("kölcsönözhető");
        k.setMegjegyzes(megjegyzes.getText());
        sql.addFatyol(k);
        Fatylak fatylak = new Fatylak(szulo);
        szulo.panelmutat(fatylak);
    }//GEN-LAST:event_mentes_gombActionPerformed

    private void megse_gombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_megse_gombActionPerformed
        Fatylak fatylak = new Fatylak(szulo);
        szulo.panelmutat(fatylak);         // TODO add your handling code here:
    }//GEN-LAST:event_megse_gombActionPerformed

    private void arActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ar;
    private javax.swing.JButton bongeszes_gomb;
    private javax.swing.JComboBox<String> fazonComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea megjegyzes;
    private javax.swing.JButton megse_gomb;
    private javax.swing.JButton mentes_gomb;
    // End of variables declaration//GEN-END:variables
}
