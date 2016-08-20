import java.util.Scanner;
class vowels
{
public static void main(String[] arg)
{
Scanner in=new Scanner(System.in);
char a;
System.out.println("Enter the character");
a=in.next().charAt(0);
if(a=='a'|| a=='A'||a=='e'||a=='E'||a=='i'||a=='I'||a=='o'||a=='O'||a=='u'||a=='U')
System.out.println(a+" is vowel");
else
System.out.println(a+" is consonant");
}
}
