package pe.egcc.dto;

/**
 *
 * @author Gustavo Coronel
 */
public class ComboDto {

  private String codigo;
  private String nombre;
  private String abreviatura;
  private boolean actual;

  public ComboDto() {
  }

  public ComboDto(String codigo, String nombre, String abreviatura, boolean actual) {
    this.codigo = codigo;
    this.nombre = nombre;
    this.abreviatura = abreviatura;
    this.actual = actual;
  }

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getAbreviatura() {
    return abreviatura;
  }

  public void setAbreviatura(String abreviatura) {
    this.abreviatura = abreviatura;
  }

  public boolean isActual() {
    return actual;
  }

  public void setActual(boolean actual) {
    this.actual = actual;
  }

  @Override
  public String toString() {
    String texto = codigo + " | ";
    if (abreviatura != null) {
      texto += abreviatura;
    } else {
      texto += nombre;
    }
    return texto;
  }

}
