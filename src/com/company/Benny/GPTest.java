package com.company.Benny;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.*;

/**
 * Created by blin on 2014/12/23.
 */
class CGFrame extends JFrame {
    JButton btnShow;
    JButton btnCls;

    CGFrame() {

//        btnShow = new JButton("呈現");
//        btnShow.setBounds(25, 80, 70, 20);
//        add(btnShow);

        CGPanel pane = new CGPanel();
        pane.setBounds(20, 20, 200, 200);
        add(pane);


        setTitle("JFrame畫布");
        setBounds(100, 100, 520, 550);
//        setBorder(BorderFactory.createLineBorder(Color.red));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
class CGPanel extends JPanel {
    public void paintComponent(Graphics g) {
        ImageIcon icon = new ImageIcon("c:\\email.pngf");
        Image img = icon.getImage();
        g.drawImage(img, 0, 0, this);
    }
}

public class GPTest {
    public void paint(Graphics g){
        g.drawString("大家來學 Java2 !", 50, 70);

        System.out.println("Graphics...");
    }





    public void  teststart(){


        CGFrame frame = new CGFrame();
        // paint(frame.getGraphics());





    }
}
