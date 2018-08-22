import java.util.Scanner;
public class Reverse
{
	public static void main(String[] x)
	{
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter Number");
		int n;
		n = ip.nextInt();
		int c=0 , r , sum=0;
		while(n != 0)
		{
			r = n % 10;
			sum = (sum*10) + r;
			n /= 10;
		}
		
		System.out.println("Reverse number is " + sum);
	}
}