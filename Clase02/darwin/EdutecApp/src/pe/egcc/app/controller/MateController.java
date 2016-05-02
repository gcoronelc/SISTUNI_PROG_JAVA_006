/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.egcc.app.controller;

import pe.egcc.lib.Matelib;

/**
 *
 * @author Alumno
 */
public class MateController {

    private Matelib mate;
    
    public MateController()
    {
        mate = new Matelib();
    }
    public int promediar(int n1, int n2) {
        return mate.Promediar(n1, n2);
    }

    public int promediar(int n1, int n2, int n3) {
        return mate.Promediar(n1, n2, n3);
    }
    
    public int promediar(int n1, int n2, int n3, int n4)
    {
        return mate.Promediar(n1, n2, n3, n4);
    }
    
     public int promediar(int n1, int n2, int n3, int n4, int n5)
    {
        return mate.Promediar(n1, n2, n3, n4, n5);
    }
}
