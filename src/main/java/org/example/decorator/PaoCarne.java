package org.example.decorator;

public class PaoCarne implements Hamburguer{

    private float preco;

    public PaoCarne(float preco){
        this.preco = preco;
    }
    public PaoCarne(){}

    public float getPreco() {
        return this.preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
