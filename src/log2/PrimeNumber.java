package log2;

public class PrimeNumber 
{
	public static void main(String[] args)
	{
		int count=0;
		int n=19;
		for (int i = 1; i <=n; i++) 
		{
			if(n%i==0)
			{
				count=count+1;
				
			}
			
		}
		System.out.println(count);
		if(count==2)
		{
			System.out.println("Prime");
		}
		else
			
		{
			System.out.println("Not Prime");
		}
	}

}
