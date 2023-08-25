import java.util.Scanner;
class Hcf
{
public static void main(String[]args)
{
 Scanner sc= new Scanner(System.in);
System.out.println("enter First no");
int n1= sc.nextInt();
System.out.println("enter second no");
int n2= sc.nextInt();

int hcf=n1<n2?n1:n2;

while(true)
{
if(n1%hcf==0 && n2%hcf==0)
{
System.out.println("hcf is : "+hcf);
break;
}
hcf++;
}

}
}