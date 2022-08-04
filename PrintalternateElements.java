package Strings;

import java.util.Scanner;

public class PrintalternateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		  for(int i=0;i<s.length();i=i+2)
	        {
	            
	             System.out.print(s.charAt(i));
	             }

	}

}
