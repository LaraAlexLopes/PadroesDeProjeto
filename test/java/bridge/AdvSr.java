package bridge;

import org.example.bridge.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AdvSr {
    @Test
    void deveRetornarSalarioAdvogadoSrComProcessoCivel(){
        Cargo advSr = new AdvogadoSr(2000.0f);
        Civel tipoProcessoGanho = Civel.getInstance();

        advSr.setTipoProcessoGanhoInterface(tipoProcessoGanho);
        advSr.calcularSalario();

        assertEquals(4200.0f, advSr.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioAdvogadoSrComProcessoPenal(){
        Cargo advSr = new AdvogadoSr(2000.0f);
        Penal tipoProcessoGanho = Penal.getInstance();

        advSr.setTipoProcessoGanhoInterface(tipoProcessoGanho);
        advSr.calcularSalario();

        assertEquals(4600.0f, advSr.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioAdvogadoSrComProcessoTrabalhista(){
        Cargo advSr = new AdvogadoSr(2000.0f);
        Trabalhista tipoProcessoGanho = Trabalhista.getInstance();

        advSr.setTipoProcessoGanhoInterface(tipoProcessoGanho);
        advSr.calcularSalario();

        assertEquals(4400.0f, advSr.calcularSalario(), 0.01f);
    }
}
