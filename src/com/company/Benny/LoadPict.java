package com.company.Benny;

/**
 * Created by blin on 2014/12/25.
 */
import java.awt.*;
import javax.swing.*;

class CGFrame1 extends JFrame {
    CGFrame1() {
        CGPanel pane = new CGPanel();
        pane.setBounds(20, 20, 300, 200);
        add(pane);

        setTitle("顯示影像");
        setLayout(null);
        setBounds(50, 50, 440, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    class CGPanel extends JPanel {
        public void paintComponent(Graphics g) {
            ImageIcon icon = new ImageIcon("c:\\email.png");
            Image img = icon.getImage();
            g.drawImage(img, 0, 0, this);
            g.drawString("Test",10,10);
        }
    }
}

public class LoadPict {
    CGFrame1 frame = new CGFrame1();
}
