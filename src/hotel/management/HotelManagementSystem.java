 
package hotel.management;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class HotelManagementSystem extends JFrame implements ActionListener{

        JLabel l1;
        JButton b1;
        
        public HotelManagementSystem() {
		
                setSize(1366,430);          // setContentPane(300,300,1366,390);   frame size
                setLayout(null);
                setLocation(-1,200);//(left,top)

		l1 = new JLabel("");
                b1 = new JButton("Login");
                
                b1.setBackground(Color.WHITE);
                b1.setForeground(Color.BLACK);
				
                
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/hotel-presidente-4s.jpg"));
                Image i3 = i1.getImage().getScaledInstance(1366, 390,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                l1 = new JLabel(i2);
                
                JLabel lid=new JLabel("SGGS HOTEL");
                lid.setBounds(30,300,1500,100);//locationx,locationy,length,width
                lid.setFont(new Font("serif",Font.PLAIN,70));
                lid.setForeground(Color.blue);
                l1.add(lid);
                
                b1.setBounds(1170,325,150,50);
		l1.setBounds(0, 0, 1366, 390);
                
                l1.add(b1);
		add(l1);
 
                b1.addActionListener(this);
                setVisible(true);
                
                while(true){
                    //hide sleep show sleep repeating to infinity
                        lid.setVisible(false); // lid =  j label
                    try{
                        Thread.sleep(500); //1000 = 1 second
                    }
                    catch(Exception e){
                    } 
                        lid.setVisible(true);
                    try{
                        Thread.sleep(500);
                    }
                    catch(Exception e){
                    }
                }
	}
        
        public void actionPerformed(ActionEvent ae){
                new Login().setVisible(true);
                setVisible(false);
                
        }
        
        public static void main(String[] args) {
                HotelManagementSystem window = new HotelManagementSystem();
                window.setVisible(true);			
	}
}