## 📬 **Sistema de Notificações – Java**

Exercício prático de POO – Herança, Polimorfismo e Classes Abstratas

Este projeto foi desenvolvido como parte dos meus estudos de Programação Orientada a Objetos.
O objetivo era praticar herança, polimorfismo, classes abstratas e o uso de ArrayList para armazenar diferentes tipos de objetos.

O sistema simula o envio de notificações por três canais:

Email

SMS

Push (notificação tipo app)

Cada tipo de notificação implementa sua própria forma de envio.

---


## 🎯 **Objetivos do exercício**

- Criar uma classe abstrata `Notificacao`

- Criar 3 classes filhas (Email, Sms e Push)

- Usar polimorfismo para armazenar objetos diferentes na mesma lista

- Enviar todas as notificações de uma vez com `n.enviar()`

- Utilizar menu com `Scanner`

- Trabalhar com sobreposição de métodos (`@Override`)

---


## **🏗️ Tecnologias utilizadas**

- Java 

- Programação Orientada a Objetos

- `ArrayList`

- `Scanner`

- Polimorfismo

- Classes abstratas

---


## 📌 **Estrutura do Projeto**
     ├── src/

     ├── exercise/
     │   └── SistemaNotificacoes.java
     └── model/
      ├── Notificacao.java       (classe mãe abstrata)
      ├── Email.java
      ├── Sms.java
      └── Push.java


--- 


## **Conceitos praticados**
### ✔️ Classe abstrata
```java
public abstract class Notificacao {
    private String mensagem;
    private String destinatario;

    public abstract void enviar();
}
```

### ✔️ Polimorfismo
```java
ArrayList<Notificacao> lista = new ArrayList<>();

Notificacao n = new Email("Olá!", "samara@gmail.com");
lista.add(n);
```

### ✔️ Sobrescrita de método
```java
@Override
public void enviar() {
    System.out.println("Enviando EMAIL para " + getDestinatario());
}
```

## 💻 **Como o sistema funciona**

O usuário pode:

1 - Cadastrar notificação por Email

2 - Cadastrar notificação por SMS

3 - Cadastrar notificação por Push

4 - Enviar todas as notificações

0 - Sair

As notificações ficam armazenadas em um ArrayList<Notificacao>.

Quando o usuário escolhe 4, todas são enviadas usando polimorfismo:

```java
for (Notificacao n : lista) {
    n.enviar();
}
```

## 📤 **Exemplo de saída**
```java
===== SISTEMA DE NOTIFICAÇÕES =====
1 - Cadastrar notificação por EMAIL
2 - Cadastrar notificação por SMS
3 - Cadastrar notificação por PUSH
4 - Enviar todas as notificações
0 - Sair

Enviando EMAIL para samara@gmail.com: Seu pedido foi aprovado!
Enviando SMS para 11999998888: Código de acesso: 123456
Enviando PUSH para usuario_samara: Você ganhou um cupom!
```

## **📚 Aprendizados**

Esse exercício me ajudou a entender:

- Como polimorfismo funciona na prática

- Como armazenar objetos diferentes no mesmo ArrayList

- Como classes filhas sobrescrevem métodos da classe mãe

- Como estruturar um mini-sistema com menu e Scanner

É um dos projetos que mais me ajudou a fixar herança + polimorfismo.
