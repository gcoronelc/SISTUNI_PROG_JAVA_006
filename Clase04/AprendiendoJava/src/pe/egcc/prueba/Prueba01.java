package pe.egcc.prueba;

import pe.egcc.service.espec.IMate;
import pe.egcc.service.impl2.MateImpl2;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    IMate mate = new MateImpl2();
    System.out.println("5 + 8 + 3 = " + mate.sumar(5,8,3));            
  }
  
}
