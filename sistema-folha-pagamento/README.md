# 💼 Sistema de Folha de Pagamento

Este projeto foi desenvolvido em **Java** com o objetivo de praticar **programação orientada a objetos (POO)**, **métodos**, **encapsulamento** e **tratamento de dados** por meio da interação com o usuário.

O sistema simula o cálculo de salário líquido de funcionários a partir de informações inseridas pelo usuário, aplicando boas práticas de organização em classes e pacotes.

---

## 📚 **Objetivo do Projeto**

Criar um sistema que permita:
- Inserir dados de funcionários (nome, salário bruto e desconto);
- Calcular o **salário líquido** de cada funcionário;
- Exibir um relatório final com os resultados.

---

## 🧠 **Conceitos Aplicados**

- **Orientação a Objetos (POO)**  
  Uso de classes (`Financeiro`, `Relatorio`, `SistemaPagamento`) e métodos para modularizar o código.

- **Encapsulamento**  
  Utilização de atributos `private` e métodos `get`/`set` para proteger os dados das classes.

- **Métodos com retorno e sem retorno**  
  Aplicação de métodos `void` (para exibir relatórios) e métodos com retorno (`double`) para cálculos.

- **Tratamento de entrada de dados**  
  Utilização da classe `Scanner` para coletar informações do usuário.

- **Estrutura de Pacotes**
  Organização do projeto em dois pacotes:

src/
├── main/ → Contém a classe principal do sistema (SistemaPagamento)
└── metodos/ → Contém as classes auxiliares (Financeiro e Relatorio)


---

## ⚙️ **Estrutura do Projeto**

sistema-folha-pagamento/
├── src/
│ ├── main/
│ │ └── SistemaPagamento.java
│ └── metodos/
│ ├── Financeiro.java
│ └── Relatorio.java


---

## 🚀 **Como Executar o Programa**

1. Abra o projeto em sua **IDE Java** (como Eclipse ou IntelliJ).  
2. Certifique-se de que o arquivo principal (`SistemaPagamento.java`) está dentro do pacote `main`.  
3. Execute o método `main` da classe `SistemaPagamento`.  
4. O sistema solicitará as informações do funcionário:
Digite o nome do funcionário:
Digite o salário bruto:
Digite o desconto:
5. Após a entrada dos dados, será exibido um relatório como o exemplo abaixo:
===== RELATÓRIO FINAL =====
Nome: Samara | Salário Líquido: R$ 3600,00
Nome: Lucas | Salário Líquido: R$ 3200,00
===========================
