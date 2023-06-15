/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentManagement;

import java.sql.*;



/**
 *
 * @author Durvesh
 */
public class conn {
    Connection c;
    Statement s;
    public conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c= DriverManager.getConnection("jdbc:mysql://localhost:3306/projectsms","root","Dbz!2000");
            s= c.createStatement();
         
                   
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
