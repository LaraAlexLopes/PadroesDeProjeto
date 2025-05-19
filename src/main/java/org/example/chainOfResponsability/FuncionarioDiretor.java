package org.example.chainOfResponsability;
public class FuncionarioDiretor extends Funcionario{

    public FuncionarioDiretor(Funcionario funcionario)
    {
        pilhaDeDocumentos.add(TipoDocumentoCertificado.getInstance().getTipoDocumento());
        setFuncionarioSuperior(funcionario);
    }

    public String getCargo() {
        return "Diretor";
    }
}
