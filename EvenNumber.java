import java.util.Scanner;
public class EvenNumber
{
	public static void main(String[] x)
	{
		int n;
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter Number");
		n = ip.nextInt();
		
		int i;
		System.out.println("Even NUmbers are: ");
		for(i=1 ; i<=n; i++)
		{
			if( (i%2)==0)
			System.out.print(i + " ");
		}
	}
}