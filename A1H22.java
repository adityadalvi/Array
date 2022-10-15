
public class A1H22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= {{1,2,3,1},
					{4,5,6,1},
					{7,8,9,1},
					{1,2,3,4}};
		
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[0].length; j++)
			{
				if(i==0||j==0||(j==a[0].length-1)||(i==a.length-1))
				{
					System.out.print(a[i][j]+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
