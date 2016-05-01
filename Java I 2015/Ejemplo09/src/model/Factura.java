package model;

import entity.Item;

public class Factura extends Comprobante {

    public Factura() {
     
    }

    @Override
    public Item[] generaComprobante(double total) {
        //variables
        double consumo = total / (1 + IGV);
        double impuesto = total - consumo;
        double servicio = total * SERVICIO;
        double totalgeneral = total + servicio;
        // construir la factura
        Item[] factura = new Item[5];
        factura[0] = new Item("Consumo  :", consumo);
        factura[1] = new Item("Impuesto  :", impuesto);
        factura[2] = new Item("Total  :", total);
        factura[3] = new Item("Servicio(10%)  :", servicio);
        factura[4] = new Item("Total General  :", totalgeneral);
        return factura;
    }

}
