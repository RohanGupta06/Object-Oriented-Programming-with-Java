import java.util.*;
import java.lang.*;

class TestAccount
{
		
		Scanner sc=new Scanner(System.in);
		 int a=sc.nextInt();
		 String b=sc.next();
		 Double c=sc.nextDouble();
		
	
	public void deposited(double x)
	{
		System.out.println("Enter the amount to be deposited");
		double deposite=sc.nextDouble();
		x=x+deposite;
	}
	public void withDrawn(double l)
	{
		System.out.println("Enter the amount to be withDrawn");
		double withdraw=sc.nextDouble();
		if(l>withdraw)
		{
			l=l-withdraw;
		}
		else
			System.out.println("Insufficient amount");
	}
	public static void main(String args[])
	{
		TestAccount S1=new TestAccount();
		System.out.println("Account number-"+S1.a);
		System.out.println("Name"+S1.b);
		System.out.println("Balance"+S1.c);
		S1.deposited(S1.c);
		S1.withDrawn(S1.c);
		System.out.println("balance"+S1.c);
	}
}
			
			
		