import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loginPage extends JDialog {
    private JPanel mainPanel;
    private JTextField Jname;
    private JTextField Jpass;
    private JButton Jbutton;
    private JButton cancelbtn;

    /*public loginPage(JPanel mainPanel) {
        this.mainPanel = mainPanel;
    }*/

    public loginPage() {
        setVisible(true);
        setTitle("Login page");
        setSize(300,300);
        setContentPane(mainPanel);
        Jbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginUser();
            }


        });
        cancelbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
    private void loginUser() {
        String name=Jname.getText();
        String pass=Jpass.getText();

        if(name.isEmpty()||pass.isEmpty()){
            JOptionPane.showMessageDialog(this,"all fields are required");
        }
    }
}
