
public class SumOfOuterElementofMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a= {
				{1,2,3,4},
				{5,6,7,8},
				{1,3,5,7},
				{2,4,6,8}
				};
		int sum=0;
		int cnt=0;
		double avg=0;
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[0].length; j++)
			{
				if(i==0|| i==a.length-1 || (j==0&&i>=1&&i<=a.length-2)||(j==a[0].length-1&&i>=1&&i<=a.length-2))
				{
					sum=sum+a[i][j];
					cnt++;
				}
			}
			
		}
		System.out.println("Sum of outer:"+sum);
		System.out.println("average:"+(sum/cnt));

	}

}
