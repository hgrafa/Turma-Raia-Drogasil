# Spring boot

## Servidores

- O servidor entrega recursos
- Recursos: uma base de dados, uma REST API

## API

- dados que podem ser acessados
- acessa os dados
- reduz trabalho: serviço
- trabalho multiplo (threads)

## Copy Constructor

```java
public class Robot {

  private String name;
  private int age;

  public Robot(String name, int age) {
      this.name = name;
      this.age = age;
  }

  public Robot(Robot other) {
      this.name = other.name;
      this.age = other.age;
  }
}
```

## Spring Data JPA e Hibernate

Hibernate: Pega entidades Java e monta queries SQL

JPA: Usa o hibernate para abstrair comandos em formato de banco de dados para métodos java

JPA: _Java Persistence API_

hibernate > JPA > Spring Data JPA

> é necessário importar a jpa + o conector do banco que será utilizado

```java
@Entity
public class Robot {

  private String name;
  private int age;
}
```
