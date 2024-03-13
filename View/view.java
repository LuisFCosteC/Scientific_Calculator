package View;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JTextField;
	import javax.swing.JPanel;
	import java.awt.Color;
	import java.awt.Font;
	import java.awt.GridLayout;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
	
public class view extends JFrame{
	private static final long serialVersionUID = 1L;
	
	/*********************************** PRESENTATION OBJECTS ***********************************/
	public JButton btn_Equal;
	
	public view() {		
		getContentPane().setBackground(new Color(0, 0, 0));
		getContentPane().setLayout(null);
	/*********************************** MESSAGE OF PRESENTATION ***********************************/
		JLabel label_Presentation = new JLabel("Scientific Calculator");
		label_Presentation.setFont(new Font("Arial Black", Font.BOLD, 12));
		label_Presentation.setForeground(new Color(255, 255, 255));
		label_Presentation.setBounds(90, 0, 150, 25);
		getContentPane().add(label_Presentation);
	
	/*********************************** PANEL ***********************************/
		JTextField JTextField__Main = new JTextField();
		JTextField__Main.setToolTipText("");
		JTextField__Main.setText("0");
		JTextField__Main.setHorizontalAlignment(SwingConstants.RIGHT);
		JTextField__Main.setFont(new Font("Arial Black", Font.BOLD, 20));
		JTextField__Main.setForeground(new Color(255, 255, 255));
		JTextField__Main.setBackground(new Color(0, 0, 0));
		JTextField__Main.setBounds(10, 55, 310, 35);
		getContentPane().add(JTextField__Main);
		
		JTextField JTextField__Secondary = new JTextField();
		JTextField__Secondary.setToolTipText("");
		JTextField__Secondary.setHorizontalAlignment(SwingConstants.RIGHT);
		JTextField__Secondary.setFont(new Font("Arial Black", Font.BOLD, 16));
		JTextField__Secondary.setForeground(new Color(128, 128, 128));
		JTextField__Secondary.setBackground(new Color(0, 0, 0));
		JTextField__Secondary.setBounds(10, 25, 310, 25);
		getContentPane().add(JTextField__Secondary);
		
	/*********************************** PANEL BUTTONS ***********************************/
		JPanel panel_Buttons = new JPanel();
		panel_Buttons.setBackground(new Color(0, 0, 0));
		panel_Buttons.setForeground(new Color(0, 0, 0));
		panel_Buttons.setBounds(10, 100, 310, 450);
		getContentPane().add(panel_Buttons);
		panel_Buttons.setLayout(new GridLayout(7, 5, 0, 0));
				
	/*********************************** BUTTONS ***********************************/
		JButton btn_2nd = new JButton("2nd");
		btn_2nd.setFont(new Font("Arial Black", Font.BOLD, 12));
		btn_2nd.setForeground(new Color(128, 128, 128));
		btn_2nd.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btn_2nd);
		
		JButton btn_Deg = new JButton("Deg");
		btn_Deg.setBackground(new Color(0, 0, 0));
		btn_Deg.setFont(new Font("Arial Black", Font.BOLD, 12));
		btn_Deg.setForeground(new Color(128, 128, 128));
		panel_Buttons.add(btn_Deg);
		
		JButton btn_Sin = new JButton("Sin");
		btn_Sin.setBackground(new Color(0, 0, 0));
		btn_Sin.setFont(new Font("Arial Black", Font.BOLD, 12));
		btn_Sin.setForeground(new Color(128, 128, 128));
		panel_Buttons.add(btn_Sin);
		
		JButton btn_Cos = new JButton("Cos");
		btn_Cos.setBackground(new Color(0, 0, 0));
		btn_Cos.setFont(new Font("Arial Black", Font.BOLD, 12));
		btn_Cos.setForeground(new Color(128, 128, 128));
		panel_Buttons.add(btn_Cos);

		JButton btn_Tan = new JButton("Tan");
		btn_Tan.setBackground(new Color(0, 0, 0));
		btn_Tan.setFont(new Font("Arial Black", Font.BOLD, 12));
		btn_Tan.setForeground(new Color(128, 128, 128));
		panel_Buttons.add(btn_Tan);

		JButton btn_X_Elevated_Y = new JButton("X^Y");
		btn_X_Elevated_Y.setBackground(new Color(0, 0, 0));
		btn_X_Elevated_Y.setFont(new Font("Arial Black", Font.BOLD, 12));
		btn_X_Elevated_Y.setForeground(new Color(128, 128, 128));
		panel_Buttons.add(btn_X_Elevated_Y);
		
		JButton btn_lg = new JButton("lg");
		btn_lg.setBackground(new Color(0, 0, 0));
		btn_lg.setFont(new Font("Arial Black", Font.BOLD, 12));
		btn_lg.setForeground(new Color(128, 128, 128));
		panel_Buttons.add(btn_lg);
		
		JButton btn_ln = new JButton("ln");
		btn_ln.setFont(new Font("Arial Black", Font.BOLD, 12));
		btn_ln.setForeground(new Color(128, 128, 128));
		btn_ln.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btn_ln);
		
		JButton btn_Open_parentheses = new JButton("(");
		btn_Open_parentheses.setFont(new Font("Arial Black", Font.BOLD, 12));
		btn_Open_parentheses.setForeground(new Color(128, 128, 128));
		btn_Open_parentheses.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btn_Open_parentheses);
		
		JButton btn_Close_parentheses = new JButton(")");
		btn_Close_parentheses.setFont(new Font("Arial Black", Font.BOLD, 12));
		btn_Close_parentheses.setForeground(new Color(128, 128, 128));
		btn_Close_parentheses.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btn_Close_parentheses);
		
		JButton btn_X_Elevated_2 = new JButton("X^2");
		btn_X_Elevated_2.setFont(new Font("Arial Black", Font.BOLD, 12));
		btn_X_Elevated_2.setForeground(new Color(128, 128, 128));
		btn_X_Elevated_2.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btn_X_Elevated_2);

		JButton btn_Deleted_Complete = new JButton("C");
		btn_Deleted_Complete.setFont(new Font("Arial Black", Font.BOLD, 12));
		btn_Deleted_Complete.setForeground(new Color(204, 153, 51));
		btn_Deleted_Complete.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btn_Deleted_Complete);

		JButton btn_Eliminated_Partial = new JButton("<<");
		btn_Eliminated_Partial.setFont(new Font("Arial Black", Font.BOLD, 12));
		btn_Eliminated_Partial.setForeground(new Color(204, 153, 51));
		btn_Eliminated_Partial.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btn_Eliminated_Partial);
		
		JButton btn_Percentage = new JButton("%");
		btn_Percentage.setFont(new Font("Arial Black", Font.BOLD, 12));
		btn_Percentage.setForeground(new Color(204, 153, 51));
		btn_Percentage.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btn_Percentage);
		
		JButton btn_Division = new JButton("/");
		btn_Division.setFont(new Font("Arial Black", Font.BOLD, 12));
		btn_Division.setForeground(new Color(204, 153, 51));
		btn_Division.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btn_Division);
		
		JButton btn_Square_Root = new JButton("√ x");
		btn_Square_Root.setFont(new Font("Arial Black", Font.BOLD, 12));
		btn_Square_Root.setForeground(new Color(128, 128, 128));
		btn_Square_Root.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btn_Square_Root);
		
		JButton btn_Number_7 = new JButton("7");
		btn_Number_7.setFont(new Font("Arial Black", Font.BOLD, 12));
		btn_Number_7.setForeground(new Color(255, 255, 255));
		btn_Number_7.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btn_Number_7);
		
		JButton btn_Number_8 = new JButton("8");
		btn_Number_8.setFont(new Font("Arial Black", Font.BOLD, 12));
		btn_Number_8.setForeground(new Color(255, 255, 255));
		btn_Number_8.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btn_Number_8);

		JButton btn_Number_9 = new JButton("19");
		btn_Number_9.setFont(new Font("Arial Black", Font.BOLD, 12));
		btn_Number_9.setForeground(new Color(255, 255, 255));
		btn_Number_9.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btn_Number_9);

		JButton btn_Multiplication = new JButton("X");
		btn_Multiplication.setFont(new Font("Arial Black", Font.BOLD, 12));
		btn_Multiplication.setForeground(new Color(204, 153, 51));
		btn_Multiplication.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btn_Multiplication);
		
		JButton btn_Factorial = new JButton("n!");
		btn_Factorial.setFont(new Font("Arial Black", Font.BOLD, 12));
		btn_Factorial.setForeground(new Color(128, 128, 128));
		btn_Factorial.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btn_Factorial);
		
		JButton btn_Number_4 = new JButton("4");
		btn_Number_4.setFont(new Font("Arial Black", Font.BOLD, 12));
		btn_Number_4.setForeground(new Color(255, 255, 255));
		btn_Number_4.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btn_Number_4);
		
		JButton btn_Number_5 = new JButton("5");
		btn_Number_5.setFont(new Font("Arial Black", Font.BOLD, 12));
		btn_Number_5.setForeground(new Color(255, 255, 255));
		btn_Number_5.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btn_Number_5);
		
		JButton btn_Number_6 = new JButton("6");
		btn_Number_6.setFont(new Font("Arial Black", Font.BOLD, 12));
		btn_Number_6.setForeground(new Color(255, 255, 255));
		btn_Number_6.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btn_Number_6);
		
		JButton btn_Subtraction = new JButton("-");
		btn_Subtraction.setFont(new Font("Arial Black", Font.BOLD, 12));
		btn_Subtraction.setForeground(new Color(204, 153, 51));
		btn_Subtraction.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btn_Subtraction);

		JButton btn_Pi = new JButton("π");
		btn_Pi.setFont(new Font("Arial Black", Font.BOLD, 12));
		btn_Pi.setForeground(new Color(128, 128, 128));
		btn_Pi.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btn_Pi);

		JButton btn_Number_1 = new JButton("1");
		btn_Number_1.setFont(new Font("Arial Black", Font.BOLD, 12));
		btn_Number_1.setForeground(new Color(255, 255, 255));
		btn_Number_1.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btn_Number_1);
		
		JButton btn_Number_2 = new JButton("2");
		btn_Number_2.setFont(new Font("Arial Black", Font.BOLD, 12));
		btn_Number_2.setForeground(new Color(255, 255, 255));
		btn_Number_2.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btn_Number_2);
		
		JButton btn_Number_3 = new JButton("3");
		btn_Number_3.setFont(new Font("Arial Black", Font.BOLD, 12));
		btn_Number_3.setForeground(new Color(255, 255, 255));
		btn_Number_3.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btn_Number_3);
		
		JButton btn_Addition = new JButton("+");
		btn_Addition.setFont(new Font("Arial Black", Font.BOLD, 12));
		btn_Addition.setForeground(new Color(204, 153, 51));
		btn_Addition.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btn_Addition);
		
		JButton btn_Euler = new JButton("e");
		btn_Euler.setFont(new Font("Arial Black", Font.BOLD, 12));
		btn_Euler.setForeground(new Color(128, 128, 128));
		btn_Euler.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btn_Euler);
		
		JButton btn_More_or_Less = new JButton("±");
		btn_More_or_Less.setFont(new Font("Arial Black", Font.BOLD, 12));
		btn_More_or_Less.setForeground(new Color(204, 153, 51));
		btn_More_or_Less.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btn_More_or_Less);
		
		JButton btn_Number_0 = new JButton("0");
		btn_Number_0.setFont(new Font("Arial Black", Font.BOLD, 12));
		btn_Number_0.setForeground(new Color(255, 255, 255));
		btn_Number_0.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btn_Number_0);
		
		JButton btn_Coma = new JButton(",");
		btn_Coma.setFont(new Font("Arial Black", Font.BOLD, 12));
		btn_Coma.setForeground(new Color(204, 153, 51));
		btn_Coma.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btn_Coma);
		
		btn_Equal = new JButton("=");
		btn_Equal.setFont(new Font("Arial Black", Font.BOLD, 12));
		btn_Equal.setForeground(new Color(204, 153, 51));
		btn_Equal.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btn_Equal);
	}
}
