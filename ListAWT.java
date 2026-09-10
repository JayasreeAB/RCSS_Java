


import java.awt.*;
import java.awt.event.*;

public class ListAWT extends Frame implements ActionListener {

    Label l;
    List list;
    TextField t;
    Button b1, b2;

    ListAWT() {
        l = new Label("Enter Item:");
        list = new List(5, true); // multiple selection
        t = new TextField();

        b1 = new Button("Add");
        b2 = new Button("Remove");
 

        setLayout(new GridLayout(5, 2));

        add(l); add(t);
        add(new Label("List:")); add(list);
        add(b1); add(b2);
    

        b1.addActionListener(this);
        b2.addActionListener(this);
      

        setSize(300, 250);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) {
            list.add(t.getText());   // Add item
            t.setText("");
        }

        if (e.getSource() == b2) {
            list.remove(list.getSelectedIndex()); // Remove selected
        }


    }

    public static void main(String[] args) {
        new ListAWT();
    }
}