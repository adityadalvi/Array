/*
Given an integer array and size of subarray,find the first subarray with leasts average in single loop. Print first
index of subarray and average. (Mindstix) (Variations)
Method signature Find Firstsub(int arr[], int arr_len, int sub_arr_len)
{
//Your code
}
Example:
Input:
int arr={3,7,90,20,5,50,40}, k=3
Find Firstsub(arr,7 Output:
Index:3 Avg:25
 */
public class A1H25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={3,7,90,20,5,50,40};
		int k=3;
		int minind=0;
		int min=Integer.MAX_VALUE;
		for (int i = 0; i < a.length-k+1; i++) 
		{
			int sum=0;
			for (int j = i; j < i+k; j++)
			{
				sum=sum+a[j];
			}
			int avg=sum/k;
			if(avg<min)
			{
				min=avg;
				minind=i;
			}
			
		}
		System.out.println(min+"\n"+minind);

	}

}

