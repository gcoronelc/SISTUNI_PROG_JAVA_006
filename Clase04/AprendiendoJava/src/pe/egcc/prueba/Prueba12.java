package pe.egcc.prueba;

import java.util.ArrayList;
import java.util.List;
import pe.egcc.dto.ComboDto;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba12 {
  
  // Lista Tipificada
  
  public static void main(String[] args) {
    
    List<String> lista = new ArrayList<>();
    
    lista.add("Java");
    lista.add("JDBC");
    lista.add("Alianza Campeón");
    lista.add("Cloud");
    
    for (String dato : lista) {
      System.out.println(dato);
    }
    
    System.out.println("-------------");
    lista.set(2, "Oracle");
    lista.add(0, "Linux");
    lista.stream().forEach(s -> System.out.println(s) );
    
  }
  
}

