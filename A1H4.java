/*
 4) Write a program to copy an array by iterating the array.
 */
public class A1H4 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] a= {101,102,103,104,105};
		int[] b=new int[a.length];
		for (int i = 0; i < a.length; i++) 
		{
			b[i]=a[i];
		}
		for (int i = 0; i < b.length; i++) 
		{
			System.out.print(b[i]+" ");
		}
		
	}

}
