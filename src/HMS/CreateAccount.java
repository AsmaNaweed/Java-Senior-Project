package HMS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.regex.*;

public class CreateAccount extends JFrame implements ActionListener{
	
	// GUI components
	JLabel l1 = new JLabel(); // Label for username
	JLabel l2 = new JLabel(); // Label for password
	JLabel l3 = new JLabel(); // Label for person image
	JTextField username = new JTextField(); // Text field for username
	JPasswordField password = new JPasswordField(); // Password field for password
	JButton create = new JButton("CREATE ACCOUNT"); // Button to create an account
	JButton cancel = new JButton("CANCEL"); // Button to cancel account creation
	
	// Constructor
	CreateAccount(){
		initCo();
		this.setLocationRelativeTo(null); // Center the frame
	}
	
	// Method to initialize GUI components
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
		
		cancel.setBounds(40,120,105,20);
		cancel.setBackground(Color.black);
		cancel.setForeground(Color.white);
		cancel.setFont(new Font("",Font.BOLD,8));
		cancel.addActionListener(this);
		add(cancel);
		
		create.setBounds(170,120,105,20);
		create.setBackground(Color.black);
		create.setForeground(Color.white);
		create.setFont(new Font("",Font.BOLD,8));
		create.addActionListener(this);
		add(create);
		
		// Set and display the person image
		ImageIcon i = new ImageIcon(getClass().getResource("/Icons/person image.png"));
		Image I = i.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon i1 = new ImageIcon(I);
		l3.setIcon(i1);
		l3.setBounds(270, 20,100,100);
		add(l3);
		
		setResizable(false);
		setTitle("Account Creation");
		setSize(400,200);
		setVisible(true);
	}
	
	// Method to handle button clicks
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == cancel) {
			// If cancel button is clicked, go back to the Begin frame
			Begin s = new Begin();
			s.setVisible(true);
			dispose();
		} else if(e.getSource() == create) {
			try {
				// Read existing usernames from file
				FileReader r = new FileReader("user_credentials.txt");
				BufferedReader reader = new BufferedReader(r);
				String line;
				int index;
				ArrayList<String> user = new ArrayList<>();
				
				// Extract usernames from each line in the file
				while((line = reader.readLine()) != null) {
					index = line.indexOf(":");
					user.add(line.substring(0,index));
				}
				
				// Check if the entered username already exists
				if(user.contains(username.getText())) {
					JOptionPane.showMessageDialog(this,"Username already exists!!","Error",2);
				} else {
					// Validate password using regular expression
					String regex = "(?=[.*A-Z])(?=.*[a-z])(?=.*\\d).{9,}";
					Pattern pattern = Pattern.compile(regex);
					Matcher matcher = pattern.matcher(password.getText());
					
					if(matcher.find()) {
						// If password is valid, write the new username and password to the file
						FileWriter write = new FileWriter("user_credentials.txt",true);
						BufferedWriter writer = new BufferedWriter(write);
						writer.write(username.getText()+":"+password.getText()+"\n");
						writer.flush();
						writer.close();
						write.close();
						JOptionPane.showMessageDialog(this,"Account Created Successfully!!","Message",1);
						Begin s = new Begin();
						s.setVisible(true);
						dispose();
					} else {
						// If password is invalid, show error message
						JOptionPane.showMessageDialog(this,"Password must contain:\n*At least 9 Characters\n*An Uppercase letter\n*A Lowercase letter\n*A Digit","Password Validation",2);
					}
				}
			} catch (IOException e1) {
				// Handle IOException
				e1.printStackTrace();
			}
		}
	}
	
	// Main method
	public static void main(String[] args) {
		// Create an instance of CreateAccount
		CreateAccount log = new CreateAccount();
	}
}
