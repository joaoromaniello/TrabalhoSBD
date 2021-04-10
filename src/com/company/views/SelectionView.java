package com.company.views;

import javax.swing.*;

import com.company.views.ClientView;
import com.company.views.EmpView;

public class SelectionView extends JFrame {
    private final  JFrame frame = new JFrame("Biblioteca virtual");
    private final  JButton emplButton = new JButton("FUNCIONARIO");
    private final  JButton clientButton = new JButton("CLIENTE");
    private final JLabel tipo = new JLabel("NOME:");



    public SelectionView(){

        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(300, 175);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        tipo.setText("Selecione um ambiente ");
        tipo.setBounds(75,10,155,30);
        frame.add(tipo);

        emplButton.setBorder(BorderFactory.createEtchedBorder());
        emplButton.setBounds(10,50,130,50);
        frame.add(emplButton);

        clientButton.setBorder(BorderFactory.createEtchedBorder());
        clientButton.setBounds(150,50,130,50);
        frame.add(clientButton);
        setClientButton();
        setEmplButton();


    }

    public void setClientButton() {
        clientButton.addActionListener(event -> {
            try {
                 ClientView a = new ClientView();
                 a.frame.setVisible(true);

            } catch (Exception exception) {
                JOptionPane.showMessageDialog(this.frame, exception.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    public void setEmplButton() {
        emplButton.addActionListener(event -> {
            try {
                EmpView b = new EmpView();
                b.frame2.setVisible(true);

            } catch (Exception exception) {
                JOptionPane.showMessageDialog(this.frame, exception.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        });
    }


}
