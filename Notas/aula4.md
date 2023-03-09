# Recap

## Matrizes (quadriculado)

outros nomes:

- array 2d
- vetor 2d
- vetor de vetor

```java
String[] categorias = {"preto" , "vermelho", "branco"}

var inteiros = {{1, 2, 3},
                {3, 4, 5},
                {6, 7, 8}};

// [0, 0] = 1 [0, 1] = 2 [0, 2] = 3
// [1, 0] = 3 [1, 1] = 4 [1, 2] = 5
// [2, 0] = 6 [2, 1] = 7 [2, 2] = 8

System.out.println(inteiros[2][1]); // 7
```

## array 3D

> situação em um calendário

```java
  ["fevereiro"]["quarta"][3]
```

```java
  int[][] matriz = new int[10][10];
```

## Repetição

1 -> 5

- acrescentar 1
- chegar no objetivo
- da onde sai

### Pilares

- inicialização
- verificação
- atualização

```java
boolean estaChovendo = true;

while(estaChovendo) {
  // ... faço algo
}
```

```java
int numero = 0;// inicialização

while(numero <= 5) { // verificação
  System.out.println(numero);


  numero++; // atualização
}
```

## for (_para_)

```java
for(/*iniciacilização*/; /*verificação*/; /*atualização*/) {

}
```

```java
for(int numero = 0; numero <= 5; numero++) {
  System.out.println(numero);
}
```

# POO: Programação Orientada a Objetos

```java
//aluno
int posicaoUltimoAluno;
double[] notas = new double[10000];
String[] nomes = new String[10000];
int[] idades = new int[10000];
```

## Motivação

Como eu troco duas variáveis?

```java
int a = 2, b = 3; // a = 2 | b = 3
int aux = a; // a = 2 | b = 3 | aux = 2
a = b; // a = 3 | b = 3 | aux = 2
b = aux; // a = 3 | b = 2 | aux = 2
```

Problema motivador: Como eu troco 2 alunos?

- eu teria dificuldade em trocar 2 alunos, teria dificuldade em adicionar atributos a estes alunos(outro vetor) e dificuldade de identificar os tipos.

## Solução Orientada a Objetos

Pessoa: molde, classificação, classe
joão: fruto do molde, objeto

```java
class Cachorro {
  // tem: atributos
  String nome;
  int idade;
  String raca;

  // faz: método
  void fazerAniversario() {
    idade++;
  }
}

public class Orientacao {
  public static void main(String[] args) {

    Cachorro cachorroQuePertenceAoVinicius = new Cachorro();

    cachorroQuePertenceAoVinicius.nome = "big thor";
    cachorroQuePertenceAoVinicius.idade = 3;
    cachorroQuePertenceAoVinicius.raca = "Shitsu";

    System.out.println("Idade = " + cachorroQuePertenceAoVinicius.idade);
    cachorroQuePertenceAoVinicius.fazerAniversario();
    System.out.println("Idade = " + cachorroQuePertenceAoVinicius.idade);
  }
}
```
