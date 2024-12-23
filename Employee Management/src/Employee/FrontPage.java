package Employee;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class FrontPage extends JFrame implements ActionListener
{
    JFrame jf;
    JLabel lblimage,id;
    JButton b,b1;
    FrontPage()
    {
        //Frame Details
        jf=new JFrame("EMPLOYEE MANAGEMENT SYSTEM");
        jf.setDefaultCloseOperation(WindowConstants. EXIT_ON_CLOSE);
        jf.setResizable(false);
        jf.setLayout(null);
        jf.setLocation(50,50);
        jf.setSize(1200,650);
        
        //Title Details
        id=new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        id.setBounds(50,10,1100,100);
        id.setFont(new Font("serif",Font.PLAIN,64));
        id.setForeground(Color.red);
        jf.add(id);
        
        //Background Images
        ImageIcon i = new ImageIcon("src\\Employee\\images\\front.jpg");
        Image i1 = i.getImage().getScaledInstance(1100,550,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i1);
        lblimage= new JLabel(i3);
        lblimage.setBounds(50,100,1089,500);
        jf.add(lblimage);
        
        //Button Details
        b=new JButton("FOR EMPLOYEE ONLY");
        b.setBounds(350,410,400,70);
        b.setFont(new Font("Times_New_Roman",Font.BOLD,24));
        b.setForeground(Color.WHITE);
        b.setBackground(Color.BLACK);
        lblimage.add(b);
        b.addActionListener(this);
        
        b1=new JButton("FOR ADMIN ONLY");
        b1.setBounds(350,300,400,70);
        b1.setFont(new Font("Times_New_Roman",Font.BOLD,24));
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLACK);
        lblimage.add(b1);
        b1.addActionListener(this);
        
        jf.setVisible(true);
        while(true){
            id.setVisible(false); // lid =  j label
            try{
                Thread.sleep(500); //1000 = 1 second
            }catch(Exception e){} 
            id.setVisible(true);
            try{
                Thread.sleep(500);
            }catch(Exception e){}
        }
              
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b)
        {
            EMPlogin l=new EMPlogin();
            jf.dispose();
        }
        if(ae.getSource()==b1)
        {
             AdminWindow aw=new AdminWindow();
            jf.dispose();
        }
    }
    public static void main(String args[])
    {
        FrontPage fp=new FrontPage();
    }
}
