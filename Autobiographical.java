import java.util.Scanner;
class Autobiographical
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		int count=0;
		while(num!=0)
		{
			sum=sum+num%10;
			count++;
			num/=10;

		}
		if(sum==count)
		{
			System.out.println("it is autobiographical number");
		}
		else
		{
			System.out.println("its not autobiographical number");
		}

	}
}
