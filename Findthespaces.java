package Strings;

public class Findthespaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Hello World ";
		int count =0;
		for(int i =0;i<s.length();i++)
		{
			char c= s.charAt(i);
			
			if(c==' ')
			{
				count++;
			}
		}System.out.println(count);

	}

}
