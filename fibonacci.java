import java.util.Scanner;
class fibonacci
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n1=0;
		int n2=1;
		int n3;
		int s=sc.nextInt();
		int e=sc.nextInt();

		while(s<e)
		{
		  n3=n1+n2;
		  n1=n2;
		  n2=n3;
		  s++;
		System.out.println(n3);
	    }
	
	}
}
