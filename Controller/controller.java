package Controller;
	import java.awt.event.*;
	import View.*;
	import Model.*;

public class controller implements ActionListener{
	view obj_View = new view();
	
	public controller() {
		this.obj_View.button_Equal.addActionListener(this);
	}
	
	public void run() {
		obj_View.setBounds(0, 0, 250, 250);
		obj_View.setTitle("Scientific Calculator");
		obj_View.setVisible(true);
		obj_View.setLocationRelativeTo(null);
		obj_View.setResizable(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
