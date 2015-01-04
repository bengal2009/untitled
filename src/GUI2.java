import javax.swing.*;

/**
 * Created by blin on 2015/1/4.
 */
public class GUI2 {


    private JButton button1;
    private JPanel panel1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("This is a Test");
        frame.setLocation(100,100);
        frame.setSize(400,400);
        frame.setContentPane(new GUI2().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
