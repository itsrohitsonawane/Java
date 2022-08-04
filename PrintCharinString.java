package Strings;

public class PrintCharinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Hello Welcome";
		//Approch via array
		char c[] = s.toCharArray();
		
		for(int i =0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
		
		//Approch via char
		for(int i =0;i<s.length();i++) {
			char ch = s.charAt(i);
			System.out.println(ch);
		}
		;
		
		
		

	}

}
