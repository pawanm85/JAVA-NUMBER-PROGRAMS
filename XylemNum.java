//12345
//sum of 1 and 5 should equal to 234

import java.util.Scanner;
class XylemNum
{
	public static boolean isXylem(int num)
	{
		int sum2=0;
		int sum=num%10;
		num/=10;
		int rev=0;
		while(num>0)
		{
			rev=rev*10+num%10;
			num/=10;
		}
		sum+=rev%10;
		rev/=10;
		while(rev>0)
		{
			sum2+=rev%10;
			rev/=10;
		}
		return sum==sum2;
		
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number!");
		int num=sc.nextInt();
		if(isXylem(num))
		{
			System.out.println("its a Xylem number");
		}
		else
		{
			System.out.println("its not a Xylem number");
		}
	}
}
