
public class A1H32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {11,12,13,14,-45,-15,12,158,-78,87};
		int cnt1=0;
		int cnt2=0;
		int cnt3=0;
		int cnt4=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]<0)
			{
				cnt1++;
			}
			else if(a[i]>0)
			{
				cnt2++;
			}
			if(a[i]%2==0)
			{
				cnt3++;
			}
			else
			{
				cnt4++;
			}
		}
		System.out.println("Negative: "+cnt1);
		System.out.println("Positive: "+cnt2);
		System.out.println("Even: "+cnt3);
		System.out.println("Odd: "+cnt4);
	}

}
