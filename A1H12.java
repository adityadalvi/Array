//Write a program to put even and odd elements of array in two separate arrays. (Variations)
public class A1H12 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] a= {102,104,105,101,100};
		int count=0;
		/*for (int i = 0; i < a.length; i++)
		{
			if(a[i]%2==0)
			{
				count++;
			}
			
		}
		int eind=0;
		int oind=0;
		int[] even=new int[count];
		int[] odd=new int[a.length-count];
		
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]%2==0)
			{
				even[eind++]=a[i];
			}
			else
			{
				odd[oind++]=a[i];
			}
		}
		for (int i = 0; i < even.length; i++)
		{
			System.out.print(even[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < odd.length; i++) 
		{
			System.out.print(odd[i]+" ");
		}*/
		
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]%2==0)
			{
				System.out.print(a[i]+" ");
			}
		}
		System.out.println();
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]%2!=0)
			{
				System.out.print(a[i]+" ");
			}
		}
	}

}
