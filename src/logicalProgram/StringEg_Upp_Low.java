package logicalProgram;

public class StringEg_Upp_Low
{
	public static void main(String[] args) 
	{
		String s="WelCome To Automation";
		int ul=0;
		int Lw=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if(ch>=65 &ch<=90)
			{
				ul++;
			}
			else if (ch>=97 &ch<=123)
			{
				Lw++;
			}
			
		}
		System.out.println(ul);
		System.out.println(Lw);
		
		
	}

}
