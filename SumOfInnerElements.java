
public class SumOfInnerElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= {{1,2,3,4},
				{4,5,6,7},
				{1,2,3,4},
				{4,5,6,1}

		};
		double avg=0;
		double sum=0;
		int cnt=0;
		for (int i = 1; i < a.length-1; i++) 
		{
			for (int j = 1; j < a.length-1; j++) 
			{
				sum=sum+a[i][j];
				cnt++;
			}
		}
		avg=sum/cnt;
		System.out.println(sum);
		System.out.println(avg);

	}
}
