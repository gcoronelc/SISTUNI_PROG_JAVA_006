package model;

public class Docente extends Persona {

    // constructor

    public Docente(String codigo, String nombre, double sueldoxhora, int nrohoras) {
        super(codigo, nombre, sueldoxhora * nrohoras);
    }

    // metodo

    @Override
    public String MostrarDatos() {
        return "Docente\n" + super.MostrarDatos();
    }

}
