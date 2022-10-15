//Number of unique pairs in an array. Given an array of N elements, that ask is to find all the unique pairs that can be formed using the elements of a given array
public class A1C7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,1,2};
		int cnt=0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++)
			{
				if(a[i]==a[j])
				{
					cnt++;
				}
			}
		}
		int[] b=new int[a.length-cnt];
		int ind=0;
		for (int i = 0; i < a.length; i++)
		{
			int cnt1=0;
			for (int j = 0; j <i; j++)
			{
				if(a[i]==a[j])
				{
					cnt1++;
					break;
				}
			}
			if(cnt1==0)
			{
				b[ind++]=a[i];
			}
		}
		for (int i = 0; i < b.length; i++)
		{
			for (int j = 0; j < b.length; j++) 
			{
				System.out.println(b[i]+" "+b[j]);
			}
		}
	}

}
