package model;

public class Circulo extends Figura {
// campos

    private final double _radio;

    //constructor
    public Circulo(double _radio) {
        this._radio = _radio;
    }

    @Override
    public double Area() {
        return Math.PI * Math.pow(_radio, 2);
    }

    @Override
    public double Perimetro() {
        return 2 * Math.PI * _radio;
    }

}
