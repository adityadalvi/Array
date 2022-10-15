/*
2) Write a program to test if an array contains a specific value (Variations)
 */
public class A1H2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {101,102,103,104,105};
		int num=188;
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			if(num==a[i])
			{
				cnt++;
				break;
			}
		}
		if(cnt!=0)
		{
			System.out.println("number available in given array");
		}
		else
		{
			System.out.println("Number not found");
		}
		}

	}


