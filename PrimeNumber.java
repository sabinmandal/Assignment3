import java.util.Scanner;
public class PrimeNumber 
{
	public static void main(String[] x) 
	{
		Scanner input = new Scanner(System.in);
		int n;
		System.out.println("Enter number");
		n = input.nextInt();
		int f;
		System.out.println("Prime Numbers are : ");
		for(int i=1 ; i<=n ; i++){
			f=0;
			for(int j=2 ; j<=(i/2) ; j++)
			{
				if( i%j == 0){
					f=1;
					break;
				}
			}
			if(f == 0){
				System.out.println(i + " ");
			}
		}
	}

}
