## ✅ **Sistema de Tarefas – Java**

Exercício prático de POO – Classes, Objetos, Encapsulamento e ArrayList

Este projeto foi desenvolvido como parte dos meus estudos de Programação Orientada a Objetos (POO).
O objetivo era treinar criação de classes, manipulação de listas, busca, remoção, booleans e organização de código.

O sistema permite cadastrar, listar, buscar, concluir e remover tarefas através de um menu interativo.

Cada tarefa possui:

- Título

- Descrição

- Status (Concluída / Não concluída)

---


## 🎯 **Objetivos do exercício**

- Criar uma classe `Tarefa` com atributos privados

- Criar uma classe `ListaTarefas` para gerenciar todas as tarefas

- Trabalhar com:

    - boolean (`true` / `false`)

    - métodos (`adicionar`, `listar`, `buscar`, `remover`, `concluir`)

    - `ArrayList<Tarefa>`

- Utilizar polimorfismo básico (retorno de objetos)

- Treinar uso de `Scanner`

- Implementar um menu interativo usando `do-while`

- Exercitar lógica dentro dos métodos e no fluxo do sistema

---


## 🧱 **Tecnologias utilizadas**

- Java 

- Programação Orientada a Objetos

- ArrayList

- Encapsulamento (private + getters)

- Scanner

- Estruturas de repetição e condicionais

---


## 📁 **Estrutura do Projeto**
    src/
    ├── exercise/
    │    └── SistemaTarefas.java
    └── model/
      ├── Tarefa.java
      └── ListaTarefas.java

---


## 🧠 **Conceitos praticados**
### ✔️ Classe com métodos e atributos privados
```java
private String titulo;
private String descricao;
private boolean concluida = false;
```

### ✔️ Retorno booleano para validações
```java
public boolean removerTarefa(String titulo) {
    for (Tarefa t : tarefas) {
        if (t.getTitulo().equalsIgnoreCase(titulo)) {
            tarefas.remove(t);
            return true;
        }
    }
    return false;
}
```

### ✔️ Buscar e retornar um objeto
```java
public Tarefa buscarPorTitulo(String titulo) {
    for (Tarefa t : tarefas) {
        if (t.getTitulo().equalsIgnoreCase(titulo)) {
            return t;
        }
    }
    return null;
}
```

✔️ Exibição de dados da tarefa
```java
public void exibir() {
    String status = concluida ? "Concluída" : "Não concluída";
    System.out.println("Título: " + titulo);
    System.out.println("Descrição: " + descricao);
    System.out.println("Status: " + status);
}
```

---


## 💻 **Como o sistema funciona**

O usuário pode:

 1 - Cadastrar tarefa

 2 - Listar todas as tarefas

 3 - Buscar tarefa por título

 4 - Concluir tarefa
 
 5 - Remover tarefa

 6 - Sair

As tarefas são armazenadas em um `ArrayList<Tarefa>`.

O sistema usa métodos da classe `ListaTarefas` para organizar tudo.

---


## 📤 **Exemplo de saída**
```java
===== MENU =====
1 - Adicionar Tarefa
2 - Listar tarefas
3 - Buscar tarefa
4 - Concluir tarefa
5 - Remover Tarefa
0 - Sair
Escolha uma opção: 1

Digite o título da tarefa: Estudar Java
Digite a descrição dessa tarefa: Praticar POO
Tarefa adicionada!

===== MENU =====
2 - Listar tarefas
Título: Estudar Java
Descrição: Praticar POO
Status: Não concluída

===== MENU =====
4 - Concluir tarefa
Digite o título da tarefa: Estudar Java
Tarefa concluída com sucesso!
```

---


## 📚 **Aprendizados**

Este exercício ajudou a fixar:

- como manipular uma lista de objetos com ArrayList

- como usar boolean em métodos para indicar sucesso/erro

- como organizar responsabilidades entre classes (Tarefa × ListaTarefas)

- como procurar, remover e atualizar dados dentro de um ArrayList

- como estruturar um mini sistema realista com menu + Scanner

- lógica de fluxo usando if, else, return, loops e objetos

É um exercício excelente para consolidar POO + ArrayList + lógica de programação.
