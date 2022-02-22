package windowbuilder;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LayOutTest2 implements ActionListener {

	private JFrame frame;
	private JTextField commandLine;
	public String displayText;
	
	public LayOutTest2() {
		
		initialize();
		this.displayText = "";
	}

	public void actionPerformed(ActionEvent e) {
//		JButton tempInfo = (JButton)e.getSource();
		
		String input = (String)e.getActionCommand();
//		displayText += tempInfo.getText();
//		int num;
//		num = Integer.parseInt(input);
		
		switch(input){
		case "0": 
			displayText += input;
				break;
		case "1": 
			displayText += input;
				break;
		case "2": 
			displayText += input;
				break;
		case "3": 
			displayText += input;
				break;
		case "4": 
			displayText += input;
				break;
		case "5": 
			displayText += input;
				break;
		case "6": 
			displayText += input;
				break;
		case "7": 
			displayText += input;
				break;
		case "8": 
			displayText += input;
				break;
		case "9": 
			displayText += input;
				break;
		}
		
		
	}
	
	public String makeText(String origin, String newWord) {
		return origin + newWord;
	}
	
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 354, 541);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 1, 5, 5));
		
		JPanel panelCommandLine = new JPanel(new GridLayout(0, 1, 0, 0));
		frame.getContentPane().add(panelCommandLine);
		
		commandLine = new JTextField();
		panelCommandLine.add(commandLine);
		commandLine.setColumns(10);
		
		JPanel panel1 = new JPanel(new GridLayout(0, 4, 5, 5));
		frame.getContentPane().add(panel1);
		
		JButton calButtonModule = new JButton("%");
		panel1.add(calButtonModule);
		calButtonModule.addActionListener(this);
		
		JButton calButtonRoot = new JButton("¡î");
		panel1.add(calButtonRoot);
		calButtonRoot.addActionListener(this);
		
		JButton calButtonClear = new JButton("C");
		panel1.add(calButtonClear);
		calButtonClear.addActionListener(this);
		
		JButton calButtonDiv = new JButton("¡À");
		panel1.add(calButtonDiv);
		calButtonDiv.addActionListener(this);
		
		JPanel panel2 = new JPanel(new GridLayout(0, 4, 5, 5));
		frame.getContentPane().add(panel2);
		
		JButton calButtonSeven = new JButton("7");
		panel2.add(calButtonSeven);
		calButtonSeven.addActionListener(this);
		
		JButton calButtonEight = new JButton("8");
		panel2.add(calButtonEight);
		calButtonEight.addActionListener(this);
		
		JButton calButtonNine = new JButton("9");
		panel2.add(calButtonNine);
		calButtonNine.addActionListener(this);
		
		JButton calButtonMul = new JButton("X");
		panel2.add(calButtonMul);
		calButtonMul.addActionListener(this);
		
		JPanel panel3 = new JPanel(new GridLayout(0, 4, 5, 5));
		frame.getContentPane().add(panel3);
		
		JButton calButtonFour = new JButton("4");
		panel3.add(calButtonFour);
		calButtonFour.addActionListener(this);
		
		JButton calButtonFive = new JButton("5");
		panel3.add(calButtonFive);
		calButtonFive.addActionListener(this);
		
		JButton calButtonSix = new JButton("6");
		panel3.add(calButtonSix);
		calButtonSix.addActionListener(this);
		
		JButton calButtonMinus = new JButton("-");
		panel3.add(calButtonMinus);
		calButtonMinus.addActionListener(this);
		
		JPanel panel4 = new JPanel(new GridLayout(0, 4, 5, 5));
		frame.getContentPane().add(panel4);
		
		JButton calButtonOne = new JButton("1");
		panel4.add(calButtonOne);
		calButtonOne.addActionListener(this);
		
		JButton calButtonTwo = new JButton("2");
		panel4.add(calButtonTwo);
		calButtonTwo.addActionListener(this);
		
		JButton calButtonThree = new JButton("3");
		panel4.add(calButtonThree);
		calButtonThree.addActionListener(this);
		
		JButton calButtonPlus = new JButton("+");
		panel4.add(calButtonPlus);
		calButtonPlus.addActionListener(this);
		
		JPanel panel5 = new JPanel(new GridLayout(0, 4, 5, 5));
		frame.getContentPane().add(panel5);
		
		JButton calButtonTrans = new JButton("+/-");
		panel5.add(calButtonTrans);
		calButtonTrans.addActionListener(this);
		
		JButton calButtonZero = new JButton("0");
		panel5.add(calButtonZero);
		calButtonZero.addActionListener(this);
		
		JButton calButtonDot = new JButton(".");
		panel5.add(calButtonDot);
		calButtonDot.addActionListener(this);
		
		JButton calButtonEqual = new JButton("=");
		panel5.add(calButtonEqual);
		calButtonEqual.addActionListener(this);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LayOutTest2 window = new LayOutTest2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
