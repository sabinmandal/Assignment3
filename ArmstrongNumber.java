import java.util.Scanner;
import java.lang.Math;
public class ArmstrongNumber
{
	public static void main(String[] x)
	{
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter Number");
		int n;
		n = ip.nextInt();
		int num , c=0 , r , sum=0;
		num = n;
		while(num!=0)
		{
			c++;
			num /= 10;
		}
		num = n;
		while(num != 0)
		{
			r = num % 10;
			sum += Math.pow(r,c);
			num /= 10;
		}
		if(sum == n)
			System.out.println(n + " is Armstrong Number");
		else
			System.out.println(n + " is not a Armstrong Number");
	}
}