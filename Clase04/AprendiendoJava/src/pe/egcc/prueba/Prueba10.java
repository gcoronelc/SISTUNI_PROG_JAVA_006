/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.prueba;

import java.util.Arrays;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba10 {


  public static void main(String[] args) {
    
    String datos[] = new String[5];
    
    for (String dato : datos) {
      System.out.println(dato);
    }
    
    datos = new String[]{"Chiclayo","Cuzco","Arequipa","Huancayo"};
    
    Arrays.stream(datos).forEach(s -> System.out.println(s));
    
  }
  
}
