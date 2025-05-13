package org.example.state;

public abstract class AlunoEstado {

    private AlunoEstado alunoEstado;

    public AlunoEstado(AlunoEstado aluno){
        this.alunoEstado = aluno;
    }

    protected AlunoEstado() {}

    public boolean matricular(){
        return false;
    }

    public boolean trancar(){
        return false;
    }

    public boolean formar(){
        return false;
    }

    public boolean evadir(){
        return false;
    }

    public boolean transferir(){
        return false;
    }

    public boolean jubilar(){
        return false;
    }
}
