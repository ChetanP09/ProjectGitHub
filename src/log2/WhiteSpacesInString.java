package log2;

import java.util.Scanner;

public class WhiteSpacesInString
{
	public static void main(String[] args) 
	{

		String s1="Welcome          To";
		int count=0;
		for(int i=0;i<s1.length()-1;i++)
		{
			char ch=s1.charAt(i);
			if(ch==' ')
			{
				count=count+1;
			
			}
		}
		System.out.println(" Count is  "+count);
	}

}
