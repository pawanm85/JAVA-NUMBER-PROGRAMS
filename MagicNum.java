				 //condition:- 1234=1+2+3+4=10=1+0=1
				          //sum all the digits of given num until we get 1
import java.util.Scanner;
class MagicNum  
{
	public static boolean isMagicNum(int num)
	{
		int sum=0;
		while(num>0)
		{
			sum=sum+num%10;
			num/=10;
		}
		while(sum>0)
		{
			sum=sum+sum%10;
			sum/=10;
		}
			if(sum==1)
			{
				return true;
			}
			return false;
		}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num!");
		int num=sc.nextInt();
		if(isMagicNum(num))
		{
		System.out.println("its magic num");
		}
		else
		{
			System.out.println("not a magic number");
		}
	}
}
