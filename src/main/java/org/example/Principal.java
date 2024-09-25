package org.example;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;

public class Principal extends JFrame{
    private JPanel panel1;
    private JTable table1;
    private JButton button1;

    private DefaultTableModel model;

    public Principal(){
        String[] cabecera = {"Titulo", "Plataforma", "Año"};
        model = new DefaultTableModel(cabecera, 0);
        table1.setModel(model);

        for(Game g : Data.games){
            Object[] row = { g.getTitle(), g.getPlatform(), g.getYear() };
            model.addRow(row);
        }

        setContentPane(panel1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Principal Demo");
        pack();

        button1.addActionListener((ActionEvent e)->{

        });
    }
}
