package Strings;

import java.util.Scanner;

public class PrinttheNumberofVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		int count = 0;
		
		for(int i=0;i<s.length();i++)
		{
			 if (s.charAt(i) == 'a' || s.charAt(i) == 'A' || s.charAt(i) == 'e' || s.charAt(i) == 'E'
	                    || s.charAt(i) == 'i' || s.charAt(i) == 'I' || s.charAt(i) == 'o' || s.charAt(i) == 'O'
	                    || s.charAt(i) == 'u' || s.charAt(i) == 'U') {
				 count++;
			 }
			 
		}System.out.println(count);

	}

}
