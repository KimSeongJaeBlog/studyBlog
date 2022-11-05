package uis;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;

import bases.BButton;
import javaGuiProject.BaseFrame;
import javaGuiProject.BasePanel;

public class WorkAddUi extends BaseFrame {
	private JTextField workTest;
	private BButton addWork;

	public WorkAddUi() {
		// TODO Auto-generated constructor stub
		setFrame(400, 100, "");
		close();
//		return workTest.getText();
	}

	@Override
	public void mkComp() {
		// TODO Auto-generated method stub
		workTest = new JTextField();
		addWork = new BButton("추가").boderBackgroundNone();
	}

	@Override
	public void addComp() {
		// TODO Auto-generated method stub
		jpCenter.add(workTest);
		jpRight.add(addWork);
	}

	@Override
	public void addEvent() {
		// TODO Auto-generated method stub
		addWork.addActionListener(e->{
			System.out.println(1);
			super.setVisible(false);
			System.out.println(workTest.getText());
		});
	}

	public static void main(String[] args) {
		new WorkAddUi();
	}

}
