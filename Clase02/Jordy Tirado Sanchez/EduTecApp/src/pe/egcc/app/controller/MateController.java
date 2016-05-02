/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.app.controller;

import pe.edutec.lib.MateLib;

/**
 *
 * @author Alumno
 */
public class MateController {

    private MateLib mate;
    
    public MateController(){
        mate= new MateLib();
    }
    public double promediar(double n1, double n2){
        return mate.promediar(n1, n2);
    }
    public double promediar(double n1, double n2,double n3){
        return mate.promediar(n1, n2,n3);
    }
    public double promediar(double n1, double n2,double n3,double n4){
        return mate.promediar(n1, n2,n3,n4);
    }
    public double promediar(double n1, double n2,double n3, double n4,double n5){
        return mate.promediar(n1, n2,n3,n4,n5);
    }
    
}
