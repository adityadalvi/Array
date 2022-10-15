
public class A1H9_NotPresentInPDF {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//basic sort
		int[] a= {8,7,3,1,2};
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
		for (int i = 0; i < a.length; i++)
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
		}

	}

}
