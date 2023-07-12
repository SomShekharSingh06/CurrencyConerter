package CurrencyConverter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class CurrencyConverter {
	public static void converter() {
		final JFrame f = new JFrame("Conveter");
		
		//Creating two labels 
		
		JLabel l1 , l2 ;
		
		//Creating two text fields.
		//One for rupee and one for dollar 
		
		final JTextField t1;
		final JTextField t2;
		
		//Creating three buttons.
		
		JButton b1, b2, b3;
		
		//Naming the labels and setting the bound for the labels
		
		l1 = new JLabel("Rupees: ");
		l1.setBounds(80, 40 , 50 , 30);
		l2 = new JLabel("Dollars: ");
		l2.setBounds(170, 40 , 60 , 30);
		
		//Initializing the text fields with 0 by default and setting the bounds for the text fields.
		
		t1 = new JTextField("0");
		t1.setBounds(80, 40 ,50 ,30);
		t2 =  new JTextField("0");
		t2.setBounds(240, 40 , 50 , 30);
		
		//Creating a button for inr and one button for the dollar and one to close and setting the bounds
		
		b1 = new JButton("INR");
		b1.setBounds(50, 80, 60 , 15);
		b2 = new JButton("Dollar");
		b2.setBounds(190 , 80 , 60 , 25);
		b3 = new JButton("close");
		b3.setBounds(150 , 150 , 60 , 30);
		
		//Adding action listener
		b1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// Converting to double
				double d =   Double.parseDouble(t1.getText());;
				
				// Converting rupee to dollars
				double d1 = (d/83.25);
				 //Getting the string value of the calculation 
				
				String str1 = String.valueOf(d1);
				//Placing it in the text Box
				
				t2.setText(str1);
				 
				  
				
			}
			
		});
		
		//Adding ActionListener
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Converting to double
				double d2 = Double.parseDouble(t2.getText());
				
				//Converting dollars into rupees
				double d3 = (d2 * 83.25);
				
				//Storing the calculated value into the string value to display
				
				String str2 = String.valueOf(d3);
				//Placing it in the text box
				
				t1.setText(str2);
				
			}
		});
		
		//ActionListener to close the form 
		b3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {

				f.dispose();
				
				
			}

			
			
		});
		
		
		
		//Adding the created objects to the form.
		f.add(l1);
		f.add(l2);
		f.add(t1);
		f.add(t2);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		
		f.setLayout(null);
		f.setSize(400 , 300);
		f.setVisible(true);

		
	}
	
	public static void main(String args[]) {
		converter();
	}
	

}
