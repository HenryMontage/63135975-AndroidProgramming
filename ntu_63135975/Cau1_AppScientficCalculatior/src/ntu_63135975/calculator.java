package ntu_63135975;
import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class calculator {

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
					calculator window = new calculator();
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
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 363, 431);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SCIENTFIC CALCULATOR");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 10, 329, 31);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField.setBounds(10, 41, 329, 48);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnR = new JButton("\u221A");
		btnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnR.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnR.setBounds(10, 127, 65, 35);
		frame.getContentPane().add(btnR);
		
		JButton btn1_x = new JButton("1/x");
		btn1_x.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = 1/(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btn1_x.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btn1_x.setBounds(10, 164, 65, 35);
		frame.getContentPane().add(btn1_x);
		
		JButton btnX_Y = new JButton("X^Y");
		btnX_Y.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "X^Y";
			}
		});
		btnX_Y.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnX_Y.setBounds(10, 201, 65, 35);
		frame.getContentPane().add(btnX_Y);
		
		JButton btnX_3 = new JButton("X^3");
		btnX_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(textField.getText());
				a = a*a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnX_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnX_3.setBounds(10, 238, 65, 35);
		frame.getContentPane().add(btnX_3);
		
		JButton btnX_2 = new JButton("X^2");
		btnX_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(textField.getText());
				a = a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnX_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnX_2.setBounds(10, 275, 65, 35);
		frame.getContentPane().add(btnX_2);
		
		JButton btnN_giaithua = new JButton("n!");
		btnN_giaithua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(textField.getText());
				double fact =1;
				while(a!=0) {
					fact = fact	*a;
					a--;
				}
				textField.setText("");
				textField.setText(textField.getText()+fact);
			}
		});
		btnN_giaithua.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnN_giaithua.setBounds(10, 312, 65, 35);
		frame.getContentPane().add(btnN_giaithua);
		
		JButton btnPlusMinus = new JButton("+/-");
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(String.valueOf(textField.getText()));
				a = a*(-1);
				textField.setText(String.valueOf(a));
			}
		});
		btnPlusMinus.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnPlusMinus.setBounds(10, 349, 65, 35);
		frame.getContentPane().add(btnPlusMinus);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn1.setBounds(76, 312, 65, 35);
		frame.getContentPane().add(btn1);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn4.setBounds(76, 275, 65, 35);
		frame.getContentPane().add(btn4);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn7.setBounds(76, 238, 65, 35);
		frame.getContentPane().add(btn7);
		
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "%";
			}
		});
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnPercent.setBounds(76, 201, 65, 35);
		frame.getContentPane().add(btnPercent);
		
		JButton btnlog = new JButton("Log");
		btnlog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnlog.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnlog.setBounds(76, 164, 65, 35);
		frame.getContentPane().add(btnlog);
		
		JButton btnE_X = new JButton("e^x");
		btnE_X.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnE_X.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnE_X.setBounds(76, 127, 65, 35);
		frame.getContentPane().add(btnE_X);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn0.setBounds(76, 349, 131, 35);
		frame.getContentPane().add(btn0);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn2.setBounds(142, 312, 65, 35);
		frame.getContentPane().add(btn2);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn5.setBounds(142, 275, 65, 35);
		frame.getContentPane().add(btn5);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn8.setBounds(142, 238, 65, 35);
		frame.getContentPane().add(btn8);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnClear.setBounds(142, 201, 65, 35);
		frame.getContentPane().add(btnClear);
		
		JButton btnsinh = new JButton("Sinh");
		btnsinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnsinh.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnsinh.setBounds(142, 164, 65, 35);
		frame.getContentPane().add(btnsinh);
		
		JButton btnsin = new JButton("Sin");
		btnsin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.asin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnsin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnsin.setBounds(142, 127, 65, 35);
		frame.getContentPane().add(btnsin);
		
		JButton btnCham = new JButton(".");
		btnCham.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnCham.getText();
				textField.setText(number);
			}
		});
		btnCham.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnCham.setBounds(209, 349, 65, 35);
		frame.getContentPane().add(btnCham);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn3.setBounds(209, 312, 65, 35);
		frame.getContentPane().add(btn3);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn6.setBounds(209, 275, 65, 35);
		frame.getContentPane().add(btn6);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn9.setBounds(209, 238, 65, 35);
		frame.getContentPane().add(btn9);
		
		JButton btnBackSpace = new JButton("\uF0E7");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				if(textField.getText().length()>0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace = str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnBackSpace.setFont(new Font("Wingdings", Font.PLAIN, 21));
		btnBackSpace.setBounds(209, 201, 65, 35);
		frame.getContentPane().add(btnBackSpace);
		
		JButton btncosh = new JButton("Cosh");
		btncosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btncosh.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btncosh.setBounds(209, 164, 65, 35);
		frame.getContentPane().add(btncosh);
		
		JButton btncos = new JButton("Cos");
		btncos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btncos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btncos.setBounds(209, 127, 65, 35);
		frame.getContentPane().add(btncos);
		
		JButton btnBang = new JButton("=");
		btnBang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second = Double.parseDouble(textField.getText());
				if(operation == "+")
				{
					result = first + second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "-")
				{
					result = first - second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "*")
				{
					result = first * second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "/")
				{
					result = first / second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "%")
				{
					result = first % second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "X^Y") {
					double result = 1;
					for(int i = 0; i < second; i++) {
						result = first * result;
					}
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		btnBang.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnBang.setBounds(274, 349, 65, 35);
		frame.getContentPane().add(btnBang);
		
		JButton btnChia = new JButton("/");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		btnChia.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnChia.setBounds(274, 312, 65, 35);
		frame.getContentPane().add(btnChia);
		
		JButton btnNhan = new JButton("*");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		btnNhan.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnNhan.setBounds(274, 275, 65, 35);
		frame.getContentPane().add(btnNhan);
		
		JButton btnTru = new JButton("-");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		btnTru.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnTru.setBounds(274, 238, 65, 35);
		frame.getContentPane().add(btnTru);
		
		JButton btnCong = new JButton("+");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
		});
		btnCong.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnCong.setBounds(274, 201, 65, 35);
		frame.getContentPane().add(btnCong);
		
		JButton btntanh = new JButton("Tanh");
		btntanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btntanh.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btntanh.setBounds(274, 164, 65, 35);
		frame.getContentPane().add(btntanh);
		
		JButton btntan = new JButton("Tan");
		btntan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btntan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btntan.setBounds(274, 127, 65, 35);
		frame.getContentPane().add(btntan);
		
		JRadioButton rdbtnOn = new JRadioButton("ON");
		buttonGroup.add(rdbtnOn);
		rdbtnOn.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnOn.setBounds(20, 95, 60, 26);
		frame.getContentPane().add(rdbtnOn);
		
		JRadioButton rdbtnOff = new JRadioButton("OFF");
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
				btnCham.setEnabled(false);
				btnR.setEnabled(false);
				btn1_x.setEnabled(false);
				btnX_Y.setEnabled(false);
				btnX_3.setEnabled(false);
				btnX_2.setEnabled(false);
				btnN_giaithua.setEnabled(false);
				btnPlusMinus.setEnabled(false);
				btnE_X.setEnabled(false);
				btnlog.setEnabled(false);
				btnPercent.setEnabled(false);
				btnsin.setEnabled(false);
				btncos.setEnabled(false);
				btntan.setEnabled(false);
				btnsinh.setEnabled(false);
				btncosh.setEnabled(false);
				btntanh.setEnabled(false);
				btnClear.setEnabled(false);
				btnBackSpace.setEnabled(false);
				btnCong.setEnabled(false);
				btnTru.setEnabled(false);
				btnNhan.setEnabled(false);
				btnChia.setEnabled(false);
				btnBang.setEnabled(false);
			}
		});
		buttonGroup.add(rdbtnOff);
		rdbtnOff.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnOff.setBounds(76, 95, 65, 26);
		frame.getContentPane().add(rdbtnOff);
	}
}
