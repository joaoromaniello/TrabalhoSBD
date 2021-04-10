package com.company.service;

import java.util.Date;

public class Book {

    private String name;
    private String autor;
    private Integer id;
    private Integer qtd = 0;
    private Integer preco;


    public Book(String name, String autor, Integer id,Integer preco){

        this.name = name;
        this.autor = autor;
        this.id = id;
        this.qtd = this.qtd + 1;
        this.preco = preco;
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

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", autor='" + autor + '\'' +
                ", id=" + id +
                ", qtd=" + qtd +
                '}';
    }
}
