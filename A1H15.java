//Write a program to get the difference between the largest and smallest values in an array of integers
public class A1H15 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] a= {105,109,104,115,108,740};
		for (int i = 0; i < a.length; i++) 
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
		System.out.println("Difference between largest & smallest number is: "+(a[a.length-1]-a[0]));
	}

}
