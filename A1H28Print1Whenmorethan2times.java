
public class A1H28Print1Whenmorethan2times 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] a= {1,1,1,1,1,2,2,3,4};
		int[] n= {1,2,4};
		for (int i = 0; i < n.length; i++) 
		{
			int cnt=0;
			for (int j = 0; j < a.length; j++) 
			{
				if(n[i]==a[j])
				{
					cnt++;
				}
				if(cnt==2)
				{
					cnt=2;
					break;
				}
			}
			int[] b=new int[a.length-cnt];
			int ind=0;
			int cnt1=0;
			for (int j = 0; j < a.length; j++)
			{
				if((a[j]!=n[i])||cnt1>=2)
				{
					b[ind++]=a[j];
				}
				else
				{
					cnt1++;
				}
			}
			a=b;
		}
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}

