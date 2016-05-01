package sistemas.controller;

import sistemas.entity.Producto;
import sistemas.model.ProductoModel;

public class ProductoController {

    // atributo

    ProductoModel model = new ProductoModel();
    //cnstructor

    public ProductoController() {
    }

    // metodos

    public void RegistraProducto(Producto o) {
        model.Registrar(o);
    }

    public Producto ConsultaProducto() {
        return model.Consultar();
    }

    public void ActualizaStockProducto(int t, int c) {
        model.ActualizaStock(t, c);
    }

    public void ActualizaPrecioProducto(double t, int c) {
        model.ActualizaPrecio(t, c);
    }

}
