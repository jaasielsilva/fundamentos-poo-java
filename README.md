
# Fundamentos de POO em Java ☕

Este projeto é um exemplo simples de aplicação dos **fundamentos da Programação Orientada a Objetos (POO)** utilizando a linguagem **Java**. Ele simula uma estrutura de funcionários com diferentes funções e formas de calcular o salário, demonstrando conceitos como **herança, abstração, polimorfismo e encapsulamento**.

---

## 🧱 Estrutura do Projeto

```
com.example/
├── Funcionario.java        // Classe abstrata base com regra comum
├── Gerente.java            // Subclasse de Funcionario
├── Desenvolvedor.java      // Subclasse de Funcionario
├── Estagiario.java         // Subclasse de Funcionario
└── Main.java               // Classe principal com execução do sistema
```

---

## 💡 Conceitos de POO Aplicados

- **Abstração**: A classe `Funcionario` é abstrata e define o método `calcularSalario()`, que é implementado pelas subclasses.
- **Herança**: `Gerente`, `Desenvolvedor` e `Estagiario` herdam de `Funcionario`.
- **Polimorfismo**: Todos os objetos são tratados como `Funcionario` e cada um implementa seu cálculo de forma diferente.
- **Encapsulamento**: Atributos privados com getters e setters.

---

## ▶️ Como Executar

1. Clone o repositório:
```bash
git clone https://github.com/jaasielsilva/fundamentos-poo-java.git
```

2. Entre na pasta do projeto:
```bash
cd fundamentos-poo-java
```

3. Compile e execute com sua IDE ou via terminal:
```bash
javac com/example/*.java
java com.example.Main
```

---

## 💻 Exemplo de Saída

```
Nome: Ana
Salário Base: 1000.0
Salário Total: 2000.0
-----------------------
Nome: Lucas
Salário Base: 1000.0
Salário Total: 1500.0
-----------------------
Nome: João
Salário Base: 1000.0
Salário Total: 1000.0
-----------------------
```

---

## 📚 Autor

Desenvolvido por **Jaasiel Silva**  
🔗 GitHub: [github.com/jaasielsilva](https://github.com/jaasielsilva)

---

## 📄 Licença

Este projeto está licenciado sob a Licença MIT.  
Sinta-se à vontade para usar, estudar e modificar este código.

---
