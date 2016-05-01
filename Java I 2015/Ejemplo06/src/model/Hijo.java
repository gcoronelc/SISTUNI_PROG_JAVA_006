
package model;

public class Hijo extends Padre{
// constructor
    public Hijo() {
        super();
        System.out.println("Android es el Hijo de Java");
    }
    // metodo
    @Override
    public void Mensaje(){
        System.out.println("Android es un SO para moviles");
    }
    
}
