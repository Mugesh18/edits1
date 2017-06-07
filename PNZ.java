import java.util.Scanner;


public class PNZ {
	public static void main(String[] args){		
	int n;
	System.out.println("Enter the value of n:");
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	if(n>=1)
	{
		System.out.println(+n+"positive");
	}
	if(n<0)
	{
		System.out.println(+n+"is negative");
	}
	if(n==0)
	{
		System.out.println(+n+"is Zero");
	}
}
}
