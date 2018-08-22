import java.util.*;
public class CheckArray
{
	public static void main(String[] x)
	{
		int num , f=0;
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter Number");
		num = ip.nextInt();
		int a[] = new int[] {1,4,6,7,8,9,10};
		
		for(int i : a)
		{
			if(num == i)
				f = 1;
		}
		if( f==1)
		System.out.println("Number is in the array");
		else
		System.out.println("Number is not in the array");
	}
}