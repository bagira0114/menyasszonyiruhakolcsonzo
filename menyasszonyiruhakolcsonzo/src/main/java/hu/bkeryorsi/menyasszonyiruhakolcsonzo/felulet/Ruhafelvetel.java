/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.bkeryorsi.menyasszonyiruhakolcsonzo.felulet;

import hu.bkeryorsi.menyasszonyiruhakolcsonzo.SQL;
import hu.bkeryorsi.menyasszonyiruhakolcsonzo.adatbazis.Fatyol;
import hu.bkeryorsi.menyasszonyiruhakolcsonzo.adatbazis.Ruha;

/**
 *
 * @author keryo
 */

public class Ruhafelvetel extends javax.swing.JPanel {
private FoPanel szulo;
    /**
     * Creates new form Ruhafelvetel
     */
    public Ruhafelvetel( FoPanel szulo) {
        this.szulo=szulo;
        initComponents();
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
        leiras = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fazonComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        meret = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bongeszes_gomb = new javax.swing.JButton();
        megse_gomb = new javax.swing.JButton();
        mentes_gomb = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        megjegyzes = new javax.swing.JTextArea();

        setPreferredSize(new java.awt.Dimension(890, 600));

        jLabel1.setText("Új ruha felvétele az adatbázisba");

        jLabel2.setText("Leírás:");

        jLabel3.setText("Fazon:");

        fazonComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "sellő", "félsellő", "hercegnős" }));

        jLabel4.setText("Méret:");

        jLabel5.setText("Ár:");

        jLabel6.setText("Kép");

        jLabel7.setText("Feltöltendő kép kiválasztása");

        bongeszes_gomb.setText("Böngészés");

        megse_gomb.setText("Mégse");

        mentes_gomb.setText("Mentés");
        mentes_gomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mentes_gombActionPerformed(evt);
            }
        });

        jLabel8.setText("Megjegyzés:");

        megjegyzes.setColumns(20);
        megjegyzes.setRows(5);
        jScrollPane1.setViewportView(megjegyzes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(leiras)
                                    .addComponent(fazonComboBox, 0, 197, Short.MAX_VALUE)
                                    .addComponent(meret)
                                    .addComponent(ar))))
                        .addGap(147, 147, 147)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(megse_gomb, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bongeszes_gomb)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(mentes_gomb)))))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(leiras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(73, 73, 73)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(fazonComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(meret, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(ar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel7)
                        .addGap(44, 44, 44)
                        .addComponent(bongeszes_gomb)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(megse_gomb)
                            .addComponent(mentes_gomb))
                        .addGap(125, 125, 125))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void mentes_gombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mentes_gombActionPerformed
        SQL sql = new SQL();
        Ruha k = new Ruha();
        k.setKep(jLabel6.getText());
        k.setLeiras(leiras.getText());
        k.setAr(Integer.parseInt(ar.getText()));
        k.setFazon(String.valueOf(fazonComboBox.getSelectedItem()));
        k.setMeret(Integer.parseInt(meret.getText()));
        k.setAllapot("kölcsönözhető");
        k.setMegjegyzes(megjegyzes.getText());
        sql.addRuha(k);
        Ruhaink ruhaink = new Ruhaink(szulo);
          szulo.panelmutat(ruhaink);
    }//GEN-LAST:event_mentes_gombActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ar;
    private javax.swing.JButton bongeszes_gomb;
    private javax.swing.JComboBox<String> fazonComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField leiras;
    private javax.swing.JTextArea megjegyzes;
    private javax.swing.JButton megse_gomb;
    private javax.swing.JButton mentes_gomb;
    private javax.swing.JTextField meret;
    // End of variables declaration//GEN-END:variables
}