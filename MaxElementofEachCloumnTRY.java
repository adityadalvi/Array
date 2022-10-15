
public class MaxElementofEachCloumnTRY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a= {{4,5,6},
				{1,2,3},
				{7,8,9}};
		int min=a[0][0];
		for (int i = 0;i < a.length; i++) 
		{

			for (int j = 0; j <a.length; j++)
			{
				if(j<0)
				{
					if(a[i][j]<min)
					{
						min=a[i][j];
					}
				}
			}
			System.out.println(min);
		}

	}

}
