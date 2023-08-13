import java.util.Scanner;
class DuckNum
{
public static void main(String[]args)
{
 Scanner sc= new Scanner(System.in);
System.out.println("!! NO Zero at starting !!");
System.out.println("Enter a num");
int num=sc.nextInt();
while(num!=0)
{
 if(num%10==0)
{
System.out.println("its a duck number");
break;
}
num=num/10;
System.out.println("Not a Duck Number!!");
}

}}



