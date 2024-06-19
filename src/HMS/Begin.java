package HMS;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class Begin extends JFrame implements ActionListener {
	
	JLabel l1 = new JLabel();
	JLabel l2 = new JLabel();
	JButton create = new JButton("CREATE ACCOUNT");
	JButton login = new JButton("LOGIN");
	JButton cancel = new JButton("CANCEL");
	
	Begin(){
		
		initCo();
		this.setLocationRelativeTo(null);
		
	}
	
	public void initCo() {
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		
		ImageIcon i = new ImageIcon(getClass().getResource("/Icons/SeaShorePointHotel.jpg"));
		Image I = i.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
		ImageIcon i1 = new ImageIcon(I);
		l1.setIcon(i1);
		l1.setBounds(105, 50,300, 200);
		add(l1);
		
		l2.setText("Welcome to Sea Shore Point Hotel");
		l2.setBounds(140,0,250,30);
		l2.setForeground(Color.black);
		l2.setFont(new Font("serif",Font.BOLD,16));
		add(l2);
		
		
		cancel.setBounds(55,300,120,30);
		cancel.setFont(new Font("serif",Font.BOLD,9));
		cancel.setBackground(Color.BLACK);
		cancel.setForeground(Color.white);
		cancel.addActionListener(this);
		add(cancel);
		
		create.setBounds(195,300,120,30);
		create.setFont(new Font("serif",Font.BOLD,9));
		create.setBackground(Color.BLACK);
		create.setForeground(Color.white);
		create.addActionListener(this);
		add(create);
		
		login.setBounds(335,300,120,30);
		login.setFont(new Font("serif",Font.BOLD,9));
		login.setBackground(Color.BLACK);
		login.setForeground(Color.white);
		login.addActionListener(this);
		add(login);
		
		setResizable(false);
		setTitle("Sea Shore Inc");
		setSize(520,400);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == login) {
			
			Login log = new Login();
			log.setVisible(true);
			dispose();
		
		}else if(e.getSource() == create) {
			
			CreateAccount c = new CreateAccount();
			c.setVisible(true);
			dispose();
			
		}else if(e.getSource() == cancel) {
			dispose();
		}
		
		
	}


	public static void main(String[] args) {
	
		Begin s = new Begin();

	}

	
	

}
