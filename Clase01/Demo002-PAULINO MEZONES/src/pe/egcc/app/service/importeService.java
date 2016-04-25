/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.app.service;



public class importeService {
    
    public double calcimpuesto(double imp){
    return imp*0.18;    
    }
    
    public double calctotal(double impo){
       return impo+calcimpuesto(impo);
    }
    
}
