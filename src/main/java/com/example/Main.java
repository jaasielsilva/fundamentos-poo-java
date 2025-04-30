package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Funcionario> lista = new ArrayList<>();

        lista.add(new Gerente("Ana", 1000));
        lista.add(new Desenvolvedor("Lucas", 1000));
        lista.add(new Estagiario("João", 1000));

        for (Funcionario f : lista) {
           f.exibirDados();
           System.out.println("-----------------------");
        }
    }
}