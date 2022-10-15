
public class A1C2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] a= {41,42,43,44,45,46};
		int num=401;
		int s=0;
		int e=a.length-1;
		int mid=(s+e)/2;
		while(s<=e)
		{
			if(num==a[mid])
			{
				System.out.println("found at index:"+mid);
				break;
			}
			else if(num>a[mid])
			{
				s=mid+1;
			}
			else
			{
				e=mid-1;
			}
			mid=(s+e)/2;
		}
		if(s>e)
		{
			System.out.println("not found");
		}
	}


}
