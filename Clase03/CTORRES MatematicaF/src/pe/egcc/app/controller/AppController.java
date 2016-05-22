/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.app.controller;

import pe.egcc.app.service.MyMath;

/**
 *
 * @author Gustavo Coronel
 */
public class AppController {
  
   public  long factorial(int n){
       
    return MyMath.factorial(n);
   }
   
   public  int MCD(int n1,int n2){
   return MyMath.mcd(n1, n2);
   }
   
     public  int MCM(int n1,int n2){
   return MyMath.mcm(n1, n2);
   }
     public int [] Fibonacci(int cant){
         
         return MyMath.fibonacci(cant);
     }
     public  boolean primo(int val){
         
         return MyMath.esPrimo(val);
     }
}
