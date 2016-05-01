package model;

public class Persona {
   //atributos
    private String nombre;
    private int edad;
    private boolean genero;
    // constructor
    public Persona() {
    }

    public Persona(String nombre, int edad, boolean genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }
    // metodos get y set
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isGenero() {
        return genero;
    }

    public void setGenero(boolean genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
