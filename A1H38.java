
public class A1H38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {5,1,3,6,8,2,9,0,10};
		int[] incA=new int[a.length];
		int[] decA=new int[a.length];

		int incEle=0;
		int decEle=0;

		if(a[0]>a[1])
		{
			decA[0]=a[0];
			decEle=a[0];
			incA[0]=a[1];
			incEle=a[1];
		}
		else
		{
			decA[0]=a[1];
			decEle=a[1];
			incA[0]=a[0];
			incEle=a[0];
		}
		int incind=1;
		int decind=1;
		int cnt=0;
		for(int i=2;i<a.length;i++)
		{
			if(a[i]>incEle)
			{
				incA[incind++]=a[i];
				incEle=a[i];
			}
			else if(a[i]<decEle)
			{
				decA[decind++]=a[i];
				decEle=a[i];
			}
			else
			{
				cnt++;
				break;

			}
		}
		if(cnt==0)
		{
			for (int i = 0; i < incind; i++)
			{
				System.out.print(incA[i]+" ");
			}
			System.out.println();
			for (int i = 0; i < decind; i++) 
			{
				System.out.print(decA[i]+" ");
			}
		}
		else
		{
			System.out.println(-1);
		}
	}
}


