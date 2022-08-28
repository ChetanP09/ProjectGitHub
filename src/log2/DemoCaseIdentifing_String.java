package log2;

import java.util.Scanner;

public class DemoCaseIdentifing_String 
{
	public static void main(String[] args)
	{
		System.out.println("Enter String");
		Scanner sc=new Scanner(System.in);
		String s = sc.next();
		int upper=0,lower=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if(ch>=65 & ch<=90)
			{
				upper=upper+1;
			}
			else if(ch>=97 & ch<=123)
			{
				lower=lower+1;
			}
			
		}
		System.out.println("Capital letter are "+upper);
		System.out.println("Small letter are "+lower);
	}

}
