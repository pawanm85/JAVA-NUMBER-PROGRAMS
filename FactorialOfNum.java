import java.util.Scanner;
class FactorialOfNum
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int f=1;
while(num>0)
{
  f=f*num;
  num--;
}
System.out.println("factorial of given number is : "+f);

}
}