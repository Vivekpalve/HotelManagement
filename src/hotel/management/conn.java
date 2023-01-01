
package hotel.management;

import java.sql.*;  

public class conn{
    Connection c;
    Statement s;
    public conn(){  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql:///HotelManagementSystem","root","Gorakshanath@9067"); 
            
            s =c.createStatement();  
            
           
        }catch(Exception e){ 
            e.printStackTrace();
        }  
    }  
}