package com.example.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.UUID;


@Entity
public class Livro {

    @Id
    @GeneratedValue
    @Column(name="id")
    private UUID id;
    @Column(name="titulo")
    private String titulo;
    @Column(name="autor")
    private String autor;
    @Column(name="editora")
    private String editora;
    @Column(name="ano")
    private int ano;
    @Column(name="preco")
    private BigDecimal preco;

    // Construtores, getters e setters

    public Livro() {
    }

    public Livro(String titulo, String autor, String editora, int ano, BigDecimal preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.ano = ano;
        this.preco = preco;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
}