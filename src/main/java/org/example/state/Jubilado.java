package org.example.state;

public class Jubilado extends AlunoEstado{

    private Jubilado(){}

    private static Jubilado instance = new Jubilado();

    public static Jubilado getInstance(){
        return instance;
    }
}
