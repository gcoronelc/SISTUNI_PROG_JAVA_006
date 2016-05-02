package pe.egcc.prueba;

import pe.egcc.model.Mate;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba01 {

  public static void main(String[] args) {
    Mate mate = new Mate();
    System.out.println("8 + 7 = " + mate.sumar(8, 7));
    System.out.println("8.0 + 7 = " + mate.sumar(8.0, 7));
  }
  
}
