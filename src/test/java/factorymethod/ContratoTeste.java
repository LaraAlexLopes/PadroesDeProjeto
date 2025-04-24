package factorymethod;

import org.example.factorymethod.Contrato;
import org.example.factorymethod.EntidadesJuridicas;
import org.example.factorymethod.ObjetoFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContratoTeste {

    @BeforeEach
    public void setup() {
        ObjetoFactory.setObjetoClasse("Contrato");
    }

    @Test
    public void Dado_ObjetoCriado_Quando_InstanciaContrato_Entao_ContratoDeveSerCriado() {
        EntidadesJuridicas contrato = ObjetoFactory.getObjetoPadrao();
        assertNotNull(contrato);
        assertTrue(contrato instanceof Contrato);
    }

    @Test
    public void Dado_ContratoCriado_DescricaoSetadaIgualDescricaoExperada_Entao_DeveRetornarTrue() {
        EntidadesJuridicas contrato = ObjetoFactory.getObjetoPadrao();
        contrato.setDescricao("Contrato de Aluguel");

        String expected = "Descrição: Contrato de Aluguel do Contrato";
        assertEquals(expected, contrato.getDescricao());
    }

    @Test
    public void Dado_ContratoCriado_DescricaoSetadaDiferenteDescricaoExperada_Entao_DeveRetornarFalse() {
        EntidadesJuridicas contrato = ObjetoFactory.getObjetoPadrao();
        contrato.setDescricao("Contrato de Aluguel");

        String expected = "Descrição: Contrato de Carro do Contrato";
        assertNotEquals(expected, contrato.getDescricao());
    }

    @Test
    public void Dado_ContratoCriado_DataCadastroSetadaIgualDataCadastroExperada_Entao_DeveRetornarTrue() {
        EntidadesJuridicas contrato = ObjetoFactory.getObjetoPadrao();
        contrato.setDataCadastro("23/04/2025");

        String expected = "Data de Cadastro: 22/04/2025 do Contrato";
        assertNotEquals(expected, contrato.getDataCadastro());
    }

    @Test
    public void Dado_ClasseExistente_Entao_DeveConseguirLocalizarClasse() {
        assertEquals("Contrato", ObjetoFactory.getClassePadrao().getSimpleName());
    }


}
