import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class register extends JDialog{
    private JPanel Mainpanel;
    private JTextField tname;
    private JTextField temail;
    private JTextField tmobile;
    private JTextField taddress;
    private JTextField tpassword;
    private JTextField tconfirm;
    private JButton submitButton;
    private JButton cancelButton;


    public register(JFrame parent) {
        super(parent);
        setVisible(true);
        setTitle("User Registration");
        setSize(300, 300);
        setContentPane(Mainpanel);


        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registerUser();
            }


        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
    private void registerUser() {
        String name= tname.getText();
        String email = temail.getText();
        String mobile = tmobile.getText();
        String address = taddress.getText();
        String password = String.valueOf(tpassword.getText());
        String Cpassword = String.valueOf(tconfirm.getText());
        if(name.isEmpty() || email.isEmpty() || mobile.isEmpty() || address.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(this,"all are mandatory","try again",JOptionPane.ERROR_MESSAGE);
            return;
    }
    if(!password.equals(Cpassword)){
        JOptionPane.showMessageDialog(this,"password and confirm should be same","mismatch",JOptionPane.ERROR_MESSAGE);
        return;
    }
    user = addUserToDatabase(name,email,mobile,address,password);
        if(user!=null)
        {
            dispose();
        }
        else {
            JOptionPane.showMessageDialog(this,"user failed to register","try again",JOptionPane.ERROR_MESSAGE);
        }
    }
    public User user;
    public User addUserToDatabase(String name, String email, String mobile,String address, String password) {
        User user= new User();
        String URL = "jdbc:postgresql://localhost:5432/registration";
       // String USERNAME = "cmrit";
        //String PASSWORD="cmrit";
        try{
            Connection con = DriverManager.getConnection(URL,"postgres","cmrit");
            Statement st = con.createStatement();
            String sql = "insert into users(name,email,mobile,address,password)"+"Values(?,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,name);
            ps.setString(2,email);
            ps.setString(3,mobile);
            ps.setString(4,address);
            ps.setString(5,password);
            int addedrows = ps.executeUpdate();
            if(addedrows>0){
                user.name = name;
                user.email = email;
                user.mobile=mobile;
                user.address = address;
                user.password = password;
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return user;
    }

    public static void main(String[] args) {
        register r = new register(null);
        User user= r.user;
        if(user!=null){
            System.out.println("registration successfull");
        }
        else{
            System.out.println("failed");
        }
    }

}
