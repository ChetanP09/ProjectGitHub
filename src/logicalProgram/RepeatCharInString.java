package logicalProgram;

public class RepeatCharInString 
{

	public static void main(String[] args) 
	{
		String s="aaradhya";	//Given String
		char ch='a';	//Given Char to find Repetation 
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
