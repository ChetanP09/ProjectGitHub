package logicalProgram;

public class Demo1 
{
	public static void main(String[] args) 
	{
		String s="aaradhya";	//Given String
	   int ch='a';	//Given Char to find Repetation 
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==ch)
			{
				count++;
			}
		}
		System.out.println(count+"  count is");
		
	}

}
