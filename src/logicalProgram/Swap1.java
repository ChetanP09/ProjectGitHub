package logicalProgram;

public class Swap1
{
	public static void main(String[] args)
	{
		int a=5;
		int b=3;
		System.out.println("First number is--> "+a);
		System.out.println("Second number is--> "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping");
		
		System.out.println("First number is--> "+a);
		System.out.println("Second number is--> "+b);
		
		
	}

}
