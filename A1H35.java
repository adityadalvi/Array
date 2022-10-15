
public class A1H35 {
	
	public static void main(String[] args) {
		int[] a= {5,1,3,4,7};
		int sum=15;
		int i=0;
		loopi(i,a,sum);
		/*for (int i = 0; i < a.length; i++)
		{
			for (int j = i+1; j < a.length; j++) 
			{
				for (int k = j+1; k < a.length; k++)
				{
					if(a[i]+a[j]+a[k]==sum)
					{
						System.out.println(a[i]+" "+a[j]+" "+a[k]);
					}
				}
			}
		}*/
	}

	private static void loopi(int i, int[] a, int sum) {
		// TODO Auto-generated method stub
		if(i<a.length)
		{
			int j=i+1;
			loopj(i,j,a,sum);
			i++;
			loopi(i, a, sum);
		}
		
	}

	private static void loopj(int i, int j, int[] a, int sum) {
		// TODO Auto-generated method stub
		if(j<a.length)
		{
			int k=j+1;
			loopk(i,j,k,a,sum);
			j++;
			loopj(i, j, a, sum);
		}
		
	}

	private static void loopk(int i, int j, int k, int[] a, int sum) {
		// TODO Auto-generated method stub
		if(k<a.length)
		{
			if(a[i]+a[j]+a[k]==sum)
			{
				System.out.println(a[i]+" "+a[j]+" "+a[k]);
			}
			k++;
			loopk(i, j, k, a, sum);
		}
		
	}

}
