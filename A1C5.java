//Write a program to arrange the elements of an given array of integers where all positive integers appear before all the negative integers
public class A1C5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {-1,2,-3,3,4,-2,-4,8,9,-99};
		int ind=0;
		int[] b=new int[a.length];
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]>0)
			{
				b[ind++]=a[i];
			}	
		}
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]<0)
			{
				b[ind++]=a[i];
			}	
		}
		for (int i = 0; i < b.length; i++)
		{
			System.out.print(b[i]+" ");
		}
	}

}
