package pe.egcc.model;

/**
 *
 * @author Gustavo Coronel
 */
public class Clase1 {

  public Clase1() {
    System.out.println("Hola desde Clase1.");
  }
  
  public Clase1(String nombre) {
    System.out.println("Hola " + nombre + " desde Clase1.");
  }

  public int sumar(int n1, int n2) {
    return (n1 + n2);
  }

}
