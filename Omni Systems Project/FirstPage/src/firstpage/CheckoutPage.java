//comment
package firstpage;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

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
        Integer quantity = 0;
        double plantPrice = 0.0;
        double subTotal = 0.0;
        String plantName = "";
        
        ArrayList<String> order = new ArrayList<>();
//        for(int i = 0; i< FirstPage.cart.size(); i++){
           // String work = String.valueOf(FirstPage.cart.get(i)) + "       " + FirstPage.plant.get(i);  original
          for(int i = 0 ; i < FirstPage.cart.size() -1 ; i+=1)
          {
             
              System.out.println(quantity = FirstPage.cart.get(i));
              System.out.println(plantName = FirstPage.plant.get(i*2));
              System.out.println(plantPrice = Double.parseDouble(FirstPage.plant.get((i*2)+1)));
              System.out.println(subTotal = quantity * plantPrice);
              String work = quantity+ "       " + plantName + "       " + plantPrice + "     " + subTotal;
              System.out.println(work);
              order.add(work);
          }
                 
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
        sub1.setLayout(new BoxLayout(sub1, BoxLayout.PAGE_AXIS));
        for(int i =0; i < FirstPage.cart.size()-1; i++){
            sub1.add(new JLabel (order.get(i)));
        }
       // JLabel label = FirstPage.cart.toString();
        button1 = new JButton("Checkout");
        button1.setFont(new Font("Arial", Font.PLAIN,18));
        button1.setPreferredSize(new Dimension(240,100));
        button1.addActionListener(this);
        button1.setActionCommand("button1Clicked");
        sub1.add(button1); 
        button1 = new JButton("checkout");

        
        //primary JPanel holds 4 JPanel: topPanel, sub1
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
            System.out.println("Order Completed");
            OrderCompletedPage O = new OrderCompletedPage();
        }
        
    }
}

