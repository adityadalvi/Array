
public class A1H13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {101,102,103,104,105,106,107,108};
		int[] b= {101,111,103,104,105,106,107,108};
		if(a.length!=b.length)
		{
			System.out.println("not same");
		}
		else
		{
			int cnt=0;
			for (int i = 0; i < b.length; i++) 
			{
				if(a[i]!=b[i])
				{
					cnt++;
					System.out.println("not same");
					break;
				}
			}
			if(cnt==0)
			{
				System.out.println("Same");
			}
			
		}

	}

}
