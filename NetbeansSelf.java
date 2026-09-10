import java.awt.*;
import java.awt.event.*;
class Operations extends Frame implements ActionListener {
	TextField tq1,tq2,ta;
	Button bp,bm;
	public Operations() {
		super("Operations");
		tq1 = new TextField(5);	
		tq2 = new TextField(5);
		ta = new TextField(5);
		bp = new Button("+");
		bm = new Button("-");
		setLayout(new FlowLayout() );
		add(tq1);
		add(tq2);
		add(bp);
		add(bm);
		add(ta);
		bp.addActionListener(this);
		bm.addActionListener(this);
		setSize(500,500);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) {
		
//get text frpm fields
			String s1 = tq1.getText();
			String s2 = tq2.getText();
		
//convert string to number
			int n1 = Integer.parseInt(s1);
			int n2 = Integer.parseInt(s2);
		
			if(ae.getSource() == bp) {
				ta.setText("" + (n1 + n2));
			}
			else  {
				ta.setText("" + (n1 - n2));
			}
	}
}

class NetbeansSelf {
	public static void main(String args[]) {
		Operations obj = new Operations();
	}
}