# Mais Orientado ainda

## Interfaces

- algo visual
- front
- navegador
- **GUI:** Interface Gráfica de Usuário
- interação entre lógica e visual
- Menu
- comunicação
- usuário

- contrato

```
Pneu
  | > PneuDeCarro
  | > PneuDeCaminhao
  | > PneuDeBicicleta
```

```java
public abstract class FiguraPlana {

  protected int qntdDeLados;
  protected Cor cor;

  // construtor(es)

  public int getQntdDeLados() {
    return qntdDeLados;
  }

  public void setCor(Cor cor) {
    this.cor = cor;
  }

  public cor getCor() {
    return cor;
  }

  public abstract double area();
  public abstract double perimetro();
}
```

```java
public Retangulo extends FiguraPlana {

  private double base;
  private double altura;

  // construtor(es)

  @Override
  public double area() {
    return base * altura;
  }

  @Override
  public double perimetro() {
    return 2*(base + altura);
  }
}
```

```java
public Circulo extends FiguraPlana {

  private static final double PI = 3.14159265;
  private double raio;

  // getPi ...
}
```

## Exception

Excessão vs. Erro:

excessão

- caso a parte
- pode acontecer
- delegada
- queremos tratar

erro:

- temos que corrigir
- falha
- compromete o funcionamento

```java
ArrayIndexOutOfBoundsException
DividedByZeroException
NullPointerException
InputMissmatchException
```

## Possibilidades

- Criadas
- Tratadas
- Delegadas

## Criar

```java
  Scanner teclado = new Scanner(System.in);
  int x = teclado.nextInt();
```
