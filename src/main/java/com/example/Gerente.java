package com.example;

public class Gerente extends Funcionario {
    
    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }
    @Override
    public double calcularSalario() {
        return getSalarioBase() * 1.20; // 20% de aumento;
    }
}
