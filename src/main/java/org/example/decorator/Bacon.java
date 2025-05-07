package org.example.decorator;

public class Bacon extends HamburguerDecorator{

    public Bacon(Hamburguer hamburguer) { super(hamburguer); }

    public float getPrecoAcrescimento() {
        return 3f;
    }
}
