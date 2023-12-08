package loginmysql;

import java.awt.Color;
import java.awt.event.MouseEvent;


public class Home extends javax.swing.JFrame {

   
   int MouseX,MouseY;
    public Home() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        PanelPrincipal = new javax.swing.JPanel();
        BarraLateral = new javax.swing.JPanel();
        Button_Mi_Info = new javax.swing.JLabel();
        Panel_Exit = new javax.swing.JPanel();
        Button_Exit = new javax.swing.JLabel();
        PanelContenedor = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Panel_Min = new javax.swing.JPanel();
        Button_Min = new javax.swing.JLabel();
        Panel_Close = new javax.swing.JPanel();
        Button_Close = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelPrincipal.setBackground(new java.awt.Color(153, 153, 153));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BarraLateral.setBackground(new java.awt.Color(153, 204, 255));
        BarraLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_Mi_Info.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        Button_Mi_Info.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_Mi_Info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/usuario48.png"))); // NOI18N
        Button_Mi_Info.setText("Ver mi Información");
        Button_Mi_Info.setToolTipText("");
        Button_Mi_Info.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Mi_Info.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Mi_Info.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BarraLateral.add(Button_Mi_Info, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 550));

        Panel_Exit.setBackground(new java.awt.Color(102, 0, 0));
        Panel_Exit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_Exit.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        Button_Exit.setForeground(new java.awt.Color(255, 255, 255));
        Button_Exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_Exit.setText("Salir");
        Button_Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_ExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_ExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_ExitMouseExited(evt);
            }
        });
        Panel_Exit.add(Button_Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 40));

        BarraLateral.add(Panel_Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 190, 40));

        PanelPrincipal.add(BarraLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 600));

        PanelContenedor.setBackground(new java.awt.Color(71, 173, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Bienvenido ");

        javax.swing.GroupLayout PanelContenedorLayout = new javax.swing.GroupLayout(PanelContenedor);
        PanelContenedor.setLayout(PanelContenedorLayout);
        PanelContenedorLayout.setHorizontalGroup(
            PanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelContenedorLayout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(231, Short.MAX_VALUE))
        );
        PanelContenedorLayout.setVerticalGroup(
            PanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelContenedorLayout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(337, Short.MAX_VALUE))
        );

        PanelPrincipal.add(PanelContenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 590, 570));

        Panel_Min.setBackground(new java.awt.Color(255, 255, 255));

        Button_Min.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_Min.setText("—");
        Button_Min.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_MinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_MinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_MinMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Panel_MinLayout = new javax.swing.GroupLayout(Panel_Min);
        Panel_Min.setLayout(Panel_MinLayout);
        Panel_MinLayout.setHorizontalGroup(
            Panel_MinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Button_Min, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        Panel_MinLayout.setVerticalGroup(
            Panel_MinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Button_Min, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PanelPrincipal.add(Panel_Min, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, -1, 30));

        Panel_Close.setBackground(new java.awt.Color(255, 255, 255));

        Button_Close.setBackground(new java.awt.Color(153, 153, 153));
        Button_Close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_Close.setText("x");
        Button_Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_CloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_CloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_CloseMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Panel_CloseLayout = new javax.swing.GroupLayout(Panel_Close);
        Panel_Close.setLayout(Panel_CloseLayout);
        Panel_CloseLayout.setHorizontalGroup(
            Panel_CloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Button_Close, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        Panel_CloseLayout.setVerticalGroup(
            Panel_CloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Button_Close, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        PanelPrincipal.add(Panel_Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, -1, -1));

        getContentPane().add(PanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_ExitMouseClicked
        if(MouseEvent.BUTTON1 == evt.getButton()){
            System.exit(0);
        }
    }//GEN-LAST:event_Button_ExitMouseClicked

    private void Button_ExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_ExitMouseEntered
        Panel_Exit.setBackground(Color.red);
    }//GEN-LAST:event_Button_ExitMouseEntered

    private void Button_ExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_ExitMouseExited
        Panel_Exit.setBackground(new Color(102,0,0));
    }//GEN-LAST:event_Button_ExitMouseExited

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        MouseX = evt.getX();
        MouseY = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int X = evt.getXOnScreen();
        int Y = evt.getYOnScreen();
        this.setLocation(X-MouseX, Y-MouseY);
    }//GEN-LAST:event_formMouseDragged

    private void Button_MinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_MinMouseClicked
        if(MouseEvent.BUTTON1 == evt.getButton()){
            this.setState(Home.ICONIFIED);
        }
    }//GEN-LAST:event_Button_MinMouseClicked

    private void Button_CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_CloseMouseClicked
        if(MouseEvent.BUTTON1 == evt.getButton()){
            System.exit(0);
        }
    }//GEN-LAST:event_Button_CloseMouseClicked

    private void Button_CloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_CloseMouseEntered
        Panel_Close.setBackground(Color.red);
        Button_Close.setForeground(Color.white);
    }//GEN-LAST:event_Button_CloseMouseEntered

    private void Button_MinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_MinMouseEntered
        Panel_Min.setBackground(Color.lightGray);
        Button_Min.setForeground(Color.white);
    }//GEN-LAST:event_Button_MinMouseEntered

    private void Button_CloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_CloseMouseExited
        Panel_Close.setBackground(Color.white);
        Button_Close.setForeground(Color.black);
    }//GEN-LAST:event_Button_CloseMouseExited

    private void Button_MinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_MinMouseExited
        Panel_Min.setBackground(Color.white);
        Button_Min.setForeground(Color.black);
    }//GEN-LAST:event_Button_MinMouseExited

   
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraLateral;
    private javax.swing.JLabel Button_Close;
    private javax.swing.JLabel Button_Exit;
    private javax.swing.JLabel Button_Mi_Info;
    private javax.swing.JLabel Button_Min;
    private javax.swing.JPanel PanelContenedor;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel Panel_Close;
    private javax.swing.JPanel Panel_Exit;
    private javax.swing.JPanel Panel_Min;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
