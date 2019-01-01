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
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.text.PlainDocument;

/**
 *
 * @author keryo
 */
public class UjFatyolKolcsonzes extends javax.swing.JPanel {

    /**
     * Creates new form UjFatyolKolcsonzes
     */
    private FoPanel szulo;

    public UjFatyolKolcsonzes(FoPanel szulo) {
        this.szulo = szulo;
        initComponents();
        jCalendar1.setMinSelectableDate(new Date());
        PlainDocument doc = (PlainDocument) fatyolId.getDocument();
        doc.setDocumentFilter(new SzamFilter());
        kolcsKezd.setText(new Date().toString());
        kolcsKezd.setEnabled(false);
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
        fatyolId = new javax.swing.JTextField();
        kolcsKezd = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        kolcsonzes_gomb = new javax.swing.JButton();
        megse_gomb = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        megjegyzes = new javax.swing.JTextArea();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jComboBox1 = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(890, 600));

        jLabel1.setText("Új fátyol kölcsönzés");

        jLabel2.setText("Ügyfél:");

        jLabel3.setText("Fátyol azonosítója:");

        jLabel4.setText("Kölcsönzés kezdete:");

        jLabel5.setText("Határidő:");

        kolcsonzes_gomb.setText("Kölcsönzés");
        kolcsonzes_gomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolcsonzes_gombActionPerformed(evt);
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
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(kolcsonzes_gomb)
                        .addGap(560, 560, 560)
                        .addComponent(megse_gomb))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fatyolId)
                                    .addComponent(kolcsKezd, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel5)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(fatyolId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(kolcsKezd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kolcsonzes_gomb)
                    .addComponent(megse_gomb))
                .addGap(85, 85, 85))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void megse_gombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_megse_gombActionPerformed
        KolcsonzesFelulet kolcsonzesFelulet = new KolcsonzesFelulet(szulo);
        szulo.panelmutat(kolcsonzesFelulet);

    }//GEN-LAST:event_megse_gombActionPerformed

    private void kolcsonzes_gombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolcsonzes_gombActionPerformed
        SQL sql = new SQL();
        Kolcsonzes k = new Kolcsonzes();
        k.setUgyfelId(getugyfelId());
        k.setFatyolId(Integer.parseInt(fatyolId.getText()));
        k.setHatarido(jCalendar1.getDate());
        k.setKolcsonzesEleje(new Date());
        k.setMegjegyzes(megjegyzes.getText());
        Kolcsonzes meglevo = sql.getKolcsonzes(getugyfelId()); //kikéred a meglévőt
        if (meglevo != null) {
            k.setKolcsonzesid(meglevo.getKolcsonzesid()); //itt beállítod az id-t
            k.setKolcsonzesEleje(meglevo.getKolcsonzesEleje());
            k.setMenyasszonyiRuhaId(meglevo.getMenyasszonyiRuhaId());
            k.setKesztyuId(meglevo.getKesztyuId());
            if (!sql.getKolcsonozve(null, Integer.parseInt(fatyolId.getText()), null)) {
                if (meglevo.getFatyolId()!= null) {
                    JOptionPane.showMessageDialog(null, "Már van kint fátyol.");
                } else {
                    sql.updateKolcsonzes(k);
                    sql.fatyolStatuszModositas(Integer.parseInt(fatyolId.getText()), "kölcsönözve");
                    KolcsonzesFelulet kolcsonzesFelulet = new KolcsonzesFelulet(szulo);
                    szulo.panelmutat(kolcsonzesFelulet);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Már kölcsönzött tétel");

            }
        } else {
            if (!sql.getKolcsonozve(null, Integer.parseInt(fatyolId.getText()), null)) {

                sql.addKolcsonzes(k);
                sql.fatyolStatuszModositas(Integer.parseInt(fatyolId.getText()), "kölcsönözve");
                KolcsonzesFelulet kolcsonzesFelulet = new KolcsonzesFelulet(szulo);
                szulo.panelmutat(kolcsonzesFelulet);
            } else {
                JOptionPane.showMessageDialog(null, "Már kölcsönzött tétel");
            }

        }


    }//GEN-LAST:event_kolcsonzes_gombActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fatyolId;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JComboBox<Ugyfel> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kolcsKezd;
    private javax.swing.JButton kolcsonzes_gomb;
    private javax.swing.JTextArea megjegyzes;
    private javax.swing.JButton megse_gomb;
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
