import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class haslo extends JFrame{
    private JPanel Jpanel;
    private JPasswordField formattedTextField1;
    private JPasswordField formattedTextField2;
    private JButton OKButton;

    public haslo() {
        super("Password");
        this.setContentPane(this.Jpanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a=new String(formattedTextField1.getPassword());
                String b=new String(formattedTextField2.getPassword());
                if(a.equals("codejava") && a.equals(b)) {JOptionPane.showMessageDialog(null, "Correct password");
                }else{JOptionPane.showMessageDialog(null, "Wrong password");}
            }
        });
    }
}
