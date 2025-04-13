import org.example.EX1;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EX1Test {

    EX1 ex1 = new EX1();

    // validarNumerosApostados
    @Test
    void givenValidBetNumbers_whenValidate_thenReturnSameList() throws IllegalAccessException {
        List<Integer> validNumbers = Arrays.asList(5, 12, 23, 34, 45, 56);
        List<Integer> result = ex1.validarNumerosApostados(validNumbers);
        assertEquals(validNumbers, result);
    }

    @Test
    void givenNumberOutOfRange_whenValidate_thenThrowException() {
        List<Integer> invalidNumbers = Arrays.asList(0, 5, 10, 20, 30);
        IllegalAccessException exception = assertThrows(IllegalAccessException.class, () ->
                ex1.validarNumerosApostados(invalidNumbers));
        assertEquals("Número apostado fora do intervalo", exception.getMessage());
    }

    @Test
    void givenDuplicatedNumbers_whenValidate_thenThrowException() {
        List<Integer> duplicatedNumbers = Arrays.asList(5, 10, 10, 20, 30, 40);
        IllegalAccessException exception = assertThrows(IllegalAccessException.class, () ->
                ex1.validarNumerosApostados(duplicatedNumbers));
        assertEquals("Números apostados duplicados", exception.getMessage());
    }

    // validarNumerosSorteados
    @Test
    void givenValidDrawnNumbers_whenValidate_thenReturnHitCount() throws IllegalAccessException {
        List<Integer> drawnNumbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        int acertos = ex1.validarNumerosSorteados(drawnNumbers);
        assertTrue(acertos >= 0 && acertos <= 6);
    }

    @Test
    void givenLessThanMinimumDrawnNumbers_whenValidate_thenThrowException() {
        List<Integer> drawnNumbers = Arrays.asList(1, 2, 3);
        IllegalAccessException exception = assertThrows(IllegalAccessException.class, () ->
                ex1.validarNumerosSorteados(drawnNumbers));
        assertEquals("Quantidade de números sorteados fora do intervalo", exception.getMessage());
    }

    @Test
    void givenMoreThanMaximumDrawnNumbers_whenValidate_thenThrowException() {
        List<Integer> drawnNumbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16);
        IllegalAccessException exception = assertThrows(IllegalAccessException.class, () ->
                ex1.validarNumerosSorteados(drawnNumbers));
        assertEquals("Quantidade de números sorteados fora do intervalo", exception.getMessage());
    }

    // resultadoAposta
    @Test
    void givenSixHits_whenCheckResult_thenReturnFullPrize() {
        double prize = ex1.resultadoAposta(6, 100.0);
        assertEquals(100.0, prize);
    }

    @Test
    void givenFiveHits_whenCheckResult_thenReturnTwentyPercentPrize() {
        double prize = ex1.resultadoAposta(5, 100.0);
        assertEquals(20.0, prize);
    }

    @Test
    void givenFourHits_whenCheckResult_thenReturnFivePercentPrize() {
        double prize = ex1.resultadoAposta(4, 100.0);
        assertEquals(5.0, prize);
    }

    @Test
    void givenLessThanFourHits_whenCheckResult_thenReturnZero() {
        double prize = ex1.resultadoAposta(3, 100.0);
        assertEquals(0.0, prize);
    }
}
