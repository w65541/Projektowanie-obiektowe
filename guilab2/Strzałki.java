import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Strzałki extends JFrame{
    private JList list1;
    private JList list2;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JPanel panel;
    private DefaultListModel<String> data1 = new DefaultListModel<>();
    private DefaultListModel<String> data2 = new DefaultListModel<>();
    public Strzałki() {
        this.setContentPane(this.panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        data1.addElement("a");
        data1.addElement("b");
        data1.addElement("c");
        data2.addElement("1");
        data2.addElement("2");
        data2.addElement("3");
        list1.setModel(data1);
        list2.setModel(data2);

        button3.addActionListener(new ActionListener() {    //>
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!list1.isSelectionEmpty()){
                data2.addElement(data1.getElementAt(list1.getSelectedIndex()));
                data1.remove(list1.getSelectedIndex());}
            }
        });
        button1.addActionListener(new ActionListener() {    //>>
            @Override
            public void actionPerformed(ActionEvent e) {
                while (!data1.isEmpty()){
                    data2.addElement(data1.firstElement());
                    data1.remove(0);
                }
            }
        });
        button2.addActionListener(new ActionListener() {    //<
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!list2.isSelectionEmpty()){
                    data1.addElement(data2.getElementAt(list2.getSelectedIndex()));
                    data2.remove(list2.getSelectedIndex());}
            }
        });
        button4.addActionListener(new ActionListener() {    //<<
            @Override
            public void actionPerformed(ActionEvent e) {
                while (!data2.isEmpty()){
                    data1.addElement(data2.firstElement());
                    data2.remove(0);
                }
            }
        });
    }
}
