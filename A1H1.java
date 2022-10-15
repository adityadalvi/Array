/*
 Write a program to find the index of an array element
 */
public class A1H1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {101,102,103,104,105};
		int num=103;
		for(int i=0;i<a.length;i++)
		{
			if(num==a[i])
			{
				System.out.println("number found at index : "+i);
				break;
			}
		}
		
	}

}
