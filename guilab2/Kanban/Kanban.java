import javax.swing.*;
import java.awt.event.*;
import javax.swing.JPopupMenu;
import javax.swing.JMenuItem;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

/*
* Nie wiem jak zrobić ten popup menu i zainstalować jdatechooser, ale wszystko inne jest
* */
public class Kanban extends JFrame implements ActionListener{
    private JPopupMenu popupMenu;
    private JMenuItem menuItemEdit;
    private JMenuItem menuItemRemove;
    private JTabbedPane tabbedPane1;
    private JList list1;
    private JList list2;
    private JList list3;
    private JButton addNewTaskButton;
    private JButton button2;
    private JTextField textField1;
    private JButton button1;
    private JButton button3;
    private JPanel panel;
    private DefaultListModel<Task> data1 = new DefaultListModel<>();
    private DefaultListModel<Task> data2 = new DefaultListModel<>();
    private DefaultListModel<Task> data3 = new DefaultListModel<>();

    public Kanban() {
        this.setContentPane(this.panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,300);

        list1.setModel(data1);
        list2.setModel(data2);
        list3.setModel(data3);
        popupMenu = new JPopupMenu();
        menuItemEdit = new JMenuItem("Edit");
        menuItemRemove = new JMenuItem("Remove");
        menuItemEdit.addActionListener(this);
        menuItemRemove.addActionListener(this);
        list1.setComponentPopupMenu(popupMenu);
        list2.setComponentPopupMenu(popupMenu);
        list3.setComponentPopupMenu(popupMenu);
        //list1.addMouseListener(new ListMouseListener(list1));
        addNewTaskButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame a = new Formularz(data1);
                a.setVisible(true);

            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!list1.isSelectionEmpty()){
                    data2.addElement(data1.getElementAt(list1.getSelectedIndex()));
                    data1.remove(list1.getSelectedIndex());
                } else if(!list2.isSelectionEmpty()){
                    data3.addElement(data2.getElementAt(list2.getSelectedIndex()));
                    data2.remove(list2.getSelectedIndex());
                }
            }
        });
        list1.addMouseListener(new MouseAdapter() {
        });
        list1.addComponentListener(new ComponentAdapter() {
        });

        list1.addListSelectionListener(new ListSelectionListener() {
        @Override
        public void valueChanged(ListSelectionEvent e) {
            list2.clearSelection();
            list3.clearSelection();
        }
    });
        list2.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                list3.clearSelection();
                list1.clearSelection();
            }
        });
        list3.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                list2.clearSelection();
                list1.clearSelection();
            }
        });

    }
    @Override
    public void actionPerformed(ActionEvent event) {
        JMenuItem menu = (JMenuItem) event.getSource();
        if (menu == menuItemEdit) {
            edit();
        } else if (menu == menuItemRemove) {
            remove();
        }
    }

    public void edit(){
        if(!list1.isSelectionEmpty()){
            if(data1.getElementAt(list1.getSelectedIndex()).priority.equals("High")){p=0;}else{p=1;}
            JFrame a = new Formularz(data1,list1.getSelectedIndex(),data1.getElementAt(list1.getSelectedIndex()).title,p);
            a.setVisible(true);
        } else if(!list2.isSelectionEmpty()){
            if(data2.getElementAt(list2.getSelectedIndex()).priority.equals("High")){p=0;}else{p=1;}
            JFrame a = new Formularz(data2,list2.getSelectedIndex(),data2.getElementAt(list2.getSelectedIndex()).title,p);
            a.setVisible(true);
        }else{
            if(data3.getElementAt(list3.getSelectedIndex()).priority.equals("High")){p=0;}else{p=1;}
            JFrame a = new Formularz(data3,list3.getSelectedIndex(),data3.getElementAt(list3.getSelectedIndex()).title,p);
            a.setVisible(true);
        }
    }
    public void remove(){
        if(!list1.isSelectionEmpty()){
            data1.remove(list1.getSelectedIndex());
        } else if(!list2.isSelectionEmpty()){
            data2.remove(list2.getSelectedIndex());
        }else{
            data3.remove(list3.getSelectedIndex());
        }
    }
}
