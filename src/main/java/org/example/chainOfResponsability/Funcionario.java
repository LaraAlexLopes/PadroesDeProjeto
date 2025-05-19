package org.example.chainOfResponsability;

import java.util.ArrayList;

public abstract class Funcionario {

    protected ArrayList pilhaDeDocumentos = new ArrayList<>();
    private Funcionario funcionarioSuperior;

    public abstract String getCargo();

    public ArrayList getTipoDocumento() {
        return pilhaDeDocumentos;
    }

    public void setTipoDocumento(ArrayList pilhaDeDocumentos) {
        this.pilhaDeDocumentos = pilhaDeDocumentos;
    }

    public Funcionario getFuncionarioSuperior() {
        return funcionarioSuperior;
    }

    public void setFuncionarioSuperior(Funcionario funcionarioSuperior) {
        this.funcionarioSuperior = funcionarioSuperior;
    }

    public String assinarDocumento(Documento documento){
        if(pilhaDeDocumentos.contains(documento.getTipoDocumento())){
            return "Documento " + documento.getTipoDocumento() + "Assinado " + getCargo();
        } else{
            if(!getCargo().isEmpty()){
                return funcionarioSuperior.assinarDocumento(documento);
            } else{
                return "Documento " + getTipoDocumento() + " não pode ser assinado";
            }
        }
    }

}
