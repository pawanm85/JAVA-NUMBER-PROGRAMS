import java.util.Scanner;
class isbnNum 
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
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter A num!");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		if(num%10==4 || num%10==7)
		{
		  for(int i=1;i<=count(num);i++)
		{
			int rem=temp%10;
			sum=sum+(rem*i);
			temp/=10;
		 }
		 if(sum%11==0)
			{
		 System.out.println("its isbn num");
			}
			else
			{
				System.out.println("not isbn num");
			}
		}
		else
			System.out.println("not a isbn num");
	}
}
