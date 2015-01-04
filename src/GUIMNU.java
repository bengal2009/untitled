import javax.swing.*;

/**
 * Created by blin on 2015/1/4.
 */
public class GUIMNU {
    private JPanel p1;
    private JToolBar JT1;
    private JButton button1;
    private JButton button2;

    public static void main(String[] args) {
        JFrame frame = new JFrame("GUIMNU");
        frame.setContentPane(new GUIMNU().p1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
