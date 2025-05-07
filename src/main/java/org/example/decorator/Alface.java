package org.example.decorator;

public class Alface extends HamburguerDecorator{

    public Alface(Hamburguer hamburguer) {
        super(hamburguer);
    }

    public float getPrecoAcrescimento() {
        return 1f;
    }
}
