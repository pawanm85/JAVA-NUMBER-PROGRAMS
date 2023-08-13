import java.util.Scanner;
class EvenbouncyOddprime
{
	public static int count(int num)
	{
		int ct=0;
		while(num>0)
		{
			ct++;
			num/=10;
		}
		return ct;
	}
	public static boolean bouncy(int num)
	{
		boolean pos=false;
		boolean neg=false;
		while(num>9)
		{
		if(num%10 > (num/10)%10)
		{
			pos=true;
		}
		else if(num%10 < (num/10)%10)
		{
			neg=true;
		}
		num/=10;
		}

		return pos && neg;
		
	}
	public static boolean isPrime(int num)
	{
		for(int i=2;i<=num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static int oddSum(int num)
	{
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			if(rem%2==1)
			{
				sum+=rem;
			}
			num/=10;
		}
		return sum;
	}
	public static int reverce(int num)
	{
		int rev=0;
		while(num>0)
		{
			rev=rev*10+num%10;
			num/=10;
		}
		return rev;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<5;)
		{
			System.out.println("enter a num");
			int num=sc.nextInt();
			if(count(num)>3)
			{
				int rev=reverce(num);
				if((rev%10)%2==0)
				{
					if(bouncy(num))
					{
						System.out.println("Bouncy num");
					}
					else
					{
						System.out.println("Not Bouncy num ");
					}
					
				}
				else
				{
					int ans=oddSum(num);
					if(isPrime(ans))
					{
						System.out.println(" its a oddSum prime");
					}
					else
					{
						System.out.println("its not oddSum prime");
					}
				}

			}i++;
		}
	}
}
