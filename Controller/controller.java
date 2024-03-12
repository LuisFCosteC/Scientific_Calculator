package Controller;
	import java.awt.event.*;
	import View.*;
	import Model.*;

public class controller implements ActionListener{
	view obj_View = new view();
	
	public controller() {
		this.obj_View.btn_Equal.addActionListener(this);
	}
	
	public void run() {
		obj_View.setBounds(0, 0, 340, 600);
		obj_View.setTitle("");
		obj_View.setVisible(true);
		obj_View.setLocationRelativeTo(null);
		obj_View.setResizable(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
