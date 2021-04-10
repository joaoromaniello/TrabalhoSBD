package com.company.views;

import javax.swing.*;

public class AddBook {

    private int offset = 70;
    public final JFrame frame = new JFrame("Frame do livro");
    private final JTextField nomeLivro = new JTextField();
    private final JTextField idLivro = new JTextField();
    private final JTextField autorLivro = new JTextField();
    private final JLabel label = new JLabel("Informações do livro");
    private final JLabel nomeLiv = new JLabel("Nome:");
    private final JLabel idLiv = new JLabel("Id");
    private final JLabel autorLiv = new JLabel("Autor:");


    public AddBook(){
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(400, 355);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        label.setText("Informações do livro");
        label.setBounds(125, 20, 180, 30);
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


    }

}
