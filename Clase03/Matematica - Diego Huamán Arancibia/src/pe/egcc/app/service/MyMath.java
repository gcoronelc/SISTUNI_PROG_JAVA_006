package pe.egcc.app.service;

/**
 *
 * @author Gustavo Coronel
 */
public final class MyMath {

    private MyMath() {
    }

    public static long factorial(int n) {
        long resultado;
        for (resultado = n; n > 1; n--) {
            resultado = resultado * (n - 1);
        }
        return resultado;
    }

    public static int mcd(int n1, int n2) {
        int mcd = 0;
        int a = Math.max(n1, n2);
        int b = Math.min(n1, n2);
        do {
            mcd = b;
            b = a % b;
            a = mcd;
        } while (b != 0);
        return mcd;
    }

    public static int mcm(int n1, int n2) {
        int mcm = 0;
        int a = Math.max(n1, n2);
        int b = Math.min(n1, n2);
        mcm = (a / mcd(a, b)) * b;
        return mcm;
    }

    public static int[] fibonacci(int n) {

        //inicializamos variables  
        int a = 0;
        int i = 0;
        int f1 = 0;
        int f2 = 1;
        //ambos arreglos tienen el tamaño del valor ingresado por el ususario
        int[] arreglo = new int[n];
        int[] arreglo2 = new int[n];
        /*el array arreglo guardara la serie en linea
      el array arreglo2 guardar la serie invertida*/
 /*si el numero ingresado por el usuario es 1 el arreglo 2

      guardar este valor. Luego se retornara el arreglo2*/
        if (n == 1) {
            arreglo2[a] = 0;
        }

        /* Si el valor ingresado por el usuario es mayor a dos se emieza a ejecutar
        * el for para obtener la serie fibonacci*/
        if (n >= 2) {
            for (i = 0; i <= n - 1; i++) {
                arreglo[i] = f1;
                f2 += f1;
                f1 = f2 - f1;
            }
            /* con el segundo for recorremos el primer arreglo en forma invertida para
  * ir guardando en el segundo arreglo la serie fibonacci de forma invertida*/
            for (i = n - 1; i >= 0; i--) {
                arreglo2[a] = arreglo[i];
                a++;
            }
        }
        /*retornamos el arreglo con la serie invertida guarda a la clase principal*/
        return arreglo2;
    }

    public static boolean esPrimo(int numero) {

        int contador = 2;
        boolean primo = true;
        while ((primo) && (contador != numero)) {
            if (numero % contador == 0) {
                primo = false;
            }
            contador++;
        }

        return primo;

    }

}
