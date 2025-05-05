package bridge;

import org.example.bridge.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class AdvJr {


    @Test
    void deveRetornarSalarioAdvogadoJrComProcessoCivel(){
        Cargo advJr = new AdvogadoJr(2000.0f);
        Civel tipoProcessoGanho = Civel.getInstance();

        advJr.setTipoProcessoGanhoInterface(tipoProcessoGanho);
        advJr.calcularSalario();

        assertEquals(2000.0f, advJr.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioAdvogadoJrComProcessoPenal(){
        Cargo advJr = new AdvogadoJr(2000.0f);
        Penal tipoProcessoGanho = Penal.getInstance();

        advJr.setTipoProcessoGanhoInterface(tipoProcessoGanho);
        advJr.calcularSalario();

        assertEquals(2000.0f, advJr.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioAdvogadoJrComProcessoTrabalhista(){
        Cargo advJr = new AdvogadoJr(2000.0f);
        Trabalhista tipoProcessoGanho = Trabalhista.getInstance();

        advJr.setTipoProcessoGanhoInterface(tipoProcessoGanho);
        advJr.calcularSalario();

        assertEquals(2000.0f, advJr.calcularSalario(), 0.01f);
    }
}
