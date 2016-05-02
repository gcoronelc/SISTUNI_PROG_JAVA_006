package pe.egcc.app.controller;

import pe.edutec.lib.MateLib;

/**
 *
 * @author Gustavo Coronel
 */
public class MateController {

  private MateLib mate;

  public MateController() {
    mate = new MateLib();
  }
  
  public int promediar(int n1, int n2) {
    return mate.promediar(n1, n2);
  }
  
}
