package org.example.factorymethod;

public abstract class EntidadesJuridicas {

    private String descricao;
    private String dataCadastro;

    public String getDescricao() {
        return "Descrição: " + this.descricao + " do " + ObjetoFactory.getClassePadrao().getSimpleName();
    }

    public String getDataCadastro() {
        return "Data de Cadastro: " + this.dataCadastro + " do " + ObjetoFactory.getClassePadrao().getSimpleName();
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
