
package pe.egcc.service;

/**
 *
 * @author darwi
 */

public class MyMath {

    private MyMath() 
    {

    }
    
    public static long factorial(int n){
    
        long factorial = 1;
    //Esto realiza el factorial
        for (int i = 1; i <= n; i++)
        {
            factorial = factorial*i;
        }
    //fin de procedimiento    
    return factorial;
  }
    
     public static int mcd(int n1, int n2){   
        int MCD;
        int mayor = Math.max(n1, n2);
        int menor = Math.min(n1,n2);          
        do
            {            
                MCD=menor;
                menor = mayor%menor;
                mayor = MCD;           
            } while (menor != 0);
        
    return MCD;
  }
  
  public static int mcm(int n1, int n2){
        int MCM = 0; 
        int mayor = Math.max(n1, n2);
        int menor = Math.min(n1, n2);
       int n = MyMath.mcd(mayor, menor);
       MCM = (mayor/n)*menor;
    return MCM;
  }
  
  public static int[] fibonacci(int n){
    
      int[] arreglo = new int[n];
      int n1 = 0, n2 = 1, n3;
      for (int i = 0; i < arreglo.length; i++) {
       arreglo[i] = n1;   
       n3=n1+n2;
       n1=n2;
       n2=n3;
      }
    return arreglo;
  }
  
  public static boolean esPrimo(int n){
      int suma = 0;
      boolean estado;
      for(int i = 1; i <= n-1; i++)
      {
         if( n%i==0) suma++;
      }   
         if(suma==1) estado=true;
         else estado = false;
       return estado;
  }
  
}
