package demo;

public class PrintPattern 
{
	public static void main(String[] args)
	{
		int a=4;
		int b=5;
		for(int i=0;i<=a;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)(65+i));
			}
			System.out.println();
		}
		
	}
}
