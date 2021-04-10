package com.company.views;

import javax.swing.*;
public class EmpView extends JFrame{

    public int offset = 130;
    public final JFrame frame2 = new JFrame("Ambiente");
    private final JButton removeButton = new JButton("Remover um livro");
    private final JButton addButton = new JButton("Adicionar um livro");
    private final JLabel label = new JLabel("O QUE VOCÊ DESEJA FAZER?");


    EmpView(){
        frame2.setVisible(true);
        frame2.setResizable(false);
        frame2.setSize(400, 355);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setLayout(null);

        label.setText("O QUE VOCÊ DESEJA FAZER?");
        label.setBounds(100, 20, 180, 30);
        frame2.add(label);

        addButton.setBounds(20, 320 - offset, 350, 50);
        frame2.add(addButton);

        removeButton.setBounds(20, 260 - offset, 350, 50);
        frame2.add(removeButton);

        setAddButton();
        setRemoveButton();

    }

    public void setAddButton() {
        addButton.addActionListener(event -> {
            try {
                 AddBook a = new AddBook();
                 a.frame.setVisible(true);

            } catch (Exception exception) {
                JOptionPane.showMessageDialog(this, exception.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    public void setRemoveButton() {
        removeButton.addActionListener(event -> {
            try {
                //TODO

            } catch (Exception exception) {
                JOptionPane.showMessageDialog(this, exception.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        });
    }

}
