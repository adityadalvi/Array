//Write a program to separate even and odd numbers of an given array of integers. Put all even numbers first, and then odd numbers. (Variations)
public class A1H17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5,6};
		
		int[] b=new int[a.length];
		int ind=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]%2==0)
			{
				b[ind++]=a[i];
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]%2!=0)
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
