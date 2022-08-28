package log2;

public class Swapnumber
{
public static void main(String[] args) {
	int a=10;
	int b=20;
	System.out.println("First Number--->"+a);
	System.out.println("Second Number--->"+b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("After Swapping");
	
	System.out.println("First Number--->"+a);
	System.out.println("Second Number--->"+b);
	
}
}
