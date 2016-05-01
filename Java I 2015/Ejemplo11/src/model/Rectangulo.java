package model;

public class Rectangulo extends Figura {
    //campos

    private final double _lado, _ancho;
    // constructor

    // constructor
    public Rectangulo(double _lado, double _ancho) {
        this._lado = _lado;
        this._ancho = _ancho;
    }

    @Override
    public double Area() {
        return _lado * _ancho;
    }

    @Override
    public double Perimetro() {
        return 2 * _lado + 2 * _ancho;
    }

}
