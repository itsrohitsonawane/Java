package Strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		String s = sc.nextLine();
	    
	        for(int i=s.length();i>0;i--)
	        {
	            
	             System.out.print(s.charAt(i));
	             }
	    }
	}
			 
	