import java.util.Scanner;
class EvenOddPalindrom 
{
	public static int palindrom(int num)
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
		  return rev;
		}
		
		   
	}

	public static boolean evenOdd(int pali)
	{
		if(pali%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}


	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number!");
		int num=sc.nextInt();
		int anspali=palindrom(num);
		if(anspali==num)
		{
			boolean evenodd=evenOdd(anspali);
			if (evenodd)
			{
				System.out.println("its even palindrom");
			}
			else 
			{
				System.out.println("its odd palindrome");
			}
		}
		else
		{
			System.out.println("its not palindrom");
		}

	}
}
