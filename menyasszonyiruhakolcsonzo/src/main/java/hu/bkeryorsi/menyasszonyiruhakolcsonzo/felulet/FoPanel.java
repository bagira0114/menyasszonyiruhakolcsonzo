/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.bkeryorsi.menyasszonyiruhakolcsonzo.felulet;

import java.awt.Color;

/**
 *
 * @author keryo
 */
public class FoPanel extends javax.swing.JFrame {

    /**
     * Creates new form FoPanel
     */
    public FoPanel() {
        initComponents();
    }
    String active = "ruhaink";

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        foreteg = new javax.swing.JPanel();
        baloldali_menu = new javax.swing.JPanel();
        ugyfelek = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ruhaink = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fatylak = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        kesztyuk = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        kolcsonzes = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        kijelentkezes = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jobboldali_panel = new javax.swing.JPanel();
        ruhaink_ablak = new javax.swing.JPanel();
        fatylak_ablak = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        foreteg.setBackground(new java.awt.Color(255, 255, 255));
        foreteg.setForeground(new java.awt.Color(0, 0, 0));
        foreteg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        baloldali_menu.setBackground(new java.awt.Color(0, 51, 51));
        baloldali_menu.setForeground(new java.awt.Color(0, 0, 0));

        ugyfelek.setBackground(new java.awt.Color(0, 102, 102));
        ugyfelek.setForeground(new java.awt.Color(0, 0, 0));
        ugyfelek.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ugyfelek.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ugyfelekMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ugyfelekMouseExited(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Logó");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Ügyfelek");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout ugyfelekLayout = new javax.swing.GroupLayout(ugyfelek);
        ugyfelek.setLayout(ugyfelekLayout);
        ugyfelekLayout.setHorizontalGroup(
            ugyfelekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ugyfelekLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );
        ugyfelekLayout.setVerticalGroup(
            ugyfelekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ugyfelekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
        );

        ruhaink.setBackground(new java.awt.Color(0, 102, 102));
        ruhaink.setForeground(new java.awt.Color(0, 0, 0));
        ruhaink.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ruhaink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ruhainkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ruhainkMouseExited(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Logó");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Ruháink");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });

        javax.swing.GroupLayout ruhainkLayout = new javax.swing.GroupLayout(ruhaink);
        ruhaink.setLayout(ruhainkLayout);
        ruhainkLayout.setHorizontalGroup(
            ruhainkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ruhainkLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ruhainkLayout.setVerticalGroup(
            ruhainkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
        );

        fatylak.setBackground(new java.awt.Color(0, 102, 102));
        fatylak.setForeground(new java.awt.Color(0, 0, 0));
        fatylak.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fatylak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fatylakMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fatylakMouseExited(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Logó");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Fátylak");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });

        javax.swing.GroupLayout fatylakLayout = new javax.swing.GroupLayout(fatylak);
        fatylak.setLayout(fatylakLayout);
        fatylakLayout.setHorizontalGroup(
            fatylakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fatylakLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        fatylakLayout.setVerticalGroup(
            fatylakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        kesztyuk.setBackground(new java.awt.Color(0, 102, 102));
        kesztyuk.setForeground(new java.awt.Color(0, 0, 0));
        kesztyuk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kesztyuk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                kesztyukMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                kesztyukMouseExited(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Logó");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Kesztyűk");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
        });

        javax.swing.GroupLayout kesztyukLayout = new javax.swing.GroupLayout(kesztyuk);
        kesztyuk.setLayout(kesztyukLayout);
        kesztyukLayout.setHorizontalGroup(
            kesztyukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kesztyukLayout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );
        kesztyukLayout.setVerticalGroup(
            kesztyukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kesztyukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
        );

        kolcsonzes.setBackground(new java.awt.Color(0, 102, 102));
        kolcsonzes.setForeground(new java.awt.Color(0, 0, 0));
        kolcsonzes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kolcsonzes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                kolcsonzesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                kolcsonzesMouseExited(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Logó");

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Kölcsönzés");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel12MouseExited(evt);
            }
        });

        javax.swing.GroupLayout kolcsonzesLayout = new javax.swing.GroupLayout(kolcsonzes);
        kolcsonzes.setLayout(kolcsonzesLayout);
        kolcsonzesLayout.setHorizontalGroup(
            kolcsonzesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kolcsonzesLayout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );
        kolcsonzesLayout.setVerticalGroup(
            kolcsonzesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kolcsonzesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
        );

        kijelentkezes.setBackground(new java.awt.Color(0, 102, 102));
        kijelentkezes.setForeground(new java.awt.Color(0, 0, 0));
        kijelentkezes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kijelentkezes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                kijelentkezesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                kijelentkezesMouseExited(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Logó");

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Kijelentkezés");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel14MouseExited(evt);
            }
        });

        javax.swing.GroupLayout kijelentkezesLayout = new javax.swing.GroupLayout(kijelentkezes);
        kijelentkezes.setLayout(kijelentkezesLayout);
        kijelentkezesLayout.setHorizontalGroup(
            kijelentkezesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kijelentkezesLayout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );
        kijelentkezesLayout.setVerticalGroup(
            kijelentkezesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kijelentkezesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout baloldali_menuLayout = new javax.swing.GroupLayout(baloldali_menu);
        baloldali_menu.setLayout(baloldali_menuLayout);
        baloldali_menuLayout.setHorizontalGroup(
            baloldali_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ugyfelek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(kesztyuk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fatylak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ruhaink, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(kolcsonzes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(kijelentkezes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        baloldali_menuLayout.setVerticalGroup(
            baloldali_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baloldali_menuLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(ruhaink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(fatylak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addComponent(kesztyuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(ugyfelek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(kolcsonzes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(kijelentkezes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168))
        );

        foreteg.add(baloldali_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 603));

        jobboldali_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ruhaink_ablak.setBackground(new java.awt.Color(255, 255, 255));
        ruhaink_ablak.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout ruhaink_ablakLayout = new javax.swing.GroupLayout(ruhaink_ablak);
        ruhaink_ablak.setLayout(ruhaink_ablakLayout);
        ruhaink_ablakLayout.setHorizontalGroup(
            ruhaink_ablakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        ruhaink_ablakLayout.setVerticalGroup(
            ruhaink_ablakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jobboldali_panel.add(ruhaink_ablak, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 900, 600));

        javax.swing.GroupLayout fatylak_ablakLayout = new javax.swing.GroupLayout(fatylak_ablak);
        fatylak_ablak.setLayout(fatylak_ablakLayout);
        fatylak_ablakLayout.setHorizontalGroup(
            fatylak_ablakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        fatylak_ablakLayout.setVerticalGroup(
            fatylak_ablakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jobboldali_panel.add(fatylak_ablak, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 0, 900, 610));

        foreteg.add(jobboldali_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 0, 890, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(foreteg, javax.swing.GroupLayout.PREFERRED_SIZE, 1084, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(foreteg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        this.ugyfelekMouseEntered(evt);
    }//GEN-LAST:event_jLabel4MouseEntered

    private void ugyfelekMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ugyfelekMouseEntered
        ugyfelek.setBackground(new Color(30, 144, 255));
    }//GEN-LAST:event_ugyfelekMouseEntered

    private void ugyfelekMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ugyfelekMouseExited

        if (!(active.equalsIgnoreCase("ugyfelek"))) {

            ugyfelek.setBackground(new Color(0, 102, 102));
    }//GEN-LAST:event_ugyfelekMouseExited
    }
    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        this.ugyfelekMouseExited(evt);
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        this.ruhainkMouseEntered(evt);    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        this.ruhainkMouseExited(evt);
    }//GEN-LAST:event_jLabel6MouseExited

    private void ruhainkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ruhainkMouseEntered
        ruhaink.setBackground(new Color(30, 144, 255));

    }//GEN-LAST:event_ruhainkMouseEntered

    private void ruhainkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ruhainkMouseExited

        if (!(active.equalsIgnoreCase("ruhaink"))) {

            ruhaink.setBackground(new Color(0, 102, 102));
    }//GEN-LAST:event_ruhainkMouseExited
    }
    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        this.fatylakMouseEntered(evt);
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        this.fatylakMouseExited(evt);

    }//GEN-LAST:event_jLabel8MouseExited

    private void fatylakMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fatylakMouseEntered
        fatylak.setBackground(new Color(30, 144, 255));    }//GEN-LAST:event_fatylakMouseEntered

    private void fatylakMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fatylakMouseExited
        if (!(active.equalsIgnoreCase("fatylak"))) {

            fatylak.setBackground(new Color(0, 102, 102));    }//GEN-LAST:event_fatylakMouseExited
    }
    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        this.kesztyukMouseEntered(evt);
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        this.kesztyukMouseExited(evt);
    }//GEN-LAST:event_jLabel10MouseExited

    private void kesztyukMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kesztyukMouseEntered
        kesztyuk.setBackground(new Color(30, 144, 255));
    }//GEN-LAST:event_kesztyukMouseEntered

    private void kesztyukMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kesztyukMouseExited
        if (!(active.equalsIgnoreCase("kesztyuk"))) {

            kesztyuk.setBackground(new Color(0, 102, 102));
    }//GEN-LAST:event_kesztyukMouseExited
    }
    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
        this.kolcsonzesMouseEntered(evt);
    }//GEN-LAST:event_jLabel12MouseEntered

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseExited
        this.kolcsonzesMouseExited(evt);
    }//GEN-LAST:event_jLabel12MouseExited

    private void kolcsonzesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kolcsonzesMouseEntered
        kolcsonzes.setBackground(new Color(30, 144, 255));
    }//GEN-LAST:event_kolcsonzesMouseEntered

    private void kolcsonzesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kolcsonzesMouseExited
        if (!(active.equalsIgnoreCase("kolcsonzes"))) {

            kolcsonzes.setBackground(new Color(0, 102, 102));
    }//GEN-LAST:event_kolcsonzesMouseExited
    }
    private void jLabel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseEntered
        this.kijelentkezesMouseExited(evt);
    }//GEN-LAST:event_jLabel14MouseEntered

    private void jLabel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseExited
        this.kijelentkezesMouseExited(evt);
    }//GEN-LAST:event_jLabel14MouseExited

    private void kijelentkezesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kijelentkezesMouseEntered
        kijelentkezes.setBackground(new Color(30, 144, 255));
    }//GEN-LAST:event_kijelentkezesMouseEntered

    private void kijelentkezesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kijelentkezesMouseExited
        if (!(active.equalsIgnoreCase("kijelentkezes"))) {

            kijelentkezes.setBackground(new Color(0, 102, 102));
        }
    }//GEN-LAST:event_kijelentkezesMouseExited

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened
        /**
         * @param args the command line arguments
         */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FoPanel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FoPanel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FoPanel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FoPanel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FoPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel baloldali_menu;
    private javax.swing.JPanel fatylak;
    private javax.swing.JPanel fatylak_ablak;
    private javax.swing.JPanel foreteg;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jobboldali_panel;
    private javax.swing.JPanel kesztyuk;
    private javax.swing.JPanel kijelentkezes;
    private javax.swing.JPanel kolcsonzes;
    private javax.swing.JPanel ruhaink;
    private javax.swing.JPanel ruhaink_ablak;
    private javax.swing.JPanel ugyfelek;
    // End of variables declaration//GEN-END:variables
}
