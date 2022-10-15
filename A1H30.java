
public class A1H30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= {{1,2,3},
					{4,2,6},
					{7,8,4}};
		int sum=0;
		/*for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(j-i==0 || j+i==2)	
				{
					sum=sum+a[i][j];
				}
			}
		}*/
		//System.out.println(sum);
//sum of non-diagonal elements		
		for(int i=0;i<a.length;i++)
		{ 
			for(int j=0;j<3;j++)
			{
				if(j-i!=0 && j+i!=a.length-1)	
				{
					sum=sum+a[i][j];
				}
			}
		}
		System.out.println(sum);
		
		
	}

}
