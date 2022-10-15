/*
14) Write a program to print all the LEADERS in the array.
Note: An element is leader if it is greater than all the elements to its right side
 */
public class A1H14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {101,11,102,54,19,45};
		for (int i = 0; i < a.length; i++)
		{
			int cnt=0;
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]<a[j])
				{
					cnt++;
					break;
				}
			}
			if(cnt==0)
			{
				System.out.print(a[i]+" ");
			}
		}
	}

}
