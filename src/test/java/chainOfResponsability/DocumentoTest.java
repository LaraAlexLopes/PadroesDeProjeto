package chainOfResponsability;

import org.example.chainOfResponsability.Documento;
import org.example.chainOfResponsability.FuncionarioSecretaria;
import org.example.chainOfResponsability.FuncionarioCoordenador;
import org.example.chainOfResponsability.FuncionarioDiretor;
import org.example.chainOfResponsability.FuncionarioReitor;
import org.example.chainOfResponsability.TipoDocumentoHistorico;
import org.example.chainOfResponsability.TipoDocumentoMatricula;
import org.example.chainOfResponsability.TipoDocumentoCertificado;
import org.example.chainOfResponsability.TipoDocumentoDiploma;
import org.example.chainOfResponsability.TipoDocumentoBoleto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DocumentoTest {

    FuncionarioReitor reitor;
    FuncionarioDiretor diretor;
    FuncionarioCoordenador coordenador;
    FuncionarioSecretaria secretaria;

    @BeforeEach
    void setUp() {
        reitor = new FuncionarioReitor(null);
        diretor = new FuncionarioDiretor(reitor);
        coordenador = new FuncionarioCoordenador(diretor);
        secretaria = new FuncionarioSecretaria(coordenador);
    }

    @Test
    void deveRetornarSecretariaParaAssinaturaHistorico() {
        assertEquals("Tipo Documento Historico", secretaria.assinarDocumento(new Documento(TipoDocumentoHistorico.getInstance())));
    }

    @Test
    void deveRetornarCoordenadorParaAssinaturaMatricula() {
        assertEquals("Coordenador", secretaria.assinarDocumento(new Documento(TipoDocumentoMatricula.getInstance())));
    }

    @Test
    void deveRetornarDiretorParaAssinaturaCertificado() {
        assertEquals("Diretor", secretaria.assinarDocumento(new Documento(TipoDocumentoCertificado.getInstance())));
    }

    @Test
    void deveRetornarReitorParaAssinaturaDiploma() {
        assertEquals("Reitor", secretaria.assinarDocumento(new Documento(TipoDocumentoDiploma.getInstance())));
    }

    @Test
    void deveRetornarSemAssinaturaParaAssinaturaBoleto() {
        assertEquals("Sem assinatura", secretaria.assinarDocumento(new Documento(TipoDocumentoBoleto.getInstance())));
    }

}