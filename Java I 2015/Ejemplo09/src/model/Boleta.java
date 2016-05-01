package model;

import entity.Item;

public class Boleta extends Comprobante {

    public Boleta() {
     }  
    

    @Override
    public Item[] generaComprobante(double total) {
        //variables
        double servicio = total * SERVICIO;
        double totalgeneral = total + servicio;
        // construir la boleta
        Item[] boleta = new Item[3];
        boleta[0] = new Item("Total  :", total);
        boleta[1] = new Item("Servicio(10%)  :", servicio);
        boleta[2] = new Item("Total General  :", totalgeneral);
        return boleta;

    }

}
