//Write a program to remove the duplicate elements of a given array and return the new length of the array
public class A1H11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {105,108,106,108,109,106,110};
		int cnt=0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]==a[j])
				{
					cnt++;
					break;
				}
			}
		}
		int[] b=new int[a.length-cnt];
		int ind=0;
		for (int i = 0; i < a.length; i++) 
		{
			int cnt1=0;
			for (int j = i+1; j < a.length; j++) 
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
			System.out.print(b[i]+" ");
		}
		System.out.println();
		System.out.println(b.length);
	}

}
