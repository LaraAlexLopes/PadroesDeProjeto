package org.example.decorator;

public class Cebola extends HamburguerDecorator{

    public Cebola(Hamburguer hamburguer) { super(hamburguer); }

    public float getPrecoAcrescimento() { return 1f; }
}
