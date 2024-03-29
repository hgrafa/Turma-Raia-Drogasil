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

## JDBC (Java DataBase Connector)

### DAO (Data Acesss Object)

Objeto de acesso a dados

### Exemplo

```java
@Getter @Setter
public class SuperHero {

  private Long id;
  private String name;
  private String realName;
  private String power;

}
```

```java
public interface SuperHeroDAO { // CRUD

  List<SuperHero> getAllSuperHeroes();
  SuperHero getHeroByName(String name);
  List<SuperHero> getHeroesByPower(String power);

}
```

```java
public class SuperHeroDaoImpl implements SuperHeroDao {

  private String tableName = "superheroes";

  public List<SuperHero> getAllSuperHeroes() {
    String query = "SELECT * FROM " + tableName;
  }

  public SuperHero getHeroByName(String name) {
    String query = "SELECT * FROM "
        + tableName + " WHERE "
        + tablename + ".name={0}"
  }

}
```

```java
public class MyDbConnection {

}
```

## JPA: _Java Persistence API_

Inicio da persistência no Java de forma mais prática.

Utiliza o **Hibernate** por baixo dos panos, que por sua vez transforma modelos (classes Java) em linhas de código SQL.

JPA: Especifica uma espécie de CRUD em cima do hibernate.

```java
@Entity
@Table(value = "superheroes")
@Getter @Setter
public class SuperHero {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable=false)
  private String name;

  private String realName;

  @Column(nullable=false)
  private String power;

}
```

```java
public static void main(String[] args) {
  EntityManagerFactory factory = Persist.createEntityManagerFactory("persistenceunit");
  EntityManager em = factory.createEntityManager();
  SuperHero s1 = new SuperHero("IronMan", "Tony Starck", "Intelligence and Richness");
  em.persist(s1);
}
```
