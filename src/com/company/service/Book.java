package com.company.service;

public class Book {

    private String name;
    private String autor;
    private Integer id;
    private Integer qtd = 0;



    public Book(String name, String autor, Integer id){

        this.name = name;
        this.autor = autor;
        this.id = id;
        this.qtd = this.qtd++;

    }

    public String getName() {
        return name;
    }

    public String getAutor() {
        return autor;
    }

    public Integer getId() {
        return id;
    }
}
