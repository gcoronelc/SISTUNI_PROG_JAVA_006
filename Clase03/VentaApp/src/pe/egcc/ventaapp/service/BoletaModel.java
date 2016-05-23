package pe.egcc.ventaapp.service;

import pe.egcc.ventaapp.dto.ConceptoDto;

/**
 *
 * @author Gustavo Coronel
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @github github.com/gcoronelc
 */
public class BoletaModel extends CompAbstract{

  @Override
  public ConceptoDto[] procesar(double total) {
    // Variables
    double servicio, totalGeneral;
    // Proceso
    servicio = total * SERVICIO;
    totalGeneral = total + servicio;
    // Reporte
    ConceptoDto[] repo = {
      new ConceptoDto("Total", total),
      new ConceptoDto("Servicio", servicio),
      new ConceptoDto("Total General", totalGeneral)
    };
    return repo;
  }
  
}
