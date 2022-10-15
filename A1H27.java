/*
Write a program or function to find saddle point of a matrix. Your program should take input matrix from
the user, display the matrix and find the saddle point of that matrix. Saddle point of a matrix is an element in the
matrix which is smallest in its row and largest in its column. A matrix can have many or no saddle points. For
example,
6 3 1
9 7 8
2 4 5
In this matrix, 7 is the saddle point. Because it is the smallest in its row (2nd row) and largest in its column (2nd
column).
 */
public class A1H27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= {{8,9,7},
					{4,3,6},
					{11,2,2}};
		int cnt=0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++) 
			{
				int s=0;
				for (int k = 0; k < a.length; k++) 
				{
					if(a[i][j]>a[i][k])
					{
						s++;
					}
				}
				if(s==0)
				{
					int l=0;
					for (int k = 0; k < a.length; k++)
					{
						if(a[i][j]<a[k][j])
						{
							l++;
						}
					}
					if(l==0)
					{
						System.out.println("Saddle point: "+a[i][j]);
						cnt++;
					}
				}
			}
		}
		if(cnt==0)
		{
			System.out.println("no saddle point");
		}
	}
}

