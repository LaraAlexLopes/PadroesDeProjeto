package org.example.state;

public class Transferido extends AlunoEstado{

    private Transferido(){};

    private static Transferido instance =  new Transferido();

    public static Transferido getInstance(){
        return instance;
    }
}
