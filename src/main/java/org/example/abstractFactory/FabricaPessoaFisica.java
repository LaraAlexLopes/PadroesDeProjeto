package org.example.abstractFactory;

public class FabricaPessoaFisica implements FabricaAbstrata{

    @Override
    public Contrato criarContrato() {
        return new ContratoPessoaFisica();
    }

    @Override
    public Processo criarProcesso() {
        return new ProcessoPessoaFisica();
    }
}