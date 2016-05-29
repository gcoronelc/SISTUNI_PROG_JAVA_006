package pe.egcc.prueba;

import pe.egcc.service.espec.IMate;
import pe.egcc.service.impl.MateImpl;
import pe.egcc.service.impl2.MateImpl2;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba02 {
  
  public static void main(String[] args) {
    IMate mate = new MateImpl();
    System.out.println("5 + 8 + 3 = " + mate.sumar(5,8,3)); 
    compatible(mate);
  }
  
  public static void compatible(IMate bean){
    String texto = "";
    if(bean instanceof MateImpl){
      texto = "MateImpl";
    } else if( bean instanceof  MateImpl2){
      texto = "MateImpl2";
    }
    System.out.println("Compatible com: " + texto);
  }
  
}
