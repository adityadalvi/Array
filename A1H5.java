/*
5) Write a program to find and display reverse of an array using third variable.
 */
public class A1H5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {101,102,103,104,105};
		int i=0;
		int j=a.length-1;
		while(i<j)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		for (int j2 = 0; j2 < a.length; j2++) 
		{
			System.out.print(a[j2]+" ");
		}

	}

}
