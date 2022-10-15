
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {101,102,103,104,105,106,107,108};
		int element=114;
		int cnt=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]==element)
			{
				cnt++;
				System.out.print("number found @ index: "+i);
			}
		}
		if(cnt==0)
		{
			System.out.println("Not found");
		}
	}

}
