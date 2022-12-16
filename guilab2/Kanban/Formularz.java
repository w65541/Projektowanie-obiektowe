import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formularz extends JFrame{
    private JTextField textField1;
    private JComboBox comboBox1;
    private JButton button1;
    private JPanel panel;
    DefaultComboBoxModel<String> priority=new DefaultComboBoxModel<>(new String[]{"High","Low"});

    public Formularz(DefaultListModel data) {
        this.setContentPane(this.panel);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300,300);
        comboBox1.setModel(priority);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                data.addElement(new Task(textField1.getText(),(String)comboBox1.getSelectedItem()));
            }
        });
    }

    public Formularz(DefaultListModel data,int i,String title,int p) {
        this.setContentPane(this.panel);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300,300);
        comboBox1.setModel(priority);
        textField1.setText(title);
        comboBox1.setSelectedIndex(p);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                data.set(i,new Task(textField1.getText(),(String)comboBox1.getSelectedItem()));
            }
        });
    }
}
