package com.company.views;

import javax.swing.*;

import com.company.data.DataBase;
import com.company.data.Magazine;

import java.awt.*;

public class MagazineView extends JFrame {
    private final JFrame frame = new JFrame("Revistas");
    private final JButton incluirButton = new JButton("Incluir");
    private final JButton bookButton = new JButton("Livros");
    private final JButton listagemButton = new JButton("Listagem");
    private final JLabel tipo = new JLabel("Revistas");
    private final JLabel titulo = new JLabel("Titulo");
    private final JTextField tituloField = new JTextField();
    private final JLabel org = new JLabel("Org");
    private final JTextField orgField = new JTextField();
    private final JLabel ano = new JLabel("Ano");
    private final JTextField anoField = new JTextField();
    private final JLabel nro = new JLabel("Nro:");
    private final JTextField nroField = new JTextField();
    private final JLabel Vol = new JLabel("Vol:");
    private final JTextField VolField = new JTextField();
    public DataBase database;

    public MagazineView(DataBase db){
        database = db;
        setFront();
        setListagemButton();
        setBookButton();
        setIncluirButton();

    }

    public void setFront(){
        frame.setVisible(true);
        frame.setResizable(false);

        frame.setSize(370, 300);
        frame.setLocation(900,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        tipo.setText("Revistas");
        tipo.setBounds(150,30,185,30);
        frame.add(tipo);

        titulo.setText("Titulo: ");
        titulo.setBounds(30,70,90,25);
        frame.add(titulo);

        tituloField.setBounds(70,70,200,25);
        frame.add(tituloField);

        org.setText("Org: ");
        org.setBounds(30,100,90,25);
        frame.add(org);

        orgField.setBounds(70,100,200,25);
        frame.add(orgField);

        ano.setText("Ano: ");
        ano.setBounds(30,130,90,25);
        frame.add(ano);

        anoField.setBounds(70,130,40,25);
        frame.add(anoField);


        nro.setText("Nro: ");
        nro.setBounds(115,130,90,25);
        frame.add(nro);

        nroField.setBounds(145,130,40,25);
        frame.add(nroField);


        Vol.setText("Vol: ");
        Vol.setBounds(190,130,90,25);
        frame.add(Vol);

        VolField.setBounds(220,130,40,25);
        frame.add(VolField);



        incluirButton.setBounds(30,200,90,30);
        frame.add(incluirButton);

        bookButton.setBounds(135,190,90,50);
        frame.add(bookButton);
        listagemButton.setBounds(240,200,90,30);
        frame.add(listagemButton);

        frame.setBackground(new Color(255,0,255));

    }

    public void setIncluirButton() {
        incluirButton.addActionListener(event -> {

           try {
                Magazine a = new Magazine(tituloField.getText(), Integer.parseInt(anoField.getText()), orgField.getText(),Integer.parseInt(VolField.getText()),Integer.parseInt(nroField.getText()));

                database.magazines.add(a); //adiciona o livro a ao banco de dados de livros

                JOptionPane.showMessageDialog(this, "REVISTA ADICIONADA COM SUCESSO!");
            }
           catch (Exception exception) {
                JOptionPane.showMessageDialog(this, "Algum campo está incorreto ou em branco!!", "Erro", JOptionPane.ERROR_MESSAGE);
            }

        });
    }

    public void setBookButton() {
        bookButton.addActionListener(event -> {

            try {
                frame.dispose();
                new BookView(database);
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
