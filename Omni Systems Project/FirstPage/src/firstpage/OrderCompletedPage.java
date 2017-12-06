
package firstpage;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class OrderCompletedPage{
     private JFrame frame;
    private JPanel primary;
    private JPanel topPanel;
    private JPanel sub1;
    private JPanel sub2;
    private JPanel sub3;
    private JLabel welcomeLabel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    
    
    public OrderCompletedPage()
    {
        frame = new JFrame("Order Completed Page");
        frame.setPreferredSize(new Dimension(750,450));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        
         //JPanel across top of page: topPanel
        topPanel = new JPanel();
        topPanel.setBackground(new Color(116,205,255));
        topPanel.setPreferredSize(new Dimension(750,75));
        welcomeLabel = new JLabel("Your order has been completed.");
        welcomeLabel.setFont(new Font("Arial", Font.PLAIN,20));
        topPanel.add(welcomeLabel);
        
        primary = new JPanel();
        primary.setBackground(new Color(120,157,255));
        primary.setPreferredSize(new Dimension (500,300));
        
        primary.add(topPanel);
        
        
    
        frame.getContentPane().add(primary);
        frame.pack();
        frame.setVisible(true);
    } 

        
    }

