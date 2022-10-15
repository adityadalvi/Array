import java.util.Iterator;

public class A1C1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5,67};			//array declarations
		int sum=0;
		for (int i = 0; i < a.length; i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
		System.out.println(sum/a.length);
	}

}
