package pe.egcc.prueba;

import pe.egcc.model.Clase1;
import pe.egcc.model.Clase2;
import pe.egcc.model.Clase3;
import pe.egcc.model.Clase4;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba02 {

  public static void main(String[] args) {
    Clase2 obj = new Clase2();
    
    System.out.println("Compatible con Object: " + ((obj instanceof Object)?"SI":"NO") );
    System.out.println("Compatible con Clase1: " + ((obj instanceof Clase1)?"SI":"NO") );
    System.out.println("Compatible con Clase2: " + ((obj instanceof Clase2)?"SI":"NO") );
    System.out.println("Compatible con Clase3: " + ((obj instanceof Clase3)?"SI":"NO") );
    System.out.println("Compatible con Clase4: " + ((obj instanceof Clase4)?"SI":"NO") );
    
    
  }
  
}
