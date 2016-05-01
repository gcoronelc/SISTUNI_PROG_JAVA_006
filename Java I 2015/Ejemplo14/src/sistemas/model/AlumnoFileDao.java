package sistemas.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import sistemas.entity.Alumno;
import sistemas.servicio.IMantenimiento;

public class AlumnoFileDao implements IMantenimiento<Alumno> {

    // atributo
    private String archivo = "E:\\Program Files\\Java I 2015\\Ejemplo14\\Alumnos.txt";

    //constructor
    public AlumnoFileDao() {
    }

    // metodos para la persistencia de datos
    @Override
    public void create(Alumno a) {
        try {
            try (PrintWriter datos = new PrintWriter(new FileWriter(archivo, true))) {
                String mensaje = a.getId() + "#" + a.getNombre() + "#" + a.getNota() + "#"
                        + a.getEstado() + "\n";
                datos.write(mensaje);
                datos.close();
            }
        } catch (IOException e) {
            try {
                throw e;
            } catch (IOException ex) {
                Logger.getLogger(AlumnoFileDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void update(Alumno a) throws IOException {
        try {
            BufferedReader mensaje = new BufferedReader(new FileReader(archivo));
            String nuevomensaje = a.getId() + "#" + a.getNombre() + "#" + a.getNota() + "#"
                    + a.getEstado() + "\n";
            String linea = mensaje.readLine();
            while (linea != null) {
                StringTokenizer token = new StringTokenizer(linea, "#");
                String codigo = token.nextToken();
                if (Integer.parseInt(codigo) == a.getId()) {
                    PrintWriter mensajeTemp = new PrintWriter(new FileWriter(
                            "E:\\Program Files\\Java I 2015\\Ejemplo14\\tempo.txt", true));
                    mensajeTemp.write(nuevomensaje);
                    mensajeTemp.close();

                } else {
                    String lineatempo = linea + "\n";
                    PrintWriter mensajeTemp = new PrintWriter(new FileWriter(
                            "E:\\Program Files\\Java I 2015\\Ejemplo14\\tempo.txt", true));
                    mensajeTemp.write(lineatempo);
                    mensajeTemp.close();
                }
                linea = mensaje.readLine();
            }
            mensaje.close();
            borrar_archivo(archivo);
            renombrar_archivo(archivo);
        } catch (IOException | NumberFormatException e) {
            throw e;
        }
    }

    @Override
    public void delete(Alumno a) throws Exception {
        try {
            BufferedReader mensaje = new BufferedReader(new FileReader(archivo));
            String linea = mensaje.readLine();
            while (linea != null) {
                StringTokenizer token = new StringTokenizer(linea, "#");
                String codigo = token.nextToken();
                if (Integer.parseInt(codigo) == a.getId()) {
                } else {
                    String lineatempo = linea + "\n";
                    PrintWriter mensajeTemp = new PrintWriter(new FileWriter(
                            "E:\\Program Files\\Java I 2015\\Ejemplo14\\tempo.txt", true));
                    mensajeTemp.write(lineatempo);
                    mensajeTemp.close();
                }
                linea = mensaje.readLine();
            }
            mensaje.close();
            borrar_archivo(archivo);
            renombrar_archivo(archivo);
        } catch (IOException | NumberFormatException e) {
            throw e;
        }
    }

    private void borrar_archivo(String ruta) {
        // BORRAR ARCHIVO VIEJO
        String original = ruta;
        File arc = new File(original);
        if (arc.delete()) {
            System.out.println("Archivo Borrado");
        } else {
            System.out.println("No se pudo borrar");
        }
        // BORRAR ARCHIVO VIEJO
    }

    private void renombrar_archivo(String ruta) {
        // RENOMBRAR ARCHIVO temp.txt
        File nuevonombre = new File(ruta);
        File viejonombre = new File("E:\\Program Files\\Java I 2015\\Ejemplo14\\tempo.txt");
        if (viejonombre.renameTo(nuevonombre)) {
            System.out.println("No se pudo renombrar");
        }// RENOMBRAR ARCHIVO temp.txt

    }

    @Override
    public Alumno find(Object x) throws IOException {
        Alumno o = null;
        try {
            try ( // abrrir achivo para lectura
                    BufferedReader entrada = new BufferedReader(new FileReader(archivo))) {
                //lee la primera linea del archivo
                String linea = entrada.readLine();
                while (linea != null) {
                   
                    StringTokenizer token = new StringTokenizer(linea, "#");
                    String codigo = token.nextToken();
                    String nombre = token.nextToken();
                    String nota = token.nextToken();
                    String estado = token.nextToken();
                    if (Integer.parseInt(codigo) == (int) x) {
                        o = new Alumno();
                        o.setId(Integer.parseInt(codigo));
                        o.setNombre(nombre);
                        o.setNota(Float.parseFloat(nota));
                        o.setEstado(estado);
                    }
                    linea = entrada.readLine();
                }
                entrada.close();
            }
        } catch (IOException e) {
            throw e;
        }
        return o;
    }

    @Override
    public List<Alumno> readAll() throws FileNotFoundException, IOException {
        List<Alumno> lista = new ArrayList<>();
        try {
            try ( // abrrir achivo para lectura
                    BufferedReader entrada = new BufferedReader(new FileReader(archivo))) {
                //lee la primera linea del archivo
                String linea = entrada.readLine();
                while (linea != null) {
                    Alumno o = new Alumno();
                    StringTokenizer token = new StringTokenizer(linea, "#");
                    String codigo = token.nextToken();
                    String nombre = token.nextToken();
                    String nota = token.nextToken();
                    String estado = token.nextToken();
                    o.setId(Integer.parseInt(codigo));
                    o.setNombre(nombre);
                    o.setNota(Float.parseFloat(nota));
                    o.setEstado(estado);
                    lista.add(o);
                    linea = entrada.readLine();
                }
            }
        } catch (IOException e) {
            throw e;
        }
        return lista;
    }

}
