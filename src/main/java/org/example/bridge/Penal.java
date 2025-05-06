package org.example.bridge;

public class Penal extends TipoProcessoGanho implements TipoProcessoGanhoInterface{

    private Penal(){};
    private static Penal instance = new Penal();
    public static Penal getInstance(){
        return instance;
    }

    public float percentualAumento() {
        return 0.3f;
    }

    public String emitirTipoProcesso() {
        return "Processo Penal";
    }

    public String getTipoProcesso() {
        return super.getTipoProcesso();
    }

    public void setTipoProcesso(String tipoProcessoVencido) {
        super.setTipoProcesso(tipoProcessoVencido);
    }
}
