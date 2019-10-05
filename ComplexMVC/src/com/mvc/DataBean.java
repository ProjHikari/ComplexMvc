package com.mvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import java.sql.*;


public class DataBean {
private String username;
private String password;
private String phone;
private String dept;
private String salary;
private String email;
private String Uid;

public String getUid() {
	return Uid;
}
public void setUid(String uid) {
	Uid = uid;
}


Connection con;
PreparedStatement pst;
ResultSet rs;

public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public String getSalary() {
	return salary;
}
public void setSalary(String salary) {
	this.salary = salary;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}


public String valid() {
		
	try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Registered");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","Newuser123");
		System.out.println("Connected");
		pst=con.prepareStatement("SELECT DEPT FROM EMP WHERE NAME=? AND PASSWORD=? ");
		pst.setString(1,username);
		pst.setString(2, password);
		rs=pst.executeQuery();
		
		if(rs.next()) {
			System.out.println("1"+rs.getString(1));
			return rs.getString(1);
		}
		else
		{
			return null;
		}
	}
	catch(Exception e) { 
		e.printStackTrace();
		}
	


return null;
}


public boolean update() {
	
	try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Registered");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","Newuser123");
		System.out.println("Connected");
		pst=con.prepareStatement("UPDATE EMP SET NAME=?, PHONE=?, DEPT=? ,SALARY=? ,EMAIL=?, PASSWORD=? WHERE ID=?");
		pst.setString(1,username);
		pst.setString(2, phone);
		pst.setString(3,dept);
		pst.setString(4,salary);
		pst.setString(5,email);
		pst.setString(6,password);
		pst.setString(7,Uid);
		int num=pst.executeUpdate();
		System.out.println("Updated");
		if(num>0) {
			return true;
		}
		else {
			return false;
		}
		
	}
	catch(Exception e) { 
		e.printStackTrace();
		}
	return false;
}

public ResultSet view() {
	try
	{
		ArrayList det=new ArrayList<String>();
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Registered");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","Newuser123");
		System.out.println("Connected");
		pst=con.prepareStatement("SELECT * FROM EMP WHERE ID=? ");
		pst.setString(1,Uid);
		rs=pst.executeQuery();
		if(rs!=null) {
		System.out.println("in");
		return rs;
		
		}
		else {
			return null;
		}
	}	
	catch(Exception e) { 
		e.printStackTrace();
		}	
	return null;
}
}

