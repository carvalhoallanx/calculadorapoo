package calculadora02;

public class InterfaceCalculadora extends javax.swing.JFrame {

    public InterfaceCalculadora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TxtTELA = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        BtnAC = new javax.swing.JButton();
        Btnpercentual = new javax.swing.JButton();
        Btndividir = new javax.swing.JButton();
        BtnSomar = new javax.swing.JButton();
        BtnDiminuir = new javax.swing.JButton();
        BtnMultiplicar = new javax.swing.JButton();
        Btn7 = new javax.swing.JButton();
        Btn8 = new javax.swing.JButton();
        Btn9 = new javax.swing.JButton();
        Btn4 = new javax.swing.JButton();
        Btn5 = new javax.swing.JButton();
        Btn6 = new javax.swing.JButton();
        Btn1 = new javax.swing.JButton();
        Btn2 = new javax.swing.JButton();
        Btn3 = new javax.swing.JButton();
        Btnponto = new javax.swing.JButton();
        Btn0 = new javax.swing.JButton();
        BtnRes = new javax.swing.JButton();
        TxtRES = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TxtTELA.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        TxtTELA.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TxtTELA.setText("0,00");
        TxtTELA.setBorder(null);

        jPanel2.setLayout(new java.awt.GridLayout(6, 3));

        BtnAC.setText("AC");
        BtnAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnACActionPerformed(evt);
            }
        });
        jPanel2.add(BtnAC);

        Btnpercentual.setText("%");
        Btnpercentual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnpercentualActionPerformed(evt);
            }
        });
        jPanel2.add(Btnpercentual);

        Btndividir.setText("/");
        Btndividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtndividirActionPerformed(evt);
            }
        });
        jPanel2.add(Btndividir);

        BtnSomar.setText("+");
        BtnSomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSomarActionPerformed(evt);
            }
        });
        jPanel2.add(BtnSomar);

        BtnDiminuir.setText("-");
        BtnDiminuir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDiminuirActionPerformed(evt);
            }
        });
        jPanel2.add(BtnDiminuir);

        BtnMultiplicar.setText("x");
        BtnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMultiplicarActionPerformed(evt);
            }
        });
        jPanel2.add(BtnMultiplicar);

        Btn7.setText("7");
        Btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn7ActionPerformed(evt);
            }
        });
        jPanel2.add(Btn7);

        Btn8.setText("8");
        Btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn8ActionPerformed(evt);
            }
        });
        jPanel2.add(Btn8);

        Btn9.setText("9");
        Btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn9ActionPerformed(evt);
            }
        });
        jPanel2.add(Btn9);

        Btn4.setText("4");
        Btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn4ActionPerformed(evt);
            }
        });
        jPanel2.add(Btn4);

        Btn5.setText("5");
        Btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn5ActionPerformed(evt);
            }
        });
        jPanel2.add(Btn5);

        Btn6.setText("6");
        Btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn6ActionPerformed(evt);
            }
        });
        jPanel2.add(Btn6);

        Btn1.setText("1");
        Btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn1ActionPerformed(evt);
            }
        });
        jPanel2.add(Btn1);

        Btn2.setText("2");
        Btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn2ActionPerformed(evt);
            }
        });
        jPanel2.add(Btn2);

        Btn3.setText("3");
        Btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn3ActionPerformed(evt);
            }
        });
        jPanel2.add(Btn3);

        Btnponto.setText(".");
        Btnponto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnpontoActionPerformed(evt);
            }
        });
        jPanel2.add(Btnponto);

        Btn0.setText("0");
        Btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn0ActionPerformed(evt);
            }
        });
        jPanel2.add(Btn0);

        BtnRes.setText("=");
        BtnRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResActionPerformed(evt);
            }
        });
        jPanel2.add(BtnRes);

        TxtRES.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TxtRES.setBorder(null);
        TxtRES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtRESActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtRES)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                    .addComponent(TxtTELA))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TxtRES, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtTELA, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn0ActionPerformed
        Digitar("0");
    }//GEN-LAST:event_Btn0ActionPerformed

    private void Btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn1ActionPerformed
        Digitar("1");
    }//GEN-LAST:event_Btn1ActionPerformed

    private void Btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn2ActionPerformed
        Digitar("2");
    }//GEN-LAST:event_Btn2ActionPerformed

    private void Btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn3ActionPerformed
        Digitar("3");
    }//GEN-LAST:event_Btn3ActionPerformed

    private void Btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn4ActionPerformed
        Digitar("4");
    }//GEN-LAST:event_Btn4ActionPerformed

    private void Btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn5ActionPerformed
        Digitar("5");
    }//GEN-LAST:event_Btn5ActionPerformed

    private void Btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn6ActionPerformed
        Digitar("6");
    }//GEN-LAST:event_Btn6ActionPerformed

    private void Btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn7ActionPerformed
        Digitar("7");
    }//GEN-LAST:event_Btn7ActionPerformed

    private void Btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn8ActionPerformed
        Digitar("8");
    }//GEN-LAST:event_Btn8ActionPerformed

    private void Btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn9ActionPerformed
        Digitar("9");
    }//GEN-LAST:event_Btn9ActionPerformed

    private void BtnpontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnpontoActionPerformed
        Digitar(".");
    }//GEN-LAST:event_BtnpontoActionPerformed

    private void BtnACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnACActionPerformed
        limpar();
    }//GEN-LAST:event_BtnACActionPerformed
        CalculadoraHeranca call = new CalculadoraHeranca();
    private void BtnSomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSomarActionPerformed
        call.setvalor1(Double.parseDouble(TxtTELA.getText()));
        call.setCalcular("Somar");
        call.setcalculo(true);
        TxtTELA.setText("");
    }//GEN-LAST:event_BtnSomarActionPerformed

    private void BtnDiminuirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDiminuirActionPerformed
        call.setvalor1(Double.parseDouble(TxtTELA.getText()));
        call.setCalcular("Diminuir");
        call.setcalculo(true);
        TxtTELA.setText("");
    }//GEN-LAST:event_BtnDiminuirActionPerformed

    private void BtnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMultiplicarActionPerformed
        call.setvalor1(Double.parseDouble(TxtTELA.getText()));
        call.setCalcular("Multiplicar");
        call.setcalculo(true);
        TxtTELA.setText("");
    }//GEN-LAST:event_BtnMultiplicarActionPerformed

    private void BtndividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtndividirActionPerformed
        call.setvalor1(Double.parseDouble(TxtTELA.getText()));
        call.setCalcular("Dividir");
        call.setcalculo(true);
        TxtTELA.setText("");
    }//GEN-LAST:event_BtndividirActionPerformed

    private void BtnpercentualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnpercentualActionPerformed
        call.setvalor2(Double.parseDouble(TxtTELA.getText()));
        String S;
        String V1,V2;
        V1 = Double.toString(call.getValor1());
        V2 = Double.toString(call.getValor2());
        
        if ("Somar".equals(call.getCalcular()) && call.getcalculo() == true) {
            TxtTELA.setText(String.valueOf(call.getpercentualsomar()));
            S = (V1 +""+"+"+""+V2+"%"+"=");
            TxtRES.setText(S);
            call.setcalculo(false);
        } else if("Diminuir".equals(call.getCalcular()) && call.getcalculo() == true){
            TxtTELA.setText(String.valueOf(call.getpercentualdiminuir()));
            S = (V1 +""+"-"+""+V2+"%"+"=");
            TxtRES.setText(S);
            call.setcalculo(false);
        }else if("Multiplicar".equals(call.getCalcular()) && call.getcalculo() == true){
            TxtTELA.setText(String.valueOf(call.getpercentualmultiplicar()));
            S = (V1 +""+"*"+""+V2+"%"+"=");
            TxtRES.setText(S);
            call.setcalculo(false);
        }else if("Dividir".equals(call.getCalcular()) && call.getcalculo() == true){
            TxtTELA.setText(String.valueOf(call.getpercentualdividir()));
            S = (V1 +""+"/"+""+V2+"%"+"=");
            TxtRES.setText(S);
            call.setcalculo(false);
        }
    }//GEN-LAST:event_BtnpercentualActionPerformed

    private void BtnResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResActionPerformed
        String S;
        String V1,V2;
        call.setvalor2(Double.parseDouble(TxtTELA.getText()));
        V1 = Double.toString(call.getValor1());
        V2 = Double.toString(call.getValor2());
        
        if ("Somar".equals(call.getCalcular()) && call.getcalculo() == true) {
           TxtTELA.setText(String.valueOf(call.getsomar()));
           S = (V1 +""+"+"+""+V2+"=");
           TxtRES.setText(S);
           call.setcalculo(false);
        } else if("Diminuir".equals(call.getCalcular()) && call.getcalculo() == true){
            TxtTELA.setText(String.valueOf(call.getsubtrair()));
            S = (V1 +""+"-"+""+V2+"=");
            TxtRES.setText(S);
            call.setcalculo(false);
        } else if("Multiplicar".equals(call.getCalcular()) && call.getcalculo() == true){
            TxtTELA.setText(String.valueOf(call.getmultiplicar()));
            S = (V1 +""+"*"+""+V2+"=");
            TxtRES.setText(S);
            call.setcalculo(false);
        } else if("Dividir".equals(call.getCalcular()) && call.getcalculo() == true){
            TxtTELA.setText(String.valueOf(call.getdividir()));
            S = (V1 +""+"/"+""+V2+"=");
            TxtRES.setText(S);
            call.setcalculo(false);
        }
    }//GEN-LAST:event_BtnResActionPerformed

    private void TxtRESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtRESActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtRESActionPerformed


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceCalculadora().setVisible(true);
            }
        });
    }
    
    private void Digitar(String caractere){
        if (TxtTELA.getText().equals("0,00")) {
            TxtTELA.setText(caractere);
        }else{
            if (caractere.equals(",") && TxtTELA.getText().contains(",")) {
            } else{
            TxtTELA.setText(TxtTELA.getText().concat(caractere));
            }
        }    
    }
    private void limpar(){
        TxtTELA.setText("0,00");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn0;
    private javax.swing.JButton Btn1;
    private javax.swing.JButton Btn2;
    private javax.swing.JButton Btn3;
    private javax.swing.JButton Btn4;
    private javax.swing.JButton Btn5;
    private javax.swing.JButton Btn6;
    private javax.swing.JButton Btn7;
    private javax.swing.JButton Btn8;
    private javax.swing.JButton Btn9;
    private javax.swing.JButton BtnAC;
    private javax.swing.JButton BtnDiminuir;
    private javax.swing.JButton BtnMultiplicar;
    private javax.swing.JButton BtnRes;
    private javax.swing.JButton BtnSomar;
    private javax.swing.JButton Btndividir;
    private javax.swing.JButton Btnpercentual;
    private javax.swing.JButton Btnponto;
    private javax.swing.JTextField TxtRES;
    private javax.swing.JTextField TxtTELA;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
