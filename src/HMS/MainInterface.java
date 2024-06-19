package HMS;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainInterface extends JFrame implements ActionListener{
	
	JLabel l1 = new JLabel();
	JLabel name = new JLabel();
	JLabel imagelabel = new JLabel();
	JButton reserve = new JButton("Reserve");
	JButton price = new JButton("View Pricing");
	JButton check = new JButton("Check Availability");
	JButton logout = new JButton("Log Out");
	JButton manager = new JButton("Manager");
	String USER;
	
	MainInterface(String user){
		
		USER = user;
		initCo();
		this.setLocationRelativeTo(null);
		
	}
	
	public void initCo() {
		
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		l1.setText("Welcome to Sea Shore Reservation System");
		l1.setFont(new Font("arial",Font.BOLD,16));
		l1.setBounds(150,20,350,20);
		add(l1);
		
		name.setFont(new Font("calibri",Font.BOLD,16));
		name.setText("Welcome "+USER);
		name.setBounds(20,60,300,20);
		add(name);
		
		ImageIcon i = new ImageIcon(getClass().getResource("/Icons/receptionimage.jpg"));
		Image img = i.getImage().getScaledInstance(500, 280, Image.SCALE_DEFAULT);
		ImageIcon image = new ImageIcon(img);
		imagelabel.setIcon(image);
		imagelabel.setBounds(65,120,500,280);
		add(imagelabel);
		
		reserve.setBounds(35,430,150,30);
		reserve.setBackground(Color.black);
		reserve.setForeground(Color.white);
		reserve.addActionListener(this);
		add(reserve);
		
		check.setBounds(242,430,150,30);
		check.setBackground(Color.black);
		check.setForeground(Color.white);
		check.addActionListener(this);
		add(check);
		
		price.setBounds(450,430,150,30);
		price.setBackground(Color.black);
		price.setForeground(Color.white);
		price.addActionListener(this);
		add(price);
		
		logout.setBounds(450,60,150,20);
		logout.setBackground(Color.black);
		logout.setForeground(Color.white);
		logout.addActionListener(this);
		add(logout);
		
		manager.setForeground(Color.white);
		manager.addActionListener(this);
		manager.setBackground(Color.black);
	    manager.setBounds(10,10,100,20);
		add(manager);
		
		setResizable(false);
		setSize(650,550);
		setTitle("Reservation System");
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == logout) {
			
			Login log = new Login();
			log.setVisible(true);
			dispose();
			
		}else if(e.getSource() == check) {
			CheckAvail checkavail = new CheckAvail(USER);
			checkavail.setVisible(true);
			dispose();
			
			
		}else if(e.getSource() == price) {
			
			CheckPrice checkprice = new CheckPrice();
			checkprice.setVisible(true);
			
			
		}else if(e.getSource() == reserve) {
			
			Reserve r = new Reserve(USER);
			r.setVisible(true);
			dispose();
			
		}else if(e.getSource() == manager) {
			
			OwnerUpdate o = new OwnerUpdate();
			o.setVisible(true);
			
			
		}
		
	}


	public static void main(String[] args) {
		
		MainInterface inter = new MainInterface(null);
		
	}

}
