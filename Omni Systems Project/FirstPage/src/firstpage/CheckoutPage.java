
package firstpage;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CheckoutPage implements ActionListener{
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
    
    
    public CheckoutPage()
    {
        frame = new JFrame("Checkout");
        frame.setPreferredSize(new Dimension(750,450));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        
         //JPanel across top of page: topPanel
        topPanel = new JPanel();
        topPanel.setBackground(new Color(116,205,255));
        topPanel.setPreferredSize(new Dimension(750,75));
        welcomeLabel = new JLabel("Here is a summary of your order:");
        welcomeLabel.setFont(new Font("Arial", Font.PLAIN,20));
        topPanel.add(welcomeLabel);
        
        //3 JPanel in middle of page: sub1, sub2, sub3
        sub1 = new JPanel();
        sub1.setBackground(new Color(255,238,170));//gold
        sub1.setPreferredSize(new Dimension(500,325));
        
        for(int i =0; i < FirstPage.cart.size(); i++){
            sub1.add(new JLabel(FirstPage.cart.get(i)));
        }
       // JLabel label = FirstPage.cart.toString();
        button1 = new JButton("Checkout");
        button1.setFont(new Font("Arial", Font.PLAIN,18));
        button1.setPreferredSize(new Dimension(240,100));
        button1.addActionListener(this);
        button1.setActionCommand("button1Clicked");
        sub1.add(button1); 
        button1 = new JButton("zinnia");

        
        //primary JPanel holds 4 JPanel: topPanel, sub1, sub2, sub3
        primary = new JPanel();
        primary.setBackground(new Color(120,157,255));
        primary.setPreferredSize(new Dimension (500,300));
       
        primary.add(topPanel);
        primary.add(sub1);
        
    
        frame.getContentPane().add(primary);
        frame.pack();
        frame.setVisible(true);
    } 

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getActionCommand().equals("button1Clicked")){
            System.out.println("add 1 square foot zinnia to cart");
            // TODO: this is where i should add this item to my cart
            FirstPage.cart.add("Zinnia");
            //add to order
        }
        
        if(e.getActionCommand().equals("button2Clicked")){
            System.out.println("clicked show-me-my-cart button");
            //this is where i should add this item to my cart
            System.out.println(FirstPage.cart.toString());
            frame.setVisible(false);
            //display the order so far
        }
        
        if(e.getActionCommand().equals("button3Clicked")){
            System.out.println("add 1 square foot daisy to cart");
            FirstPage.cart.add("Daisy");
            //this is where i should add this item to my cart;
            //add to order
        }
        
        if(e.getActionCommand().equals("button4Clicked")){
            System.out.println("clicked return to main menu button");
            frame.setVisible(false);
            FirstPage F = new FirstPage();
        }   
      
        if(e.getActionCommand().equals("button5Clicked")){
            System.out.println("add 1 square foot cosmos to cart");
            FirstPage.cart.add("Cosmos");
            //add to order
        }
        
        if(e.getActionCommand().equals("button6Clicked")){
            System.out.println("clicked I'm-ready-to-check-out button; order page will load");
            frame.setVisible(false);
            //final order prints to screen
        }
    }
}
