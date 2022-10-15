
public class A1H33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3};
		int b[]= {4,5};
		int c[]=new int[a.length+b.length];
		int ind=0;
		for (int i = 0; i < a.length; i++)
		{
			c[ind++]=a[i];
		}
		for (int i = 0; i < b.length; i++)
		{
			c[ind++]=b[i];
		}
		for (int i = 0; i < c.length; i++)
		{
			System.out.print(c[i]+" ");
		}

	}

}
