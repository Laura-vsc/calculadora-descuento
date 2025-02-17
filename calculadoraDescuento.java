package calculadoraDescuento;
public class calculadoraDescuento extends javax.swing.JFrame {
    public calculadoraDescuento() {
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

        jColorChooser1 = new javax.swing.JColorChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        botonEjecutar = new javax.swing.JButton();
        cajaAhorro = new javax.swing.JTextField();
        cajaN1 = new javax.swing.JTextField();
        cajaN2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cajaPrecio1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 3));
        jPanel1.setForeground(new java.awt.Color(255, 204, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 18)); // NOI18N
        jLabel1.setText("AHORRO:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 340, 120, 30);

        jLabel2.setFont(new java.awt.Font("Agency FB", 3, 24)); // NOI18N
        jLabel2.setText("CALCULADORA DE DESCUENTOS");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(130, 10, 280, 70);

        jLabel3.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 18)); // NOI18N
        jLabel3.setText("PRECIO:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 100, 90, 40);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 18)); // NOI18N
        jLabel4.setText("DESCUENTO:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 150, 100, 30);

        botonEjecutar.setBackground(new java.awt.Color(204, 153, 255));
        botonEjecutar.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 18)); // NOI18N
        botonEjecutar.setText("EJECUTAR");
        botonEjecutar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 3));
        botonEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEjecutarActionPerformed(evt);
            }
        });
        jPanel1.add(botonEjecutar);
        botonEjecutar.setBounds(210, 210, 120, 30);

        cajaAhorro.setEditable(false);
        cajaAhorro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2));
        jPanel1.add(cajaAhorro);
        cajaAhorro.setBounds(180, 340, 170, 30);

        cajaN1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2));
        jPanel1.add(cajaN1);
        cajaN1.setBounds(180, 100, 180, 30);

        cajaN2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 102), 2, true));
        jPanel1.add(cajaN2);
        cajaN2.setBounds(180, 150, 180, 30);

        jLabel5.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 18)); // NOI18N
        jLabel5.setText("PRECIO FINAL:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 290, 120, 20);

        cajaPrecio1.setEditable(false);
        cajaPrecio1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2));
        jPanel1.add(cajaPrecio1);
        cajaPrecio1.setBounds(180, 280, 170, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEjecutarActionPerformed
        // variables
        int precio, descuento, precioFinal, descuentoPesos, ahorro;
        precio = Integer.parseInt(cajaN1.getText());
        descuento = Integer.parseInt(cajaN2.getText());
        descuentoPesos = precio * descuento / 100;   
        precioFinal = precio - descuentoPesos;
        ahorro = precio - precioFinal;
        cajaPrecio1.setText(String.valueOf(precioFinal));
        cajaAhorro.setText(String.valueOf(ahorro));
    }//GEN-LAST:event_botonEjecutarActionPerformed

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
            java.util.logging.Logger.getLogger(calculadoraDescuento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculadoraDescuento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculadoraDescuento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculadoraDescuento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculadoraDescuento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEjecutar;
    private javax.swing.JTextField cajaAhorro;
    private javax.swing.JTextField cajaN1;
    private javax.swing.JTextField cajaN2;
    private javax.swing.JTextField cajaPrecio1;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
