package pe.egcc.model;

/**
 *
 * @author Gustavo Coronel
 */
public class Mate2 extends ClaseAbstracta{

  @Override
  public int suma(int n1, int n2) {
    int suma;
    suma = (n1 + n2) * (n1 - n2);
    return suma;
  }
  
}
