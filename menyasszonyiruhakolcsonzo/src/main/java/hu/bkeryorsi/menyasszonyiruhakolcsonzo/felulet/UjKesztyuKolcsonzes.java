/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.bkeryorsi.menyasszonyiruhakolcsonzo.felulet;

import hu.bkeryorsi.menyasszonyiruhakolcsonzo.SQL;
import hu.bkeryorsi.menyasszonyiruhakolcsonzo.adatbazis.Kolcsonzes;
import hu.bkeryorsi.menyasszonyiruhakolcsonzo.adatbazis.Ugyfel;
import hu.bkeryorsi.menyasszonyiruhakolcsonzo.felulet.eszkozok.SzamFilter;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.text.PlainDocument;

/**
 *
 * @author keryo
 */
public class UjKesztyuKolcsonzes extends javax.swing.JPanel {

    /**
     * Creates new form UjKesztyuKolcsonzes
     */
    private FoPanel szulo;

    public UjKesztyuKolcsonzes(FoPanel szulo) {
        this.szulo = szulo;
        initComponents();
        jCalendar1.setMinSelectableDate(new Date());
        PlainDocument doc = (PlainDocument) kesztyuId.getDocument();
        doc.setDocumentFilter(new SzamFilter());
        kolcskezd.setText(DateFormat.getDateInstance(DateFormat.LONG, new Locale("hu", "HU")).format(new Date()));
        kolcskezd.setEnabled(false);
        initComboBox();
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
        mentes_gomb = new javax.swing.JButton();
        megse_gomb = new javax.swing.JButton();
        kesztyuId = new javax.swing.JTextField();
        kolcskezd = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        megjegyzes = new javax.swing.JTextArea();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jComboBox1 = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(890, 600));

        jLabel1.setText("Új kesztyű kölcsönzés");

        jLabel2.setText("Ügyfél:");

        jLabel3.setText("Kesztyű azonosítója:");

        jLabel4.setText("Kölcsönzés kezdete:");

        jLabel5.setText("Határidő:");

        mentes_gomb.setText("Mentés");
        mentes_gomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mentes_gombActionPerformed(evt);
            }
        });

        megse_gomb.setText("Mégse");
        megse_gomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                megse_gombActionPerformed(evt);
            }
        });

        jLabel6.setText("Megjegyzés:");

        megjegyzes.setColumns(20);
        megjegyzes.setRows(5);
        jScrollPane1.setViewportView(megjegyzes);

        jComboBox1.setSelectedItem(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(327, 327, 327)
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mentes_gomb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(megse_gomb)))
                        .addGap(96, 96, 96))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(86, 86, 86)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(kolcskezd, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kesztyuId, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)))
                        .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel5)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(kesztyuId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(kolcskezd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mentes_gomb)
                    .addComponent(megse_gomb))
                .addGap(109, 109, 109))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void megse_gombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_megse_gombActionPerformed
        KolcsonzesFelulet kolcsonzesFelulet = new KolcsonzesFelulet(szulo);
        szulo.panelmutat(kolcsonzesFelulet);
    }//GEN-LAST:event_megse_gombActionPerformed

    private void mentes_gombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mentes_gombActionPerformed
        SQL sql = new SQL();
        Kolcsonzes k = new Kolcsonzes();
        k.setUgyfelId(getugyfelId());
        k.setKesztyuId(Integer.parseInt(kesztyuId.getText()));
        k.setHatarido(jCalendar1.getDate());
        k.setKolcsonzesEleje(new Date());
        k.setMegjegyzes(megjegyzes.getText());
        Kolcsonzes meglevo = sql.getKolcsonzes(getugyfelId()); 
        if (meglevo != null) {
            k.setKolcsonzesid(meglevo.getKolcsonzesid()); 
            k.setKolcsonzesEleje(meglevo.getKolcsonzesEleje());
            k.setMenyasszonyiRuhaId(meglevo.getMenyasszonyiRuhaId());
            k.setFatyolId(meglevo.getFatyolId());
            if (!sql.getKolcsonozve(null, null, Integer.parseInt(kesztyuId.getText()))) {
                if (meglevo.getKesztyuId() != null) {
                    JOptionPane.showMessageDialog(null, "Már van kint kesztyű");
                } else {
                    sql.updateKolcsonzes(k);
                    sql.kesztyuStatuszModositas(Integer.parseInt(kesztyuId.getText()), "kölcsönözve");
                    KolcsonzesFelulet kolcsonzesFelulet = new KolcsonzesFelulet(szulo);
                    szulo.panelmutat(kolcsonzesFelulet);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Már kölcsönzött tétel");

            }
        } else {
            if (!sql.getKolcsonozve(null, null, Integer.parseInt(kesztyuId.getText()))) {

                sql.addKolcsonzes(k);
                sql.kesztyuStatuszModositas(Integer.parseInt(kesztyuId.getText()), "kölcsönözve");
                KolcsonzesFelulet kolcsonzesFelulet = new KolcsonzesFelulet(szulo);
                szulo.panelmutat(kolcsonzesFelulet);
            } else {
                JOptionPane.showMessageDialog(null, "Már kölcsönzött tétel");
            }

        }


    }//GEN-LAST:event_mentes_gombActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JComboBox<Ugyfel> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kesztyuId;
    private javax.swing.JTextField kolcskezd;
    private javax.swing.JTextArea megjegyzes;
    private javax.swing.JButton megse_gomb;
    private javax.swing.JButton mentes_gomb;
    // End of variables declaration//GEN-END:variables
private void initComboBox() {
        SQL sql = new SQL();
        List<Ugyfel> ugyfelek = sql.getUgyfel();
        for (int i = 0; i < ugyfelek.size(); i++) {
            jComboBox1.addItem(ugyfelek.get(i));
        }

    }

    private int getugyfelId() {
        Ugyfel ugyfel = (Ugyfel) jComboBox1.getSelectedItem();

        return ugyfel.getId();
    }
}
