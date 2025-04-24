package factorymethod;

import org.example.factorymethod.EntidadesJuridicas;
import org.example.factorymethod.ObjetoFactory;
import org.example.factorymethod.Processo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProcessoTeste {

    @BeforeEach
    public void setup() {
        ObjetoFactory.setObjetoClasse("Processo");
    }

    @Test
    public void Dado_ObjetoCriado_Quando_InstanciaProcesso_Entao_ProcessoDeveSerCriado() {
        EntidadesJuridicas processo = ObjetoFactory.getObjetoPadrao();
        assertNotNull(processo);
        assertTrue(processo instanceof Processo);
    }

    @Test
    public void Dado_ProcessoCriado_DescricaoCorreta_Entao_DeveRetornarDescricaoEsperada() {
        EntidadesJuridicas processo = ObjetoFactory.getObjetoPadrao();
        processo.setDescricao("Processo Judicial");

        String expected = "Descrição: Processo Judicial do Processo";
        assertEquals(expected, processo.getDescricao());
    }

    @Test
    public void Dado_ProcessoCriado_DescricaoIncorreta_Entao_DeveFalharComparacao() {
        EntidadesJuridicas processo = ObjetoFactory.getObjetoPadrao();
        processo.setDescricao("Processo Judicial");

        String expected = "Descrição: Processo Administrativo do Processo";
        assertNotEquals(expected, processo.getDescricao());
    }

    @Test
    public void Dado_ProcessoCriado_DataCadastroCorreta_Entao_DeveRetornarDataEsperada() {
        EntidadesJuridicas processo = ObjetoFactory.getObjetoPadrao();
        processo.setDataCadastro("23/04/2025");

        String expected = "Data de Cadastro: 23/04/2025 do Processo";
        assertEquals(expected, processo.getDataCadastro());
    }

    @Test
    public void Dado_ClasseProcesso_Entao_NomeDaClasseDeveSerProcesso() {
        assertEquals("Processo", ObjetoFactory.getClassePadrao().getSimpleName());
    }
}
