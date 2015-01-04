import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by blin on 2015/1/4.
 */
public class GUI2 {


    private JButton ClearBut;
    private JPanel panel1;
    private JButton SendBut;
    private JTextField tx1;
    private enum ButtonName {
        SendBut,ClearBut;
    }

    public GUI2() {


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
