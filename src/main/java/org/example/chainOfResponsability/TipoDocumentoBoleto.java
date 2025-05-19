package org.example.chainOfResponsability;

public class TipoDocumentoBoleto implements TipoDocumento{

    private TipoDocumentoBoleto(){};

    private static TipoDocumentoBoleto instance = new TipoDocumentoBoleto();

    public static TipoDocumentoBoleto getInstance(){
        return instance;
    }
    public String getTipoDocumento() {
        return "Tipo Documento Boleto";
    }
}
