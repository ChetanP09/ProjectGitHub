package log2;

import java.util.Scanner;

public class MultiplicationOf_Two_NumberWithoutOpeatior
{
	public static void main(String[] args)
	{
		System.out.println("Enter First Number");
		Scanner sc=new Scanner(System.in);
		int FirstNum=sc.nextInt();
		System.out.println("Enter Second Number");
		int SecondNum=sc.nextInt();
		int sum=0;
		for(int i=1;i<=FirstNum;i++)
		{
			sum=sum+SecondNum;
		}
		System.out.println(sum);
	}

}
