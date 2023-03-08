# É tipo assim

iniciando com uma linguagem....

## Calculadora

- 2 Entradas
- Operações/Operadores
- Processamento/Lógica
- Saídas

## Entrada e Saída

```java
  System.out.println("Hello World!");
```

leitor de entrada

```java
  Scanner leitor = new Scanner(System.in);
```

utilização:

```java
int estoque = leitor.nextInt();
```

## Caixinhas: Variáveis

|    tipo     |        sintaxe         |
| :---------: | :--------------------: |
|   inteiro   | `short`, `int`, `long` |
| com virgula |   `float`, `double`    |
|    texto    |    `char`, `String`    |
| verdadeiro  |   `byte`, `boolean`    |

> O que o char faz, o String faz melhor ~Carioca, Leo

```java
  int idade = 12;
  char confirma = 's';

  int caixaDeSapato = 3;
  var carro = (long)1;
  // ler depois: upcasting e downcasting

  caixaDeSapato = carro; // nao funciona
  carro = caixaDeSapato; // funciona

  var refrigerante = "200mL";

  // casting: aviso de troca
  System.out.println((int)confirma);
```

## Seleção

```java
if ( /*condição*/ ) {
  // executa se for verdade
} else {
  // executa se for falso
}
```

```java
boolean estaChovendo = true;
boolean estaLigadaTV = false;

if ( estaChovendo ) {
  estaLigadaTV = true;
}
```

"se esta chovendo, desligo tv. se esta sem chuva, saio de casa"

"se esta chovendo, desligo tv, senão, saio de casa"
