/*36)Write a program to Find unique Pair Of Integers in Array whose Sum is Given Number. (Variations) Given array
: [2, 4, 3, 5, 6, -2, 4, 7, 8, 9]
Given sum : 7
*/
public class A1H36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2, 4,3,3, 5, 6, -2, 4, 7, 8, 9};
		int cnt=0;
		int sum=7;
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
			for (int j = i+1; j < b.length; j++)
			{
				if(b[i]+b[j]==sum)
				{
					System.out.println(b[i]+" "+b[j]);
				}
			}
		}
	}

}
