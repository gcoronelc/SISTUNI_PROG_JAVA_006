package sistemas.model;

import sistemas.entity.Alumno;
import sistemas.servicio.IMantenimiento;

public class AlumnoMemoryDao implements IMantenimiento<Alumno> {

    //atributos
    private Alumno[] lista;
    final int MAXIMO = 100;
    private static int n;
    private static int cont;
    //CONSTRUCTOR

    public AlumnoMemoryDao() {
        lista = new Alumno[MAXIMO];
        n = 0;
    }

    // metodos de persisitrencia
    @Override
    public void create(Alumno a) {
        cont++;
        a.setId(cont);
        lista[n] = a;
        n++;
    }

    @Override
    public void update(Alumno a) {
        int index = 0;
        for (Alumno x : lista) {
            if (x.getId() == a.getId()) {
                lista[index] = a;
                break;
            }
            index++;
        }

    }

    @Override
    public void delete(Alumno a) {
        for (int i = 0; i < n; i++) {
            if (lista[i].getId() == a.getId()) {
                for (int j = i; j < n; j++) {
                    lista[j] = lista[j + 1];
                }
                n--;
                break;
            }
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
    public Alumno[] readAll() {
        Alumno[] aux;
        if (n == MAXIMO) {
            aux = lista;
        } else {
            aux = new Alumno[n];
            System.arraycopy(lista, 0, aux, 0, n);
        }
        return aux;
    }

}
