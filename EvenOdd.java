import java.util.Scanner;


public class EvenOdd {
	public static void main(String[] args)
	{
		int n;
		System.out.println("Enter the value of n:");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		if(n%2==0)
		{
			System.out.println(+n+"even");
		}
		else
		{
			System.out.println(+n+"is Odd");
		}
	}
}
