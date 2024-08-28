import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Integer.parseInt;

public class GUIApp {
    public static void main(String[] args) {
        demo obj = new demo();
    }
}

class demo extends JFrame
{
    JTextField t1;
    JTextField t2;
    JButton b;
    JButton b1;
    JLabel l;
    public demo()
    {
        t1=new JTextField(20);
        t2=new JTextField(20);
        b=new JButton("add");
        b1= new JButton("Subtract");
        l=new JLabel("result");

        add(t1);
        add(t2);
        add(b);
        add(l);
        add(b1);

        ActionListener al;

        b.addActionListener(e ->
                {
                    int num1 = parseInt(t1.getText());
                    int num2 = parseInt(t2.getText());
                    int value = num1+num2;
                    int sub = num1-num2;
                    l.setText(value+"");
                    l.setText(sub+"");
                }
        );
                b1.addActionListener(e ->
                {
                    int num1 = parseInt(t1.getText());
                    int num2 = parseInt(t2.getText());

                    int sub = num1-num2;

                    l.setText(sub+"");
                }
        );

        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
    }

}