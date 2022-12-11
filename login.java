import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class login extends JFrame{
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton button1;
    private JPanel Jpanel;
    private JLabel label;

    public login() {
        this.setContentPane(this.Jpanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String a="Username: "+textField1.getText()+", Password: "+ new String(passwordField1.getPassword());
            label.setText(a);
            }
        });
    }
}
