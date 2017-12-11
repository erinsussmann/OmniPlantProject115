//authors: Erin Sussmann, Amanda Boeni, Julia Giolitto

package firstpage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;

public class Cart implements ActionListener
{
    private JFrame frame;
    private JPanel primary;
    private JPanel topPanel;
    private JPanel sub1;
    private JPanel sub2;
    private JPanel sub3;
    private JLabel welcomeLabel;
    private JLabel cartStuff;
    private JButton button1;
    private JButton button2;
    
    public Cart()
    {
        /**
         * Show what you order
         * how much you have
         * price
         * (possibly) plus or minus the amount you have
         */
        frame = new JFrame("Cart");
        frame.setPreferredSize(new Dimension(750,450));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        
        topPanel = new JPanel();
        topPanel.setBackground(new Color(116,205,255));//turquoise
        topPanel.setPreferredSize(new Dimension(750,75));
        welcomeLabel = new JLabel("Your cart");
        welcomeLabel.setFont(new Font("Arial", Font.PLAIN,35));
        topPanel.add(welcomeLabel);
        
        sub1 = new JPanel();
        sub1.setBackground(new Color(255,238,170));//gold
        sub1.setPreferredSize(new Dimension(240,325));
        sub2 = new JPanel();
        sub2.setBackground(new Color(255,238,170));//gold
        sub2.setPreferredSize(new Dimension(240,325));
        
        
        cartStuff = new JLabel("•This is your Cart: \n \n");
        cartStuff.setFont(new Font("Arial", Font.PLAIN, 12));
        sub1.add(cartStuff);
        
        for(int i =0; i < FirstPage.cart.size(); i++)
        {
            if (FirstPage.cart.get(i)!=0)
                sub1.add(new JLabel("\n"+FirstPage.cart.get(i)+"   "+FirstPage.plant.get(i*2)+"   $"+Double.parseDouble(FirstPage.plant.get((i*2)+1))));
        }
        
        
        button1 = new JButton("I'm ready to check out");
        button1.setFont(new Font("Arial", Font.PLAIN,18));
        button1.setPreferredSize(new Dimension(240,50));
        button1.addActionListener(this);
        button1.setActionCommand("button1Clicked");
        sub2.add(button1); 
        
        button2 = new JButton("Return to Main Menu");
        button2.setFont(new Font("Arial", Font.PLAIN,18));
        button2.setPreferredSize(new Dimension(240,50));
        button2.addActionListener(this);
        button2.setActionCommand("button2Clicked");
        sub2.add(button2);
        
        JButton button3 = new JButton("Start Over");
        button3.setFont(new Font("Arial", Font.PLAIN,18));
        button3.setPreferredSize(new Dimension(240,50));
        button3.addActionListener(this);
        button3.setActionCommand("button3Clicked");
        sub2.add(button3);
        
        primary = new JPanel();
        primary.setBackground(new Color(120,157,255));
        primary.setPreferredSize(new Dimension (500,300));
       
        primary.add(topPanel);
        primary.add(sub1);
        primary.add(sub2);
    
        frame.getContentPane().add(primary);
        frame.pack();
        frame.setVisible(true);
    }
    
   
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getActionCommand().equals("button1Clicked")){
            System.out.println("Ready to CheckOut! Order page will load...");
            CheckoutPage c = new CheckoutPage();
        }
        
        if(e.getActionCommand().equals("button2Clicked")){
            System.out.println("Returning to Main Menu...");
            frame.setVisible(false);
            FirstPage F = new FirstPage();
        }
        
        if(e.getActionCommand().equals("button3Clicked")){
            System.out.println("Start Over clicked... starting over...");
            frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
        }
    }
}

