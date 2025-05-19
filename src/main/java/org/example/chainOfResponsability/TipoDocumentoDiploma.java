package org.example.chainOfResponsability;

public class TipoDocumentoDiploma implements TipoDocumento{

    private TipoDocumentoDiploma(){};

    private static TipoDocumentoDiploma instance = new TipoDocumentoDiploma();

    public static TipoDocumentoDiploma getInstance(){
        return instance;
    }

    public String getTipoDocumento() {
        return "Tipo Documento Diploma ";
    }
}
