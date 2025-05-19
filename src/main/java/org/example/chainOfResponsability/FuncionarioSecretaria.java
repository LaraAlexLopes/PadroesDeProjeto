package org.example.chainOfResponsability;
public class FuncionarioSecretaria extends Funcionario{

    public FuncionarioSecretaria(Funcionario funcionario)
    {
        pilhaDeDocumentos.add(TipoDocumentoHistorico.getInstance().getTipoDocumento());
        setFuncionarioSuperior(funcionario);
    }

    public String getCargo() {
        return "Secretária";
    }

}
