/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;
import static javax.swing.JOptionPane.showMessageDialog;


public class ladoCliente extends javax.swing.JFrame {

    private BigInteger p;
    private BigInteger q;
    private BigInteger N;
    private BigInteger phi;
    private BigInteger e;
    private BigInteger d;
    private int bitlength = 1024;
    private Random r;
    static ServerSocket ss;
    static ServerSocket ss2;
    static ServerSocket ss3;
    static Socket s;
    static Socket s2;
    static Socket s3;
    static DataInputStream dis;
    static DataOutputStream dos;
    static DataOutputStream dosN;
    static DataOutputStream dosD;
    static DataInputStream disN;
    static DataInputStream disD;

  
    public ladoCliente() {
        initComponents();
        
        r = new Random();
        p = BigInteger.probablePrime(bitlength, r);
        q = BigInteger.probablePrime(bitlength, r);
        N = p.multiply(q);
        phi = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
        e = BigInteger.probablePrime(bitlength / 2, r);
        while (phi.gcd(e).compareTo(BigInteger.ONE) > 0 && e.compareTo(phi) < 0) {
            e.add(BigInteger.ONE);
        }
        d = e.modInverse(phi);
    }

    public ladoCliente(BigInteger e, BigInteger d, BigInteger N) {
        this.e = e;
        this.d = d;
        this.N = N;
    }

    public BigInteger bigIntObtenerD() {
        return (d);
    }

    public BigInteger bigIntObtenerN() {
        return (N);
    }

   
    public byte[] encrypt(byte[] message) {
        return (new BigInteger(message)).modPow(e, N).toByteArray();
    }

    
    static public byte[] decrypt(byte[] message, BigInteger valD, BigInteger valN) {
        return (new BigInteger(message)).modPow(valD, valN).toByteArray();
    }

    private static String bytesToString(byte[] encrypted) {
        String test = "";
        for (byte b : encrypted) {
            test += Byte.toString(b);
        }
        return test;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtLadoClienteVentana = new javax.swing.JTextArea();
        txtMensajeCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnEnviarCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtLadoClienteVentana.setColumns(20);
        txtLadoClienteVentana.setRows(5);
        jScrollPane1.setViewportView(txtLadoClienteVentana);

        txtMensajeCliente.setText("Escriba su mensaje aqui");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("CHAT DEL CLIENTE");

        btnEnviarCliente.setText("Enviar!");
        btnEnviarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtMensajeCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEnviarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMensajeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnviarCliente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarClienteActionPerformed
        try {

            String mensajeserver = "";
            mensajeserver = txtMensajeCliente.getText();
            txtMensajeCliente.setText("");
            //showMessageDialog(null, bytesToString(mensajeserver.getBytes()));
            byte[] arres = encrypt(mensajeserver.getBytes());
            byte[] desencriptado = decrypt(arres, bigIntObtenerD(), bigIntObtenerN());
            System.out.println("Bytes enviados: " + bytesToString(arres));
            System.out.println("Decrypted String: " + new String(desencriptado));
            //showMessageDialog(null, Arrays.toString(arres));
            dos.writeUTF(Arrays.toString(arres));
            System.out.println("Este es el valor de N: " + bigIntObtenerN().toString());
            System.out.println("Este es el valor de d: " + bigIntObtenerD().toString());
            dosN.writeUTF(bigIntObtenerN().toString());
            dosD.writeUTF(bigIntObtenerD().toString());
            txtLadoClienteVentana.setText(txtLadoClienteVentana.getText() + "\n Usted: " + mensajeserver);

        } catch (Exception e) {

        }
       
    }//GEN-LAST:event_btnEnviarClienteActionPerformed

   
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ladoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ladoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ladoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ladoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ladoCliente().setVisible(true);
            }
        });

        try {
            String msjentrada = "";
            String msjRsaD = "";
            String msjRsaN = "";
            s = new Socket("127.0.0.1", 1449);
            s2 = new Socket("127.0.0.1", 1450);
            s3 = new Socket("127.0.0.1", 1451);
            dis = new DataInputStream(s.getInputStream());
            disN = new DataInputStream(s2.getInputStream()); // N va por el puerto 1450
            disD = new DataInputStream(s3.getInputStream()); // D va por el puerto 1451
            dos = new DataOutputStream(s.getOutputStream());
            dosN = new DataOutputStream(s2.getOutputStream());
            dosD = new DataOutputStream(s3.getOutputStream());

            while (!msjentrada.equals("Exit")) {

                //ladoCliente ld = new ladoCliente();
                msjentrada = dis.readUTF(); //-- aqui si lo hace
                System.out.println("Este es el mensaje del servidor:" + msjentrada); //--- 
                msjRsaN = disN.readUTF();
                msjRsaD = disD.readUTF();
                BigInteger rsaN = new BigInteger(msjRsaN);
                BigInteger rsaD = new BigInteger(msjRsaD);
                String joinedMinusBrackets = msjentrada.substring(1, msjentrada.length() - 1);
                // byte[] bdes = msjentrada.getBytes();
                String[] resplit = joinedMinusBrackets.split(", ");
                byte[] arrenc = new byte[resplit.length];
                for (int i = 0; i < resplit.length; ++i) {
                    arrenc[i] = Byte.parseByte(resplit[i]);
                }
                System.out.println("Bytes recibidos: " + arrenc);
                //showMessageDialog(null, Arrays.toString(arrenc));
                System.out.println("Recibí este valor de D: " + msjRsaD);
                System.out.println("Recibí este valor de N: " + msjRsaN);
                byte[] desencriptado = decrypt(arrenc, rsaD, rsaN);
                System.out.println("Desencriptando bytes: " + bytesToString(desencriptado));
                System.out.println("Cadena desencriptada: " + new String(desencriptado));
                String msjdesenc = new String(desencriptado);
                // byte[] arrdesencriptado = ld.decrypt(arrenc);
                //encriptarMensaje desm = new encriptarMensaje(msjentrada);
                //String mensajedesc = desm.desencriptamelo(bdes);
                txtLadoClienteVentana.setText(txtLadoClienteVentana.getText() + "\n Servidor: " + msjdesenc);
            }
        } catch (Exception e) {

        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTextArea txtLadoClienteVentana;
    private javax.swing.JTextField txtMensajeCliente;
    // End of variables declaration//GEN-END:variables
}
