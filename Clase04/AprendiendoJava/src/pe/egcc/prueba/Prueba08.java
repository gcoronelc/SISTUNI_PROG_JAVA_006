package pe.egcc.prueba;

import pe.egcc.model.Clase1;
import pe.egcc.model.Clase2;
import pe.egcc.model.Clase3;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba08 {

  public static void main(String[] args) {
    
    Clase2 z1 = new Clase2();
    
    Clase1 z2 = z1;
    
    Clase2 z3 = (Clase2) z2;
    
    Clase3 z4 = (Clase3) z2; // No hay compatibilidad
  }
  
}
