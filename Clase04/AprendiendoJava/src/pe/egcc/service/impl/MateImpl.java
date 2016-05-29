package pe.egcc.service.impl;

import pe.egcc.service.espec.IMate;

/**
 *
 * @author Gustavo Coronel
 */
public class MateImpl implements IMate {

  @Override
  public int sumar(int... datos) {
    int suma = 0;
    for (int dato : datos) {
      suma += dato;
    }
    return suma;
  }

}
