package HundredDays_ofCode;
import java.util.*;
class Tuples
{
	long CountTuples(long arr[],int n,int sum)
	{
		long cnt=0;
		Arrays.sort(arr);
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<n;j++)
			{
				if(j==n-1)
				{
					break;
				}
				if(arr[i]+arr[j]+arr[j+1]<sum)
				{
					cnt++;
				}
			}
		}
	
		
		return cnt;
	}
}
public class Smaller_TUples_x {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int k = sc.nextInt();
			long a[]= new long[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextLong();
			}
			Tuples ob =new Tuples();
			long ans =ob.CountTuples(a, n, k);
			System.out.println(ans);
		}

	}

}
