package logicalProgram;

public class LargestNum 
{
	final public static void main(String[] args) 
	{
		int a=2002;int b=2345; int c=53777; int d=5056576;
		
		if(a>b&a>c&a>d)
		{
			System.out.println("A is gretter");
		}
		else if(b>c&b>a&b>d)
		{
			
			System.out.println("B is gretter");
		}
		else if(c>a&c>b&c>d)
		{
			System.out.println("C is gretter");
		}
		else
		{
			System.out.println("D is gretter");
		}
		
	}

}
