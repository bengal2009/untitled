import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by blin on 2015/1/4.
 */
public class GUI2 {


    private JButton ClearBut;
    private JPanel panel1;
    private JButton SendBut;
    private JTextField tx1;
    private JLabel label1;

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    private enum ButtonName {
        SendBut,ClearBut;
    }

    public GUI2() {

            label1.setIcon(new ImageIcon("c:\\email.png"));
        SendBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

//                ButtonName fruit = ButtonName.valueOf(e.getSource().toString());
                /*switch (fruit){
                    case SendBut:
                        break;
                }*/
                if (e.getSource()==SendBut)
                        tx1.setText("11111111111");
            }
        });
        ClearBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==ClearBut)
                    tx1.setText("");
            }
        });
        panel1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int posx=label1.getX();
                int posy=label1.getY();
                super.keyPressed(e);
                switch (e.getKeyCode()){
                    case KeyEvent.VK_LEFT:
                        System.out.println("Test");
                        break;

                }
            }
        });

    }

    public static void main(String[] args) {


        JFrame frame = new JFrame("This is a Test");
        frame.setLocation(100, 100);
        frame.setSize(400, 400);
        frame.setContentPane(new GUI2().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }


}
