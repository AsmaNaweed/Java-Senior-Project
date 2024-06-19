package HMS;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;
public class Reserve extends JFrame implements ActionListener{
	
	JLabel label = new JLabel();
	JLabel label1 = new JLabel();
	JLabel label2 = new JLabel();
	JLabel label3 = new JLabel();
	JLabel label4 = new JLabel();
	JLabel label5 = new JLabel();
	JButton cancel = new JButton("Cancel");
	JButton reserve = new JButton("Reserve");
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
	
	Reserve(String user){
		USER = user;
		initCo();
		validation();
		this.setLocationRelativeTo(null);
		
	}
	
	public void initCo() {
		
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		label.setText("Lets Book Your Stay");
		label.setBounds(200,20,200,20);
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
		add(ground);
		
		first.setBackground(Color.white);
		first.setBounds(50,210,120,20);
		add(first);
		
		second.setBackground(Color.white);
		second.setBounds(50,260,120,20);
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
		
		cancel.setBackground(Color.black);
		cancel.setForeground(Color.white);
		cancel.setBounds(80,300,150,30);
		cancel.addActionListener(this);
		add(cancel);
		
		reserve.setBackground(Color.black);
		reserve.setForeground(Color.white);
		reserve.setBounds(360,300,150,30);
		reserve.addActionListener(this);
		add(reserve);
		
		setResizable(false);
		setTitle("Reservation");
		setSize(600,400);
		setVisible(true);
	}
	
	

	public static void main(String[] args) {
		
		Reserve r = new Reserve(null);
		

	}
	
	public void validation() {
		
		try {
			
			FileReader r = new FileReader("reserve_data.txt");
			BufferedReader reader = new BufferedReader(r);
			String line;
			ArrayList<String> info = new ArrayList<>();
			
			while((line = reader.readLine()) != null) {
				
				info.add(line);
				
			}
			
			String stay = week.getSelectedItem().toString();
			String gf = ground.getText();
			String ff = first.getText();
			String sf = second.getText();
			
			if(info.contains(stay+":"+gf)) {
				
				ground.setEnabled(false);
				
			}else {
				
				ground.setEnabled(true);
				
			}
			
            if(info.contains(stay+":"+ff)) {
				
				first.setEnabled(false);
				
			}else {
				
				first.setEnabled(true);
				
			}
            
            if(info.contains(stay+":"+sf)) {
				
				second.setEnabled(false);
				
			}else {
				
				second.setEnabled(true);
				
			}
			
		
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}


	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==cancel) {
			
			MainInterface main = new MainInterface(USER);
			main.setVisible(true);
			dispose();
			
		}else if(e.getSource()==reserve) {
			
			reservationAlgo();
			
			
		}else if(e.getSource()==week) {
			
			validation();
			
		}
		
		
	}
	
	public void reservationAlgo() {
		
		String date = week.getSelectedItem().toString();
		String floor=null;
	
		if(ground.isSelected()) {
			
			floor = "Ground Floor";
			
		}else if(first.isSelected()) {
			
			floor = "First Floor";
			
		}else if(second.isSelected()) {
			
			floor = "Second Floor";
			
		}
		
		Date d = new Date();
		SimpleDateFormat formater = new SimpleDateFormat("EEEE, MMMM dd, yyyy, hh:mm a");
		String dt = formater.format(d).toString();
		
		
		try {
	
			FileWriter w = new FileWriter("reserve_data.txt",true);
			BufferedWriter writer = new BufferedWriter(w);
			writer.write(date+":"+floor+"\n");
			writer.flush();
			writer.close();
			w.close();
			
			//"+var+"
			JOptionPane.showMessageDialog(this,"Confirmation - "+dt+"\n\nThank You for reserving the "+floor+" for the week "+date+".\n\nCancellation must be made by Calling(800) Bay Shore three weeks in advance to get full refund.","Revervation Confirmation - "+dt+"",1);
			MainInterface main = new MainInterface(USER);
			main.setVisible(true);
			dispose();
	
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
		
	}

}
