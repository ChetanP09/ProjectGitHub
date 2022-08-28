package log2;

public class Fibonanci {

	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int c;
		int number=20;
		System.out.print(a+" "+b);
		for(int i=2;i<=number;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			
			a=b;
			b=c;
		}
	}
}
