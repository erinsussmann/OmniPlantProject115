//authors: Erin Sussmann, Amanda Boeni, Julia Giolitto

package firstpage;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.*;

        
public class FirstPage implements ActionListener{
    
    //this is the gloabal cart (public)
    //then its accesable to any class

    public static ArrayList<Integer> cart = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0));
    //public static ArrayList<String> plant = new ArrayList<>(Arrays.asList("Zinnia", "7.80","Daisy","8.50","Cosmos","12.00","Acorus","8.00","Devian","6.00","Sage","5.00","Pepper", "14.00","Eggplant","19.00","Tomato","12.50"));
    public static ArrayList<String> plant = new ArrayList<>();
    
    public FirstPage()
    {
        JFrame frame = new JFrame("FirstPage");
        frame.setPreferredSize(new Dimension(750,450));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        
        //JPanel across top of page: topPanel
        JPanel topPanel = new JPanel();
        topPanel.setBackground(new Color(116,205,255));//turquoise
        topPanel.setPreferredSize(new Dimension(750,75));
        JLabel welcomeLabel = new JLabel("Welcome to Omni Systems order page");
        welcomeLabel.setFont(new Font("Arial", Font.PLAIN,35));
        topPanel.add(welcomeLabel);
        
        //3 JPanel in middle of page: sub1, sub2, sub3
        JPanel sub1 = new JPanel();
        sub1.setBackground(new Color(255,238,170));//gold
        sub1.setPreferredSize(new Dimension(240,325));
        JButton button1 = new JButton("show me the Flowers");
        button1.setFont(new Font("Arial Narrow", Font.PLAIN,20));
        button1.setPreferredSize(new Dimension(240,100));
        button1.addActionListener(this);
        button1.setActionCommand("button1Clicked");
        sub1.add(button1); 
        sub1.add(new JLabel(new ImageIcon("daisy.png")));
        JButton button2 = new JButton("show me my cart");
        button2.setPreferredSize(new Dimension(240,50));
        button2.addActionListener(this);
        button2.setActionCommand("button2Clicked");
        sub1.add(button2);
        
        JPanel sub2 = new JPanel();
        sub2.setBackground(new Color(255,238,170));//gold
        sub2.setPreferredSize(new Dimension(240,325));
        JButton button3 = new JButton("show me the Vegetables");
        button3.setFont(new Font("Arial Narrow", Font.PLAIN,20));
        button3.setPreferredSize(new Dimension(240,100));
        button3.addActionListener(this);
        button3.setActionCommand("button3Clicked");
        sub2.add(button3);
        sub2.add(new JLabel(new ImageIcon("eggplant.png")));
        
        JPanel sub3 = new JPanel();
        sub3.setBackground(new Color(255,238,170));//gold
        sub3.setPreferredSize(new Dimension(240,325));
        JButton button5 = new JButton("show me the Groundcovers");
        button5.setFont(new Font("Arial Narrow", Font.PLAIN,20));
        button5.setPreferredSize(new Dimension(240,100));
        button5.addActionListener(this);
        button5.setActionCommand("button5Clicked");
        sub3.add(button5);
        sub3.add(new JLabel(new ImageIcon("devian.png")));
        JButton button6 = new JButton("I'm ready to checkout");
        button6.setPreferredSize(new Dimension(240,50));
        button6.addActionListener(this);
        button6.setActionCommand("button6Clicked");
        sub3.add(button6);
        
        //primary JPanel holds 4 JPanel: topPanel, sub1, sub2, sub3
        JPanel primary = new JPanel();
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

    public static void main(String[] args) throws IOException
    {
        FirstPage firstPage = new FirstPage();
        
        try{
        File in = new File("plantData.txt");
        BufferedReader currentIn = new BufferedReader(new FileReader(in));
        String inLine;
        java.util.List<String> temp = new ArrayList<>();
        while((inLine = currentIn.readLine()) !=null)
            temp = Arrays.asList(inLine.split(","));
            plant.addAll(temp);}
        catch(IOException e)
        {
            System.out.println("IO Exception!");
        }
        
    }
        
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("button1Clicked")){
            System.out.println("clicked show-me-the-flowers button; flower page will load");
            //close FirstPage
            FlowerPage F = new FlowerPage();}
        
        if(e.getActionCommand().equals("button2Clicked")){
            System.out.println("clicked show-me-my-cart button");
            //close FirstPage
            }
        
        if(e.getActionCommand().equals("button3Clicked")){
            System.out.println("clicked vegetable button; vegetable page will load");
            //close FirstPage
            VegetablePage V = new VegetablePage();}
          
        if(e.getActionCommand().equals("button5Clicked")){
            System.out.println("clicked groundcover button; groundcover page will load");
            //close FirstPage
            GroundcoverPage G = new GroundcoverPage();}
        
        if(e.getActionCommand().equals("button6Clicked")){
            System.out.println("clicked I'm-ready-to-check-out button; order page will load");
            //close FirstPage
            //print final order to screen
            CheckoutPage C = new CheckoutPage();
            }
    }
}

