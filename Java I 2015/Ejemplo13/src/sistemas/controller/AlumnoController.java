package sistemas.controller;

import java.util.List;
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

    public List<Alumno> AlumnoListar() {
        return dao.readAll();
    }

    public Alumno AlumnoBuscar(Object o) {
        return dao.find(o);
    }

}
