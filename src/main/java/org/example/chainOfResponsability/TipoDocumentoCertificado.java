package org.example.chainOfResponsability;

public class TipoDocumentoCertificado implements TipoDocumento{

    private TipoDocumentoCertificado(){};

    private static TipoDocumentoCertificado instance = new TipoDocumentoCertificado();

    public static TipoDocumentoCertificado getInstance(){
        return instance;
    }

    public String getTipoDocumento() {
        return "Tipo Documento Certificado";
    }
}
