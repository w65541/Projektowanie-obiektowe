import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioIcon extends JFrame{
    private JPanel Jpanel;
    private JButton button1;
    private JRadioButton linuxRadioButton;
    private JRadioButton windowsRadioButton1;
    private JRadioButton macintoshRadioButton;
    private JLabel Jlabel;

    public RadioIcon() {
        ImageIcon l=new ImageIcon(getClass().getResource("./images/linux.jpg"));
        ImageIcon w=new ImageIcon(getClass().getResource("./images/windows.jpg"));
        ImageIcon m=new ImageIcon(getClass().getResource("./images/apple.jpg"));
        this.setContentPane(this.Jpanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        linuxRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Jlabel.setIcon(l);
                windowsRadioButton1.setSelected(false);
                macintoshRadioButton.setSelected(false);
            }
        });
        windowsRadioButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Jlabel.setIcon(w);
                linuxRadioButton.setSelected(false);
                macintoshRadioButton.setSelected(false);
            }
        });
        macintoshRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Jlabel.setIcon(m);
                linuxRadioButton.setSelected(false);
                windowsRadioButton1.setSelected(false);
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(linuxRadioButton.isSelected()) JOptionPane.showMessageDialog(null, "You selected: Linux");
                if(windowsRadioButton1.isSelected()) JOptionPane.showMessageDialog(null, "You selected: Windows");
                if(macintoshRadioButton.isSelected()) JOptionPane.showMessageDialog(null, "You selected: Macintosh");

            }
        });
    }
}
