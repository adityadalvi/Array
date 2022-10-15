
public class A1H19 {
	//static double sum=0;
	//static int cnt=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= {{1,2,3,4},
				{4,5,6,7},
				{1,2,3,4},
				{4,5,6,1}

		};
		/*double avg=0;
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
		System.out.println(avg);*/
		
		int i=1;
		Data obj = new Data();
		loopi(i,a,obj);
		System.out.println(obj.sum+"\n"+obj.cnt);
	}
	private static void loopi(int i,int[][] a,Data obj)
	{
		if(i<a.length-1)
		{
			int j=1;
			loopj(i,j,a,obj);
			i++;
			loopi(i, a,obj);
		}
		
	}
	private static void loopj(int i, int j, int[][] a,Data obj) {
		// TODO Auto-generated method stub
		if(j<a.length-1)
		{
			obj.sum=obj.sum+a[i][j];
			obj.cnt++;
			//obj=new Data(obj.sum,obj.cnt);
			j++;
			loopj(i, j, a,obj);
		}
	}

}
class Data
{
	double sum=0;
	int cnt=0;
	
}
