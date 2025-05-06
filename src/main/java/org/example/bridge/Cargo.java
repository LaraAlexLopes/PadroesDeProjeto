package org.example.bridge;

public abstract class Cargo {
    protected TipoProcessoGanhoInterface tipoProcessoGanhoInterface;

    protected float salarioBase;

    public Cargo(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setTipoProcessoGanhoInterface(TipoProcessoGanhoInterface tipoProcessoGanhoInterface) {
        this.tipoProcessoGanhoInterface = tipoProcessoGanhoInterface;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract float calcularSalario();
}
