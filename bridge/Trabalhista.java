package org.example.bridge;

public class Trabalhista extends TipoProcessoGanho implements TipoProcessoGanhoInterface{

    private Trabalhista(){}
    private static Trabalhista instance = new Trabalhista();
    public static Trabalhista getInstance(){
        return instance;
    }

    public float percentualAumento() {
        return 0.2f;
    }

    public String emitirTipoProcesso() {
        return "Processo Trabalhista";
    }

    public String getTipoProcesso() {
        return super.getTipoProcesso();
    }

    public void setTipoProcesso(String tipoProcessoVencido) {
        super.setTipoProcesso(tipoProcessoVencido);
    }
}
