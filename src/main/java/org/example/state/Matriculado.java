package org.example.state;

public class Matriculado extends AlunoEstado {

    private Matriculado(){}

    private static Matriculado instance =  new Matriculado();

    public static Matriculado getInstance(){
        return instance;
    }

    public boolean trancar() {
        return true;
    }

    public boolean formar(){
        return true;
    };

    public boolean evadir(){
        return true;
    };

    public boolean transferir(){
        return true;
    };

    public boolean jubilar(){
        return true;
    };
}
