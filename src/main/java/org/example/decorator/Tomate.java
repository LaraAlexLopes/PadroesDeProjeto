package org.example.decorator;

public class Tomate extends HamburguerDecorator{

    public Tomate(Hamburguer hamburguer) { super(hamburguer); }

    public float getPrecoAcrescimento() {
        return 0.5f;
    }
}
