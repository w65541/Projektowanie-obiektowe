import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Czekboks extends JFrame{
    private JPanel Jpanel;
    private JCheckBox jawa1000ZłCheckBox;
    private JCheckBox c100ZłCheckBox;
    private JCheckBox python1500ZłCheckBox;
    private JCheckBox c2000ZłCheckBox;
    private JButton button1;

    public Czekboks() {
        this.setContentPane(this.Jpanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String rachunek="";
                int suma=0;
                if(jawa1000ZłCheckBox.isSelected()){
                    rachunek+=jawa1000ZłCheckBox.getText()+"\n";
                    suma+=1000;
                }
                if(c100ZłCheckBox.isSelected()){
                    rachunek+=c100ZłCheckBox.getText()+"\n";
                    suma+=100;
                }
                if(python1500ZłCheckBox.isSelected()){
                    rachunek+=python1500ZłCheckBox.getText()+"\n";
                    suma+=1500;
                }
                if(c2000ZłCheckBox.isSelected()){
                    rachunek+=c2000ZłCheckBox.getText()+"\n";
                    suma+=2000;
                }
                rachunek+="--------------\nRazem:"+suma;
                JOptionPane.showMessageDialog(null, rachunek);
            }
        });
    }
}
