package Calculator_1410;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ButtonGroup;


public class Calgui {

	private JFrame frame;
	private JTextField textField;
	

	

	/**
	 * Launch the application.
	 */
	
	Calculate acc = new Calculate();
	private final Action action = new SwingAction();
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calgui window = new Calgui();
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
	public Calgui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(119, 136, 153));
		frame.setBounds(100, 100, 545, 532);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText();
				
				textField.setText("0");
			}
		});
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Arial Black", Font.BOLD, 21));
		textField.setBounds(27, 50, 473, 68);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("CSIS-1410 Calculator");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 21));
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setBackground(new Color(139, 69, 19));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 521, 28);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btn_1 = new JButton("1");
		btn_1.setFont(new Font("Arial Black", Font.BOLD, 21));
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = textField.getText() + btn_1.getText();
				textField.setText(number);
				
			}
		});
		btn_1.setBounds(27, 223, 78, 43);
		frame.getContentPane().add(btn_1);
		
		JButton btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn_2.getText();
				textField.setText(number);
			}
		});
		btn_2.setFont(new Font("Arial Black", Font.BOLD, 21));
		btn_2.setBounds(115, 224, 78, 40);
		frame.getContentPane().add(btn_2);
		
		JButton btn_3 = new JButton("3");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn_3.getText();
				textField.setText(number);
			}
		});
		btn_3.setFont(new Font("Arial Black", Font.BOLD, 21));
		btn_3.setBounds(203, 223, 78, 43);
		frame.getContentPane().add(btn_3);
		
		JButton btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn_4.getText();
				textField.setText(number);
			}
		});
		btn_4.setFont(new Font("Arial Black", Font.BOLD, 21));
		btn_4.setBounds(27, 277, 78, 43);
		frame.getContentPane().add(btn_4);
		
		JButton btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn_5.getText();
				textField.setText(number);
			}
		});
		btn_5.setFont(new Font("Arial Black", Font.BOLD, 21));
		btn_5.setBounds(115, 277, 78, 43);
		frame.getContentPane().add(btn_5);
		
		JButton btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn_6.getText();
				textField.setText(number);
			}
		});
		btn_6.setFont(new Font("Arial Black", Font.PLAIN, 21));
		btn_6.setBounds(203, 277, 78, 43);
		frame.getContentPane().add(btn_6);
		
		JButton btn_7 = new JButton("7");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn_7.getText();
				textField.setText(number);
			}
		});
		btn_7.setFont(new Font("Arial Black", Font.BOLD, 21));
		btn_7.setBounds(27, 331, 78, 43);
		frame.getContentPane().add(btn_7);
		
		JButton btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn_8.getText();
				textField.setText(number);
			}
		});
		btn_8.setFont(new Font("Arial Black", Font.BOLD, 21));
		btn_8.setBounds(115, 331, 78, 43);
		frame.getContentPane().add(btn_8);
		
		JButton btn_9 = new JButton("9");
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn_9.getText();
				textField.setText(number);
			}
		});
		btn_9.setFont(new Font("Arial Black", Font.BOLD, 21));
		btn_9.setBounds(203, 331, 78, 43);
		frame.getContentPane().add(btn_9);
		
		JButton btn_0 = new JButton("0");
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn_0.getText();
				textField.setText(number);
			}
		});
		btn_0.setFont(new Font("Arial Black", Font.BOLD, 21));
		btn_0.setBounds(27, 387, 78, 43);
		frame.getContentPane().add(btn_0);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				acc.secNum = Double.parseDouble(textField.getText());
				acc.add();
				acc.sub();
				acc.mul();
				acc.div();
				acc.rem();
				acc.power();
				acc.squre();
				
				textField.setText(acc.ans);
				
			
			}
		});
		btnEqual.setFont(new Font("Arial Black", Font.BOLD, 21));
		btnEqual.setBounds(203, 387, 78, 43);
		frame.getContentPane().add(btnEqual);
		
		JButton btnP = new JButton("+");
		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acc.fnum = Double.parseDouble(textField.getText());
				textField.setText("");
				acc.operation = "+";
				
				
				
				
			}
		});
		btnP.setFont(new Font("Arial Black", Font.BOLD, 21));
		btnP.setBounds(309, 199, 78, 43);
		frame.getContentPane().add(btnP);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acc.fnum = Double.parseDouble(textField.getText());
				textField.setText("");
				acc.operation = "-";
			}
		});
		btnSub.setFont(new Font("Arial Black", Font.BOLD, 21));
		btnSub.setBounds(397, 145, 78, 43);
		frame.getContentPane().add(btnSub);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acc.fnum = Double.parseDouble(textField.getText());
				textField.setText("");
				acc.operation = "*";
			}
		});
		btnMul.setFont(new Font("Arial Black", Font.BOLD, 21));
		btnMul.setBounds(397, 199, 78, 43);
		frame.getContentPane().add(btnMul);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acc.fnum = Double.parseDouble(textField.getText());
				textField.setText("");
				acc.operation = "/";
			}
		});
		btnDiv.setFont(new Font("Arial Black", Font.BOLD, 21));
		btnDiv.setBounds(397, 254, 78, 43);
		frame.getContentPane().add(btnDiv);
		
		JButton btnRem = new JButton("%");
		btnRem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acc.fnum = Double.parseDouble(textField.getText());
				textField.setText("");
				acc.operation = "%";
			}
		});
		btnRem.setFont(new Font("Arial Black", Font.BOLD, 21));
		btnRem.setBounds(309, 254, 78, 43);
		frame.getContentPane().add(btnRem);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Arial Black", Font.BOLD, 21));
		btnDot.setBounds(115, 387, 78, 43);
		frame.getContentPane().add(btnDot);
		
		JButton btnBack = new JButton("\u2190");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				
				if(textField.getText().length() > 0) {
					
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace = str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnBack.setFont(new Font("Arial Black", Font.BOLD, 21));
		btnBack.setBounds(309, 145, 78, 43);
		frame.getContentPane().add(btnBack);
		
		JButton btnCl = new JButton("Cl");
		btnCl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnCl.setFont(new Font("Arial Black", Font.BOLD, 21));
		btnCl.setBounds(203, 170, 78, 43);
		frame.getContentPane().add(btnCl);
		
		JButton btnPower = new JButton("^");
		btnPower.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acc.fnum = Double.parseDouble(textField.getText());
				textField.setText("");
				acc.operation = "^";
			}
		});
		btnPower.setFont(new Font("Arial Black", Font.BOLD, 21));
		btnPower.setBounds(397, 308, 78, 43);
		frame.getContentPane().add(btnPower);
		
		JButton btnSqroot = new JButton("\u221A");
		btnSqroot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acc.ops = Double.parseDouble(String.valueOf(textField.getText()));
				acc.ops = Double.parseDouble(String.valueOf(textField.getText()));
				textField.setText(String.valueOf(acc.ops));
				textField.setText("\u221A");
				
				acc.operation = "\u221A";
			}
		});
		btnSqroot.setFont(new Font("Arial Black", Font.BOLD, 21));
		btnSqroot.setBounds(309, 308, 78, 43);
		frame.getContentPane().add(btnSqroot);
		
		JButton btnAns = new JButton("ans");
		btnAns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(acc.ans);
			}
		});
		btnAns.setFont(new Font("Arial Black", Font.BOLD, 21));
		btnAns.setBounds(27, 441, 78, 43);
		frame.getContentPane().add(btnAns);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("ON");
		rdbtnNewRadioButton.setBackground(new Color(222, 184, 135));
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_1.setEnabled(true);
				btn_2.setEnabled(true);
				btn_3.setEnabled(true);
				btn_4.setEnabled(true);
				btn_5.setEnabled(true);
				btn_6.setEnabled(true);
				btn_7.setEnabled(true);
				btn_8.setEnabled(true);
				btn_9.setEnabled(true);
				btn_0.setEnabled(true);
				btnCl.setEnabled(true);
				btnP.setEnabled(true);
				btnSub.setEnabled(true);
				btnMul.setEnabled(true);
				btnBack.setEnabled(true);
				btnDot.setEnabled(true);
				btnRem.setEnabled(true);
				btnDiv.setEnabled(true);
				btnPower.setEnabled(true);
				btnEqual.setEnabled(true);
				btnSqroot.setEnabled(true);
				btnAns.setEnabled(true);
				textField.setEnabled(true);
			}
		});
		rdbtnNewRadioButton.setFont(new Font("Arial Black", Font.BOLD, 18));
		rdbtnNewRadioButton.setForeground(Color.RED);
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(10, 147, 78, 43);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnOff = new JRadioButton("OFF");
		rdbtnOff.setBackground(new Color(100, 149, 237));
		rdbtnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_1.setEnabled(false);
				btn_2.setEnabled(false);
				btn_3.setEnabled(false);
				btn_4.setEnabled(false);
				btn_5.setEnabled(false);
				btn_6.setEnabled(false);
				btn_7.setEnabled(false);
				btn_8.setEnabled(false);
				btn_9.setEnabled(false);
				btn_0.setEnabled(false);
				btnCl.setEnabled(false);
				btnP.setEnabled(false);
				btnSub.setEnabled(false);
				btnMul.setEnabled(false);
				btnBack.setEnabled(false);
				btnDot.setEnabled(false);
				btnRem.setEnabled(false);
				btnDiv.setEnabled(false);
				btnPower.setEnabled(false);
				btnEqual.setEnabled(false);
				btnSqroot.setEnabled(false);
				btnAns.setEnabled(false);
				textField.setEnabled(false);
			}
		});
		rdbtnOff.setFont(new Font("Arial Black", Font.BOLD, 18));
		rdbtnOff.setForeground(Color.RED);
		buttonGroup.add(rdbtnOff);
		rdbtnOff.setBounds(101, 147, 83, 43);
		frame.getContentPane().add(rdbtnOff);
		
		JButton btnSave = new JButton("save");
		btnSave.setFont(new Font("Arial Black", Font.BOLD, 21));
		btnSave.setBounds(115, 441, 89, 43);
		frame.getContentPane().add(btnSave);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
