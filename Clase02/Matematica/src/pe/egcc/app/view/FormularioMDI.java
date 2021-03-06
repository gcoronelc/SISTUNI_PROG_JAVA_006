/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.app.view;

/**
 *
 * @author Gustavo Coronel
 */
public class FormularioMDI extends javax.swing.JFrame {

  /**
   * Creates new form FormularioMDI
   */
  public FormularioMDI() {
    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    desktopPane = new javax.swing.JDesktopPane();
    jToolBar1 = new javax.swing.JToolBar();
    btnTBFactorial = new javax.swing.JButton();
    jButton2 = new javax.swing.JButton();
    jButton3 = new javax.swing.JButton();
    jButton4 = new javax.swing.JButton();
    jSeparator1 = new javax.swing.JToolBar.Separator();
    jButton5 = new javax.swing.JButton();
    menuBar = new javax.swing.JMenuBar();
    fileMenu = new javax.swing.JMenu();
    exitMenuItem = new javax.swing.JMenuItem();
    menuOpciones = new javax.swing.JMenu();
    menuOpcionesFactorial = new javax.swing.JMenuItem();
    menuOpcionesMcdMcm = new javax.swing.JMenuItem();
    menuOpcionesFibonacci = new javax.swing.JMenuItem();
    menuOpcionesPrimo = new javax.swing.JMenuItem();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jToolBar1.setFloatable(false);
    jToolBar1.setRollover(true);

    btnTBFactorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/egcc/app/img/Excel.png"))); // NOI18N
    btnTBFactorial.setToolTipText("Factorial");
    btnTBFactorial.setFocusable(false);
    btnTBFactorial.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btnTBFactorial.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    btnTBFactorial.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        menuOpcionesFactorialActionPerformed(evt);
      }
    });
    jToolBar1.add(btnTBFactorial);

    jButton2.setText("jButton2");
    jButton2.setFocusable(false);
    jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    jToolBar1.add(jButton2);

    jButton3.setText("jButton3");
    jButton3.setFocusable(false);
    jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    jToolBar1.add(jButton3);

    jButton4.setText("jButton4");
    jButton4.setFocusable(false);
    jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    jToolBar1.add(jButton4);
    jToolBar1.add(jSeparator1);

    jButton5.setText("Salir");
    jButton5.setFocusable(false);
    jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    jToolBar1.add(jButton5);

    fileMenu.setMnemonic('f');
    fileMenu.setText("File");

    exitMenuItem.setMnemonic('x');
    exitMenuItem.setText("Exit");
    exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        exitMenuItemActionPerformed(evt);
      }
    });
    fileMenu.add(exitMenuItem);

    menuBar.add(fileMenu);

    menuOpciones.setMnemonic('h');
    menuOpciones.setText("Opciones");

    menuOpcionesFactorial.setMnemonic('c');
    menuOpcionesFactorial.setText("Factorial");
    menuOpcionesFactorial.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        menuOpcionesFactorialActionPerformed(evt);
      }
    });
    menuOpciones.add(menuOpcionesFactorial);

    menuOpcionesMcdMcm.setMnemonic('a');
    menuOpcionesMcdMcm.setText("MCD y MCM");
    menuOpciones.add(menuOpcionesMcdMcm);

    menuOpcionesFibonacci.setText("Fibonacci");
    menuOpciones.add(menuOpcionesFibonacci);

    menuOpcionesPrimo.setText("Primo");
    menuOpciones.add(menuOpcionesPrimo);

    menuBar.add(menuOpciones);

    setJMenuBar(menuBar);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
      .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
      System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

  private void menuOpcionesFactorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOpcionesFactorialActionPerformed
    FactorialView view = new FactorialView();
    desktopPane.add(view);
    view.setVisible(true);
  }//GEN-LAST:event_menuOpcionesFactorialActionPerformed

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
      java.util.logging.Logger.getLogger(FormularioMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(FormularioMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(FormularioMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(FormularioMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new FormularioMDI().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnTBFactorial;
  private javax.swing.JDesktopPane desktopPane;
  private javax.swing.JMenuItem exitMenuItem;
  private javax.swing.JMenu fileMenu;
  private javax.swing.JButton jButton2;
  private javax.swing.JButton jButton3;
  private javax.swing.JButton jButton4;
  private javax.swing.JButton jButton5;
  private javax.swing.JToolBar.Separator jSeparator1;
  private javax.swing.JToolBar jToolBar1;
  private javax.swing.JMenuBar menuBar;
  private javax.swing.JMenu menuOpciones;
  private javax.swing.JMenuItem menuOpcionesFactorial;
  private javax.swing.JMenuItem menuOpcionesFibonacci;
  private javax.swing.JMenuItem menuOpcionesMcdMcm;
  private javax.swing.JMenuItem menuOpcionesPrimo;
  // End of variables declaration//GEN-END:variables

}
