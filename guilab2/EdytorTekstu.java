import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
public class EdytorTekstu extends JFrame{
    private JPanel panel;
    private DefaultComboBoxModel<String> kolor=new DefaultComboBoxModel<>(new String[]{"Szary","Czarny","Czerwony","Niebieski","Zielony","Żółty"});
    private JComboBox comboBox1;
    private JTextPane textArea1;
    private JButton bButton;
    private JButton zButton;
    private JButton iButton;
    private JButton pButton;
    int size;
    boolean b=false,i=false;
    SimpleAttributeSet attributes = new SimpleAttributeSet();
    public EdytorTekstu() {
        this.setContentPane(this.panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        size=textArea1.getFont().getSize();
        comboBox1.setModel(kolor);
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch ((String) comboBox1.getSelectedItem()){
                    case "Czerwony":
                        textArea1.setForeground(Color.red);
                        break;
                    case "Czarny":
                        textArea1.setForeground(Color.black);
                        break;
                    case "Szary":
                        textArea1.setForeground(Color.gray);
                        break;
                    case "Niebieski":
                        textArea1.setForeground(Color.blue);
                        break;
                    case "Zielony":
                        textArea1.setForeground(Color.green);
                        break;
                    case "Żółty":
                        textArea1.setForeground(Color.yellow);
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + (String) comboBox1.getSelectedItem());
                }

            }
        });
        bButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b=!b;
                StyleConstants.setBold(attributes, b);
                textArea1.setCharacterAttributes(attributes,false);
                textArea1.setText(textArea1.getText());

            }
        });
        iButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                i=!i;
                StyleConstants.setItalic(attributes, i);
                textArea1.setCharacterAttributes(attributes,false);
                textArea1.setText(textArea1.getText());
            }
        });
        zButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(size>0)size--;
                StyleConstants.setFontSize(attributes,size);
                textArea1.setCharacterAttributes(attributes,false);
                textArea1.setText(textArea1.getText());
            }
        });
        pButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                size++;
                StyleConstants.setFontSize(attributes,size);
                textArea1.setCharacterAttributes(attributes,false);
                textArea1.setText(textArea1.getText());
            }
        });
    }
}
