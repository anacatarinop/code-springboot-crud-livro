# Spring Boot, MySQL, JPA, Hibernate Rest API

Aplicação utilizando Spring Boot, MySQL, JPA e Hibernate.
Esta API foi projetada para ser utilizada com a [Interface Gráfica Web para Gerenciamento de Livros](https://github.com/anacatarinop/code-web-interface-livro).

## Requisitos

1. Java - 1.8.x
2. Maven - 3.x.x
3. Mysql - 5.x.x

## Passos para o SETUP

**1. Crie o banco de dados no MySQL**
```bash
create database livraria
```

**2. Modifique o usuário e senha de acordo com a sua instalação**

+ abra `src/main/resources/application.properties`

+ modifique `spring.datasource.username` e `spring.datasource.password` de acordo com sua instalação

**3. Build e rode a aplicação usando MAVEN**

```bash
mvn package
java -jar target/crud-1.0.0.jar
```

Alternativamente, você pode rodar dessa forma -

```bash
mvn spring-boot:run
```

O app vai rodar nesse endereço <http://localhost:8080>.

Você pode testar as APIs utilizando o Postman 
