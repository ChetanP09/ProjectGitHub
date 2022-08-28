package log2;

public class SamplePalindrome
{
	public static void main(String[] args)
	{
		String s="RADAr";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		if(s.equalsIgnoreCase(rev))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Pallindrome");
		}
		
		
	}

}
