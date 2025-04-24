package org.example.factorymethod;

public class Compromisso {
    private String descricao;
    private String dataCadastro;

    public String getDescricao() {
        return "Descrição: " + this.descricao + " do Compromisso";
    }

    public String getDataCadastro() {
        return "Data de Cadastro: " + this.dataCadastro + " do Compromisso";
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
