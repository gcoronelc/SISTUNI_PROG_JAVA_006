package pe.egcc.ventaapp.dto;

/**
 *
 * @author Gustavo Coronel
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @github github.com/gcoronelc
 */
public class ConceptoDto {
  
  private String nombre;
  private double valor;

  public ConceptoDto() {
  }

  public ConceptoDto(String nombre, double valor) {
    this.nombre = nombre;
    this.valor = valor;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }
  
  
}
