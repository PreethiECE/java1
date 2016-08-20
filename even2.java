import java.util.Scanner;
class even
{
public static void main(String[] arg)
{
Scanner in=new Scanner(System.in);
int n;
System.out.println("Enter the number");
n=in.nextInt();
if(n%2==0)
System.out.println(n+" is even");
else
System.out.println(n+" is odd");
}
}
