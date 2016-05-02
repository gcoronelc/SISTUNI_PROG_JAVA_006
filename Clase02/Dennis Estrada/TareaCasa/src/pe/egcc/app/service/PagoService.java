/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.app.service;
import pe.egcc.model.PagoDto;

/**
 *
 * @author ALBERT
 */
public class PagoService {
   
    public void Procesar(int a, int b,double c) {
    double ingreso=0;
    double renta=0;
    double neto=0;
    ingreso=(a*b*c);
    //System.out.println(ingreso);
    if(ingreso>1500)
    {
        renta=ingreso*0.08;
        neto=ingreso-renta;
    }else{
       
        neto=ingreso;
    }
    
    //System.out.println(neto);
    //System.out.println(renta);
    PagoDto dd= new PagoDto();
    dd.setHoras(a);
    dd.setDias(b);
    dd.setPagoxhoras(c);
    dd.setIngresos(ingreso);
    dd.setRenta(renta);
    dd.setNeto(neto);
    
  }
}
