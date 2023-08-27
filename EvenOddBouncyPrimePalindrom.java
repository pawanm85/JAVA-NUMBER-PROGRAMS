import java.util.Scanner;
class EvenOddBouncyPrimePalindrom
{
	public static boolean evenOdd(int num)
	{
		if(num%2==0)
		{
			return true;
		}
		return false;
	}
	/*public static boolean bouncy(int num)
	{
		
		
	}
	public static boolean isPrime(int num)
	{
		
	}
	public static boolean ispalindrome(int num)
	{
		int temp=num;
		int rev=0;
		while(temp>0)
		{
			rev=rev*10+temp%10;
			temp/=10;
		}
		  if(rev==num)
		{
		  return true;
		}
		return false;
	
		
	}*/
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Num!");
		int num=sc.nextInt();
		boolean ans=evenOdd(num);
		if(ans==false)
		{
			boolean ans1=BouncyNum.isbouncy(num);
			if(ans1==true)
			{
				System.out.println("odd bouncy num");
			}
			else
			{
				System.out.println("not a bouncy num");
			}
		}
		else if(ans==true)
		{
			boolean ans1=P1Prime.isPrime(num);
			if(ans1==true)
			{
				int ans2=EvenOddPalindrom.palindrom(num);
				{
					if (ans2==true)
					{
						int ans3
					}
					System.out.println("odd prime palindrome");
				}
			}

		}

			
		}
	}
