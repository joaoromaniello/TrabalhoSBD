package com.company.views;

import javax.swing.*;
import com.company.data.DataBase;
import com.company.data.Book;


public class BookView extends JFrame {

    private final  JFrame frame = new JFrame("Livros");
    private final  JButton incluirButton = new JButton("Incluir");
    private final  JButton revistaButton = new JButton("Revista");
    private final  JButton listagemButton = new JButton("Listagem");
    private final  JTextField tituloField = new JTextField();
    private final  JTextField autorField = new JTextField();
    private final  JTextField anoField = new JTextField();
    public DataBase database;

    public BookView(DataBase db){
        database = db;
        setFront();
        setIncluirButton();
        setListagemButton();
        setMagazineButton();
    }

    public void setFront(){
        JLabel tipo = new JLabel("Livros");
        JLabel titulo = new JLabel("Titulo");
        JLabel autor = new JLabel("Autor");
        JLabel ano = new JLabel("Ano");

        frame.setVisible(true);
        frame.setResizable(false);

        frame.setSize(370, 300);
        frame.setLocation(900,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        tipo.setText("Livros");
        tipo.setBounds(150,30,185,30);
        frame.add(tipo);

        titulo.setText("Titulo: ");
        titulo.setBounds(30,70,90,25);
        frame.add(titulo);

        tituloField.setBounds(70,70,200,25);
        frame.add(tituloField);

        autor.setText("Autor: ");
        autor.setBounds(30,100,90,25);
        frame.add(autor);

        autorField.setBounds(70,100,200,25);
        frame.add(autorField);

        ano.setText("Ano: ");
        ano.setBounds(30,130,90,25);
        frame.add(ano);

        anoField.setBounds(70,130,40,25);
        frame.add(anoField);

        incluirButton.setBounds(30,200,90,30);
        frame.add(incluirButton);

        revistaButton.setBounds(135,190,90,50);
        frame.add(revistaButton);

        listagemButton.setBounds(240,200,90,30);
        frame.add(listagemButton);

    }

    public void setIncluirButton() {
        incluirButton.addActionListener(event -> {

            try {
                Book a = new Book(tituloField.getText(), autorField.getText(), Integer.parseInt(anoField.getText()));

                database.books.add(a); //adiciona o livro a ao banco de dados de livros

                JOptionPane.showMessageDialog(this, "LIVRO ADICIONADO COM SUCESSO!");
            }
            catch (Exception exception) {
           JOptionPane.showMessageDialog(this, "Algum campo está incorreto ou em branco!!", "Erro", JOptionPane.ERROR_MESSAGE);
           }

        });
    }

    public void setMagazineButton() {
        revistaButton.addActionListener(event -> {

            try {
               frame.dispose();
                new MagazineView(database);
            }
            catch (Exception exception) {
                JOptionPane.showMessageDialog(this, "Algum campo está incorreto ou em branco!!", "Erro", JOptionPane.ERROR_MESSAGE);
            }

        });
    }

    public void setListagemButton() {
        listagemButton.addActionListener(event -> {
            try {
                new ListView(database);
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(this, exception.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        });
    }


}
