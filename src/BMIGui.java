/**
 * @author Kaitlyn Morris
 * CS 491 Homework 1
 * Program for the GUI
 */

public class BMIGui extends javax.swing.JFrame {
    /**
     * Creates new form BMIGui
     */
    public BMIGui() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(204, 204, 204));

        jLayeredPane2.setBackground(java.awt.Color.lightGray);
        jLayeredPane2.setForeground(new java.awt.Color(0, 0, 0));
        jLayeredPane2.setMaximumSize(new java.awt.Dimension(30000, 30000));
        jLayeredPane2.setOpaque(true);
        jLayeredPane2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Height:");
        jLayeredPane2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 55, 25));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Weight:");
        jLayeredPane2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 55, 25));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("BMI:");
        jLayeredPane2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 55, 25));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("BMI Catagories: \n");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLayeredPane2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 112, 20));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText(" Feet");
        jLayeredPane2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 55, 25));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText(" Inches");
        jLayeredPane2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 55, 25));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText(" Pounds");
        jLayeredPane2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 55, 25));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Calculate BMI");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jLayeredPane2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jLayeredPane2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 75, -1));

        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jLayeredPane2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 75, -1));

        jTextField4.setBackground(new java.awt.Color(255, 255, 255));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jLayeredPane2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 75, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("BMI Calculator");
        jLayeredPane2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 12, 120, 20));

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLayeredPane2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, -1));

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Underweight = <18.5");
        jLayeredPane2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, -1, -1));

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Normal Weight = 18.5-24.9");
        jLayeredPane2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, -1, -1));

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Overweight = 25-2...");
        jLayeredPane2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, -1, -1));

        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Obesity = BMI of 30 or greater");
        jLayeredPane2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, -1));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setOpaque(true);
        jLayeredPane2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 60, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String feet = jTextField4.getText(); 
        int ifeet = Integer.parseInt(feet);
        
        String pounds = jTextField3.getText();
        double dpounds = Integer.parseInt(pounds);
        
        String inches = jTextField2.getText();
        double dinches = Integer.parseInt(inches);
        
        BMICalculations b = new BMICalculations();
        double bmi = b.calculator(ifeet, dinches, dpounds);
        
        jLabel14.setText(String.format("%.1f%n", bmi));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BMIGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BMIGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BMIGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BMIGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BMIGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
