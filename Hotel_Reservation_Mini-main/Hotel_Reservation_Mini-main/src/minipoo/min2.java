
package minipoo;

import java.awt.*;
import javax.swing.*;
public class min2 {
    public static void main(String[] args) {
       new fnt();
    }    
}


class fnt
{
    JFrame f;
    JLabel t1;
    //JLabel t2,u1,u2;
    //JTextField f1,f2;
    //JButton l1,r1;
    fnt()
    {
        f = new JFrame();
        f.setTitle("Login page");
        
        //f.getContentPane().setBackground(Color.YELLOW);
        
        t1 = new JLabel(" D E K S H ");
        t1.setFont(new Font("Bahnschrift",Font.BOLD ,25));
        t1.setForeground(Color.BLACK);//Bahnschrift Digital tech
        //t1.setBounds(120, 100, 100, 40);
        
        
        f.setVisible(true);
        f.add(t1);
        f.setSize(400,400);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
}

class tst
{
    JFrame f;
    JLabel l;
    void bp()
    {
        try 
        {
            
        }
        catch(Exception e)
        {
            
        }
    }
}