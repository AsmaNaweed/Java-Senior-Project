package HMS;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class OwnerUpdate extends JFrame implements ActionListener{
	
	JPanel mainpanel = new JPanel();
	JMenuBar menu = new JMenuBar();
	JMenu file = new JMenu("File");
	JMenuItem save = new JMenuItem("Save");
	JMenuItem exit = new JMenuItem("Exit");
	JMenuItem open = new JMenuItem("Open");
	JLabel l1 = new JLabel("WEEK");
	JLabel l2 = new JLabel("GROUND");
	JLabel l3 = new JLabel("FIRST");
	JLabel l4 = new JLabel("SECOND");
	
	JLabel w1 = new JLabel("May 14 - May 20");
	JLabel w2 = new JLabel("May 21 - May 27");
	JLabel w3 = new JLabel("May 28 - Jun 03");
	JLabel w4 = new JLabel("Jun 04 - Jun 10");
	JLabel w5 = new JLabel("Jun 11 - Jun 17");
	JLabel w6 = new JLabel("Jun 18 - Jun 24");
	JLabel w7 = new JLabel("Jun 25 - Jul 01");
	JLabel w8 = new JLabel("Jul 02 - Jul 08");
	JLabel w9 = new JLabel("Jul 09 - Jul 15");
	JLabel w10 = new JLabel("Jul 16 - Jul 22");
	JLabel w11 = new JLabel("Jul 23 - Jul 29");
	JLabel w12 = new JLabel("Jul 30 - Aug 05");
	JLabel w13 = new JLabel("Aug 06 - Aug 12");
	JLabel w14 = new JLabel("Aug 13 - Aug 19");
	JLabel w15 = new JLabel("Aug 20 - Aug 26");
	JLabel w16 = new JLabel("Aug 27 - Sep 02");
	
	JLabel w1g = new JLabel();
	JLabel w1f = new JLabel();
	JLabel w1s = new JLabel();
	
	JLabel w2g = new JLabel();
	JLabel w2f = new JLabel();
	JLabel w2s = new JLabel();
	
	JLabel w3g = new JLabel();
	JLabel w3f = new JLabel();
	JLabel w3s = new JLabel();
	
	JLabel w4g = new JLabel();
	JLabel w4f = new JLabel();
	JLabel w4s = new JLabel();
	
	JLabel w5g = new JLabel();
	JLabel w5f = new JLabel();
	JLabel w5s = new JLabel();
	
	JLabel w6g = new JLabel();
	JLabel w6f = new JLabel();
	JLabel w6s = new JLabel();
	
	JLabel w7g = new JLabel();
	JLabel w7f = new JLabel();
	JLabel w7s = new JLabel();
	
	JLabel w8g = new JLabel();
	JLabel w8f = new JLabel();
	JLabel w8s = new JLabel();
	
	JLabel w9g = new JLabel();
	JLabel w9f = new JLabel();
	JLabel w9s = new JLabel();
	
	JLabel w10g = new JLabel();
	JLabel w10f = new JLabel();
	JLabel w10s = new JLabel();
	
	JLabel w11g = new JLabel();
	JLabel w11f = new JLabel();
	JLabel w11s = new JLabel();
	
	JLabel w12g = new JLabel();
	JLabel w12f = new JLabel();
	JLabel w12s = new JLabel();
	
	JLabel w13g = new JLabel();
	JLabel w13f = new JLabel();
	JLabel w13s = new JLabel();
	
	JLabel w14g = new JLabel();
	JLabel w14f = new JLabel();
	JLabel w14s = new JLabel();
	
	JLabel w15g = new JLabel();
	JLabel w15f = new JLabel();
	JLabel w15s = new JLabel();
	
	JLabel w16g = new JLabel();
	JLabel w16f = new JLabel();
	JLabel w16s = new JLabel();
	
	JLabel t = new JLabel();
	JLabel gtotal = new JLabel();
	JLabel ftotal = new JLabel();
	JLabel stotal = new JLabel();
	
	JLabel c = new JLabel();
	JLabel combine = new JLabel();
	
	
	OwnerUpdate(){
		initCo();
		this.setLocationRelativeTo(null);
		update();
	}
	
	public void initCo() {
		
		mainpanel.setLayout(null);
		setLayout(null);
		
		
		mainpanel.setBackground(Color.white);
		mainpanel.setBounds(0,20,600,580);
		add(mainpanel);
		
		menu.setBackground(Color.darkGray);
		menu.setBounds(0,0,600,20);
	    add(menu);
		
	    file.setForeground(Color.white);
		menu.add(file);
		
		file.add(open);
		open.addActionListener(this);
		file.add(save);
		save.addActionListener(this);
		file.add(exit);
		exit.addActionListener(this);
		
		l1.setBounds(60,10,80,30);
		mainpanel.add(l1);
		
		l2.setBounds(170,10,80,30);
		mainpanel.add(l2);
		
		l3.setBounds(280,10,80,30);
		mainpanel.add(l3);
	    
		l4.setBounds(390,10,80,30);
		mainpanel.add(l4);
		
		w1.setBounds(40,50,100,20);
		mainpanel.add(w1);
		
		w2.setBounds(40,70,100,20);
		mainpanel.add(w2);
		
		w3.setBounds(40,90,100,20);
		mainpanel.add(w3);
		
		w4.setBounds(40,110,100,20);
		mainpanel.add(w4);
		
		w5.setBounds(40,130,100,20);
		mainpanel.add(w5);
		
		w6.setBounds(40,150,100,20);
		mainpanel.add(w6);
		
		w7.setBounds(40,170,100,20);
		mainpanel.add(w7);
		
		w8.setBounds(40,190,100,20);
		mainpanel.add(w8);
		
		w9.setBounds(40,210,100,20);
		mainpanel.add(w9);
		
		w10.setBounds(40,230,100,20);
		mainpanel.add(w10);
		
		w11.setBounds(40,250,100,20);
		mainpanel.add(w11);
		
		w12.setBounds(40,270,100,20);
		mainpanel.add(w12);
		
		w13.setBounds(40,290,100,20);
		mainpanel.add(w13);
		
		w14.setBounds(40,310,100,20);
		mainpanel.add(w14);
		
		w15.setBounds(40,330,100,20);
		mainpanel.add(w15);
		
		w16.setBounds(40,350,100,20);
		mainpanel.add(w16);
		
		w1g.setText("R");
		w1g.setBounds(190,50,10,20);
		mainpanel.add(w1g);
		
		w1f.setText("R");
		w1f.setBounds(290,50,10,20);
		mainpanel.add(w1f);
		
		w1s.setText("R");
		w1s.setBounds(410,50,10,20);
		mainpanel.add(w1s);
		
		w2g.setText("R");
		w2g.setBounds(190,70,10,20);
		mainpanel.add(w2g);
		
		w2f.setText("R");
		w2f.setBounds(290,70,10,20);
		mainpanel.add(w2f);
		
		w2s.setText("R");
		w2s.setBounds(410,70,10,20);
		mainpanel.add(w2s);
		
		w3g.setText("R");
		w3g.setBounds(190,90,10,20);
		mainpanel.add(w3g);
		
		w3f.setText("R");
		w3f.setBounds(290,90,10,20);
		mainpanel.add(w3f);
		
		w3s.setText("R");
		w3s.setBounds(410,90,10,20);
		mainpanel.add(w3s);
		
		w4g.setText("R");
		w4g.setBounds(190,110,10,20);
		mainpanel.add(w4g);
		
		w4f.setText("R");
		w4f.setBounds(290,110,10,20);
		mainpanel.add(w4f);
		
		w4s.setText("R");
		w4s.setBounds(410,110,10,20);
		mainpanel.add(w4s);
		
		w5g.setText("R");
		w5g.setBounds(190,130,10,20);
		mainpanel.add(w5g);
		
		w5f.setText("R");
		w5f.setBounds(290,130,10,20);
		mainpanel.add(w5f);
		
		w5s.setText("R");
		w5s.setBounds(410,130,10,20);
		mainpanel.add(w5s);
		
		w6g.setText("R");
		w6g.setBounds(190,150,10,20);
		mainpanel.add(w6g);
		
		w6f.setText("R");
		w6f.setBounds(290,150,10,20);
		mainpanel.add(w6f);
		
		w6s.setText("R");
		w6s.setBounds(410,150,10,20);
		mainpanel.add(w6s);
		

		w7g.setText("R");
		w7g.setBounds(190,170,10,20);
		mainpanel.add(w7g);
		
		w7f.setText("R");
		w7f.setBounds(290,170,10,20);
		mainpanel.add(w7f);
		
		w7s.setText("R");
		w7s.setBounds(410,170,10,20);
		mainpanel.add(w7s);
		
		w8g.setText("R");
		w8g.setBounds(190,190,10,20);
		mainpanel.add(w8g);
		
		w8f.setText("R");
		w8f.setBounds(290,190,10,20);
		mainpanel.add(w8f);
		
		w8s.setText("R");
		w8s.setBounds(410,190,10,20);
		mainpanel.add(w8s);
		
		w9g.setText("R");
		w9g.setBounds(190,210,10,20);
		mainpanel.add(w9g);
		
		w9f.setText("R");
		w9f.setBounds(290,210,10,20);
		mainpanel.add(w9f);
		
		w9s.setText("R");
		w9s.setBounds(410,210,10,20);
		mainpanel.add(w9s);
		
		w10g.setText("R");
		w10g.setBounds(190,230,10,20);
		mainpanel.add(w10g);
		
		w10f.setText("R");
		w10f.setBounds(290,230,10,20);
		mainpanel.add(w10f);
		
		w10s.setText("R");
		w10s.setBounds(410,230,10,20);
		mainpanel.add(w10s);
		
		w11g.setText("R");
		w11g.setBounds(190,250,10,20);
		mainpanel.add(w11g);
		
		w11f.setText("R");
		w11f.setBounds(290,250,10,20);
		mainpanel.add(w11f);
		
		w11s.setText("R");
		w11s.setBounds(410,250,10,20);
		mainpanel.add(w11s);
		
		w12g.setText("R");
		w12g.setBounds(190,270,10,20);
		mainpanel.add(w12g);
		
		w12f.setText("R");
		w12f.setBounds(290,270,10,20);
		mainpanel.add(w12f);
		
		w12s.setText("R");
		w12s.setBounds(410,270,10,20);
		mainpanel.add(w12s);
		
		w13g.setText("R");
		w13g.setBounds(190,290,10,20);
		mainpanel.add(w13g);
		
		w13f.setText("R");
		w13f.setBounds(290,290,10,20);
		mainpanel.add(w13f);
		
		w13s.setText("R");
		w13s.setBounds(410,290,10,20);
		mainpanel.add(w13s);
		
		w14g.setText("R");
		w14g.setBounds(190,310,10,20);
		mainpanel.add(w14g);
		
		w14f.setText("R");
		w14f.setBounds(290,310,10,20);
		mainpanel.add(w14f);
		
		w14s.setText("R");
		w14s.setBounds(410,310,10,20);
		mainpanel.add(w14s);
		
		w15g.setText("R");
		w15g.setBounds(190,330,10,20);
		mainpanel.add(w15g);
		
		w15f.setText("R");
		w15f.setBounds(290,330,10,20);
		mainpanel.add(w15f);
		
		w15s.setText("R");
		w15s.setBounds(410,330,10,20);
		mainpanel.add(w15s);
		
		w16g.setText("R");
		w16g.setBounds(190,350,10,20);
		mainpanel.add(w16g);
		
		w16f.setText("R");
		w16f.setBounds(290,350,10,20);
		mainpanel.add(w16f);
		
		w16s.setText("R");
		w16s.setBounds(410,350,10,20);
		mainpanel.add(w16s);
		
		t.setText("Totals :");
		t.setBounds(30,430,80,20);
		mainpanel.add(t);
		
		gtotal.setText("");
		gtotal.setBounds(190,430,100,20);
		mainpanel.add(gtotal);
		
		ftotal.setText("");
		ftotal.setBounds(290,430,100,20);
		mainpanel.add(ftotal);
		
		stotal.setText("");
		stotal.setBounds(410,430,100,20);
		mainpanel.add(stotal);
		
		c.setText("Combined :");
		c.setBounds(30,480,100,20);
		mainpanel.add(c);
		
		combine.setText("892686");
		combine.setBounds(150,480,100,20);
		mainpanel.add(combine);
		
		setResizable(false);
		setSize(500,600);
		setVisible(true);
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OwnerUpdate o = new OwnerUpdate();

	}
	
	public void update() {
		
		try {
			
			FileReader r = new FileReader("reserve_data.txt");
			BufferedReader reader = new BufferedReader(r);
			String line;
			ArrayList<String> data = new ArrayList<>();
			
			 DecimalFormat formatter = new DecimalFormat("#,###");
	            
			
			int sumG=0;
			int sumF=0;
			int sumS=0;
			
			int TOTAL=0;
			
			
			while((line = reader.readLine())!=null) {
				data.add(line);
			}
			
			if(data.contains(w1.getText()+":Ground Floor")) {
				
				w1g.setText("R");
				
				sumG = sumG + 1392;
				
				
			}else {
				w1g.setText("-");
			}
			
            if(data.contains(w2.getText()+":Ground Floor")) {
				
				w2g.setText("R");
				
				sumG = sumG + 1392;
				
				
			}else {
				w2g.setText("-");
			}
            
            if(data.contains(w3.getText()+":Ground Floor")) {
				
				w3g.setText("R");
				
				sumG = sumG + 1392;
				
				
			}else {
				w3g.setText("-");
			}
			
            if(data.contains(w4.getText()+":Ground Floor")) {
				
				w4g.setText("R");
				
				sumG = sumG + 1392;
				
				
			}else {
				w4g.setText("-");
			}
            
            if(data.contains(w5.getText()+":Ground Floor")) {
				
				w5g.setText("R");
				
				sumG = sumG + 1392;
				
				
			}else {
				w5g.setText("-");
			}
            
            if(data.contains(w6.getText()+":Ground Floor")) {
				
				w6g.setText("R");
				
				sumG = sumG + 1392;
				
				
			}else {
				w6g.setText("-");
			}
            
            if(data.contains(w7.getText()+":Ground Floor")) {
				
				w7g.setText("R");
				
				sumG = sumG + 1392;
				
				
			}else {
				w7g.setText("-");
			}
            
            if(data.contains(w8.getText()+":Ground Floor")) {
				
				w8g.setText("R");
				
				sumG = sumG + 1392;
				
				
			}else {
				w8g.setText("-");
			}
            
            if(data.contains(w9.getText()+":Ground Floor")) {
				
				w9g.setText("R");
				
				sumG = sumG + 1392;
				
				
			}else {
				w9g.setText("-");
			}
            
            if(data.contains(w10.getText()+":Ground Floor")) {
				
				w10g.setText("R");
				
				sumG = sumG + 1392;
				
				
			}else {
				w10g.setText("-");
			}
            
            if(data.contains(w11.getText()+":Ground Floor")) {
				
				w11g.setText("R");
				
				sumG = sumG + 1392;
				
				
			}else {
				w11g.setText("-");
			}
            
            if(data.contains(w12.getText()+":Ground Floor")) {
				
				w12g.setText("R");
				
				sumG = sumG + 1392;
				
				
			}else {
				w12g.setText("-");
			}
            
            if(data.contains(w13.getText()+":Ground Floor")) {
				
				w13g.setText("R");
				
				sumG = sumG + 1392;
				
				
			}else {
				w13g.setText("-");
			}
            
            if(data.contains(w14.getText()+":Ground Floor")) {
				
				w14g.setText("R");
				
				sumG = sumG + 1392;
				
				
			}else {
				w14g.setText("-");
			}
            
            if(data.contains(w15.getText()+":Ground Floor")) {
				
				w15g.setText("R");
				
				sumG = sumG + 1392;
				
				
			}else {
				w15g.setText("-");
			}
            
            if(data.contains(w16.getText()+":Ground Floor")) {
				
				w16g.setText("R");
				
				sumG = sumG + 1392;
				
				
			}else {
				w16g.setText("-");
			}
            
           
            String gdollar = formatter.format(sumG);
            
            gtotal.setText("$"+gdollar);
            
            
            if(data.contains(w16.getText()+":First Floor")) {
				
				w16f.setText("R");
				
				sumF = sumF + 990;
				
				
			}else {
				w16f.setText("-");
			}
            
            
            if(data.contains(w15.getText()+":First Floor")) {
				
				w15f.setText("R");
				
				sumF = sumF + 990;
				
				
			}else {
				w15f.setText("-");
			}
            
            if(data.contains(w14.getText()+":First Floor")) {
				
				w14f.setText("R");
				
				sumF = sumF + 990;
				
				
			}else {
				w14f.setText("-");
			}
            
            if(data.contains(w13.getText()+":First Floor")) {
				
				w13f.setText("R");
				
				sumF = sumF + 990;
				
				
			}else {
				w13f.setText("-");
			}
 
 
		    if(data.contains(w12.getText()+":First Floor")) {
					
				w12f.setText("R");
				
				sumF = sumF + 990;
					
					
			}else {
				w12f.setText("-");
			}
 
 
			if(data.contains(w11.getText()+":First Floor")) {
					
				w11f.setText("R");
				
				sumF = sumF + 990;
				
				
			}else {
				w11f.setText("-");
			}
 
 
		   if(data.contains(w10.getText()+":First Floor")) {
				
				w10f.setText("R");
				
				sumF = sumF + 990;
				
				
			}else {
				w10f.setText("-");
			}	
		   
		   
		  if(data.contains(w9.getText()+":First Floor")) {
				
				w9f.setText("R");
				
				sumF = sumF + 990;
				
				
			}else {
				w9f.setText("-");
			}	
 
		 if(data.contains(w8.getText()+":First Floor")) {
				
				w8f.setText("R");
				
				sumF = sumF + 990;
				
				
			}else {
				w8f.setText("-");
			}	
		 
 
		 if(data.contains(w7.getText()+":First Floor")) {
				
				w7f.setText("R");
				
				sumF = sumF + 990;
				
				
			}else {
				w7f.setText("-");
			}	
		 
 
		 if(data.contains(w6.getText()+":First Floor")) {
				
				w6f.setText("R");
				
				sumF = sumF + 990;
				
				
			}else {
				w6f.setText("-");
			}	
		 
		
		 if(data.contains(w5.getText()+":First Floor")) {
				
				w5f.setText("R");
				
				sumF = sumF + 990;
				
				
			}else {
				w5f.setText("-");
			}	

		 
		 if(data.contains(w4.getText()+":First Floor")) {
				
				w4f.setText("R");
				
				sumF = sumF + 990;
				
				
			}else {
				w4f.setText("-");
			}
		 
 
		 if(data.contains(w3.getText()+":First Floor")) {
				
				w3f.setText("R");
				
				sumF = sumF + 990;
				
				
			}else {
				w3f.setText("-");
			}	
 
		 
		 if(data.contains(w2.getText()+":First Floor")) {
				
				w2f.setText("R");
				
				sumF = sumF + 990;
				
				
			}else {
				w2f.setText("-");
			}	
		 
 
		 if(data.contains(w1.getText()+":First Floor")) {
				
				w1f.setText("R");
				
				sumF = sumF + 990;
				
				
			}else {
				w1f.setText("-");
			}	
		 
		 
		 String fdollar = formatter.format(sumF);
		 
		 ftotal.setText("$"+fdollar);
		 
		 if(data.contains(w1.getText()+":Second Floor")) {
				
				w1s.setText("R");
				
				sumS = sumS + 660;
				
				
			}else {
				w1s.setText("-");
			}
		 
		 
		 
		 if(data.contains(w2.getText()+":Second Floor")) {
				
				w2s.setText("R");
				
				sumS = sumS + 660;
				
				
			}else {
				w2s.setText("-");
			}
		 
		 if(data.contains(w3.getText()+":Second Floor")) {
				
				w3s.setText("R");
				
				sumS = sumS + 660;
				
				
			}else {
				w3s.setText("-");
			}
		 
		 if(data.contains(w4.getText()+":Second Floor")) {
				
				w4s.setText("R");
				
				sumS = sumS + 660;
				
				
			}else {
				w4s.setText("-");
			}
		 
		 if(data.contains(w5.getText()+":Second Floor")) {
				
				w5s.setText("R");
				
				sumS = sumS + 660;
				
				
			}else {
				w5s.setText("-");
			}
		 
		 if(data.contains(w6.getText()+":Second Floor")) {
				
				w6s.setText("R");
				
				sumS = sumS + 660;
				
				
			}else {
				w6s.setText("-");
			}
		 
		 if(data.contains(w7.getText()+":Second Floor")) {
				
				w7s.setText("R");
				
				sumS = sumS + 660;
				
				
			}else {
				w7s.setText("-");
			}
		 
		 if(data.contains(w8.getText()+":Second Floor")) {
				
				w8s.setText("R");
				
				sumS = sumS + 660;
				
				
			}else {
				w8s.setText("-");
			}
		 
		 
		 if(data.contains(w9.getText()+":Second Floor")) {
				
				w9s.setText("R");
				
				sumS = sumS + 660;
				
				
			}else {
				w9s.setText("-");
			}
		 
		 if(data.contains(w10.getText()+":Second Floor")) {
				
				w10s.setText("R");
				
				sumS = sumS + 660;
				
				
			}else {
				w10s.setText("-");
			}
		 
		 if(data.contains(w11.getText()+":Second Floor")) {
				
				w11s.setText("R");
				
				sumS = sumS + 660;
				
				
			}else {
				w11s.setText("-");
			}
		 
		 if(data.contains(w12.getText()+":Second Floor")) {
				
				w12s.setText("R");
				
				sumS = sumS + 660;
				
				
			}else {
				w12s.setText("-");
			}
		 
		 if(data.contains(w13.getText()+":Second Floor")) {
				
				w13s.setText("R");
				
				sumS = sumS + 660;
				
				
			}else {
				w13s.setText("-");
			}
		 
		 if(data.contains(w14.getText()+":Second Floor")) {
				
				w14s.setText("R");
				
				sumS = sumS + 660;
				
				
			}else {
				w14s.setText("-");
			}
		 
		 if(data.contains(w15.getText()+":Second Floor")) {
				
				w15s.setText("R");
				
				sumS = sumS + 660;
				
				
			}else {
				w15s.setText("-");
			}
		 
		 if(data.contains(w16.getText()+":Second Floor")) {
				
				w16s.setText("R");
				
				sumS = sumS + 660;
				
				
			}else {
				w16s.setText("-");
			}
		 
		 String sdollar = formatter.format(sumS);
		 
		 stotal.setText("$"+sdollar);
		 
		 String cdollar = formatter.format(sumS+sumF+sumG);
		 
		 combine.setText("$"+cdollar);
 
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==exit) {
			dispose();
		}else if(e.getSource()==save) {
			
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setDialogTitle("Specify a file to save");
			
			int userSelection = fileChooser.showSaveDialog(this);
			
			if(userSelection == JFileChooser.APPROVE_OPTION) {
				
				File file = fileChooser.getSelectedFile();
				//file.getAbsolutePath();
				
				try {
					
					FileWriter w = new FileWriter(file);
					BufferedWriter writer = new BufferedWriter(w);
					
					writer.write("WEEKS\t\t\tGround Floor\tFirst Floor\tSecondFloor \n");
					
					writer.write("\n");
					
					writer.write(w1.getText()+":\t\t"+w1g.getText()+"\t\t"+w1f.getText()+"\t\t"+w1s.getText()+"\n");
					
					writer.write(w2.getText()+":\t\t"+w2g.getText()+"\t\t"+w2f.getText()+"\t\t"+w2s.getText()+"\n");
					
					writer.write(w3.getText()+":\t\t"+w3g.getText()+"\t\t"+w3f.getText()+"\t\t"+w3s.getText()+"\n");
					
					writer.write(w4.getText()+":\t\t"+w4g.getText()+"\t\t"+w4f.getText()+"\t\t"+w4s.getText()+"\n");
					
					writer.write(w5.getText()+":\t\t"+w5g.getText()+"\t\t"+w5f.getText()+"\t\t"+w5s.getText()+"\n");
					
					writer.write(w6.getText()+":\t\t"+w6g.getText()+"\t\t"+w6f.getText()+"\t\t"+w6s.getText()+"\n");
					
					writer.write(w7.getText()+":\t\t"+w7g.getText()+"\t\t"+w7f.getText()+"\t\t"+w7s.getText()+"\n");
					
					writer.write(w8.getText()+":\t\t"+w8g.getText()+"\t\t"+w8f.getText()+"\t\t"+w8s.getText()+"\n");
					
					writer.write(w9.getText()+":\t\t"+w9g.getText()+"\t\t"+w9f.getText()+"\t\t"+w9s.getText()+"\n");
					
					writer.write(w10.getText()+":\t\t"+w10g.getText()+"\t\t"+w10f.getText()+"\t\t"+w10s.getText()+"\n");
					
					writer.write(w10.getText()+":\t\t"+w10g.getText()+"\t\t"+w10f.getText()+"\t\t"+w10s.getText()+"\n");
					
					writer.write(w11.getText()+":\t\t"+w11g.getText()+"\t\t"+w11f.getText()+"\t\t"+w11s.getText()+"\n");
					
					writer.write(w12.getText()+":\t\t"+w12g.getText()+"\t\t"+w12f.getText()+"\t\t"+w12s.getText()+"\n");
					
					writer.write(w13.getText()+":\t\t"+w13g.getText()+"\t\t"+w13f.getText()+"\t\t"+w13s.getText()+"\n");
					
					writer.write(w14.getText()+":\t\t"+w15g.getText()+"\t\t"+w15f.getText()+"\t\t"+w14s.getText()+"\n");
					
					writer.write(w15.getText()+":\t\t"+w15g.getText()+"\t\t"+w15f.getText()+"\t\t"+w15s.getText()+"\n");
					
					writer.write("\n");
					
					writer.write("Totals : \t\t\t"+gtotal.getText()+"\t\t"+ftotal.getText()+"\t\t"+stotal.getText()+"\n");
					
					writer.write("\n");
					
					writer.write("Combined : \t\t"+combine.getText());
					
					writer.flush();
					writer.close();
					w.close();
					
				} catch (IOException e1) {
					
					// TODO Auto-generated catch block
					e1.printStackTrace();
					
				}
				
			}
			
			
		} else if(e.getSource()==open) {
			
			File workingDir = new File(System.getProperty("user.dir"));
		
			JFileChooser chooser = new JFileChooser();
		    chooser.setDialogTitle("Choose a Data File");
			chooser.setCurrentDirectory(workingDir);
			
			 int status = chooser.showOpenDialog(this);
			
			 try {
				 
			 if(status == JFileChooser.APPROVE_OPTION) {
	 
			 File file = chooser.getSelectedFile();
			 Scanner scan = new Scanner(file);
			 StringBuilder info = new StringBuilder();
			 
			 while (scan.hasNext()) {
				 
			 info.append(scan.nextLine());
			 info.append("\n");
			 
			 }
			 
			 scan.close();
			 System.out.print(info);
			 
			 }

			 
			 } catch (Exception e1) {
				 
				 e1.printStackTrace();
			 
			 }

			
		}
		
	}

}
