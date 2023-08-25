import java.util.Scanner;
class P1Prime 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number!");
		int num=sc.nextInt();
	    if(isPrime(num))
		{
		   System.out.println("Prime!!");
		}
		else
			System.out.println("not prime");
	}
	public static boolean isPrime(int num)//5
	{
		int i=2;
		for(;i<=num;i++)//2<5
		{
			if(num%i==0)//5%2==0
			{
				break;
			}
			
		}
		if(num==i)//5==2
		{
			return true;
		}
		return false;
	}
}
