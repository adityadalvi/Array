
public class A1H37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {8,7,3,1,2};
		for (int i = 0; i < a.length-1; i++)
		{
			if(a[i]>a[i+1])
			{
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				i=-1;
			}
		}
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		
		/*int i=0;
		loopi(i,a);
		for (i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}

	}

	private static void loopi(int i, int[] a) {
		// TODO Auto-generated method stub
		if(i<a.length-1)
		{
			if(a[i]>a[i+1])
			{
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				i=-1;
				
			}
			i++;
			loopi(i,a);
		}*/
		
	}

}
