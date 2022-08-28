package logicalProgram;

public class PalindromeNumber 
{
	public static void main(String[] args)
	{
		System.out.println("HI");
		int num=56765;
		int temp=num;
		int rev=0;
		int rem=0;
		while(num>0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(rev==num) 
		{
			System.out.println("NUmber is palindrome");
		}
		else
		 {
			System.out.println("NUmber is NOTpalindrome");
		}
		
	}

}
