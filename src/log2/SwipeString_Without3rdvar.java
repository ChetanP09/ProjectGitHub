package log2;

public class SwipeString_Without3rdvar
{
	public static void main(String[] args) {
		
		String a="Aaradhya";//8
		String b="Viraj";//5
		
		System.out.println("Before Swap a= "+a+"  b= "+b);
		a=a+b;//8+5=13
		b=a.substring(0,a.length()-b.length());//0,(13-5=)8
		a=a.substring(b.length(),a.length());//8,13
		
		System.out.println("After Swap a= "+a+"  b= "+b);
		
	}
	
	

}
