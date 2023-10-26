package com.question;

import java.util.Scanner;

public class UserNameCheck {
	
	static String checkUser(String user) {
		boolean capital=false;
		boolean small=false;
		boolean number=false;
		boolean space=true;
		boolean sing=false;
		int index=0;
		if(user.length()>4&&user.length()<=10) {
			for(int i=0;i<user.length();i++) {
				index=user.charAt(i);
				//System.out.println(index);
				if(index>=48&&index<=57) {
					number=true;
				}else if(index==32)
				{
					space=false;
				}else if(index>=97&&index<=122) {
					small=true;
				}else if(index>=65&&index<=90){
					capital=true;
				}
				if(user.charAt(i)=='@'||user.charAt(i)=='#'||user.charAt(i)=='@'||user.charAt(i)=='=') {
					sing=true;
				}
			}
			if(number&&small&&space&&capital&&sing) {
				return "user - pass";
			}
			else {
				return "user - fail";
			}
			
		}
		else {
			return "user - fail";
		}
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String[] user=new String[4];
		for(int i=0;i<4;i++) {
			
		    System.out.println("Enter User name: ");
		    user[i]=sc.nextLine();
		}
		for(String u:user) {
			System.out.println(checkUser(u));
		}
		
	}

}
