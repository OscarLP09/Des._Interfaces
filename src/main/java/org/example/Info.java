package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Info extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JLabel Title;
    private JLabel Platform;
    private JLabel Year;

    public Info() {
        setContentPane(contentPane);
        setModal(true); // hace que no pueda pulsar fuera de la ventana
        getRootPane().setDefaultButton(buttonOK); // si le damos al ENTER, realiza el OK
        pack();

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });
    }

    private void onOK() {
        // add your code here
        dispose();// cierra la ventana
    }

}
