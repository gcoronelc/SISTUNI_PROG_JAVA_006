
package pe.egcc.controller;

import pe.egcc.service.MyMath;


/**
 *
 * @author darwi
 */
    
public class AppController
{
   
  public long Factorial( int n )
  {
     return MyMath.factorial(n);
  }
  
  public boolean Estado( int n )
  {
      return MyMath.esPrimo(n);
  }
  
  public int[] fibonacci( int n )
  {
      return MyMath.fibonacci(n);
  }
  
  public int MCD ( int n1, int n2 )
  {
      return MyMath.mcd(n2, n1);
  }
  
  public int MCM ( int n1, int n2)
  {
      return MyMath.mcm(n1, n2);
  }
}
