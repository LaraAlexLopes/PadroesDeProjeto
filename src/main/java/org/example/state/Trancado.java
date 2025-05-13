package org.example.state;

public class Trancado extends AlunoEstado{

    private Trancado(){}

    private static Trancado instance = new Trancado();

    public static Trancado getInstance(){
        return instance;
    }

    public boolean matricular(){
        return true;
    };

    public boolean transferir(){
        return true;
    };
}
