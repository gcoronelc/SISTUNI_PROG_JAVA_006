package sistemas.controller;

import java.io.IOException;
import java.util.List;
import sistemas.entity.Alumno;
import sistemas.model.AlumnoFileDao;


public class AlumnoController {

    //atributo
    private AlumnoFileDao dao;
    //constructor

    public AlumnoController() {
        dao = new AlumnoFileDao();
    }

    // metodos de negocio
    public void AlumnoAdicionar(Alumno o) {
        dao.create(o);
    }

    public void AlumnoActualizar(Alumno o) throws IOException {
        dao.update(o);
    }

    public void AlumnoEliminar(Alumno o) throws Exception {
        dao.delete(o);
    }

    public List<Alumno> AlumnoListar() throws IOException {
        return dao.readAll();
    }

    public Alumno AlumnoBuscar(Object o) throws IOException {
        return dao.find(o);
    }

}
