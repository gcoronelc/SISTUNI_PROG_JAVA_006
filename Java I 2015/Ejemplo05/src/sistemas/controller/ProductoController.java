package sistemas.controller;

import sistemas.entity.Producto;
import sistemas.model.ProductoModel;

public class ProductoController {

    // atributo

   static ProductoModel  model = new ProductoModel();
    
    // metodos

    public static void RegistraProducto(Producto o) {
        model.Registrar(o);
    }

    public static Producto ConsultaProducto() {
        return model.Consultar();
    }

    public static void ActualizaStockProducto(int t, int c) {
        model.ActualizaStock(t, c);
    }

    public static void ActualizaPrecioProducto(double t, int c) {
        model.ActualizaPrecio(t, c);
    }

}
