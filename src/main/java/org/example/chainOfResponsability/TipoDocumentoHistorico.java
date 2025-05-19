package org.example.chainOfResponsability;

public class TipoDocumentoHistorico implements TipoDocumento{

    private TipoDocumentoHistorico(){};

    private static TipoDocumentoHistorico instance = new TipoDocumentoHistorico();

    public static TipoDocumentoHistorico getInstance(){
        return instance;
    }

    public String getTipoDocumento() {
        return "Tipo Documento Historico";
    }
}
