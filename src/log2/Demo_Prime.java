package log2;

public class Demo_Prime
{
	public static void main(String[] args) 
	{
		
		int a=200;
		int count=0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				count++;
			}
			
		}
	System.out.println(count);
		if(count>=2)
		{
			System.out.println("NOTPrime");
		}
		else
			
		{
			System.out.println("Prime");
		}

}}

