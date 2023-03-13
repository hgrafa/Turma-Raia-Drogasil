# Ainda mais Orientado

## Construtores

```java
class Pessoa {
  // tem
  String nome;
  int idade;
  double altura;
  String telefone;

  Pessoa (String nome, int idade, double altura) {
    this.nome = nome;
    this.idade = idade;
    this.altura = altura;
  }
}
```

```java
Pessoa pedro = new Pessoa("Pedro da Silva", 21, 1.8);


pedro.idade = -10;
```

## palavra-chave (keyword) `this`

A palavra `this` faz referência na maioria das vezes ao objeto que chamou a método ou faz referência a própria método.

## Sobrecarga de construtores

- muitas intruções
- tarefas excessivas

```java
class Pessoa {
  // tem
  String nome;
  int idade;
  double altura;
  String telefone;

  Pessoa (String nome, int idade, double altura) {
    this.nome = nome;
    this.idade = idade;
    this.altura = altura;
  }

  Pessoa (String nome, int idade, double altura, String telefone) {
    this.nome = nome;
    this.idade = idade;
    this.altura = altura;
    this.telefone = telefone;
  } // construtor de String, int, double, String

}
```

```java
Pessoa pedro = new Pessoa("Pedro da Silva", 21, 1.8);
Pessoa maria = new Pessoa("Maria Beatriz", 22, 1.7, "(11) 92222-3333");

pedro.idade = -10;
```

## Sobrecarga de métodos

```java
void dizerOi() {
  System.out.println("oi");
}

void dizerOi(String nome) {
  System.out.println("oi, " + nome);
}

// String dizerOi(String nome) {
//   System.out.println("olá, " + nome);
//   return "está dito";
// } // NÃO PODE

double somar(double a, double b) {
  return a + b;
}

double somar(double a, double b, double c) {
  return a + b + c;
}
```

## Encapsulamento
