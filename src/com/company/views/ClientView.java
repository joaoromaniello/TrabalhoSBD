package com.company.views;

import javax.swing.*;
import java.awt.*;


//AREA DO CLIENTE

public class ClientView extends JFrame {

    public int offset = 130;
    public final  JFrame frame = new JFrame("Ambiente");
    private final  JButton buyButton = new JButton("Comprar um livro");
    private final  JButton rentButton = new JButton("Alugar um livro");
    private final  JButton sellButton = new JButton("Vender um livro");
    private final JButton removeButton = new JButton("Remover um livro");
    private final JButton addButton = new JButton("Adicionar um livro");
    private final JLabel label = new JLabel("O QUE VOCÊ DESEJA FAZER?");


    ClientView() {
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(400, 355);
        frame.setLocation(900,300);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setLayout(null);

        label.setText("O QUE VOCÊ DESEJA FAZER?");
        label.setBounds(100, 20, 180, 30);
        frame.add(label);

        sellButton.setBounds(20, 320 - offset, 350, 50);
        frame.add(sellButton);


        rentButton.setBounds(20, 260 - offset, 350, 50);
        frame.add(rentButton);

        buyButton.setBounds(20, 200 - offset, 350, 50);
        frame.add(buyButton);


    }


}
