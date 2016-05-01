package sistemas.servicio;

import sistemas.entity.Alumno;

public interface IMantenimiento<T> {

    // definir las firmas de los metodos
    void create(Alumno a);

    void update(Alumno a);

    void delete(Alumno a);

    T find(Object x);

    T[] readAll();
}
