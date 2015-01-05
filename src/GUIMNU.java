import com.company.DiaTest;
import com.company.GUITEST;
import sun.util.calendar.BaseCalendar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;

import java.net.URL;
import java.sql.Date;

/**
 * Created by blin on 2015/1/4.
 */



public class GUIMNU {
    private JPanel p1;
    private JToolBar JT1;
    private JButton button1;
    private JButton button2;
    private  JLabel lb1;
    //--------------------------------
   static BufferedImage image;               // the rasterized image
    static  int width, height;
    static String filename;

    public GUIMNU() {
        ImageIcon yy= new ImageIcon("c:\\email.png");
        lb1.setIcon(yy);
        width=yy.getIconWidth();
        height=yy.getIconHeight();
        p1.setPreferredSize(new Dimension(width+50,height+50));

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == button1) {
                    GUI2 t2 = new GUI2();
                    t2.main(null);
                    GUITEST t3 = new GUITEST();
                    t3.main(null);
                    DiaTest t1 = new DiaTest();
                    DiaTest.main(null);


                }
            }
        });
    }





    public static void main(String[] args) {
        JFrame frame = new JFrame("GUIMNU");
        frame.setContentPane(new GUIMNU().p1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        //lb1.setIcon(new ImageIcon("c:\\email.png"));
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
