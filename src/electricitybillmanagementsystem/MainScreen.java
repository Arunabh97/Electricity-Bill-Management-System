package electricitybillmanagementsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class MainScreen {

    JFrame frame = new JFrame();
    ImageIcon i1 = new ImageIcon(getClass().getResource("/icon/electricity.png"));
    Image i2 = i1.getImage();
    ImageIcon i3 = new ImageIcon(i2);
    JLabel image = new JLabel(i3);
    JLabel text = new JLabel("Electricity Bill Management System");
    JProgressBar progressBar = new JProgressBar();
    JLabel message = new JLabel();

    MainScreen() {
        createGUI();
        addImage();
        addText();
        addProgressBar();
        runningPBar();
    }

    public void createGUI() {
        frame.getContentPane().setLayout(null);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(new Color(0x8E44AD)); // Change background color here
        frame.setVisible(true);
    }

    public void addImage() {
        image.setBounds(150, 70, 500, 300);
        frame.add(image);
    }

    public void addText() {
        text.setFont(new Font("Arial", Font.BOLD, 26)); // Change font here
        text.setBounds(160, 350, 600, 50);
        text.setForeground(Color.white); // Change font color here
        frame.add(text);
    }

    public void addProgressBar() {
        progressBar.setBounds(140, 450, 500, 30);
        progressBar.setBorderPainted(true);
        progressBar.setStringPainted(true);
        progressBar.setBackground(Color.white); // Change progress bar background color here
        progressBar.setForeground(new Color(0xFFA500)); // Change progress bar color here
        progressBar.setValue(0);
        frame.add(progressBar);
    }

    public void runningPBar() {
        int i = 0;
        while (i <= 100) {
            try {
                Thread.sleep(40);
                progressBar.setValue(i);
                i++;
                if (i == 100)
                    frame.dispose();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
 
