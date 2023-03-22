# Persistência e camadas

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

## Spring Data JPA e Hibernate

Hibernate: Pega entidades Java e monta queries SQL

JPA: Usa o hibernate para abstrair comandos em formato de banco de dados para métodos java

JPA: _Java Persistence API_

hibernate > JPA > Spring Data JPA

> é necessário importar a jpa + o conector do banco que será utilizado

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
@Repository
public interface SuperHeroRepository
  extends JpaRepository<SuperHero, Long> {
}
```

## Funcionamento Genérica da JPA

CRUD + algumas coisas:

- TEntity
- TKey

CREATE (criar um): `(TEntity) -> (TEntity)`
READ (pegar todos): `() -> List<TEntity>`
READ (pegar pela chave primaria): `(TKey) -> TEntity`
UPDATE (atualização por id): `(TKey, TEntity) -> TEntity`
UPDATE (atualização): `(TEntity) -> TEntity`
DELETE (deleção) : `(TKey) -> (boolean)`

- Ler sobre "Composition over inheritance"
- O java não permite herança múltipla: problema do diamante
