package org.example.state;

public class Evadido extends AlunoEstado{

    private static Evadido instance = new Evadido();

    private Evadido(){}

    public static Evadido getInstance(){
        return instance;
    }
}
