/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.PagoService;

import pe.egcc.PagoDto.PagoDto;

/**
 *
 * @author Alumno
 */
public class Calculo {

  public void procesar(PagoDto dto) {
    // Variables
    double ingresos, renta, neto;
    // Proceso
    ingresos = dto.getDias() * dto.getHorasdia() * dto.getPagohora();
    if (ingresos > 1500) {
      renta = 0.08 * ingresos;
    } else {
      renta = 0;
    }
    neto = ingresos - renta;
    // Salida
    dto.setIngresos(ingresos);
    dto.setRenta(renta);
    dto.setNeto(neto);
  }
}
