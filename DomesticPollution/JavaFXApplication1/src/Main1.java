/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import java.awt.Color;

/**
 *
 * @author Muskan
 */
public class Main1 {
    Connection cn;
PreparedStatement pst, pst1,pst2;
ResultSet rs;
 String url,sql;
 int i=0;
   public void MyConnection()
{
    try
    {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            url="jdbc:sqlserver://localhost;instance=MUSKAN;databaseName=akinator;user=vidushi;password=123@fet";
            cn=DriverManager.getConnection(url);
    }
    catch(Exception e)
    {
        System.out.println(e.getMessage());
    }
                
}
   int  ShowFirst()
   {
       int ra=0;
      
       try
    {
        MyConnection();
              
        sql="Select time From URL2 where url='https://www.facebook.com/'";
        pst=cn.prepareStatement(sql);
        rs=pst.executeQuery();
      
        while(rs.next())
        {
            //jTextField1.setEditable(false);
            ra=rs.getInt("time");
       //jTextField11.setText(rs.getString("character"));
            System.out.println("time"+rs.getInt("time"));
       
        }
        ra=rs.getInt("time");
             System.out.println("hii"+ra);
       //if(jTextField11.getText().equals(""))
        //jTextField11.setText("Your answers were Contradictory");
        
        rs.close();
        cn.close();
    
    }
     
             catch(Exception e)
    {
        //lblmessage.setText(e.toString());
    }
      return (ra);
    
   }
   public static int main(String args[])
   {
       Main1 obj=new Main1();
       
       int a=obj.ShowFirst();
       return a;
   }
   
   
}
