package HundredDays_ofCode;
import java.util.*;
class Solution
{
	public int findK(int a[][], int n, int m, int k)
	{
	    // Your code goes here
	    int top=0;
	    int down=n-1;
	    int left=0;
	    int right=m-1;
	    int dir=0;
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    while(top<=down && left<=right)
	    {
	        if(dir==0)
	        {
	            for(int i=left;i<=right;i++)
	            {
	               list.add(a[top][i]);
	              
	            }
	            top+=1;
	        }
	        else if(dir==1)
	        {
	            for(int i=top ;i<=down;i++)
	            {
	                list.add(a[i][right]);
	            }
	            right--;
	        }
	         else if(dir==2)
            {
                 for(int i=right;i>=left;i--)
                 {
                      list.add(a[down][i]);
                 }
               
                down--;
            }
             else if(dir==3)
        {
            for(int i=down;i>=top;i--)
            {
                list.add(a[i][left]);
            }
                
            left++;
        }
        dir=(dir+1)%4;
	    }
	    
	   
	   
	    //System.out.println(list.get(k-1));
	    return list.get(k-1);
	
	}
	
}
public class Spiral_Matrix {
	
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Read total number of test cases");
		int t= sc.nextInt();
		while(t-->0)
		{
			System.out.println("Read total number of rows and col");
			int n = sc.nextInt();
			int m = sc.nextInt();
			System.out.println("Read value of k");
			int k= sc.nextInt();
			int arr[][]= new int[n][m];
			System.out.println("Read the elements if the array");
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
				{
					arr[i][j]=sc.nextInt();
				}
			}
			Solution obj = new Solution();
			//System.out.println(obj.findK(arr, n, m, k));
			System.out.println(obj.findK(arr, n, m, k));
			
		}
		
		

	}
	

}
