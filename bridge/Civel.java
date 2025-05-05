package org.example.bridge;

public class Civel extends TipoProcessoGanho implements TipoProcessoGanhoInterface{

    private Civel(){}
    private static Civel instance = new Civel();
    public static Civel getInstance(){
        return instance;
    }

    public float percentualAumento() {
        return 0.1f;
    }

    public String emitirTipoProcesso() {
        return "Processo Civel";
    }

    public String getTipoProcesso() {
        return super.getTipoProcesso();
    }

    public void setTipoProcesso(String tipoProcessoVencido) {
        super.setTipoProcesso(tipoProcessoVencido);
    }
}
