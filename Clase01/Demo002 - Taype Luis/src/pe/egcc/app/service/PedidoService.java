/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.app.service;

/**
 *
 * @author Alumno
 */
public class PedidoService {

    public double calcImpuesto(double importe) {
        return (importe * 0.18);

    }

    public double calTotal(double importe) {
        return (importe + calcImpuesto(importe));
    }

}
