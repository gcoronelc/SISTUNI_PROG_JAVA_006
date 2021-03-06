/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.view;

import pe.egcc.controller.AppController;

/**
 *
 * @author darwi
 */
public class SerieFibonacciView extends javax.swing.JInternalFrame {

    /**
     * Creates new form SerieFibonacciView
     */
    public SerieFibonacciView() {
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

        lbl_Numero = new javax.swing.JLabel();
        txt_Numero = new javax.swing.JTextField();
        lbl_Serie = new javax.swing.JLabel();
        btn_Operar = new javax.swing.JButton();
        lbl_Resultado = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Fibonacci");

        lbl_Numero.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        lbl_Numero.setText("INGRESE NUMERO: ");

        lbl_Serie.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        lbl_Serie.setText("LA SERIE ES:");

        btn_Operar.setText("OPERAR");
        btn_Operar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_OperarActionPerformed(evt);
            }
        });

        lbl_Resultado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_Resultado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_Serie)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_Numero, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Numero, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Operar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Operar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_Numero, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_Numero, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Serie, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(137, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_OperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_OperarActionPerformed
        int Dato =Integer.parseInt(txt_Numero.getText());
        AppController control = new AppController();
        int[] resultado = control.fibonacci(Dato);
        //ESCRIBO EL RESULTADO DE LA CADENA
        String repo="";
        for (int i = 0; i < resultado.length; i++) {
         repo += resultado[i] + ", ";               
        }
        lbl_Resultado.setText(repo);
    }//GEN-LAST:event_btn_OperarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Operar;
    private javax.swing.JLabel lbl_Numero;
    private javax.swing.JLabel lbl_Resultado;
    private javax.swing.JLabel lbl_Serie;
    private javax.swing.JTextField txt_Numero;
    // End of variables declaration//GEN-END:variables
}
