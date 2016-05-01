package sistemas.controller;

import sistemas.entity.Alumno;
import sistemas.model.AlumnoMemoryDao;

public class AlumnoController {

    //atributo
    private AlumnoMemoryDao dao;
    //constructor

    public AlumnoController() {
        dao = new AlumnoMemoryDao();
    }

    // metodos de negocio
    public void AlumnoAdicionar(Alumno o) {
        dao.create(o);
    }

    public void AlumnoActualizar(Alumno o) {
        dao.update(o);
    }

    public void AlumnoEliminar(Alumno o) {
        dao.delete(o);
    }

    public Alumno[] AlumnoListar() {
        return dao.readAll();
    }

    public Alumno AlumnoBuscar(Object o) {
        return dao.find(o);
    }

}
