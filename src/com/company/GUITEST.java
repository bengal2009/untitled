package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by blin on 2014/12/31.
 */
public class GUITEST {
    private JPanel Panel1;
    private JButton button1;
    private JButton button2;
    private JLabel label1;


    public GUITEST() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label1.setText("1111");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GUITEST");
        frame.setContentPane(new GUITEST().Panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
