package org.example.bridge;

public class AdvogadoSr extends Cargo{

    public AdvogadoSr(float salarioBase) {
        super(salarioBase);
    };

    public float calcularSalario() {
        return this.salarioBase * (2 + this.tipoProcessoGanhoInterface.percentualAumento());
    }
}
