/*
8) Write a program to find the second largest element in an array (Variations)
 */
public class A1H8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if duplicate elements are present-- first code for remove duplicates
		int[] a= {108,109,101,106,107};
		int max=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		int max1=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]!=max&&a[i]>max1)
			{
				max1=a[i];
			}
		}
		System.out.println(max1);
		
	}

}
