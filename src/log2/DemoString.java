package log2;

public class DemoString 
{
	public static void main(String[] args)
	{
		String a="chetan";
		String b="boss";
		System.out.println("Before swap: a= " + a + " b= " + b);  
		a=a+b;
		b = a.substring(0, a.length() - b.length());  
        a = a.substring(b.length());  
        System.out.println("After  swap :a= " + a + "   b= " + b);  
	}

}
