package pe.egcc.service.impl2;

import java.util.Arrays;
import pe.egcc.service.espec.IMate;

/**
 *
 * @author Gustavo Coronel
 */
public class MateImpl2 implements IMate{

  @Override
  public int sumar(int... datos) {
    int suma =Arrays.stream(datos).sum();
    return suma;
  }
  
}
