package decorator;

import org.example.decorator.*;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class HamburguerTest {

    @Test
    void deveRetornarPrecoPaoCarne() {
        Hamburguer hamburguer = new PaoCarne(5.0f);
        assertEquals(5.0f, hamburguer.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoPaoCarneQueijo() {
        Hamburguer hamburguer = new Queijo(new PaoCarne(5.0f));
        assertEquals(6.5f, hamburguer.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoPaoCarneTomate() {
        Hamburguer hamburguer = new Tomate(new PaoCarne(5.0f));
        assertEquals(5.5f, hamburguer.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoPaoCarneAlface() {
        Hamburguer hamburguer = new Alface(new PaoCarne(5.0f));
        assertEquals(6.0f, hamburguer.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoPaoCarneCebola() {
        Hamburguer hamburguer = new Cebola(new PaoCarne(5.0f));
        assertEquals(6.0f, hamburguer.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoPaoCarneBacon() {
        Hamburguer hamburguer = new Bacon(new PaoCarne(5.0f));
        assertEquals(8.0f, hamburguer.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoPaoCarneQueijoTomate() {
        Hamburguer hamburguer = new Tomate(new Queijo(new PaoCarne(5.0f)));
        assertEquals(7.0f, hamburguer.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoPaoCarneQueijoTomateAlface() {
        Hamburguer hamburguer = new Alface(new Tomate(new Queijo(new PaoCarne(5.0f))));
        assertEquals(8.0f, hamburguer.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoPaoCarneQueijoTomateAlfaceCebola() {
        Hamburguer hamburguer = new Cebola(new Alface(new Tomate(new Queijo(new PaoCarne(5.0f)))));
        assertEquals(9.0f, hamburguer.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoPaoCarneQueijoTomateAlfaceCebolaBacon() {
        Hamburguer hamburguer = new Bacon(new Cebola(new Alface(new Tomate(new Queijo(new PaoCarne(5.0f))))));
        assertEquals(12.0f, hamburguer.getPreco(), 0.01f);
    }
}
