/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import DAL.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.Timer;

/**
 *
 * @author Usuario
 */
public class Frm_Inicial extends javax.swing.JFrame {

    /**
     * Creates new form Frm_Inicial
     */
    public Frm_Inicial() {

        initComponents();
        setLocationRelativeTo(null);
        DALEmpleado.leerEmpleados();
        DALArea.leerAreas();
        DALAsignacion.leerAsignaciones();
        DALPuesto.leerPuestos();

        LocalTime medioDia = LocalTime.of(12, 0);
        // formato
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");

        // saludo
        // Se crea un Timer que se ejecuta cada segundo
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Se obtiene la hora actual
                LocalTime hora = LocalTime.now();
                // Se muestra la hora formateada
                jLabel3.setText(hora.format(formato));
                // Se muestra el saludo según la hora
                if (hora.isAfter(medioDia)) {
                    jLabel2.setText("Buenas tardes");
                } else {
                    jLabel2.setText("Buenos días");
                }
            }
        });
        // Se inicia el Timer
        timer.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 90)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 153));
        jLabel1.setText("Talento Gestor");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 680, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 0));
        jLabel2.setText("text");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 51));
        jLabel3.setText("Timer");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 0, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 255, 255));
        jButton1.setText("Comenzar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 260, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 790, 660));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 151, 161));
        jLabel4.setText("Integrantes:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 210, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 151, 161));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos Interfaz/bookmark-gri.png"))); // NOI18N
        jLabel5.setText("Morales Robles Jeancarlo");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 250, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 151, 161));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos Interfaz/bookmark-gri.png"))); // NOI18N
        jLabel6.setText("Cuba Prieto Mauricio");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 250, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 151, 161));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos Interfaz/bookmark-gri.png"))); // NOI18N
        jLabel7.setText("Días Uceda Carlos");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 250, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 151, 161));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos Interfaz/bookmark-gri.png"))); // NOI18N
        jLabel8.setText("León García Axel ");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 250, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 151, 161));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos Interfaz/bookmark-gri.png"))); // NOI18N
        jLabel9.setText("Malca Delgado Alba");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 250, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 151, 161));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos Interfaz/bookmark-gri.png"))); // NOI18N
        jLabel10.setText("Mamani Azabache Eduardo ");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 250, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 3, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 151, 161));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos Interfaz/bookmark-gri.png"))); // NOI18N
        jLabel11.setText("Montoya Granda Cindy");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 250, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 290, 290));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        Frm_Menu comenzar = new Frm_Menu();
        comenzar.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(Frm_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Inicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

    private void ExtendedState(int MAXIMIZED_BOTH) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
