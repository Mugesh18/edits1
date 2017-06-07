import java.util.Scanner;


public class LeapYear {
public static void main(String[] args){
	int n;
	System.out.println("Enter the value of n :");
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	if(n%4==0)
	{
		System.out.println(+n+"is a leap year");
	}
	else
	{
		System.out.println(+n+"is not a leap year");
	}
}
}
