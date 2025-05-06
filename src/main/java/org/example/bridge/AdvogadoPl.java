package org.example.bridge;

public class AdvogadoPl extends Cargo{

    public AdvogadoPl(float salarioBase){
        super(salarioBase);
    }
    public float calcularSalario() {
        return this.salarioBase * (1 + this.tipoProcessoGanhoInterface.percentualAumento());
    }
}
