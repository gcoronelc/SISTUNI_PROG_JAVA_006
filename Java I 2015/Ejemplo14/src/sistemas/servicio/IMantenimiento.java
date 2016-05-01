package sistemas.servicio;

import java.util.List;
import sistemas.entity.Alumno;

public interface IMantenimiento<T> {

    // definir las firmas de los metodos
    void create(Alumno a) throws Exception;

    void update(Alumno a) throws Exception;

    void delete(Alumno a) throws Exception;

    T find(Object x) throws Exception;

    List<T> readAll() throws Exception;
}
