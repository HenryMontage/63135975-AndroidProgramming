import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class calculator {

	private JFrame frame;
	private JTextField textField;

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
		frame.setBounds(100, 100, 363, 426);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SCIENTFIC CALCULATOR");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 10, 305, 31);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(10, 41, 329, 50);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnR = new JButton("R");
		btnR.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnR.setBounds(10, 122, 65, 35);
		frame.getContentPane().add(btnR);
		
		JButton btnNewButton_1 = new JButton("1/x");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnNewButton_1.setBounds(10, 159, 65, 35);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("X^Y");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_2.setBounds(10, 196, 65, 35);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("X^3");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_3.setBounds(10, 233, 65, 35);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("X^2");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_4.setBounds(10, 270, 65, 35);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("n!");
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnNewButton_5.setBounds(10, 307, 65, 35);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnPlusMinus = new JButton("+/-");
		btnPlusMinus.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnPlusMinus.setBounds(10, 344, 65, 35);
		frame.getContentPane().add(btnPlusMinus);
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn1.setBounds(76, 307, 65, 35);
		frame.getContentPane().add(btn1);
		
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn4.setBounds(76, 270, 65, 35);
		frame.getContentPane().add(btn4);
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn7.setBounds(76, 233, 65, 35);
		frame.getContentPane().add(btn7);
		
		JButton btnPercent = new JButton("%");
		btnPercent.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnPercent.setBounds(76, 196, 65, 35);
		frame.getContentPane().add(btnPercent);
		
		JButton btnNewButton_1_1 = new JButton("Log");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnNewButton_1_1.setBounds(76, 159, 65, 35);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_7 = new JButton("e^x");
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_7.setBounds(76, 122, 65, 35);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn0.setBounds(76, 344, 131, 35);
		frame.getContentPane().add(btn0);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn2.setBounds(142, 307, 65, 35);
		frame.getContentPane().add(btn2);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn5.setBounds(142, 270, 65, 35);
		frame.getContentPane().add(btn5);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn8.setBounds(142, 233, 65, 35);
		frame.getContentPane().add(btn8);
		
		JButton btnClear = new JButton("C");
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnClear.setBounds(142, 196, 65, 35);
		frame.getContentPane().add(btnClear);
		
		JButton btnNewButton_1_2 = new JButton("Sinh");
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1_2.setBounds(142, 159, 65, 35);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_8 = new JButton("Sin");
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_8.setBounds(142, 122, 65, 35);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnCham = new JButton(".");
		btnCham.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnCham.setBounds(209, 344, 65, 35);
		frame.getContentPane().add(btnCham);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn3.setBounds(209, 307, 65, 35);
		frame.getContentPane().add(btn3);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn6.setBounds(209, 270, 65, 35);
		frame.getContentPane().add(btn6);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn9.setBounds(209, 233, 65, 35);
		frame.getContentPane().add(btn9);
		
		JButton btnBackSpace = new JButton("B");
		btnBackSpace.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnBackSpace.setBounds(209, 196, 65, 35);
		frame.getContentPane().add(btnBackSpace);
		
		JButton btnNewButton_1_3 = new JButton("Cosh");
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1_3.setBounds(209, 159, 65, 35);
		frame.getContentPane().add(btnNewButton_1_3);
		
		JButton btnNewButton_9 = new JButton("Cos");
		btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_9.setBounds(209, 122, 65, 35);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnBang = new JButton("=");
		btnBang.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnBang.setBounds(274, 344, 65, 35);
		frame.getContentPane().add(btnBang);
		
		JButton btnChia = new JButton("/");
		btnChia.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnChia.setBounds(274, 307, 65, 35);
		frame.getContentPane().add(btnChia);
		
		JButton btnNhan = new JButton("*");
		btnNhan.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnNhan.setBounds(274, 270, 65, 35);
		frame.getContentPane().add(btnNhan);
		
		JButton btnTru = new JButton("-");
		btnTru.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnTru.setBounds(274, 233, 65, 35);
		frame.getContentPane().add(btnTru);
		
		JButton btnCong = new JButton("+");
		btnCong.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnCong.setBounds(274, 196, 65, 35);
		frame.getContentPane().add(btnCong);
		
		JButton btnNewButton_1_4 = new JButton("Tanh");
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1_4.setBounds(274, 159, 65, 35);
		frame.getContentPane().add(btnNewButton_1_4);
		
		JButton btnNewButton_10 = new JButton("Tan");
		btnNewButton_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_10.setBounds(274, 122, 65, 35);
		frame.getContentPane().add(btnNewButton_10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("ON");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnNewRadioButton.setBounds(10, 95, 49, 21);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnOff = new JRadioButton("OFF");
		rdbtnOff.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnOff.setBounds(65, 95, 57, 21);
		frame.getContentPane().add(rdbtnOff);
	}
}
