
package sistemas.entity;

public class Producto {
   // atributos
    private String codigo;
    private String nombre;
    private String fecha;
    private double precio;
    private int cantidad;
    // constructor

    public Producto() {
        this.codigo = "P001";
        this.nombre = "Producto 0";
        this.fecha = "15/01/2015";
        this.precio = 25.50;
        this.cantidad = 100; 
    }

    public Producto(String codigo, String nombre, String fecha, double precio, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.fecha = fecha;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    // metodos get y set

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
   
}
