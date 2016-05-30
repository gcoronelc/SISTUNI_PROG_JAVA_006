package pe.egcc.prueba;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba13 {


  public static void main(String[] args) {
    
    Map<String,Object> datos = new HashMap<>();
    
    datos.put("Profesor", "Gustavo");
    datos.put("Edad", 52);
    datos.put("Direccion", "Los Olivos");
    datos.put("Equipo", "El Mejor");
    datos.put("Casado", true);
    datos.put("Profesor", "Sergio");
    
    
    
    for(String key: datos.keySet()){
      System.out.println(key + " - " + datos.get(key));
    }
    
  }
  
}
