/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minipoo;

import java.sql.*;

/**
 *
 * @author HP
 */
public class main {
    public static void main(String[] argv)
    {
        try
        {
                    Class.forName("com.mysql.cj.jdbc.Driver");
//                    Class.forName("com.mysql.jdbc.Driver");
//                       String rtable = "asw";
                    Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/this_scs", "root", "Passing@5q1");
//                    String mtab = "CREATE TABLE matetab (Member int, Name varchar(50), Phone int, Email varchar(55), Address varchar(100),Gender varchar(20), Age int)";
//                    String rtab = "CREATE TABLE "+rtable+" (Room int, TV varchar(5), Music varchar(5),VGames varchar(5), Library varchar(5),Food varchar(5), Gadgets varchar(5))";
                    Statement sql = c.createStatement();
//                    sql.executeUpdate(mtab);
//                    sql.executeUpdate(rtab);
//                    System.out.print(rtable);
                    System.out.print("Done");
                    String inst = "INSERT INTO matetab (Member,Name,Phone,Email,Address,Gender,Age) VALUES ('1','gh','9754','erq@com','retea','mal','45')";
                    sql.executeUpdate(inst);
        }
        catch(Exception e)
        {
            System.out.print(e);
//            e.printStackTrace();
        }
    }
}
