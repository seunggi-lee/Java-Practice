package windowbuilder;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class LayoutTest implements ActionListener {

	private JFrame frame;
	private JTextField display;

	public String displayText;
	
	public LayoutTest() {
		makeCaculator();
		displayText = "";
	}
	
	public void makeCaculator() {
		frame = new JFrame();
		frame.setBounds(100, 100, 614, 469);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton1 = new JButton("1");
		btnNewButton1.setBounds(33, 108, 91, 72);
		frame.getContentPane().add(btnNewButton1);
		btnNewButton1.addActionListener(this);
		
		JButton btnNewButton2 = new JButton("2");
		btnNewButton2.setBounds(167, 108, 91, 72);
		frame.getContentPane().add(btnNewButton2);
		btnNewButton2.addActionListener(this);
		
		JButton btnNewButton3 = new JButton("3");
		btnNewButton3.setBounds(312, 108, 91, 72);
		frame.getContentPane().add(btnNewButton3);
		btnNewButton3.addActionListener(this);
		
		JButton btnNewButton4 = new JButton("4");
		btnNewButton4.setBounds(33, 217, 91, 72);
		frame.getContentPane().add(btnNewButton4);
		btnNewButton4.addActionListener(this);
		
		JButton btnNewButton5 = new JButton("5");
		btnNewButton5.setBounds(167, 217, 91, 72);
		frame.getContentPane().add(btnNewButton5);
		btnNewButton5.addActionListener(this);
		
		JButton btnNewButton6 = new JButton("6");
		btnNewButton6.setBounds(312, 217, 91, 72);
		frame.getContentPane().add(btnNewButton6);
		btnNewButton6.addActionListener(this);
		
		JButton btnNewButton7 = new JButton("7");
		btnNewButton7.setBounds(33, 334, 91, 72);
		frame.getContentPane().add(btnNewButton7);
		btnNewButton7.addActionListener(this);
		
		JButton btnNewButton8 = new JButton("8");
		btnNewButton8.setBounds(167, 334, 91, 72);
		frame.getContentPane().add(btnNewButton8);
		btnNewButton8.addActionListener(this);
		
		JButton btnNewButton9 = new JButton("9");
		btnNewButton9.setBounds(312, 334, 91, 72);
		frame.getContentPane().add(btnNewButton9);
		btnNewButton9.addActionListener(this);
		
		display = new JTextField();
		display.setBounds(33, 21, 525, 55);
		frame.getContentPane().add(display);
		display.setColumns(10);
		
		JButton clearButton = new JButton("clear");
		clearButton.setBounds(438, 108, 120, 72);
		frame.getContentPane().add(clearButton);
		clearButton.addActionListener(this);
		
		JButton multipleButton = new JButton("X");
		multipleButton.setBounds(438, 217, 120, 72);
		frame.getContentPane().add(multipleButton);
		multipleButton.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		JButton tempInfo = (JButton)e.getSource(); // 내가 생각한 계산기 버튼 입력 시 정보 저장할 방법들
		displayText += tempInfo.getText();
		display.setText(displayText);
		
	}
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LayoutTest window = new LayoutTest();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
}
