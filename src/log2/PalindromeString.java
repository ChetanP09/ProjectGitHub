package log2;

//import com.sun.org.apache.xpath.internal.operations.Equals;

public class PalindromeString 
{
	public static void main(String[] args)
	{
		String s="RADARARADAR";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
			
			
		}
		System.out.println(rev);
		if(s.equals(rev))
		{
			System.out.println("String is Pallindrome ");
		}
		else
		{
			System.out.println("Not Pallindrome");
		}
		
		
		
	}

}
