package com.company.views;

import javax.swing.*;
import com.company.service.Book;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import com.company.views.SelectionView;




public class AddBook extends  JFrame {


    private String nome ;
    private int id ;
    private String autor;
    public int counter = 0;
    private int offset = 50;
    public Set<Book> livros = new HashSet<>();
    public final JFrame frame = new JFrame("Frame do livro");
    private final JTextField nomeLivro = new JTextField();
    private final JTextField idLivro = new JTextField();
    private final JTextField autorLivro = new JTextField();
    private final JLabel label = new JLabel("Informações do livro");
    private final JLabel nomeLiv = new JLabel("Nome:");
    private final JLabel idLiv = new JLabel("Id");
    private final JLabel autorLiv = new JLabel("Autor:");
    private final JButton addButton = new JButton("ADICIONAR");
    private final JButton backButton = new JButton("Voltar");
    private final JButton listButton = new JButton("Listar ");

    public AddBook(){
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(400, 355);
        frame.setLocation(900,300);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setLayout(null);

        label.setText("Informações do livro");
        label.setBounds(140, -40+offset, 180, 30);
        frame.add(label);

        nomeLiv.setText("Nome:");
        nomeLiv.setBounds(25, 10 + offset, 50, 30);
        frame.add(nomeLiv);

        autorLiv.setText("Autor:");
        autorLiv.setBounds(25 , 70 +offset, 50, 30);
        frame.add(autorLiv);

        idLiv.setText("ID:");
        idLiv.setBounds(25 , 130 +offset, 50, 30);
        frame.add(idLiv);

        nomeLivro.setBounds(80, 15+offset, 255, 30);
        frame.add(nomeLivro);

        autorLivro.setBounds(80, 75+offset, 255, 30);
        frame.add(autorLivro);


        idLivro.setBounds(80, 135+offset, 255, 30);
        frame.add(idLivro);


        addButton.setBounds(112, +(5*offset), 160, 40);
        frame.add(addButton);

        backButton.setBounds(10, 10+(5*offset), 90, 25);
        frame.add(backButton);

        listButton.setBounds(285, 10+(5*offset), 90, 25);
        frame.add(listButton);

        setBackButton();
        setAddButton();
        setListButton();
    }

    public void addBook(Book a){

        livros.add(a);

    }


    public void setAddButton() {
        addButton.addActionListener(event -> {
            try {

                this.nome = nomeLivro.getText();
                this.autor = autorLivro.getText();
                this.id = Integer.parseInt(idLivro.getText());

                Book a = new Book(nome,autor,id,300);

                addBook(a);


                JOptionPane.showMessageDialog(this,"LIVRO ADICIONADO COM SUCESSO!");



            } catch (Exception exception) {
                JOptionPane.showMessageDialog(this, exception.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    public void setBackButton() {
        backButton.addActionListener(event -> {
            try {
                this.frame.dispose();

            } catch (Exception exception) {
                JOptionPane.showMessageDialog(this, exception.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    public void setListButton() {
        listButton.addActionListener(event -> {
            try {
               String liv =  livros.toString();
                System.out.println(liv);

            } catch (Exception exception) {
                JOptionPane.showMessageDialog(this, exception.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        });
    }

}
