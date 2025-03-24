package exo2;

import javax.swing.*;
import java.awt.event.*;
import java.util.Random;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class Catche extends JFrame implements MouseListener {
	private JButton catchMeButton;

    public Catche() {
        setTitle("Catch Me!");
        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        catchMeButton = new JButton("Catch me!");
        catchMeButton.setBounds(150, 150, 100, 50);
        catchMeButton.addMouseListener(this);
        add(catchMeButton);

        setVisible(true);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       
        Random rand = new Random();
        int x = rand.nextInt(getWidth() - 120); 
        int y = rand.nextInt(getHeight() - 120); 
        catchMeButton.setBounds(x, y, 100, 50);
    }

    @Override
    public void mouseClicked(MouseEvent e) { }
    @Override
    public void mousePressed(MouseEvent e) { }
    @Override
    public void mouseReleased(MouseEvent e) { }
    @Override
    public void mouseExited(MouseEvent e) { }

    public static void main(String[] args) {
        new Catche();
    }

}
