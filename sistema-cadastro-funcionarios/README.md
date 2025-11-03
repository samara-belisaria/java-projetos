# 👩‍💼 Sistema de Cadastro de Funcionários

Este projeto foi desenvolvido em **Java** com o objetivo de praticar **Programação Orientada a Objetos (POO)**, **encapsulamento**, **métodos sobrecarregados**, **validação de atributos** e o uso de **listas dinâmicas (ArrayList)**.

O sistema permite cadastrar funcionários, armazenar seus dados e exibir relatórios completos com o salário líquido calculado automaticamente, aplicando boas práticas de modelagem e organização de código.

---

## 🎯 **Objetivo do Projeto**

Criar um sistema que:
- Permita cadastrar múltiplos funcionários via console;
- Armazene os dados em uma lista (`ArrayList`);
- Realize o cálculo do salário líquido com base no salário bruto e descontos;
- Valide as informações inseridas (por exemplo, não permitir salário negativo);
- Exiba um relatório final com todos os funcionários e seus respectivos salários.

---

## 🧩 **Conceitos Aplicados**

### 🔹 **Programação Orientada a Objetos (POO)**
- Utilização de classes (`Funcionario`, `Employee`, `Main`) e objetos para representar entidades do sistema.
- Aplicação de **encapsulamento** para proteger os atributos e expor apenas métodos controlados.

### 🔹 **Encapsulamento**
- Uso de atributos `private` com métodos `get` e `set` para acessar e modificar os dados de forma segura.

### 🔹 **Construtores**
- Implementação de **construtores completos** e **sobrecarga de construtores** para permitir diferentes formas de criar objetos.

### 🔹 **Validação de Atributos**
- Uso de `throw new IllegalArgumentException()` para impedir entrada de dados inválidos (ex.: salário ≤ 0, desconto > salário).

### 🔹 **Coleções**
- Utilização de `ArrayList<Employee>` para armazenar todos os funcionários cadastrados, simulando um banco de dados em memória.

### 🔹 **Laços de Repetição e Interação**
- Uso do `for` para percorrer e exibir os dados de cada funcionário, demonstrando como percorrer listas de objetos.

---

## 🧱 **Estrutura do Projeto**

sistema-cadastro-funcionarios/

├── src/

│ ├── main/

│ │ ├── Funcionario.java # Classe principal para interação com o usuário

│ │ ├── Employee.java # Classe que representa o funcionário com encapsulamento

│ │ └── Métodos auxiliares # Cálculo e exibição de dados

└── README.md # Documentação do projeto


---

## 🖥️ **Exemplo de Saída**

Quantos funcionários deseja cadastrar? 2

Digite o nome do funcionário: Samara

Digite o salário bruto: 4000

Digite o desconto: 400


Digite o nome do funcionário: Lucas

Digite o salário bruto: 3500

Digite o desconto: 300

===== RELATÓRIO FINAL =====

Nome: Samara | Salário Líquido: R$ 3600,00

Nome: Lucas | Salário Líquido: R$ 3200,00

===========================



---

## 🚀 **Aprendizados**
Durante o desenvolvimento deste projeto, pratiquei:
- Criação e manipulação de objetos em Java;
- Estruturação de código com boas práticas de POO;
- Validação de dados e tratamento de exceções;
- Uso de coleções (`ArrayList`);
- Organização modular e clara do código-fonte.

---

📌 **Status do Projeto:** Concluído ✅  
📅 **Linguagem:** Java ☕  
