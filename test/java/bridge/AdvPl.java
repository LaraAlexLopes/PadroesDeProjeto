package bridge;

import org.example.bridge.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class AdvPl {

    @Test
    void deveRetornarSalarioAdvogadoPlComProcessoCivel(){
        Cargo advPl = new AdvogadoPl(2000.0f);
        Civel tipoProcessoGanho = Civel.getInstance();

        advPl.setTipoProcessoGanhoInterface(tipoProcessoGanho);
        advPl.calcularSalario();

        assertEquals(2200.0f, advPl.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioAdvogadoPlComProcessoPenal(){
        Cargo advPl = new AdvogadoPl(2000.0f);
        Penal tipoProcessoGanho = Penal.getInstance();

        advPl.setTipoProcessoGanhoInterface(tipoProcessoGanho);
        advPl.calcularSalario();

        assertEquals(2600.0f, advPl.calcularSalario(), 0.01f);;
    }

    @Test
    void deveRetornarSalarioAdvogadoPlComProcessoTrabalhista(){
        Cargo advPl = new AdvogadoPl(2000.0f);
        Trabalhista tipoProcessoGanho = Trabalhista.getInstance();

        advPl.setTipoProcessoGanhoInterface(tipoProcessoGanho);
        advPl.calcularSalario();

        assertEquals(2400.0f, advPl.calcularSalario(), 0.01f);;
    }
}
