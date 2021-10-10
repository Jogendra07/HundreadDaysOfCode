package HundredDays_ofCode;
import java.util.*;
public class ValidPair_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int cnt=0;
			int n = sc.nextInt();
			int a[]= new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
				
			}
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(i==j)
					{
						continue;
						
					}
					else if(a[i]!=a[j] && a[i]+a[j]>0)
					{
						cnt++;
					}
				}
			}
			System.out.println(cnt);
			
			
		}
	}

}
