package org.example.state;

public class Formado extends AlunoEstado{

    private Formado(){}

    private static Formado instance = new Formado();

    public static Formado getInstance(){ return instance; }
}
