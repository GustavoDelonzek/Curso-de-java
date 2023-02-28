package application;
import javax.swing.*;
import java.awt.*;

public class LoveScreen extends JFrame {
  public LoveScreen() {
    super("I Love You Baby");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 400);
    
    // Create the message label
    JLabel messageLabel = new JLabel("I Love You Baby");
    messageLabel.setForeground(new Color(128, 0, 128)); // Set the text color to purple
    messageLabel.setFont(new Font("Arial", Font.BOLD, 36));
    messageLabel.setHorizontalAlignment(JLabel.CENTER);
    add(messageLabel, BorderLayout.CENTER);
    
    // Create the background panel with visual effects
    JPanel backgroundPanel = new JPanel();
    backgroundPanel.setBackground(Color.WHITE);
    backgroundPanel.setLayout(new FlowLayout());
    add(backgroundPanel, BorderLayout.SOUTH);
    
    // Add the visual effects
    JLabel heart1 = new JLabel("♥");
    JLabel heart2 = new JLabel("♥");
    JLabel heart3 = new JLabel("♥");
    heart1.setForeground(new Color(255, 0, 128));
    heart2.setForeground(new Color(128, 0, 255));
    heart3.setForeground(new Color(255, 0, 128));
    heart1.setFont(new Font("Arial", Font.BOLD, 24));
    heart2.setFont(new Font("Arial", Font.BOLD, 36));
    heart3.setFont(new Font("Arial", Font.BOLD, 24));
    backgroundPanel.add(heart1);
    backgroundPanel.add(heart2);
    backgroundPanel.add(heart3);
    
    setVisible(true);
  }
  
  public static void main(String[] args) {
    new LoveScreen();
  }
}
