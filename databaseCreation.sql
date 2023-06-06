-- Criação do banco de dados
CREATE DATABASE livraria;

-- Utiliza o banco de dados criado
USE livraria;
CREATE TABLE livro (
                        id VARCHAR(36) PRIMARY KEY,
                        titulo VARCHAR(200) NOT NULL,
                        autor VARCHAR(200) NOT NULL,
                        editora VARCHAR(200) NOT NULL,
                        ano INT NOT NULL,
                        preco DECIMAL(10, 2) NOT NULL
);