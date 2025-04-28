package org.example.abstractFactory;

public class FabricaPessoaJuridica implements FabricaAbstrata{

    @Override
    public Contrato criarContrato() {
        return new ContratoPessoaJuridica();
    }

    @Override
    public Processo criarProcesso() {
        return new ProcessoPessoaJuridica();
    }
}