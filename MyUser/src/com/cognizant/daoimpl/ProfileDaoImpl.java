package com.cognizant.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cognizant.dao.ProfileDao;
import com.cognizant.registration.Registration;
import com.cognizant.util.JdbcConnection;

public class ProfileDaoImpl implements ProfileDao {

	@Override
	public ArrayList<Registration> showprofile(String userid) {
		Connection con=null;
        con=JdbcConnection.getConnection();
       String query="Select first_name,last_name,email,user_id,emptype from users where user_id=?";
        //String query="Select * from users where user_id=?";
        ArrayList <Registration> aList=null;
        System.out.println(userid);
        try {
                    PreparedStatement pst=con.prepareStatement(query);
                    pst.setString(1,userid);
                    ResultSet rs=pst.executeQuery();
                    aList=new ArrayList<Registration>();
            while(rs.next()){
                    String m_fname=rs.getString(1);
                    String m_lname=rs.getString(2);
                    String m_email=rs.getString(3);
                    String m_userid=rs.getString(4);
                 //   String m_password=rs.getString(5);
                    String m_emptype=rs.getString(5);
                   System.out.println(m_fname);
                   Registration regis=new Registration(m_fname, m_lname, m_email,m_userid,m_emptype);
                   
                    aList.add(regis);
            } 
         
        }catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
        }
        finally{
                    try {
                                con.close();
                    } catch (SQLException e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                    }
        }
		return aList;
        
     

}

		
		
		
	
}
