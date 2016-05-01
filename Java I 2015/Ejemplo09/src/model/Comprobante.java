
package model;

import entity.Item;

// clase base
public abstract class Comprobante {
    //constante
    public final double IGV=0.18;
    public final double SERVICIO=0.10;

    public Comprobante() {
    }
    
    
    // METODO ABSTRACTO
    public abstract Item[] generaComprobante(double total);
}
