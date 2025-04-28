package org.example.abstractFactory;

public class ProcessoPessoaJuridica implements Processo{

    public String  emitirProcesso() {
        return "Processo de Pessoa Jurídica";
    }
}