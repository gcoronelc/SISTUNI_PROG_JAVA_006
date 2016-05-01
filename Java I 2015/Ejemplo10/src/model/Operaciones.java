package model;

import Interfaces.IOperaciones;

public class Operaciones implements IOperaciones {

    @Override
    public float Sumar(float x, float y) {
        return x + y;
    }

    @Override
    public float Restar(float x, float y) {
        return x - y;
    }

    @Override
    public float Multiplicar(float x, float y) {
        return x * y;
    }

    @Override
    public float Dividir(float x, float y) {
        return x / y;
    }

}
