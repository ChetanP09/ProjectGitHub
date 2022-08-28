package log2;

import java.util.Scanner;

public class StringVowelISpresentOrNot 
{
	public static void main(String[] args) {
		System.out.println("Enter String");
		Scanner sc=new Scanner(System.in);
		String s = sc.next();
		int count=0;
		
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if(ch=='a'|ch=='e'|ch=='i'|ch=='o'|ch=='u')	
			{
				count=count+1;
				
				
			}
			
				
		}
		System.out.println("Vowel is present");	
		System.out.println(count);
		
	}

}
