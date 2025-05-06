package org.example.bridge;

public abstract class TipoProcessoGanho {

    protected String tipoProcesso;

    public void setTipoProcesso(String tipoProcessoVencido) {
        this.tipoProcesso = tipoProcessoVencido;
    }

    public String getTipoProcesso() {
        return this.tipoProcesso;
    }
}
