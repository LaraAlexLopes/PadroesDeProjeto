package state;

import org.example.state.*;
import org.example.state.Formado;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class AlunoTest {

    @Test
    void deveRetornarAlunoMatriculado() {
        assertEquals(false, Matriculado.getInstance().matricular());
    }

    @Test
    void deveRetornarAlunoMatriculadoETrancado(){
        assertEquals(true, Matriculado.getInstance().trancar());
    }

    @Test
    void deveRetornarAlunoMatriculadoEFormado(){
        assertEquals(true,Matriculado.getInstance().formar());
    }

    @Test
    void deveRetornarAlunoMatriculadoEEvadido(){
        assertEquals(true, Matriculado.getInstance().evadir());
    }

    @Test
    void deveRetornarAlunoMatriculadoETransferido(){
        assertEquals(true, Matriculado.getInstance().transferir());
    }

    @Test
    void deveRetornarAlunoMatriculadoEJubilar(){
        assertEquals(true, Matriculado.getInstance().jubilar());
    }

// Trancado
    @Test
    void deveRetornarAlunoTrancadoETrancado() {
        assertEquals(false,  Trancado.getInstance().trancar());
    }

    @Test
    void deveRetornarAlunoTrancadoEMatriculado(){
        assertEquals(true, Trancado.getInstance().matricular());
    }

    @Test
    void deveRetornarAlunoTrancadoEFormado(){
        assertEquals(false, Trancado.getInstance().formar());
    }

    @Test
    void deveRetornarAlunoTrancadoEEvadido(){
        assertEquals(false, Trancado.getInstance().evadir());
    }

    @Test
    void deveRetornarAlunoTrancadoETransferido(){
        assertEquals(true, Trancado.getInstance().transferir());
    }

    @Test
    void deveRetornarAlunoTrancadoEJubilar(){
        assertEquals(false, Trancado.getInstance().jubilar());
    }

    // Formado
    @Test
    void deveRetornarAlunoFormadoEFormado() {
        assertEquals(false, Formado.getInstance().formar());
    }

    @Test
    void deveRetornarAlunoFormadoEMatriculado(){
        assertEquals(false, Formado.getInstance().matricular());
    }

    @Test
    void deveRetornarAlunoFormadoETrancar(){
        assertEquals(false, Formado.getInstance().formar());
    }

    @Test
    void deveRetornarAlunoFormadoEEvadido(){
        assertEquals(false, Formado.getInstance().evadir());
    }

    @Test
    void deveRetornarAlunoFormadoETransferido(){
        assertEquals(false, Formado.getInstance().transferir());
    }

    @Test
    void deveRetornarAlunoFormadoEJubilar(){
        assertEquals(false, Formado.getInstance().jubilar());
    }

    // Evadido
    @Test
    void deveRetornarAlunoEvadidoEEvadido() {
        assertEquals(false, Evadido.getInstance().evadir());
    }

    @Test
    void deveRetornarAlunoEvadidoEMatriculado(){
        assertEquals(false, Evadido.getInstance().matricular());
    }

    @Test
    void deveRetornarAlunoEvadidoETrancar(){
        assertEquals(false, Evadido.getInstance().trancar());
    }

    @Test
    void deveRetornarAlunoEvadidoEFormar(){
        assertEquals(false, Evadido.getInstance().formar());
    }

    @Test
    void deveRetornarAlunoEvadidoETransferido(){
        assertEquals(false, Evadido.getInstance().transferir());
    }

    @Test
    void deveRetornarAlunoEvadidoEJubilar(){
        assertEquals(false, Evadido.getInstance().jubilar());
    }

    // Jubilado
    @Test
    void deveRetornarAlunoJubiladoEJubilado() {
        assertEquals(false, Jubilado.getInstance().jubilar());
    }

    @Test
    void deveRetornarAlunoJubiladoEMatriculado(){
        assertEquals(false, Jubilado.getInstance().matricular());
    }

    @Test
    void deveRetornarAlunoJubiladoETrancar(){
        assertEquals(false, Jubilado.getInstance().trancar());
    }

    @Test
    void deveRetornarAlunoJubiladoEFormar(){
        assertEquals(false, Jubilado.getInstance().formar());
    }

    @Test
    void deveRetornarAlunoJubiladoETransferido(){
        assertEquals(false, Jubilado.getInstance().transferir());
    }

    @Test
    void deveRetornarAlunoJubiladoEJubilar(){
        assertEquals(false, Jubilado.getInstance().jubilar());
    }

    // Transferido
    @Test
    void deveRetornarAlunoTransferidoEJubilado() {
        assertEquals(false, Transferido.getInstance().jubilar());
    }

    @Test
    void deveRetornarAlunoTransferidoEMatriculado(){
        assertEquals(false, Jubilado.getInstance().matricular());
    }

    @Test
    void deveRetornarAlunoTransferidoETrancar(){
        assertEquals(false, Transferido.getInstance().trancar());
    }

    @Test
    void deveRetornarAlunoTransferidoEFormar(){
        assertEquals(false, Transferido.getInstance().formar());
    }

    @Test
    void deveRetornarAlunoTransferidoETransferido(){
        assertEquals(false, Transferido.getInstance().transferir());
    }

    @Test
    void deveRetornarAlunoTransferidoEEvadir(){
        assertEquals(false, Transferido.getInstance().evadir());
    }
}
