package pe.egcc.app.view;

import javax.swing.JInternalFrame;

public class FormularioMDI extends javax.swing.JFrame {

  /**
   * Creates new form FormularioMIDI
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
    btnFactorial = new javax.swing.JButton();
    btnFibonacci = new javax.swing.JButton();
    btnMCMyMCD = new javax.swing.JButton();
    btnPrimo = new javax.swing.JButton();
    btnCerrar = new javax.swing.JButton();
    jSeparator1 = new javax.swing.JSeparator();
    menuBar = new javax.swing.JMenuBar();
    fileMenu = new javax.swing.JMenu();
    openMenuItem = new javax.swing.JMenuItem();
    saveMenuItem = new javax.swing.JMenuItem();
    saveAsMenuItem = new javax.swing.JMenuItem();
    exitMenuItem = new javax.swing.JMenuItem();
    editMenu = new javax.swing.JMenu();
    miFactorial = new javax.swing.JMenuItem();
    miFibonacci = new javax.swing.JMenuItem();
    miMCMyMCD = new javax.swing.JMenuItem();
    miPrimo = new javax.swing.JMenuItem();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    btnFactorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/factorial.png"))); // NOI18N
    btnFactorial.setText("Factorial");
    btnFactorial.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnFactorialActionPerformed(evt);
      }
    });

    btnFibonacci.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fibonacci.png"))); // NOI18N
    btnFibonacci.setText("Fibonacci");
    btnFibonacci.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnFibonacciActionPerformed(evt);
      }
    });

    btnMCMyMCD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mcmymcd.png"))); // NOI18N
    btnMCMyMCD.setText("MCM y MCD");
    btnMCMyMCD.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnMCMyMCDActionPerformed(evt);
      }
    });

    btnPrimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/primo.png"))); // NOI18N
    btnPrimo.setText("Primo");
    btnPrimo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnPrimoActionPerformed(evt);
      }
    });

    btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancel.png"))); // NOI18N
    btnCerrar.setText("Exit");
    btnCerrar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCerrarActionPerformed(evt);
      }
    });

    jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

    fileMenu.setMnemonic('f');
    fileMenu.setText("File");

    openMenuItem.setMnemonic('o');
    openMenuItem.setText("Open");
    fileMenu.add(openMenuItem);

    saveMenuItem.setMnemonic('s');
    saveMenuItem.setText("Save");
    fileMenu.add(saveMenuItem);

    saveAsMenuItem.setMnemonic('a');
    saveAsMenuItem.setText("Save As ...");
    saveAsMenuItem.setDisplayedMnemonicIndex(5);
    fileMenu.add(saveAsMenuItem);

    exitMenuItem.setMnemonic('x');
    exitMenuItem.setText("Exit");
    exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        exitMenuItemActionPerformed(evt);
      }
    });
    fileMenu.add(exitMenuItem);

    menuBar.add(fileMenu);

    editMenu.setMnemonic('e');
    editMenu.setText("Opciones");

    miFactorial.setMnemonic('t');
    miFactorial.setText("Factorial");
    miFactorial.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        miFactorialActionPerformed(evt);
      }
    });
    editMenu.add(miFactorial);

    miFibonacci.setMnemonic('y');
    miFibonacci.setText("Fibonacci");
    miFibonacci.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        miFibonacciActionPerformed(evt);
      }
    });
    editMenu.add(miFibonacci);

    miMCMyMCD.setMnemonic('p');
    miMCMyMCD.setText("MCM y MCD");
    miMCMyMCD.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        miMCMyMCDActionPerformed(evt);
      }
    });
    editMenu.add(miMCMyMCD);

    miPrimo.setMnemonic('d');
    miPrimo.setText("Numero Primo");
    miPrimo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        miPrimoActionPerformed(evt);
      }
    });
    editMenu.add(miPrimo);

    menuBar.add(editMenu);

    setJMenuBar(menuBar);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(btnFactorial)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnFibonacci)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnMCMyMCD)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnPrimo)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnCerrar)
        .addContainerGap(98, Short.MAX_VALUE))
      .addComponent(desktopPane)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(btnCerrar)
          .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(btnFactorial)
            .addComponent(btnFibonacci)
            .addComponent(btnMCMyMCD)
            .addComponent(btnPrimo)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
      System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void miFibonacciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miFibonacciActionPerformed
      cargarFormulario(FibonacciView.class);
    }//GEN-LAST:event_miFibonacciActionPerformed

    private void miFactorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miFactorialActionPerformed
      cargarFormulario(FactorialView.class);
    }//GEN-LAST:event_miFactorialActionPerformed

    private void miMCMyMCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miMCMyMCDActionPerformed
      cargarFormulario(MCDyMCMView.class);
    }//GEN-LAST:event_miMCMyMCDActionPerformed

    private void miPrimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPrimoActionPerformed
      cargarFormulario(Primoview.class);
    }//GEN-LAST:event_miPrimoActionPerformed

    //botones
    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
      this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnFactorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFactorialActionPerformed
      cargarFormulario(FactorialView.class);
    }//GEN-LAST:event_btnFactorialActionPerformed

    private void btnFibonacciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFibonacciActionPerformed
      cargarFormulario(FibonacciView.class);
    }//GEN-LAST:event_btnFibonacciActionPerformed

    private void btnMCMyMCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMCMyMCDActionPerformed
      cargarFormulario(MCDyMCMView.class);
    }//GEN-LAST:event_btnMCMyMCDActionPerformed

    private void btnPrimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimoActionPerformed
      cargarFormulario(Primoview.class);
    }//GEN-LAST:event_btnPrimoActionPerformed

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
        if ("Windows".equals(info.getName())) {
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
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new FormularioMDI().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnCerrar;
  private javax.swing.JButton btnFactorial;
  private javax.swing.JButton btnFibonacci;
  private javax.swing.JButton btnMCMyMCD;
  private javax.swing.JButton btnPrimo;
  private javax.swing.JDesktopPane desktopPane;
  private javax.swing.JMenu editMenu;
  private javax.swing.JMenuItem exitMenuItem;
  private javax.swing.JMenu fileMenu;
  private javax.swing.JSeparator jSeparator1;
  private javax.swing.JMenuBar menuBar;
  private javax.swing.JMenuItem miFactorial;
  private javax.swing.JMenuItem miFibonacci;
  private javax.swing.JMenuItem miMCMyMCD;
  private javax.swing.JMenuItem miPrimo;
  private javax.swing.JMenuItem openMenuItem;
  private javax.swing.JMenuItem saveAsMenuItem;
  private javax.swing.JMenuItem saveMenuItem;
  // End of variables declaration//GEN-END:variables

  private void cargarFormulario(Class<?> aClass) {
    try {
      // Buscar una instancia
      JInternalFrame view = null;
      for (JInternalFrame frame : desktopPane.getAllFrames()) {
        if (aClass.isInstance(frame)) {
          view = frame;
          break;
        }
      }
      // Crear la instancia
      if (view == null) {
        view = (JInternalFrame) Class.forName(aClass.getName()).newInstance();
        desktopPane.add(view);
      }
      // Hacerlo visible
      view.setVisible(true);
      view.setSelected(true);
    } catch (Exception e) {
    } 
    
  }

}
