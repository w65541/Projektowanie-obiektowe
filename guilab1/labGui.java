import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class labGui extends JFrame{
    private javax.swing.JPanel Jpanel;
    private JFormattedTextField formattedTextField1;
    private JLabel textField1;
    private JButton cFButton;


    public labGui() {
        super("CnaF");
        this.setContentPane(this.Jpanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        cFButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = formattedTextField1.getText();
                try{
                    double n = Double.parseDouble(s);
                    n=(n*1.8)+32.0;
                    s=Double.toString(n);
                }
                catch (NumberFormatException ex){
                    s="0";
                }
                textField1.setText(s);
            }
        });
    }
}
