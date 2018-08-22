public class SortArray
{
	public static void main(String[] x)
	{
		int a[] = new int[] {1,1,1,1,0,0,1,0};
		int i , j , len;
		len = a.length;
		for(i=0 ; i<len ; i++)
		{
			for(j = 0 ; j<len ; j++)
			{
				if( a[j] > a[i] )
				{
					int t = a[j];
					a[j] = a[i];
					a[i] = t;
				}
			}			
		}
		
		System.out.println("Sorted Array is : ");
		for(int k : a)
			System.out.print(k + " ");
	}
}