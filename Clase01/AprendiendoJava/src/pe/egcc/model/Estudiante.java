package pe.egcc.model;

/**
 *
 * @author Gustavo Coronel
 */
public class Estudiante {

  private String nombre;
  private String apellido;
  private int edad;
  private boolean casado;
  private String email;

  /**
   * Constructor por defecto
   */
  public Estudiante() {
    nombre = "Gustavo";
    apellido = "Coronel";
    edad = 30;
    email = "gcoronelc@gmail.com";
    casado = true;
    System.out.println("Objeto creado !!!!!!!!!!!!");
  }

  /**
   * Constructor adicional
   * 
   * @param nombre Nombre del estudiante
   * @param apellido Apellido del estudiante
   * @param edad Edad, debe ser mayor que cero.
   * @param casado Debe ser tru o false.
   * @param email Cooreo del estudiante.
   */
  public Estudiante(String nombre, String apellido, int edad, boolean casado, String email) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;
    this.casado = casado;
    this.email = email;
  }

  @Override
  protected void finalize() throws Throwable {
    System.err.println("Chau objeto !!!!!!!!!!!!!!!");
  }
  
  

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public boolean isCasado() {
    return casado;
  }

  public void setCasado(boolean casado) {
    this.casado = casado;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    String repo = "";
    repo += "Nombre: " + nombre + "\n";
    repo += "Apellido: " + apellido + "\n";
    repo += "Email: " + email + "\n";
    repo += "Edad: " + edad + "\n";
    repo += "Casado: " + casado + "\n";
    return repo;
  }

}
