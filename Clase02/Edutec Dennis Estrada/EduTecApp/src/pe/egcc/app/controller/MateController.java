package pe.egcc.app.controller;

import pe.edutec.lib.MateLib;


public class MateController {
    
    private final MateLib mate;
    
    public MateController(){
        mate = new MateLib();
    }
    
    //de 2
    public int promediar(int n1, int n2){
        return mate.promediar(n1, n2);
    }
    
    //de3
        public int promediar(int n1, int n2, int n3){
        return mate.promediar(n1, n2, n3);
    }
        
    //de 4    
        public int promediar(int n1, int n2, int n3, int n4){
        return mate.promediar(n1, n2, n3, n4);
    }
        
    //de 5
        public int promediar(int n1, int n2, int n3, int n4, int n5){
        return mate.promediar(n1, n2, n3, n4, n5);
    }    
}
