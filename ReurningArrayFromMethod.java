
public class ReurningArrayFromMethod {

	static int[] get()
	{
		return new int[]{1,2,3,4,5};
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=get();
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}

	}

}
