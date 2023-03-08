## Função e método

**gostei:**

- retorna algo
- o que faz
- processamento
- procedimento
- realização
- instruções
- entrada

- f(x) = x + 2
- f(3) = 3 + 2
- somar(2, 3) => 5
- baskara(a, b, c) = ...
- mmc(12, 9), mdc(12, 9)
- pagarAlugel(valor, mes) => {verifica...valida...transfere...pago!}

**fazem sentido:**

- iguais
- condição
- parametro/argumento

**depois:**

- privado
- objeto

## Função no Java

```java
double somar(double a, double b) {
  return a + b;
}

public static void main(String[] args) {
  double a = 2, b = 3;

  double resultado1 = a + b;
  double resultado2 = somar(a, b);
}
```

## Motivações

- Reuso
- legibidade

# Repetição (loops)

- Fazer de novo
- circulo/roda gigante
- Reuso
- Economia de tempo

## Motivação

- Economia de tempo

## While (_enquanto_)

> enquanto não parar a chuva: vai ligar

```java
while ( !chuvaParar ) { //uoio
  System.out.println("fico em casa");
}
```

# Tipo dos **Tipos**

- Array
- Vetor

> O vetor é um bloco contíguo alocado na memória

```java
String[] turmas = {"RD", "IfoodCoders", "ResiliaSharps"};

double[] notas = new double[10000];
String[] nomes = new String[10000];
int[] idades = new int[10000];

notas[3] = 9.0;
System.out.println(notas[3]);
```

> Vetores começam a contar a partir do zero

## Desvantagens/Reclamações

- tamanho fixo (_a princípio_)
- vetor não tem tantos recursos/métodos
