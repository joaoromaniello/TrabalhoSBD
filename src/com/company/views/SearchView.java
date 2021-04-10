package com.company.views;

import javax.swing.*;
import java.awt.*;




public class SearchView  extends  JFrame{

    private final   JPanel  busca = new JPanel();
    private final  JFrame frame = new JFrame("Biblioteca virtual");
    private final  JButton searchButton = new JButton("Buscar");
    private final  JButton changeButton = new JButton("Mudar");
    private final JLabel label = new JLabel("NOME:");
    private final JTextField campoPesquisar = new JTextField();


    public SearchView(){

        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(400, 355);
        frame.setLocation(900,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        label.setText("Nome:");
        label.setBounds(30,10,55,30);
        frame.add(label);

        campoPesquisar.setBounds(75, 15, 280, 20);
        frame.add(campoPesquisar);

        busca.setBounds(15,50,360,200);
        busca.setBorder(BorderFactory.createLineBorder(new Color(255,0,0)));
        busca.setBackground(new Color(255,255,255));
        frame.add(busca);

        searchButton.setBounds(20,260,350,50);
        frame.add(searchButton);



    }



}
