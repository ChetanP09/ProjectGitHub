package log2;

import java.util.Scanner;

public class InputFromUser
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		System.out.println("Enter Second number");
		int num2 = sc.nextInt();
		System.out.println("ADDITION  "+(num1+num2));
		
	}

}
