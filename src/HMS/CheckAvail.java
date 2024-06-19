package HMS;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class CheckAvail extends JFrame implements ActionListener {
	
	JLabel label = new JLabel();
	JLabel label1 = new JLabel();
	JLabel label2 = new JLabel();
	JLabel label3 = new JLabel();
	JLabel label4 = new JLabel();
	JLabel label5 = new JLabel();
	JLabel status = new JLabel();
	
	
	JButton back = new JButton("Back");
	JRadioButton ground = new JRadioButton("Ground Floor");
	JRadioButton first = new JRadioButton("First Floor");
	JRadioButton second = new JRadioButton("Second Floor");
	ButtonGroup radio = new ButtonGroup();
	String weeks[] = {	    		    
		    "May 14 - May 20",
		    "May 21 - May 27",
		    "May 28 - Jun 03",
		    "Jun 04 - Jun 10",
		    "Jun 11 - Jun 17",
		    "Jun 18 - Jun 24",
		    "Jun 25 - Jul 01",
		    "Jul 02 - Jul 08",
		    "Jul 09 - Jul 15",
		    "Jul 16 - Jul 22",
		    "Jul 23 - Jul 29",
		    "Jul 30 - Aug 05",
		    "Aug 06 - Aug 12",
		    "Aug 13 - Aug 19",
		    "Aug 20 - Aug 26",
		    "Aug 27 - Sep 02"
		};
	JComboBox week = new JComboBox(weeks);
	String USER;
	
	CheckAvail(String user){
		USER = user;
		initCo();
		this.setLocationRelativeTo(null);
	}
	
	public void initCo() {
		
		getContentPane().setBackground(Color.white);
		setLayout(null);
		
		label.setText("Check the Availability Here");
		label.setBounds(170,20,250,20);
		label.setFont(new Font("arial", Font.BOLD,18));
		add(label);
		
		label1.setText("Please Select your week of stay "+USER+" :");
		label1.setBounds(40,60,560,20);
		add(label1);
		
		week.setBackground(Color.white);
		week.setBounds(40,90,150,20);
		week.addActionListener(this);
		add(week);
		
		label2.setBounds(40,120,150,20);
		label2.setText("Please Select the Floor :");
		add(label2);
		
		ground.setBackground(Color.white);
		ground.setBounds(50,160,120,20);
		ground.addActionListener(this);
		add(ground);
		
		first.setBackground(Color.white);
		first.setBounds(50,210,120,20);
		first.addActionListener(this);
		add(first);
		
		second.setBackground(Color.white);
		second.setBounds(50,260,120,20);
		second.addActionListener(this);
		add(second);
		
		radio.add(ground);
		radio.add(first);
		radio.add(second);
		
		label3.setText("3 Badrooms , 8 Sleeps , 2 ½ Bathrooms , Kitchenette");
		label3.setForeground(Color.blue);
		label3.setBounds(200,160,350,20);
		add(label3);
		
		label4.setText("2 Badrooms , 5 Sleeps , 2 Bathrooms , Kitchenette");
		label4.setForeground(Color.blue);
		label4.setBounds(200,210,350,20);
		add(label4);
		
		label5.setText("1 Badrooms , 3 Sleeps , 1 Bathrooms , Kitchenette");
		label5.setForeground(Color.blue);
		label5.setBounds(200,260,350,20);
		add(label5);
		
		back.setBackground(Color.black);
		back.setForeground(Color.white);
		back.setBounds(210,310,150,30);
		back.addActionListener(this);
		add(back);
		
		status.setAlignmentX(CENTER_ALIGNMENT);
		status.setText("Select Week and Floor");
		status.setFont(new Font("serif",Font.BOLD,16));
		status.setBounds(300,90,200,30);
		add(status);
		
		
		setTitle("Check Availability");
		setResizable(false);
		setSize(600,400);
		setVisible(true);
		
	}
	
	public void availablity() {
		
		try {
			
			FileReader r = new FileReader("reserve_data.txt");
			BufferedReader reader = new BufferedReader(r);
			String line;
			ArrayList<String> info = new ArrayList<>();
			
			while((line = reader.readLine())!=null) {
				
				info.add(line);
				
			}
			
			String date = week.getSelectedItem().toString();
			String floor=null;
			
			
			
			if(ground.isSelected()) {
				
				floor = "Ground Floor";
				
			}else if(first.isSelected()) {
				
				floor = "First Floor";
				
			}else if(second.isSelected()) {
				
				floor = "Second Floor";
				
			}
			
			if(info.contains(date+":"+floor)) {
				
				status.setText("UNAVAILABLE");
				status.setForeground(Color.red);
				
			}else {
				
				status.setText("AVAILABLE");
				status.setForeground(Color.green);
				
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==back) {
			
			MainInterface main = new MainInterface(USER);
			main.setVisible(true);
			dispose();
			
		}else if(e.getSource()==week) {
			
			availablity();
			
		}else if(e.getSource()==first) {
			
			availablity();
			
		}else if(e.getSource()==second) {
			
			availablity();
			
		}else if(e.getSource()==ground) {
			
			availablity();
		}
		
	}

	public static void main(String[] args) {
		CheckAvail checkavail = new CheckAvail(null);

	}

}
