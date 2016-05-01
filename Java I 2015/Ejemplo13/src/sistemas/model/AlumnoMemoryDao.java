package sistemas.model;

import java.util.ArrayList;
import java.util.List;
import sistemas.entity.Alumno;
import sistemas.servicio.IMantenimiento;

public class AlumnoMemoryDao implements IMantenimiento<Alumno> {

    //atributos
    private List<Alumno> lista;    
    private static int cont;
    //CONSTRUCTOR

    public AlumnoMemoryDao() {
        lista = new ArrayList<>();
    }

    // metodos de persisitrencia
    @Override
    public void create(Alumno a) {
        cont++;
        a.setId(cont);
       lista.add(a); // adiciona a la coleccion
    }

    @Override
    public void update(Alumno a) {
        int index = 0;
        for (Alumno x : lista) {
            if (x.getId() == a.getId()) {
                lista.set(index, a);// actualiza 
                break;
            }
            index++;
        }

    }

    @Override
    public void delete(Alumno a) {
        int i=0;
        for (Alumno alu : lista) {
            if (alu.getId()==a.getId()) {
                lista.remove(i);// elimina
                break;
            }
            i++;
        }
    }

    @Override
    public Alumno find(Object x) {
        for (Alumno a : lista) {
            if (a.getId() == (int) x) {
                return a;
            }
        }
        return null;
    }

    @Override
    public List<Alumno> readAll() {
         return lista;
    }

}
