package log2;

public class Capital_Small_lettter_InString 
{
	public static void main(String[] args)
	{
		String s="Silence   Have  Some  Secret";
		int upper=0;
		int lower=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>=65 &ch<=90)
			{
				upper++;
				
			}
			else if (ch>=97 &ch<=123)
			{
				lower++;
				
			}
		}
		System.out.println("Upper case Present  "+upper);
		System.out.println("Lower case Present  "+lower);
	}

}
