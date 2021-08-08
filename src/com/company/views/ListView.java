package com.company.views;

import com.company.data.DataBase;

import javax.swing.*;
import java.awt.*;


public class ListView extends  JFrame{

    JTextField textField ;
    public DataBase database;

    public ListView(DataBase db){
        database = db;
        setFront();


    }

    public void setFront(){
        textField = new JTextField(database.toString());
        this.setVisible(true);
        this.setResizable(false);

        this.setSize(500, 300);
        this.setLocation(900,300);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(null);


        JScrollPane listPane = new JScrollPane(buildTextArea(database.toString()));
        listPane.setBounds(10, 15, 465, 230);
        add(listPane);


    }

    public JTextArea buildTextArea(String text) {
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setText(text);
        textArea.setWrapStyleWord(true);
        textArea.setBorder(BorderFactory.createBevelBorder(1));
        textArea.setFont(new Font("", Font.PLAIN, 15));
        textArea.setCaretPosition(0);

        return textArea;
    }

}
