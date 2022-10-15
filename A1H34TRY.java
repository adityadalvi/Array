
public class A1H34TRY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,2,3,4,5,6,2,7,5};
		int n=4;
		int m=5;
		int Nind=0;
		int Mind=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(n==a[i])
			{
				Nind=i;
				break;
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			if(m==a[i])
			{
				Mind=i;
				break;
			}
		}
		if(Nind>Mind)
		{
			System.out.println(Nind-Mind);
		}
		else
		{
			System.out.println(Mind-Nind);
		}
		
	}

}
