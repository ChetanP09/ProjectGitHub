package log2;

public class AmstrongNumber 
{
	public static void main(String[] args) 
	{
		int num1=153;
		int sum=0;
		
		for(int i=num1;i>0;i=i/10)
		{
			int rem=i%10;
			sum=sum+(rem*rem*rem);
		}
		if(num1==sum)
		{
			System.out.println("Giver number "+num1+" is Amstrong");
		}
		else
		{
			System.out.println("Giver number "+num1+" is Not Amstrong");
		}
		
	}
}
