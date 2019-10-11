package com.bit;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyBankFrame extends JFrame {

	private JButton savingCreateBtn;
	private JButton loanCreateBtn;
	private JButton myBankCheckBtn;
	private JTextField testTextField;
	private JPanel savingCreatePanel;
	private JPanel loanCreatePanel;
	private JPanel myBankCheckPanel;
	private JPanel centerCardLayoutPanel;
	private CardLayout cardLayout;
	private JLabel savingCreateLabel;
	private JLabel loanCreateLabel;
	private JLabel myBankCheckLabel;
	private ActionListener btnHandle = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			String compName="";
			switch (e.getActionCommand()) {
			case "적금 통장 개설":
				compName="1";
				break;
			case "대출 통장 개설":
				compName="2";
				break;
			case "내 통장 확인":
				compName="3";
				break;
			}
			cardLayout.show(centerCardLayoutPanel, compName);
		}
	};

	public MyBankFrame() {
		super("MyBank 환영");
		savingCreateBtn = new JButton();
		loanCreateBtn = new JButton();
		myBankCheckBtn = new JButton();
		testTextField = new JTextField();

		JPanel leftPanel = new JPanel(new GridLayout(3, 1));
		leftPanel.add(savingCreateBtn);
		leftPanel.add(loanCreateBtn);
		leftPanel.add(myBankCheckBtn);
		cardLayout = new CardLayout();
		centerCardLayoutPanel = new JPanel(cardLayout);

		savingCreatePanel = new SavingCreatePanel();
		loanCreatePanel = new LoanCreatePanel();
		myBankCheckPanel = new MyBankCheckPanel();
		savingCreateLabel = new JLabel("saving");
		loanCreateLabel = new JLabel("loan");
		myBankCheckLabel = new JLabel("check");

//		savingCreatePanel.add(savingCreateLabel);
//		loanCreatePanel.add(loanCreateLabel);
//		myBankCheckPanel.add(myBankCheckLabel);

		centerCardLayoutPanel.add(savingCreatePanel, "1");
		centerCardLayoutPanel.add(loanCreatePanel, "2");
		centerCardLayoutPanel.add(myBankCheckPanel, "3");

		this.add(BorderLayout.WEST, leftPanel);
		this.add(BorderLayout.CENTER, centerCardLayoutPanel);

		savingCreateBtn.addActionListener(btnHandle);
		loanCreateBtn.addActionListener(btnHandle);
		myBankCheckBtn.addActionListener(btnHandle);
		init();
	}

	private void init() {
		// 초기화
		setBounds(10, 10, 500, 400);
		savingCreateBtn.setText("적금 통장 개설");
		loanCreateBtn.setText("대출 통장 개설");
		myBankCheckBtn.setText("내 통장 확인");
		// testTextField.setText(savingCreateBtn.getText());

	}

	public class SavingCreatePanel extends JPanel {
		public SavingCreatePanel() {
			add(new JLabel("SavingCreatePanel"));
		}
	}

	public class LoanCreatePanel extends JPanel {
		public LoanCreatePanel() {
			add(new JLabel("LoanCreatePanel"));
		}
	}

	public class MyBankCheckPanel extends JPanel {
		public MyBankCheckPanel() {
			add(new JLabel("MyBankCheckPanel"));
		}
	}

	public static void main(String[] args) {
		MyBankFrame frame = new MyBankFrame();
		frame.setVisible(true);
	}

}
