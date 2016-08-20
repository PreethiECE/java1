import java.util.Scanner;
public class oddeven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int n;
	n=in.nextInt();
	if(n%2==0)
		System.out.println(n+" is even");
	else
		System.out.println(n+" is odd");

	}

}
