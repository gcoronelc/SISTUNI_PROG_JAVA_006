package pe.egcc.ventaapp.service;

import pe.egcc.ventaapp.dto.ConceptoDto;

/**
 *
 * @author Gustavo Coronel
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @github github.com/gcoronelc
 */
public class FacturaModel extends CompAbstract{

  @Override
  public ConceptoDto[] procesar(double total) {
    // Variables
    double consumo, impuesto, servicio, totalGeneral;
    // Proceso
    consumo = total / (1 + IGV);
    impuesto = total - consumo;
    servicio = total * SERVICIO;
    totalGeneral = total + servicio;
    // Reporte
    ConceptoDto[] repo = {
      new ConceptoDto("Consumo", consumo),
      new ConceptoDto("Impuesto", impuesto),
      new ConceptoDto("Total", total),
      new ConceptoDto("Servicio", servicio),
      new ConceptoDto("Total General", totalGeneral)
    };
    return repo;
  }
  
}
