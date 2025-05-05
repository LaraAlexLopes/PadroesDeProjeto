package org.example.bridge;

public class AdvogadoJr extends Cargo{

    public AdvogadoJr(float salarioBase){
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase;
    }
}
