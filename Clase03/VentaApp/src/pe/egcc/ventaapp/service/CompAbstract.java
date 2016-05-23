package pe.egcc.ventaapp.service;

import pe.egcc.ventaapp.dto.ConceptoDto;

/**
 *
 * @author Gustavo Coronel
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @github github.com/gcoronelc
 */
public abstract class CompAbstract {
  
  public static final double IGV = 0.18;
  public static final double SERVICIO = 0.10;
  
  public abstract ConceptoDto[] procesar(double total);
  
  
}
