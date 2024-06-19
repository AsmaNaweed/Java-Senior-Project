package HMS;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;

import javax.swing.*;

public class CheckPrice extends JFrame implements ActionListener{
	
	JLabel imagelabel = new JLabel();
	JLabel label = new JLabel();
	JButton ok = new JButton("OK");
	
	CheckPrice(){
		initCo();
		this.setLocationRelativeTo(null);
	}
	
	public void initCo() {
		
		setLayout(null);
		getContentPane().setBackground(Color.white);
		
		ImageIcon i = new ImageIcon(getClass().getResource("/Icons/Price Image.png"));
		Image img = i.getImage().getScaledInstance(500, 100, Image.SCALE_DEFAULT);
		ImageIcon image = new ImageIcon(img);
		imagelabel.setIcon(image);
		imagelabel.setBounds(40,70,500,100);
		add(imagelabel);
		
		label.setForeground(Color.BLUE);
		label.setFont(new Font("arial",Font.BOLD,18));
		label.setText(" Check Prices");
		label.setBounds(232,20,150,30);
		add(label);
		
		ok.addActionListener(this);
		ok.setForeground(Color.white);
		ok.setBackground(Color.blue);
		ok.setBounds(215,195,150,30);
		add(ok);
		
		setResizable(false);
		setTitle("Privacy License Agreement");
		setSize(600,300);
		setVisible(true);
	}
	
    public void actionPerformed(ActionEvent e) {
		dispose();
		
	}

	public static void main(String[] args) {
		CheckPrice check = new CheckPrice();

	}


	

}
