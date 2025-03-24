package exo1;


import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;




public class Interface extends JFrame {
	
	private JTextField celsiusField;
	private JLabel fahrenheitLabel ;
	
	public Interface()  {
        super("change celsius to Fahrenheit");

        setSize(400,200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        this.setLocationRelativeTo(null); 
        setLayout(new GridLayout(3,2)); 
        JLabel celsiusLabel = new JLabel("temperature en celsius");
         celsiusField = new JTextField();
        JButton bouton = new JButton("Convert");
        fahrenheitLabel = new JLabel("temperature en Fahrenheit");

        
        
        
        bouton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try 
				{
				double celsius = Double.parseDouble(celsiusField.getText());
				double fahrenheit = (celsius * 9/5)+32 ;
				fahrenheitLabel.setText("temperature en Fahrenheit"+fahrenheit);
				
			}
				catch(NumberFormatException ex){
				JOptionPane.showMessageDialog(null, "nbr nn valid","EREURE",JOptionPane.ERROR_MESSAGE);
			}
			}
			
		});
        add(celsiusLabel);
        add(celsiusField);
        add(bouton);
        add(fahrenheitLabel);
        
        
        
        setVisible(true);
        
    }

public static void main(String[] args) {
    new Interface();
}
}