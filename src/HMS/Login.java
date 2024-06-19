package HMS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class Login extends JFrame implements ActionListener {
	
	JLabel l1 = new JLabel();
	JLabel l2 = new JLabel();
	JLabel l3 = new JLabel();
	JTextField username = new JTextField();
	JPasswordField password = new JPasswordField();
	JButton login = new JButton("LOGIN");
	JButton cancel = new JButton("CANCEL");
	
	Login(){
		initCo();
		this.setLocationRelativeTo(null);
	}
	
	public void initCo() {
		
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		l1.setText("Username");
		l1.setBounds(50,20,80,30);
		add(l1);
		
		l2.setText("Password");
		l2.setBounds(50,70,80,30);
		add(l2);
		
		username.setBounds(140,26,120,20);
		add(username);
		
		password.setBounds(140,76,120,20);
		add(password);
		
		cancel.setBounds(40,120,100,20);
		cancel.setBackground(Color.black);
		cancel.setForeground(Color.white);
		cancel.addActionListener(this);
	    add(cancel);
		
		login.setBounds(170,120,100,20);
		login.setBackground(Color.black);
		login.setForeground(Color.white);
		login.addActionListener(this);
		add(login);
		
		ImageIcon i = new ImageIcon(getClass().getResource("/Icons/person image.png"));
		Image I = i.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon i1 = new ImageIcon(I);
		l3.setIcon(i1);
		l3.setBounds(270, 20,100,100);
		add(l3);
		
		setResizable(false);
		setTitle("Login");
		setSize(400,200);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == login) {
			
			try {
				
				FileReader read = new FileReader("user_credentials.txt");
				BufferedReader reader = new BufferedReader(read);
				String line;
				ArrayList<String> users = new ArrayList<>();
				
				while((line = reader.readLine()) !=null ) {
					
					users.add(line);
					
				}
				
				if(users.contains(username.getText()+":"+password.getText())) {
					
					MainInterface mainframe = new MainInterface(username.getText());
					mainframe.setVisible(true);
					dispose();
					
				}else {
					
					JOptionPane.showMessageDialog(this,"Username or Pasword is Invalid!!","Error",2);
					
				}
				
			} catch (IOException e1) {
				
				e1.printStackTrace();
			}
		
			
			
			
		}else if (e.getSource() == cancel) {
			Begin s = new Begin();
			s.setVisible(true);
			dispose();
		}
	}
	
	

	public static void main(String[] args) {
		
		Login log = new Login();

	}

}
