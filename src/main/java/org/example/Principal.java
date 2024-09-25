package org.example;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
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
        setLocationRelativeTo(null); // Centramos la ventana

        table1.getSelectionModel().addListSelectionListener(
            (ListSelectionEvent e) -> {
                if(!e.getValueIsAdjusting()) return;
                    System.out.println(table1.getSelectedRow());
                    var title = model.getValueAt(table1.getSelectedRow(), 0).toString();
                    var platform = model.getValueAt(table1.getSelectedRow(), 1).toString();
                    var year = (Integer) model.getValueAt(table1.getSelectedRow(), 2);

                System.out.println(title + " " + platform + " " + year);

                Session.gameSelected = new Game (title,platform,year);

                var info = new Info();
                info.setVisible(true);
            }
        );

        button1.addActionListener((ActionEvent e)->{

        });
    }
}
