import javax.swing.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Proj07Runner extends JFrame {
	
	JPanel panel;
	JButton btnLeft;
	JButton btnRight;
	JLabel label;
	
	public Proj07Runner() {
		System.out.println("I certify that this program is my own work");
        System.out.println("and is not the work of others. I agree not");
        System.out.println("to share my solution with others.");
        System.out.println("Caroline Kim\n");
		
		// JFrame
		this.setTitle("Caroline Kim");
		setLayout(new BorderLayout());
		this.setSize(250, 110);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		// JPanel
		panel = new JPanel();
		
		// JButton-01
		btnLeft = new JButton("Left");
		btnLeft.addActionListener(new MyMouse());
		btnLeft.setActionCommand("Left");
		panel.add(btnLeft);
		// JLabel
		label = new JLabel("Left");
		label.setOpaque(true);
		label.setBackground(Color.yellow);
		label.setForeground(Color.red);
		label.setText("Left");
		panel.add(label);
		// JButton-02
		btnRight = new JButton("Right");
		btnRight.addActionListener(new MyMouse());
		btnRight.setActionCommand("Right");
		panel.add(btnRight);
		

		
		this.add(panel, BorderLayout.CENTER);
		this.setVisible(true);


	}


	public class MyMouse implements ActionListener {
		
		public void actionPerformed(ActionEvent e){
			if(e.getActionCommand()=="Right"){
				label.setText("Right");
			}else{
				label.setText("Left");
			}
		}
	}
}