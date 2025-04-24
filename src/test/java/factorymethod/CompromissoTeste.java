package factorymethod;

import org.example.factorymethod.Compromisso;
import org.example.factorymethod.EntidadesJuridicas;
import org.example.factorymethod.ObjetoFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CompromissoTeste {

    Compromisso compromisso = new Compromisso();

    @Test
    public void Dado_ObjetoCriado_Quando_InstanciaCompromisso_Entao_CompromissoDeveSerCriado() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> ObjetoFactory.setObjetoClasse("Compromisso")
        );
        assertTrue(exception.getMessage().contains("Entidade Juridica inexistente"));
    }

    @Test
    public void Dado_CompromissoCriado_DescricaoCorreta_Entao_DeveRetornarDescricaoEsperada() {
        compromisso.setDescricao("Reunião com Cliente");
        String expected = "Descrição: Reunião com Cliente do Compromisso";
        assertEquals(expected, compromisso.getDescricao());
    }

    @Test
    public void Dado_CompromissoCriado_DescricaoIncorreta_Entao_DeveFalharComparacao() {
        compromisso.setDescricao("Reunião com Cliente");

        String expected = "Descrição: Viagem de Negócios do Compromisso";
        assertNotEquals(expected, compromisso.getDescricao());
    }

    @Test
    public void Dado_CompromissoCriado_DataCadastroCorreta_Entao_DeveRetornarDataEsperada() {
        compromisso.setDataCadastro("23/04/2025");

        String expected = "Data de Cadastro: 23/04/2025 do Compromisso";
        assertEquals(expected, compromisso.getDataCadastro());
    }

    @Test
    public void Dado_ClasseCompromisso_Entao_NomeDaClasseDeveSerCompromisso() {
        assertEquals("Compromisso", ObjetoFactory.getClassePadrao().getSimpleName());
    }
}
