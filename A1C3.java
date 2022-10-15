//Write a program sort array elements in using selection sort, merge sort.
//selection sort
public class A1C3 {
	public static void main(String[] args) {
		int[] a= {7,8,3,1,2};
		//basic sort
		/*for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]>a[j])
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
		}*/
		
		//bubble sort
		/*for (int i = 0; i < a.length-1; i++)
		{
			for (int j = 0; j < a.length-1; j++) 
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
		/*for (int i = 0; i < a.length; i++) 
		{
			int min=i;
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[min]>a[j])
				{
					min=j;
				}
			}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}*/
		//insertion sort
		/*for (int i = 1; i < a.length; i++) 
		{
			int j=i-1;
			int temp=a[i];
			while(j>=0&&temp<a[j])
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}*/
	}

}
