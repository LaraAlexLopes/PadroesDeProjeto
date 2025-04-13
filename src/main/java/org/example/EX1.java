package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EX1 {
    static int  numeroMinimoApostado = 1;
    static int  numeroMaximoApostado = 60;
    static int quantidadeMinimaSorteados = 6;
    static int quantidadeMaximoSorteados = 15;
    static int quantidadeMaximaApostado = 6;
    static int numeroMaximoSorteado = 59;

    static double porcentagemQuina = 0.2;
    static double porcentagemQuarta = 0.05;

    public List<Integer> validarNumerosApostados(List<Integer> numerosApostados) throws IllegalAccessException {
        List<Integer> listaApostados = new ArrayList<>();

        for (Integer n: numerosApostados){
            if(n<numeroMinimoApostado || n>numeroMaximoApostado){
                throw new IllegalAccessException("Número apostado fora do intervalo");
            }
            if(listaApostados.contains(n)){
                throw new IllegalAccessException("Números apostados duplicados");
            }
            else{
                listaApostados.add(n);
            }
        }
        return listaApostados;
    }


    public int validarNumerosSorteados(List<Integer> listaSorteados) throws IllegalAccessException {
        int quantidadeAcertos = 0;
        if (!(listaSorteados.size() >= quantidadeMinimaSorteados && listaSorteados.size() <= quantidadeMaximoSorteados)){
            throw new IllegalAccessException("Quantidade de números sorteados fora do intervalo");
        }

        List<Integer> listaApostado = new ArrayList<>();
        for (Integer i: listaSorteados){
            int numeroApostado = new Random().nextInt(numeroMaximoSorteado) + 1;
            if (!listaApostado.contains(numeroApostado) && listaApostado.size() < quantidadeMaximaApostado) {
                listaApostado.add(numeroApostado);
            }
            if (listaApostado.contains(i)){
                quantidadeAcertos++;
            }
        }
        return quantidadeAcertos;
    }

    public double resultadoAposta(Integer quantidadeAcertos, double valor){

        if(quantidadeAcertos == 6){
            return valor;
        }
        else if(quantidadeAcertos == 5){
            return valor * porcentagemQuina;
        }
        else if (quantidadeAcertos == 4){
            return valor * porcentagemQuarta;
        }
        return 0.0;
    }

}