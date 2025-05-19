package org.example.chainOfResponsability;

public class TipoDocumentoMatricula implements TipoDocumento{

    private TipoDocumentoMatricula(){};

    private static TipoDocumentoMatricula instance = new TipoDocumentoMatricula();

    public static TipoDocumentoMatricula getInstance(){
        return instance;
    }

    public String getTipoDocumento() {
        return "Tipo Documento Matricula";
    }
}
