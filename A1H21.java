
public class A1H21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] b= {{9,8,7},{6,5,4},{3,2,1}};
		int[][] c=new int[a.length][b[0].length];
	
		//multiplication
		
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[0].length; j++) 
			{
				for (int j2 = 0; j2 < b.length; j2++)
				{
					c[i][j]=c[i][j]+(a[i][j2]*b[j2][j]);
				}
			}
		}
		for (int i = 0; i < c.length; i++) 
		{
			for (int j = 0; j < c[0].length; j++) 
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		//subtraction
		/*
		for (int i = 0; i < c.length; i++) 
		{
			for (int j = 0; j < c.length; j++) 
			{
				c[i][j]=a[i][j]-b[i][j];
			}
		}
		for (int i = 0; i < c.length; i++) 
		{
			for (int j = 0; j < c.length; j++) 
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}*/

	}

}
