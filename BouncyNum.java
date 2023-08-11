import java.util.Scanner;
class BouncyNum 
{
	public static boolean isbouncy(int num)
	{
		boolean pos=false; boolean neg=false;
		while(num>9)
		{
			if(num%10 > (num/10)%10)
			{
				neg=true;
			}
			else if (num%10<(num/10)%10)
			{
				pos=true;
			}
			  num/=10;	

		}		
		   return pos && neg;
}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num!");
		int num=sc.nextInt();
		if(isbouncy(num))
		{
		System.out.println("bouncy number");
		}
		else
		{
			System.out.println("not bouncy num");
		}
	}
}
