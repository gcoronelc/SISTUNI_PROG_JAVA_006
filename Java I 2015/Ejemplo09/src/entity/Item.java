
package entity;

public class Item {
  //atributos
private String concepto;
private double importe;
//constructor

    public Item() {
    }

    public Item(String concepto, double importe) {
        this.concepto = concepto;
        this.importe = importe;
    }
// metodos get y set

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
    
}
