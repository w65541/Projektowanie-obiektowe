import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Objects;

public class Tabela extends JFrame{
    private JPanel panel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton addButton;
    private JButton clearButton;
    private JButton deleteButton;
int i =0;
String[] row=new String[]{"Name","Email","Phone","Address"};
    String[][] column=new String[0][0];
DefaultTableModel data=new DefaultTableModel(column,row);
private JTable table1;
    public Tabela() {
        this.setContentPane(this.panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        table1.setModel(data);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!textField1.getText().equals("")&&!textField2.getText().equals("")&&!textField3.getText().equals("")&&!textField4.getText().equals("")){
               /* table1.setValueAt(textField1.getText(),i,0);
                table1.setValueAt(textField2.getText(),i,1);
                table1.setValueAt(textField3.getText(),i,2);
                table1.setValueAt(textField4.getText(),i,3);
                i++;*/
                data.addRow(new String[]{textField1.getText(),textField2.getText(),textField3.getText(),textField4.getText()});
                }
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField3.setText("");
                textField2.setText("");
                textField4.setText("");
            }
        });
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                data.removeRow(table1.getSelectedRow());
            }
        });
    }

}
