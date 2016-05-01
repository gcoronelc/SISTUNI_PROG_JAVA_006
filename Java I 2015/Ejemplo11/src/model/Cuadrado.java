package model;

public class Cuadrado extends Figura {
    //campos

    private final double _lado;

    //constructor
    public Cuadrado(double _lado) {
        this._lado = _lado;
    }

    @Override
    public double Area() {
        return Math.pow(_lado, 2);
    }

    @Override
    public double Perimetro() {
        return 4 * _lado;
    }

}
