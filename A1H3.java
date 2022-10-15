/*
3) Write a program to remove a specific element from an array (Variations)
 */
public class A1H3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {101,102,103,104,103,105};
		int num=103;
		int cnt=0;
		/*for (int i = 0; i < a.length; i++)
		{
			if(a[i]==num)
			{
				cnt++;
			}
		}
		int[] b=new int[a.length-cnt];
		int ind=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]!=num)
			{
				b[ind++]=a[i];
			}
		}
		for (int i = 0; i < b.length; i++)
		{
			System.out.print(b[i]+" ");
		}*/
		
		int i=0;
		cnt=loopi(i,num,cnt,a);
		int[] b=new int[a.length-cnt];
		int ind=0;
		int j=0;
		loopj(j,b,ind,a,num);
		int k=0;
		loopk(k,b);
		
	}
	private static int loopi(int i,int num,int cnt,int[] a)
	{
		if(i<a.length)
		{
			if(a[i]==num)
			{
				cnt++;
			}
			i++;
			return loopi(i, num, cnt, a);
		}
		return cnt;
	}
	private static void loopj(int j,int[] b,int ind,int[] a,int num)
	{
		if(j<a.length)
		{
			if(a[j]!=num)
			{
				b[ind++]=a[j];
			}
			j++;
			loopj(j,b, ind, a, num);
		}
	}
	private static void loopk(int k,int[] b)
	{
		if(k<b.length)
		{
			System.out.print(b[k]+" ");
			k++;
			loopk(k, b);
		}
	}

}
