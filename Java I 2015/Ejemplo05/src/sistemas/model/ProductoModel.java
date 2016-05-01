package sistemas.model;

import sistemas.entity.Producto;

public class ProductoModel {

    // atributo
    Producto oproducto = new Producto();
    private static int cont = 0;
    // metodo

    public ProductoModel() {
    }

    //metodos para procesar datos
    public void Registrar(Producto p) {
        cont++;
        p.setCodigo("PR00" + cont);
        oproducto = p;
    }

    public Producto Consultar() {
        return oproducto;
    }

    public void ActualizaStock(int cant, int opcion) {
        switch (opcion) {
            case 1://aumento
                oproducto.setCantidad(oproducto.getCantidad() + cant);
                break;
            case 2://disminuir
                oproducto.setCantidad(oproducto.getCantidad() - cant);
                break;
        }
    }

    public void ActualizaPrecio(double tasa, int opcion) {
        switch (opcion) {
            case 1://aumento
                oproducto.setPrecio(oproducto.getPrecio() + oproducto.getPrecio() * tasa / 100);
                break;
            case 2://disminuir
                oproducto.setPrecio(oproducto.getPrecio() - oproducto.getPrecio() * tasa / 100);
                break;
        }
    }

}
