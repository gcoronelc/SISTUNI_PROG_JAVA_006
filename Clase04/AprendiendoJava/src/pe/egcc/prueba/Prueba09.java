package pe.egcc.prueba;

import java.util.Arrays;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba09 {
  
  public static void main(String[] args) {
    
    int[] notas = new int[5];
    
    System.out.println("recoriido indexado");
    for (int i = 0; i < notas.length; i++) {
      int nota = notas[i];
      System.out.println(nota);
    }
    
    notas[2] = 20;
    notas[4] = 25;
    
    System.out.println("recorrido tipo colección");
    for (int nota : notas) {
      System.out.println(nota);
    }
    
    System.out.println("Usando Lambda");
    Arrays.stream(notas).forEach(n -> System.out.println(n) );
  }
  
}
