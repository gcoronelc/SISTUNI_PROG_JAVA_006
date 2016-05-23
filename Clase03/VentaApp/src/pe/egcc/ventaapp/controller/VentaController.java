package pe.egcc.ventaapp.controller;

import pe.egcc.ventaapp.dto.ConceptoDto;
import pe.egcc.ventaapp.service.BoletaModel;
import pe.egcc.ventaapp.service.CompAbstract;
import pe.egcc.ventaapp.service.FacturaModel;

/**
 *
 * @author Gustavo Coronel
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @github github.com/gcoronelc
 */
public class VentaController {
  
  public static final String COMP_FACTURA = "FACTURA";
  public static final String COMP_BOLETA = "BOLETA";
  
  
  public String[] getTipos(){
    String[] tipos = {COMP_FACTURA,COMP_BOLETA};
    return tipos;
  }

  public ConceptoDto[] procesar(String tipo, double total) {
    CompAbstract comp = null;
    switch(tipo){
      case COMP_FACTURA:
        comp = new FacturaModel();
        break;
      case COMP_BOLETA:
        comp = new BoletaModel();
        break;
    }
    return comp.procesar(total);
  }
  
  
  
  
  
}
