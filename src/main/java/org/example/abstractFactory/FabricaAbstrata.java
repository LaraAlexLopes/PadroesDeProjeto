package org.example.abstractFactory;

public interface FabricaAbstrata {
    Processo criarProcesso();
    Contrato criarContrato();
}