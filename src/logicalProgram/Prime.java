package logicalProgram;

import java.util.Scanner;

public class Prime 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter Number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
	//	int num=13;
		//System.out.println("Number you enter  "+num);
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count=count+1;
			}
		
		}
     	//System.out.println("Count is  "+count);
		if(count==2)
		{
			System.out.println("Number is Prime");
		}
		else
		{
			System.out.println("Number is Not Prime");
		}
	}
}
