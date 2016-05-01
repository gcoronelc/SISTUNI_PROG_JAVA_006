package model;

public class Alumno extends Persona {
    // atributos
    private double promedio;
    private String estado;
    // constructor
    public Alumno() {
    }

    public Alumno(double promedio, String estado, String nombre,
            int edad, boolean genero) {
        super(nombre, edad, genero);
        this.promedio = promedio;
        this.estado = estado;
    }
    // metodos get y set
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    // metodo adicional
    public void calcularEstado() {//estado=(promedio>=14)?"aprobado":"desaprobado";
        setEstado((getPromedio() >= 14) ? "Aprobado" : "Desaprobado");
    }

}
