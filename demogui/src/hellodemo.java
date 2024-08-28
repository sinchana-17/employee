import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class hellodemo extends JFrame {
    private JTextField txtname;
    private JPanel Clickme;
    private JPanel MainPanel;
    private JButton button1;

    public hellodemo() {
        this.txtname = txtname;
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(button1,txtname.getText()+"Hello");
            }
        });
        }

    public static void main(String[] args) {
        hellodemo h = new hellodemo();
        h.setVisible(true);
        h.setSize(300,300);
        h.setContentPane(h.Clickme);
    }
}
