import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class demo {
    private JTextField text;
    private JButton clickmeButton;
    private static JPanel Mainpanel;

    public demo(JTextField text) {
        this.text = text;

        clickmeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(clickmeButton,text.getText()+"Hello");
            }
        });
    }
    public static void main(String args[])
    {
        hellodemo h=new hellodemo();
        h.setVisible(true);
        h.setSize(300,300);
        h.setContentPane(Mainpanel);

    }
}







