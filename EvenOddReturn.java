import java.util.Scanner;
class EvenOddReturn 
{
	public static boolean EvenOdd(int num)
	{
		
		if(num%2==0)
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
		Scanner x=new Scanner(System.in);
		System.out.println("Enter a number!");
		int num=x.nextInt();
		boolean ans=EvenOdd(num);
		if(ans)
		{
			System.out.println("its even number!!!");
		}
	    else
		{
			System.out.println("its Odd number!!!");
		}
	}
}
