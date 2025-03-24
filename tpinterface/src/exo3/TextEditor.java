package exo3;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class TextEditor extends JFrame {
	private JTextArea textArea;
    private JButton saveButton;

    public TextEditor() {
        setTitle("Éditeur de Texte");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        textArea = new JTextArea();
        saveButton = new JButton("Save");
        
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveTextToFile();
            }
        });
        
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(new JScrollPane(textArea), BorderLayout.CENTER);
        panel.add(saveButton, BorderLayout.SOUTH);
        
        add(panel);
    }
    
    private void saveTextToFile() {
        try (FileWriter writer = new FileWriter("fichier.txt")) {
            writer.write(textArea.getText());
            JOptionPane.showMessageDialog(this, "Fichier sauvegardé avec succès !");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Erreur lors de la sauvegarde du fichier", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TextEditor().setVisible(true);
        });
    }

}
