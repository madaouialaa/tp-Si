package exo01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;

public class Celsius extends JFrame {
	private JTextField fahrenheitField, celsiusField;
    private JButton convertButton;

    public  Celsius() {
        setTitle("Change Celsius to Fahrenheit");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        JLabel fahrenheitLabel = new JLabel("Fahrenheit");
        fahrenheitField = new JTextField();

        JLabel celsiusLabel = new JLabel("Celcius"); 
        celsiusField = new JTextField();
        celsiusField.setEditable(false); 
        convertButton = new JButton("Convert");
        convertButton.addActionListener((e) -> {
            try {
                double fahrenheit = Double.parseDouble(fahrenheitField.getText());
                double celsius = (fahrenheit - 32) * 5 / 9;
                celsiusField.setText(String.format("%f", celsius));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Veuillez entrer un nombre valide.", "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        });

        
        add(fahrenheitLabel);
        add(fahrenheitField);
        add(celsiusLabel);
        add(celsiusField);
        add(convertButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Celsius();
    }

}
