package pe.egcc.app.service;

public class ServicePedido {
    
    public double calcImpuesto(double importe){
        
        double impuesto = 0.0;
        
        impuesto = importe * 0.18;
        
        return impuesto;
    }
    
    public double calcTotal(double impuesto, double importe){
        
        double total = 0.0;
        
        total =  importe + impuesto;
        
        return total;
        
    }
}
