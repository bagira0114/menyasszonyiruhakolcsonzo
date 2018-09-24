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

import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.PlainDocument;

/**
 *
 * @author keryo
 */
public class Fatylak extends javax.swing.JPanel {

    /**
     * Creates new form Fatylak
     */
    private FoPanel szulo;
    public Fatylak(FoPanel szulo) {
        this.szulo = szulo;
        initComponents();
        PlainDocument doc = (PlainDocument) id.getDocument();
        doc.setDocumentFilter(new SzamFilter());
        SQL sql = new SQL();
        List<Fatyol> fatyol = sql.getFatyol();
        fatyolBetolt(fatyol);

    }

    private void fatyolBetolt(List<Fatyol> fatyol) {
        Object o[][] = new Object[fatyol.size()][6];
        for (int i = 0; i < fatyol.size(); i++) {
            Fatyol k = new Fatyol();
            k = fatyol.get(i);

            o[i][0] = k.getId();
            o[i][1] = new ImageIcon("icons/" + k.getKep());
            o[i][2] = k.getAr();
            o[i][3] = k.getFazon();
            o[i][4] = k.getAllapot();
            o[i][5] = k.getMegjegyzes();
        }

        String[] columnNames = {"Id", "Kép", "Ár", "Fazon", "Állapot", "Megjegyzés"};
        Class [] columnClass = {Integer.class, String.class, Integer.class, String.class, String.class, String.class};
        DefaultTableModel model = new DefaultTableModel(o, columnNames) {
            //  Returning the Class of each column will allow different
            //  renderers to be used based on Class
            @Override
            public Class getColumnClass(int column) {
                return columnClass [column];
            }
        };
        jTable1.setRowHeight(100);
        jTable1.setModel(model);
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
        fazonComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        allapotComboBox = new javax.swing.JComboBox<>();
        fatyol_kereses_gomb = new javax.swing.JButton();
        uj_fatyol_gomb = new javax.swing.JButton();
        fatyol_megnyitasa_gomb = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        id = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(890, 600));

        jLabel1.setText("Fátylak");

        jLabel2.setText("Azonosító:");

        fazonComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Hosszú", "Rövid", "Pironkodó" }));

        jLabel3.setText("Fazon:");

        jLabel4.setText("Állapot");

        allapotComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Kölcsönözhető", "Kölcsönözve", "Tisztító", "Sérült" }));

        fatyol_kereses_gomb.setText("Keresés");
        fatyol_kereses_gomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fatyol_kereses_gombActionPerformed(evt);
            }
        });

        uj_fatyol_gomb.setText("Új fátyol felvétele");
        uj_fatyol_gomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uj_fatyol_gombActionPerformed(evt);
            }
        });

        fatyol_megnyitasa_gomb.setText("Kijelölt fátyol megnyitása");
        fatyol_megnyitasa_gomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fatyol_megnyitasa_gombActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(uj_fatyol_gomb, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(id)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(fazonComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(44, 44, 44)
                                        .addComponent(jLabel4)
                                        .addGap(40, 40, 40)
                                        .addComponent(allapotComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48)
                                        .addComponent(fatyol_kereses_gomb))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addComponent(fatyol_megnyitasa_gomb, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(fazonComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(allapotComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fatyol_kereses_gomb)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uj_fatyol_gomb)
                    .addComponent(fatyol_megnyitasa_gomb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fatyol_kereses_gombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fatyol_kereses_gombActionPerformed
 int beirtId;
        if (this.id.getText()!=null && !this.id.getText().equals("")){
        
    
         beirtId = (Integer.parseInt(this.id.getText()));
    } else {
            beirtId = 0;
            
            }
    
        
        String allapot = (String.valueOf(this.allapotComboBox.getSelectedItem()));
        String fazon = (String.valueOf(this.fazonComboBox.getSelectedItem()));
        SQL sql = new SQL();
        List<Fatyol> fatyol = sql.searchFatyol(beirtId, fazon, allapot);
        fatyolBetolt(fatyol);   // String kivalasztottAllap = (String) allapotComboBox.getSelectedItem(); //ez majd később kell, kiszedni a választást
        //  int kesztyuAzon =  Integer.parseInt(kesztyuAzonosito.getText());
                                                
    }//GEN-LAST:event_fatyol_kereses_gombActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void uj_fatyol_gombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uj_fatyol_gombActionPerformed
Fatyolfelvetel fatyolfelvetel = new Fatyolfelvetel(szulo);
        szulo.panelmutat(fatyolfelvetel);       
    }//GEN-LAST:event_uj_fatyol_gombActionPerformed

    private void fatyol_megnyitasa_gombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fatyol_megnyitasa_gombActionPerformed
    Fatyol fatyol = this.kivalasztottsor();
        Fatyolmodositas fatyolmodositas = new Fatyolmodositas(szulo, fatyol);
        szulo.panelmutat(fatyolmodositas);
    }//GEN-LAST:event_fatyol_megnyitasa_gombActionPerformed
public Fatyol kivalasztottsor() {
        int i = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        Fatyol k = new Fatyol();
        k.setId((Integer) model.getValueAt(i, 0));
        k.setKep(model.getValueAt(i, 1).toString());
        k.setAr((Integer) model.getValueAt(i, 2));
        k.setFazon(model.getValueAt(i, 3).toString());
        k.setAllapot((String) model.getValueAt(i, 4));
        k.setMegjegyzes((String) model.getValueAt(i, 5));
        return k;
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> allapotComboBox;
    private javax.swing.JButton fatyol_kereses_gomb;
    private javax.swing.JButton fatyol_megnyitasa_gomb;
    private javax.swing.JComboBox<String> fazonComboBox;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton uj_fatyol_gomb;
    // End of variables declaration//GEN-END:variables
}
