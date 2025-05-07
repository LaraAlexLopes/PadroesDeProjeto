package org.example.decorator;

public abstract class HamburguerDecorator implements Hamburguer{

    private Hamburguer hamburguer;
    private String descricao;

    public HamburguerDecorator(Hamburguer hamburguer){
        this.hamburguer = hamburguer;
    }

    public Hamburguer getHamburguer() {
        return hamburguer;
    }

    public void setHamburguer(Hamburguer hamburguer) {
        this.hamburguer = hamburguer;
    }

    public float getPreco() {
        return this.hamburguer.getPreco() + this.getPrecoAcrescimento();
    }

    public abstract float getPrecoAcrescimento();

    public void setDescricao(){
        this.descricao = descricao;
    }
}
