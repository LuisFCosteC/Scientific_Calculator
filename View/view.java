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
		label_Presentation.setBounds(80, 0, 150, 25);
		getContentPane().add(label_Presentation);
	
	/*********************************** PANEL ***********************************/
		JTextField JTextField__Main = new JTextField();
		JTextField__Main.setHorizontalAlignment(SwingConstants.RIGHT);
		JTextField__Main.setFont(new Font("Arial Black", Font.BOLD, 18));
		JTextField__Main.setForeground(new Color(255, 255, 255));
		JTextField__Main.setBackground(new Color(0, 0, 0));
		JTextField__Main.setBounds(10, 55, 300, 35);
		getContentPane().add(JTextField__Main);
		
		JTextField JTextField__Secondary = new JTextField();
		JTextField__Secondary.setHorizontalAlignment(SwingConstants.RIGHT);
		JTextField__Secondary.setFont(new Font("Arial Black", Font.BOLD, 16));
		JTextField__Secondary.setForeground(new Color(128, 128, 128));
		JTextField__Secondary.setBackground(new Color(0, 0, 0));
		JTextField__Secondary.setBounds(10, 25, 300, 25);
		getContentPane().add(JTextField__Secondary);
		
	/*********************************** PANEL BUTTONS ***********************************/
		JPanel panel_Buttons = new JPanel();
		panel_Buttons.setBackground(new Color(0, 0, 0));
		panel_Buttons.setForeground(new Color(0, 0, 0));
		panel_Buttons.setBounds(10, 100, 300, 450);
		getContentPane().add(panel_Buttons);
		panel_Buttons.setLayout(new GridLayout(7, 5, 0, 0));
				
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

		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.setBackground(new Color(0, 0, 0));
		btnNewButton_6.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnNewButton_6.setForeground(new Color(128, 128, 128));
		panel_Buttons.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("7");
		btnNewButton_7.setBackground(new Color(0, 0, 0));
		btnNewButton_7.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnNewButton_7.setForeground(new Color(128, 128, 128));
		panel_Buttons.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("8");
		btnNewButton_8.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnNewButton_8.setForeground(new Color(128, 128, 128));
		btnNewButton_8.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("9");
		btnNewButton_9.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnNewButton_9.setForeground(new Color(128, 128, 128));
		btnNewButton_9.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("10");
		btnNewButton_10.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnNewButton_10.setForeground(new Color(128, 128, 128));
		btnNewButton_10.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("11");
		btnNewButton_11.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnNewButton_11.setForeground(new Color(128, 128, 128));
		btnNewButton_11.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btnNewButton_11);

		JButton btnNewButton_12 = new JButton("12");
		btnNewButton_12.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnNewButton_12.setForeground(new Color(204, 153, 51));
		btnNewButton_12.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btnNewButton_12);

		JButton btnNewButton_13 = new JButton("13");
		btnNewButton_13.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnNewButton_13.setForeground(new Color(204, 153, 51));
		btnNewButton_13.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("14");
		btnNewButton_14.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnNewButton_14.setForeground(new Color(204, 153, 51));
		btnNewButton_14.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("15");
		btnNewButton_15.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnNewButton_15.setForeground(new Color(204, 153, 51));
		btnNewButton_15.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("16");
		btnNewButton_16.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnNewButton_16.setForeground(new Color(128, 128, 128));
		btnNewButton_16.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("17");
		btnNewButton_17.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnNewButton_17.setForeground(new Color(255, 255, 255));
		btnNewButton_17.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("18");
		btnNewButton_18.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnNewButton_18.setForeground(new Color(255, 255, 255));
		btnNewButton_18.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btnNewButton_18);

		JButton btnNewButton_19 = new JButton("19");
		btnNewButton_19.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnNewButton_19.setForeground(new Color(255, 255, 255));
		btnNewButton_19.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btnNewButton_19);

		JButton btnNewButton_20 = new JButton("20");
		btnNewButton_20.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnNewButton_20.setForeground(new Color(204, 153, 51));
		btnNewButton_20.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btnNewButton_20);
		
		JButton btnNewButton_21 = new JButton("21");
		btnNewButton_21.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnNewButton_21.setForeground(new Color(128, 128, 128));
		btnNewButton_21.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btnNewButton_21);
		
		JButton btnNewButton_40 = new JButton("22");
		btnNewButton_40.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnNewButton_40.setForeground(new Color(255, 255, 255));
		btnNewButton_40.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btnNewButton_40);
		
		JButton btnNewButton_22 = new JButton("23");
		btnNewButton_22.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnNewButton_22.setForeground(new Color(255, 255, 255));
		btnNewButton_22.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btnNewButton_22);
		
		JButton btnNewButton_23 = new JButton("24");
		btnNewButton_23.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnNewButton_23.setForeground(new Color(255, 255, 255));
		btnNewButton_23.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btnNewButton_23);
		
		JButton btnNewButton_24 = new JButton("25");
		btnNewButton_24.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnNewButton_24.setForeground(new Color(204, 153, 51));
		btnNewButton_24.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btnNewButton_24);

		JButton btnNewButton_25 = new JButton("26");
		btnNewButton_25.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnNewButton_25.setForeground(new Color(128, 128, 128));
		btnNewButton_25.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btnNewButton_25);

		JButton btnNewButton_26 = new JButton("27");
		btnNewButton_26.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnNewButton_26.setForeground(new Color(255, 255, 255));
		btnNewButton_26.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btnNewButton_26);
		
		JButton btnNewButton_27 = new JButton("28");
		btnNewButton_27.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnNewButton_27.setForeground(new Color(255, 255, 255));
		btnNewButton_27.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btnNewButton_27);
		
		JButton btnNewButton_28 = new JButton("29");
		btnNewButton_28.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnNewButton_28.setForeground(new Color(255, 255, 255));
		btnNewButton_28.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btnNewButton_28);
		
		JButton btnNewButton_29 = new JButton("30");
		btnNewButton_29.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnNewButton_29.setForeground(new Color(204, 153, 51));
		btnNewButton_29.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btnNewButton_29);
		
		JButton btnNewButton_30 = new JButton("31");
		btnNewButton_30.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnNewButton_30.setForeground(new Color(128, 128, 128));
		btnNewButton_30.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btnNewButton_30);
		
		JButton btnNewButton_31 = new JButton("32");
		btnNewButton_31.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnNewButton_31.setForeground(new Color(204, 153, 51));
		btnNewButton_31.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btnNewButton_31);
		
		JButton btnNewButton_32 = new JButton("33");
		btnNewButton_32.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnNewButton_32.setForeground(new Color(255, 255, 255));
		btnNewButton_32.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btnNewButton_32);
		
		JButton btnNewButton_33 = new JButton("34");
		btnNewButton_33.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnNewButton_33.setForeground(new Color(204, 153, 51));
		btnNewButton_33.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btnNewButton_33);
		
		btn_Equal = new JButton("=");
		btn_Equal.setFont(new Font("Arial Black", Font.BOLD, 12));
		btn_Equal.setForeground(new Color(204, 153, 51));
		btn_Equal.setBackground(new Color(0, 0, 0));
		panel_Buttons.add(btn_Equal);
	}
}
