

package pe.egcc.app.controller;

import pe.edutec.lib.mateLib;

/**
 *
 * @author Alumno
 */
public class MateControler {
private mateLib mate;

  

    public MateControler() {
        
        mate = new mateLib();
        
    }

    public int promediar(int n1, int n2) {
       
        return mate.promediar(n1, n2);
    }
    
    public int promediar(int n1, int n2, int n3)
    {
        return mate.promediar(n1, n2, n3);
    }
    
    public int promediar(int n1, int n2, int n3, int n4)
    {
        return mate.promediar(n1, n2, n3, n4);
    }
    
    public int promediar(int n1, int n2, int n3, int n4, int n5)
    {
        return mate.promediar(n1, n2, n3, n4, n5);
    }
    
    
    
}
