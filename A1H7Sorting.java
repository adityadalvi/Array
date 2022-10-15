/*
 7) Write a program sort array elements in ascending order using bubble sort.
 */
public class A1H7Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//basic sort
		int[] a= {7,8,3,1,2,55};
		for (int i = 0; i <a.length-1; i++) 
		{
			for (int j =i+1; j < a.length; j++)
			{
				if(a[i]>a[j])			//>-for ascending order  & <-for descending order
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
		//bubble sort
		/*int[] a= {7,8,3,1,2};
		for (int i = 0; i <a.length-1; i++) //a.length-1
		{
			
			for (int j = 0; j < a.length-i-1; j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}*/
		//selection sort
		/*int[] a= {7,8,3,1,2,55};
		for (int i = 0; i < a.length-1; i++) 
		{
			int small=i;
			for (int j = i+1; j < a.length; j++)
			{
				if(a[small]>a[j])
					small=j;
			}
			int temp=a[small];
			a[small]=a[i];
			a[i]=temp;
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}*/
		
		

	}

}
