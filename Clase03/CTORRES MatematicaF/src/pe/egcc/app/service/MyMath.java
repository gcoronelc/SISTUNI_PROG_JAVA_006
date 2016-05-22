package pe.egcc.app.service;

/**
 *
 * @author Gustavo Coronel
 */
public final class MyMath {

  private MyMath() {
  }

  public static long factorial(int n){
    
      if (n==0)
    return 1;
  else
    return n * factorial(n-1);
    
  }
  
  public static int mcd(int n1, int n2){
    
    int mcd = 0;
        int a = Math.max(n1, n2);
        int b = Math.min(n1, n2);
        do {
            mcd = b;
            b = a%b;
            a = mcd;
        } while(b!=0);
        return mcd;
  }
  
  public static int mcm(int n1, int n2){
    
     int mcm = 0;
        int a = Math.max(n1, n2);
        int b = Math.min(n1, n2);
        mcm = (a/mcd(a, b))*b;
        return mcm;
  }
  
  public static int [] fibonacci(int n){
     
 int i;
      int arr[]=new int[n];
      
      arr[0]=0;
      arr[1]=1;
     for(i=2; i <n; i++){
 
        arr[i] = arr[i-1] + arr[i-2];
 
    }
      return arr;
    
  }
   
  
  public static boolean esPrimo(int n){
      int a=0;
      for (int i=1; i<(n+1); i++)

        {            

            if (n%i==0)

            {

                a++;

            }

        }

        if (a!=2)

        {

            return false;

        }

        else

        {

           return true;
        }
   
  }
 
}
