package com.example;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, double salarioBase) {
        super(nome, salarioBase);
        
    }
    @Override
    public double calcularSalario() {
        return getSalarioBase() * 1.10; // 10% de aumento 
    }    
}
