package factorymethod;

import org.example.factorymethod.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ObjetoFactoryTeste {

    @Test
    public void Dado_ClasseInexistente_Entao_DeveLancarException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> ObjetoFactory.setObjetoClasse("Inexistente")
        );
        assertTrue(exception.getMessage().contains("Entidade Juridica inexistente"));
    }

    @Test
    public void Dado_ObjetoCriado_Quando_InstanciaContrato_Entao_ContratoDeveSerCriado() {
        EntidadesJuridicas contrato = ObjetoFactory.getObjetoPadrao();
        assertNotNull(contrato);
        assertTrue(contrato instanceof Contrato);
    }

    @Test
    public void Dado_ObjetoCriado_Quando_InstanciaProcesso_Entao_ContratoDeveSerCriado() {
        EntidadesJuridicas processo = ObjetoFactory.getObjetoPadrao();
        assertNotNull(processo);
        assertTrue(processo instanceof Processo);
    }

    @Test
    public void Dado_ObjetoCriado_Quando_InstanciaServico_Entao_ContratoDeveSerCriado() {
        EntidadesJuridicas servico = ObjetoFactory.getObjetoPadrao();
        assertNotNull(servico);
        assertTrue(servico instanceof Servico);
    }
}
