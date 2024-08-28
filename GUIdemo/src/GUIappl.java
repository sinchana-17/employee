import javax.swing.*;
import java.awt.*;

public class GUIappl {
    public static void main(String[] args) {
        demo1 obj = new demo1();
    }
}
class demo1 extends JFrame {
    JTextField t1,t2;
    JButton b;
    JLabel l;
    public demo1(){
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        b = new JButton("add");
        l= new JLabel("result");
        add(t1);
        add(t2);
        add(b);
        add(l);

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
