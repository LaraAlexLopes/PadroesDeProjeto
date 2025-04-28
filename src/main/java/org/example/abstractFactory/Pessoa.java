package org.example.abstractFactory;

public class Pessoa {

    private Contrato contrato;
    private Processo processo;

    private Pessoa() {};
    private static Pessoa instance = new Pessoa();

    public static Pessoa getInstance() {
        return instance;
    }

    public void setContrato(FabricaAbstrata fabrica) {
        this.contrato = fabrica.criarContrato();
    }

    public void setProcesso(FabricaAbstrata fabrica) {
        this.processo = fabrica.criarProcesso();
    }

    public String emitirContrato(){
        return this.contrato.emitirContrato();
    }

    public String emitirProcesso(){
        return this.processo.emitirProcesso();
    }
}