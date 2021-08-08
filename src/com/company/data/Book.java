package com.company.data;

public class Book extends Objeto{

    private final String autor;

    public Book(String name, String autor, Integer ano){
        super(name,ano);
        this.autor = autor;

    }

    @Override
    public String toString() {
        return "Livro: " + super.getName() + ", " + autor + ", " + super.getAno() +  '\n';
    }
}
