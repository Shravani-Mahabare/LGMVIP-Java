import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.UIManager;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	double first;
	double second;
	double result;
	String operation;
	String answer;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 331, 537);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblScientificCalculator = new JLabel("Scientific Calculator");
		lblScientificCalculator.setForeground(new Color(0, 0, 102));
		lblScientificCalculator.setFont(new Font("Tahoma", Font.BOLD, 29));
		lblScientificCalculator.setBounds(10, 10, 297, 37);
		frame.getContentPane().add(lblScientificCalculator);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField.setBounds(10, 57, 297, 51);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnRoot = new JButton("\u221A");
		btnRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a= Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnRoot.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnRoot.setBounds(10, 141, 60, 51);
		frame.getContentPane().add(btnRoot);
		
		JButton btnRev = new JButton("1/x");
		btnRev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a= 1/(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnRev.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnRev.setBounds(10, 192, 60, 51);
		frame.getContentPane().add(btnRev);
		
		JButton btnFact = new JButton("n!");
		btnFact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(textField.getText());
				double fact=1;
				while(a!=0)
				{
					fact=fact*a;
					a--;
				}
				textField.setText("");
				textField.setText(textField.getText()+fact);
			}
		});
		btnFact.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnFact.setBounds(10, 396, 60, 51);
		frame.getContentPane().add(btnFact);
		
		JButton btnPM = new JButton("+/-");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(String.valueOf(textField.getText()));
				a=a*(-1);  
				textField.setText(String.valueOf(a));
			}
		});
		btnPM.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnPM.setBounds(10, 447, 60, 51);
		frame.getContentPane().add(btnPM);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn7.setBounds(70, 294, 60, 51);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn4.setBounds(70, 345, 60, 51);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn1.setBounds(70, 396, 60, 51);
		frame.getContentPane().add(btn1);
		
		JButton btnSin = new JButton("sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a= Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSin.setBounds(130, 141, 60, 51);
		frame.getContentPane().add(btnSin);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+btn8.getText();
				textField.setText(number);
			}
			
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn8.setBounds(130, 294, 60, 51);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn5.setBounds(130, 345, 60, 51);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn2.setBounds(130, 396, 60, 51);
		frame.getContentPane().add(btn2);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn0.setBounds(70, 447, 120, 51);
		frame.getContentPane().add(btn0);
		
		JButton btnB = new JButton("\uF0E7");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if(textField.getText().length()>0)
				{
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace= str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnB.setFont(new Font("Wingdings", Font.PLAIN, 22));
		btnB.setBounds(190, 243, 60, 51);
		frame.getContentPane().add(btnB);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn9.setBounds(190, 294, 60, 51);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn6.setBounds(190, 345, 60, 51);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn3.setBounds(190, 396, 60, 51);
		frame.getContentPane().add(btn3);
		
		JButton btnDot = new JButton(".");
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnDot.setBounds(190, 447, 60, 51);
		frame.getContentPane().add(btnDot);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second = Double.parseDouble(textField.getText());
				if(operation=="+")
				{
					result=first+second;
					answer= String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="-")
				{
					result=first-second;
					answer= String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="*")
				{
					result=first*second;
					answer= String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="/")
				{
					result=first/second;
					answer= String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="%")
				{
					result=first%second;
					answer= String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="x^y")
				{
					double resultt=1;
					for(int i=0;i<second;i++)
					{
						resultt=first*resultt;
					}
					answer= String.format("%.2f", resultt);
					textField.setText(answer);
					
				}
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnEqual.setBounds(250, 447, 60, 51);
		frame.getContentPane().add(btnEqual);
		
		JButton btnSum = new JButton("+");
		btnSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText(null);
				operation="+";
			}
		});
		btnSum.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnSum.setBounds(250, 243, 60, 51);
		frame.getContentPane().add(btnSum);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText(null);
				operation="-";
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnMinus.setBounds(250, 294, 60, 51);
		frame.getContentPane().add(btnMinus);
		
		JButton btnMpy = new JButton("*");
		btnMpy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText(null);
				operation="*";
			}
		});
		btnMpy.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnMpy.setBounds(250, 345, 60, 51);
		frame.getContentPane().add(btnMpy);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText(null);
				operation="/";
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnDivide.setBounds(250, 396, 60, 51);
		frame.getContentPane().add(btnDivide);
		
		JButton btnPow = new JButton("x^y");
		btnPow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText(null);
				operation="x^y";

			}
		});
		btnPow.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnPow.setBounds(10, 243, 60, 51);
		frame.getContentPane().add(btnPow);
		
		JButton btnMod = new JButton("%");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText(null);
				operation="%";
			}
		});
		btnMod.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMod.setBounds(70, 243, 60, 51);
		frame.getContentPane().add(btnMod);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnC.setBounds(130, 243, 60, 51);
		frame.getContentPane().add(btnC);
		
		JButton btnCube = new JButton("x^3");
		btnCube.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a= (Double.parseDouble(textField.getText()));
				a=a*a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCube.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCube.setBounds(10, 294, 60, 51);
		frame.getContentPane().add(btnCube);
		
		JButton btnSqr = new JButton("x^2");
		btnSqr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a= (Double.parseDouble(textField.getText()));
				a=a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
			
		});
		btnSqr.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSqr.setBounds(10, 345, 60, 51);
		frame.getContentPane().add(btnSqr);
		
		JButton btnCos = new JButton("cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a= Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCos.setBounds(190, 141, 60, 51);
		frame.getContentPane().add(btnCos);
		
		JButton btnTan = new JButton("tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a= Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnTan.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnTan.setBounds(250, 141, 60, 51);
		frame.getContentPane().add(btnTan);
		
		JButton btnTanh = new JButton("tanh");
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a= Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnTanh.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnTanh.setBounds(250, 192, 60, 51);
		frame.getContentPane().add(btnTanh);
		
		JButton btnCosh = new JButton("cosh");
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a= Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCosh.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCosh.setBounds(190, 192, 60, 51);
		frame.getContentPane().add(btnCosh);
		
		JButton btnSinh = new JButton("sinh");
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a= Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSinh.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSinh.setBounds(130, 192, 60, 51);
		frame.getContentPane().add(btnSinh);
		
		JButton btnLog = new JButton("Log");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a= Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnLog.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLog.setBounds(70, 192, 60, 51);
		frame.getContentPane().add(btnLog);
		
		JButton btnE = new JButton("e^x");
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a= Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnE.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnE.setBounds(70, 141, 60, 51);
		frame.getContentPane().add(btnE);
		
		JRadioButton rdbtnOn = new JRadioButton("On");
		rdbtnOn.setSelected(true);
		rdbtnOn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btn0.setEnabled(true);
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);
				
				btnEqual.setEnabled(true);
				btnSum.setEnabled(true);
				btnMinus.setEnabled(true);
				btnMpy.setEnabled(true);
				btnDivide.setEnabled(true);
				btnMod.setEnabled(true);
				
				btnSin.setEnabled(true);
				btnSinh.setEnabled(true);
				btnCos.setEnabled(true);
				btnCosh.setEnabled(true);
				btnTan.setEnabled(true);
				btnTanh.setEnabled(true);
				
				btnLog.setEnabled(true);
				btnE.setEnabled(true);
				btnB.setEnabled(true);
				btnC.setEnabled(true);
				btnRoot.setEnabled(true);
				btnPM.setEnabled(true);
				btnCube.setEnabled(true);
				btnSqr.setEnabled(true);
				btnPow.setEnabled(true);
				btnRev.setEnabled(true);
				btnFact.setEnabled(true);
				btnDot.setEnabled(true);
			}
		});
		buttonGroup.add(rdbtnOn);
		rdbtnOn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnOn.setBounds(10, 114, 43, 21);
		frame.getContentPane().add(rdbtnOn);
		
		JRadioButton rdbtnOff = new JRadioButton("Off");
		rdbtnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn0.setEnabled(false);
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
				
				btnEqual.setEnabled(false);
				btnSum.setEnabled(false);
				btnMinus.setEnabled(false);
				btnMpy.setEnabled(false);
				btnDivide.setEnabled(false);
				btnMod.setEnabled(false);
				
				btnSin.setEnabled(false);
				btnSinh.setEnabled(false);
				btnCos.setEnabled(false);
				btnCosh.setEnabled(false);
				btnTan.setEnabled(false);
				btnTanh.setEnabled(false);
				
				btnLog.setEnabled(false);
				btnE.setEnabled(false);
				btnB.setEnabled(false);
				btnC.setEnabled(false);
				btnRoot.setEnabled(false);
				btnPM.setEnabled(false);
				btnCube.setEnabled(false);
				btnSqr.setEnabled(false);
				btnPow.setEnabled(false);
				btnRev.setEnabled(false);
				btnFact.setEnabled(false);
				btnDot.setEnabled(false);
			}
		});
		buttonGroup.add(rdbtnOff);
		rdbtnOff.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnOff.setBounds(70, 114, 51, 21);
		frame.getContentPane().add(rdbtnOff);
	}
}
