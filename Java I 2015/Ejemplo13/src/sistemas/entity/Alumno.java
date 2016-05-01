package sistemas.entity;

public class Alumno {

    // atributos

    private int id;
    private String nombre;
    private float nota;
    private String estado;
    //constructor

    public Alumno() {
    }

    public Alumno(int id, String nombre, float nota, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.nota = nota;
        this.estado = estado;
    }
    // metodos get y set

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
        this.estado = (this.nota >= 14) ? "Aprobado" : "Desaprobado";
    }

    public String getEstado() {
        return estado;
    }

//    public void setEstado(String estado) {
//        this.estado = estado;
//    }
}
