package HundredDays_ofCode;
import java.util.*;
class Tuples
{
	long CountTuples(long arr[],int n,int sum)
	{
		 Arrays.sort(arr);
	      
	        
	        long ans = 0;
	      
	      
	        for (int i = 0; i < n - 2; i++)
	        {
	           
	            int j = i + 1, k = n - 1;
	      
	            
	            while (j < k)
	            {
	               
	                if (arr[i] + arr[j] + arr[k] >= sum)
	                    k--;
	      
	               
	                else
	                {
	                    
	                    ans += (k - j);
	                    j++;
	                }
	            }
	        }
	        return ans;
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
