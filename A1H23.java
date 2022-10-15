
public class A1H23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {11,22,33,44,55,66};
		//left shift
		int temp=a[0];
		for(int i=0;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
		a[a.length-1]=temp;
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
		
		//right shift
		/*int temp=a[a.length-1];
		for(int i=a.length-1;i>0;i--)
		{
			a[i]=a[i-1];
		}
		a[0]=temp;
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}*/

	}

}
