package log2;

public class SwapString
{
	public static void main(String[] args) 
	{
		
		String s1="Chetan";
		String s2="Pune";
		System.out.println("Before Swap s1= "+s1+"  s2= "+s2);
		s1=s1+s2;
		s2=s1.substring(0,s1.length()-s2.length());
		
		s1=s1.substring(s2.length(),s1.length());
		System.out.println("After Swap s1= "+s1+"  s2= "+s2);
	}

}
