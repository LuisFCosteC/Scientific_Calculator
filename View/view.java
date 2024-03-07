package View;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JTextField;
	
public class view extends JFrame{
	private static final long serialVersionUID = 1L;
	
	/*********************************** PRESENTATION OBJECTS ***********************************/
	public JLabel label_Presentation;
	public JTextField textField_Panel;
	public JButton button_Delete;
	public JButton button_More_Less;
	public JButton button_Percentage;
	public JButton button_Divide;
	public JButton button_Multiply;
	public JButton button_Subtraction;
	public JButton button_Sum;
	public JButton button_Equal;
	public JButton button_Coma;
	public JButton button_Num_9;
	public JButton button_Num_8;
	public JButton button_Num_7;
	public JButton button_Num_6;
	public JButton button_Num_5;
	public JButton button_Num_4;
	public JButton button_Num_3;
	public JButton button_Num_2;
	public JButton button_Num_1;
	public JButton button_Num_0;
	
	public view() {
		setLayout(null);
	/*********************************** MESSAGE OF PRESENTATION ***********************************/
		label_Presentation = new JLabel("Scientific Calculator");
		label_Presentation.setBounds(65, 0, 360, 30);
		add(label_Presentation);
	
	/*********************************** PANEL ***********************************/
		textField_Panel = new JTextField();
		textField_Panel.setBounds(10, 30, 215, 25);
		add(textField_Panel);
	/*********************************** BUTTONS ***********************************/
		button_Delete = new JButton("CE");
		button_Delete.setBounds(10, 60, 50, 25);
		add(button_Delete);
		
		button_More_Less = new JButton("±");
		button_More_Less.setBounds(65, 60, 50, 25);
		add(button_More_Less);
		
		button_Percentage = new JButton("%");
		button_Percentage.setBounds(120, 60, 50, 25);
		add(button_Percentage);
		
		button_Divide = new JButton("÷");
		button_Divide.setBounds(175, 60, 50, 25);
		add(button_Divide);
		
		button_Multiply = new JButton("x");
		button_Multiply.setBounds(175, 90, 50, 25);
		add(button_Multiply);
		
		button_Subtraction = new JButton("-");
		button_Subtraction.setBounds(175, 120, 50, 25);
		add(button_Subtraction);
		
		button_Sum = new JButton("+");
		button_Sum.setBounds(175, 150, 50, 25);
		add(button_Sum);
		
		button_Equal = new JButton("=");
		button_Equal.setBounds(175, 180, 50, 25);
        add(button_Equal);
        
        button_Coma = new JButton(",");
        button_Coma.setBounds(120, 180, 50, 25);
        add(button_Coma);
		
		button_Num_9 = new JButton("9");
		button_Num_9.setBounds(120, 90, 50, 25);
		add(button_Num_9);
		
		button_Num_8 = new JButton("8");
		button_Num_8.setBounds(65, 90, 50, 25);
		add(button_Num_8);
		
		button_Num_7 = new JButton("7");
		button_Num_7.setBounds(10, 90, 50, 25);
		add(button_Num_7);
		
		button_Num_6 = new JButton("6");
		button_Num_6.setBounds(120, 120, 50, 25);
		add(button_Num_6);
		
		button_Num_5 = new JButton("5");
		button_Num_5.setBounds(65, 120, 50, 25);
		add(button_Num_5);
		
		button_Num_4 = new JButton("4");
		button_Num_4.setBounds(10, 120, 50, 25);
		add(button_Num_4);
		
		button_Num_3 = new JButton("3");
		button_Num_3.setBounds(120, 150, 50, 25);
		add(button_Num_3);
		
		button_Num_2 = new JButton("2");
		button_Num_2.setBounds(65, 150, 50, 25);
		add(button_Num_2);
		
		button_Num_1 = new JButton("1");
		button_Num_1.setBounds(10, 150, 50, 25);
		add(button_Num_1);
		
		button_Num_0 = new JButton("0");
		button_Num_0.setBounds(10, 180, 105, 25);
		add(button_Num_0);
	}
}
