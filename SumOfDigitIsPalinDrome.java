import java.util.Scanner;
public class SumOfDigitIsPalinDrome {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=a+b;
	int d=a+b;
	String s=Integer.toString(c);
	String s1=Integer.toString(d);
	if((new StringBuffer(s).reverse().toString()).equals(s1))
	{
		System.out.println("The sum os the Digit"+c+" is a Palindrome");
	}
	else
	{
		System.out.println("The sum os the Digit"+c+" is not a Palindrome");
	}
}
}
