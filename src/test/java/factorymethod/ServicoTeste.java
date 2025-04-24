package factorymethod;

import org.example.factorymethod.EntidadesJuridicas;
import org.example.factorymethod.ObjetoFactory;
import org.example.factorymethod.Servico;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ServicoTeste {

    @BeforeEach
    public void setup() {
        ObjetoFactory.setObjetoClasse("Servico");
    }

    @Test
    public void Dado_ObjetoCriado_Quando_InstanciaServico_Entao_ServicoDeveSerCriado() {
        EntidadesJuridicas servico = ObjetoFactory.getObjetoPadrao();
        assertNotNull(servico);
        assertTrue(servico instanceof Servico);
    }

    @Test
    public void Dado_ServicoCriado_DescricaoCorreta_Entao_DeveRetornarDescricaoEsperada() {
        EntidadesJuridicas servico = ObjetoFactory.getObjetoPadrao();
        servico.setDescricao("Serviço de TI");

        String expected = "Descrição: Serviço de TI do Servico";
        assertEquals(expected, servico.getDescricao());
    }

    @Test
    public void Dado_ServicoCriado_DescricaoIncorreta_Entao_DeveFalharComparacao() {
        EntidadesJuridicas servico = ObjetoFactory.getObjetoPadrao();
        servico.setDescricao("Serviço de TI");

        String expected = "Descrição: Serviço Jurídico do Servico";
        assertNotEquals(expected, servico.getDescricao());
    }

    @Test
    public void Dado_ServicoCriado_DataCadastroCorreta_Entao_DeveRetornarDataEsperada() {
        EntidadesJuridicas servico = ObjetoFactory.getObjetoPadrao();
        servico.setDataCadastro("23/04/2025");

        String expected = "Data de Cadastro: 23/04/2025 do Servico";
        assertEquals(expected, servico.getDataCadastro());
    }

    @Test
    public void Dado_ClasseServico_Entao_NomeDaClasseDeveSerServico() {
        assertEquals("Servico", ObjetoFactory.getClassePadrao().getSimpleName());
    }
}
