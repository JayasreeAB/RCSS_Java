import java.awt.*;
import java.awt.event.*;

public class CheckRadioAWT extends Frame implements ActionListener {

    Label l1, l2;
    Checkbox c1, c2, c3;
    Checkbox r1, r2;
    CheckboxGroup bg;
    Button b;
    TextField t;

    CheckRadioAWT() {

        l1 = new Label("Select Hobbies:");
        l2 = new Label("Select Gender:");

        // Checkboxes
        c1 = new Checkbox("Reading");
        c2 = new Checkbox("Music");
        c3 = new Checkbox("Sports");

        // Radio buttons (CheckboxGroup)
        bg = new CheckboxGroup();
        r1 = new Checkbox("Male", bg, false);
        r2 = new Checkbox("Female", bg, false);

        b = new Button("Show");
        t = new TextField();

        setLayout(new GridLayout(6, 2));

        add(l1); add(new Label(""));
        add(c1); add(c2);
        add(c3); add(new Label(""));
        add(l2); add(new Label(""));
        add(r1); add(r2);
        add(b); add(t);

        b.addActionListener(this);

        setSize(300, 250);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        String result = "";

        // Checkboxes (multiple selection)
        if (c1.getState()) result += "Reading ";
        if (c2.getState()) result += "Music ";
        if (c3.getState()) result += "Sports ";

        // Radio button (single selection)
        result += " | ";
        result += bg.getSelectedCheckbox().getLabel();

        t.setText(result);
    }

    public static void main(String[] args) {
        new CheckRadioAWT();
    }
}