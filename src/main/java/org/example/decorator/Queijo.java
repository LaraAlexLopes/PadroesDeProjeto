package org.example.decorator;

public class Queijo extends HamburguerDecorator{

    public Queijo(Hamburguer hamburguer) { super(hamburguer); }

    public float getPrecoAcrescimento() {
        return 1.5f;
    }
}
