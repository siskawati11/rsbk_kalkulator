/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaskalkulator;

/**
 *
 * @author ASUS
 */
public class calculator extends javax.swing.JFrame {

    double firstnumber;
    double secondnumber;
    double result;
    String operator;
    public calculator() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        text = new javax.swing.JTextField();
        t1 = new javax.swing.JButton();
        t2 = new javax.swing.JButton();
        t3 = new javax.swing.JButton();
        t4 = new javax.swing.JButton();
        t5 = new javax.swing.JButton();
        t6 = new javax.swing.JButton();
        t7 = new javax.swing.JButton();
        t8 = new javax.swing.JButton();
        t9 = new javax.swing.JButton();
        t10 = new javax.swing.JButton();
        t11 = new javax.swing.JButton();
        t12 = new javax.swing.JButton();
        t13 = new javax.swing.JButton();
        t14 = new javax.swing.JButton();
        t15 = new javax.swing.JButton();
        t16 = new javax.swing.JButton();
        t17 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("KALKULATOR");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));
        getContentPane().add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 260, 40));

        t1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        t1.setText("1");
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 50, 40));

        t2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        t2.setText("2");
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 50, 40));

        t3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        t3.setText("3");
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 50, 40));

        t4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        t4.setText("4");
        t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t4ActionPerformed(evt);
            }
        });
        getContentPane().add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 50, 40));

        t5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        t5.setText("5");
        t5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t5ActionPerformed(evt);
            }
        });
        getContentPane().add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 50, 40));

        t6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        t6.setText("6");
        t6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t6ActionPerformed(evt);
            }
        });
        getContentPane().add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 50, 40));

        t7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        t7.setText("7");
        t7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t7ActionPerformed(evt);
            }
        });
        getContentPane().add(t7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 50, 40));

        t8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        t8.setText("8");
        t8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t8ActionPerformed(evt);
            }
        });
        getContentPane().add(t8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 50, 40));

        t9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        t9.setText("9");
        t9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t9ActionPerformed(evt);
            }
        });
        getContentPane().add(t9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 50, 40));

        t10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        t10.setText("0");
        t10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t10ActionPerformed(evt);
            }
        });
        getContentPane().add(t10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 50, 40));

        t11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        t11.setText("+");
        t11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t11ActionPerformed(evt);
            }
        });
        getContentPane().add(t11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 50, 40));

        t12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        t12.setText("-");
        t12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t12ActionPerformed(evt);
            }
        });
        getContentPane().add(t12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 50, 40));

        t13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        t13.setText("C");
        t13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t13ActionPerformed(evt);
            }
        });
        getContentPane().add(t13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 110, 40));

        t14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        t14.setText("=");
        t14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t14ActionPerformed(evt);
            }
        });
        getContentPane().add(t14, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 80, 40));

        t15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        t15.setText("/");
        t15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t15ActionPerformed(evt);
            }
        });
        getContentPane().add(t15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 50, 40));

        t16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        t16.setText("*");
        t16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t16ActionPerformed(evt);
            }
        });
        getContentPane().add(t16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 50, 40));

        t17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        t17.setText(".");
        t17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t17ActionPerformed(evt);
            }
        });
        getContentPane().add(t17, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 50, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
       String number = text.getText()+ t1.getText();
        text.setText(number); // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        String number = text.getText()+ t2.getText();
        text.setText(number); // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
      String number = text.getText()+ t3.getText();
        text.setText(number);    // TODO add your handling code here:
    }//GEN-LAST:event_t3ActionPerformed

    private void t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t4ActionPerformed
       String number = text.getText()+ t4.getText();
        text.setText(number);   // TODO add your handling code here:
    }//GEN-LAST:event_t4ActionPerformed

    private void t5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t5ActionPerformed
        String number = text.getText()+ t5.getText();
        text.setText(number);  // TODO add your handling code here:
    }//GEN-LAST:event_t5ActionPerformed

    private void t6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t6ActionPerformed
        String number = text.getText()+ t6.getText();
        text.setText(number); // TODO add your handling code here:
    }//GEN-LAST:event_t6ActionPerformed

    private void t7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t7ActionPerformed
       String number = text.getText()+ t7.getText();
        text.setText(number); // TODO add your handling code here:
    }//GEN-LAST:event_t7ActionPerformed

    private void t8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t8ActionPerformed
        String number = text.getText()+ t8.getText();
        text.setText(number);  // TODO add your handling code here:
    }//GEN-LAST:event_t8ActionPerformed

    private void t9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t9ActionPerformed
      String number = text.getText()+ t9.getText();
        text.setText(number);   // TODO add your handling code here:
    }//GEN-LAST:event_t9ActionPerformed

    private void t10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t10ActionPerformed
       String number = text.getText()+ t10.getText();
        text.setText(number);  // TODO add your handling code here:
    }//GEN-LAST:event_t10ActionPerformed

    private void t11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t11ActionPerformed
      firstnumber = Double.parseDouble(text.getText());
      text.setText(" ");
      operator="+";  // TODO add your handling code here:
    }//GEN-LAST:event_t11ActionPerformed

    private void t12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t12ActionPerformed
      firstnumber = Double.parseDouble(text.getText());
      text.setText(" ");
      operator="-";      // TODO add your handling code here:
    }//GEN-LAST:event_t12ActionPerformed

    private void t13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t13ActionPerformed
       text.setText(" ");     // TODO add your handling code here:
    }//GEN-LAST:event_t13ActionPerformed

    private void t14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t14ActionPerformed
       secondnumber = Double.parseDouble(text.getText());
        if(operator == "+")
        {result=firstnumber+secondnumber;
            text.setText(Double.toString(result));}
        else if(operator == "-")
        {result=firstnumber-secondnumber;
           text.setText(Double.toString(result));}
         else if(operator == "/")
        {result=firstnumber/secondnumber;
            text.setText(Double.toString(result));}
         else if(operator == "*")
        {result=firstnumber*secondnumber;
            text.setText(Double.toString(result));} // TODO add your handling code here:
    }//GEN-LAST:event_t14ActionPerformed

    private void t15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t15ActionPerformed
        firstnumber = Double.parseDouble(text.getText());
        text.setText(" ");
        operator="/"; // TODO add your handling code here:
    }//GEN-LAST:event_t15ActionPerformed

    private void t16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t16ActionPerformed
        firstnumber = Double.parseDouble(text.getText());
        text.setText(" ");
        operator="*";  // TODO add your handling code here:
    }//GEN-LAST:event_t16ActionPerformed

    private void t17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t17ActionPerformed
       String number = text.getText()+ t17.getText();
       text.setText(number); // TODO add your handling code here:
    }//GEN-LAST:event_t17ActionPerformed

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton t1;
    private javax.swing.JButton t10;
    private javax.swing.JButton t11;
    private javax.swing.JButton t12;
    private javax.swing.JButton t13;
    private javax.swing.JButton t14;
    private javax.swing.JButton t15;
    private javax.swing.JButton t16;
    private javax.swing.JButton t17;
    private javax.swing.JButton t2;
    private javax.swing.JButton t3;
    private javax.swing.JButton t4;
    private javax.swing.JButton t5;
    private javax.swing.JButton t6;
    private javax.swing.JButton t7;
    private javax.swing.JButton t8;
    private javax.swing.JButton t9;
    private javax.swing.JTextField text;
    // End of variables declaration//GEN-END:variables
}
