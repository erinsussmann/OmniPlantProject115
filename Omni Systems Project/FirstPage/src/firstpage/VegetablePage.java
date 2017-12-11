//authors: Erin Sussmann, Amanda Boeni, Julia Giolitto
 
package firstpage;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class VegetablePage implements ActionListener
{   
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
    
    
    public VegetablePage()
    {
        frame = new JFrame("Vegetable Page");
        frame.setPreferredSize(new Dimension(750,450));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        
         //JPanel across top of page: topPanel
        topPanel = new JPanel();
        topPanel.setBackground(new Color(116,205,255));
        topPanel.setPreferredSize(new Dimension(750,75));
        welcomeLabel = new JLabel("click the vegetable name to order 1 square foot; you can click multiple times");
        welcomeLabel.setFont(new Font("Arial", Font.PLAIN,20));
        topPanel.add(welcomeLabel);
        
        //3 JPanel in middle of page: sub1, sub2, sub3
        sub1 = new JPanel();
        sub1.setBackground(new Color(255,238,170));//gold
        sub1.setPreferredSize(new Dimension(240,325));
        button1 = new JButton("pepper");
        button1.setFont(new Font("Arial", Font.PLAIN,18));
        button1.setPreferredSize(new Dimension(240,100));
        button1.addActionListener(this);
        button1.setActionCommand("button1Clicked");
        sub1.add(button1); 
        sub1.add(new JLabel(new ImageIcon("pepper.png")));
        button2 = new JButton("show me my cart");
        button2.setPreferredSize(new Dimension(240,50));
        button2.addActionListener(this);
        button2.setActionCommand("button2Clicked");
        sub1.add(button2);
        
        sub2 = new JPanel();
        sub2.setBackground(new Color(255,238,170));//gold
        sub2.setPreferredSize(new Dimension(240,325));
        button3 = new JButton("eggplant");
        button3.setFont(new Font("Arial", Font.PLAIN,18));
        button3.setPreferredSize(new Dimension(240,100));
        button3.addActionListener(this);
        button3.setActionCommand("button3Clicked");
        sub2.add(button3);
        sub2.add(new JLabel(new ImageIcon("eggplant.png")));
        button4 = new JButton("return to main menu");
        button4.setPreferredSize(new Dimension(240,50));
        button4.addActionListener(this);
        button4.setActionCommand("button4Clicked");
        sub2.add(button4);
        
        sub3 = new JPanel();
        sub3.setBackground(new Color(255,238,170));//gold
        sub3.setPreferredSize(new Dimension(240,325));
        button5 = new JButton("tomato");
        button5.setFont(new Font("Arial", Font.PLAIN,18));
        button5.setPreferredSize(new Dimension(240,100));
        button5.addActionListener(this);
        button5.setActionCommand("button5Clicked");
        sub3.add(button5);
        sub3.add(new JLabel(new ImageIcon("tomato.png")));
        button6 = new JButton("I'm ready to checkout");
        button6.setPreferredSize(new Dimension(240,50));
        button6.addActionListener(this);
        button6.setActionCommand("button6Clicked");
        sub3.add(button6);
        
        //primary JPanel holds 4 JPanel: topPanel, sub1, sub2, sub3
        primary = new JPanel();
        primary.setBackground(new Color(120,157,255));
        primary.setPreferredSize(new Dimension (500,300));
       
        primary.add(topPanel);
        primary.add(sub1);
        primary.add(sub2);
        primary.add(sub3);
    
        frame.getContentPane().add(primary);
        frame.pack();
        frame.setVisible(true);
    } 

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getActionCommand().equals("button1Clicked")){
            System.out.println("add 1 square foot pepper to cart");
            FirstPage.cart.set(6, (FirstPage.cart.get(6)+1));
            //add to order
        }
        
        if(e.getActionCommand().equals("button2Clicked")){
            System.out.println("clicked show-me-my-cart button");
            System.out.println(FirstPage.cart.toString());
            frame.setVisible(false);
            Cart c = new Cart();
        }
        
        if(e.getActionCommand().equals("button3Clicked")){
            System.out.println("add 1 square foot eggplant to cart");
            FirstPage.cart.set(7, (FirstPage.cart.get(7)+1));
            //add to order
        }
        
        if(e.getActionCommand().equals("button4Clicked")){
            System.out.println("clicked return to main menu button");
            //close VegetablePage
            FirstPage F = new FirstPage();
        }   
      
        if(e.getActionCommand().equals("button5Clicked")){
            System.out.println("add 1 square foot tomato to cart");
            FirstPage.cart.set(8, (FirstPage.cart.get(8)+1));
            //add to order
        }
        
        if(e.getActionCommand().equals("button6Clicked")){
            System.out.println("clicked I'm-ready-to-check-out button; order page will load");
            //close VegetablePage
            //final order prints to screen
            CheckoutPage C = new CheckoutPage();
        }
    }
}
