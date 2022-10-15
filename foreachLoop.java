
public class foreachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {11,22,33,44,55,66,77,88,99};
		int sum=0;
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i:a)
		{
			sum=sum+i;
		}
		System.out.println("sum : "+sum);

	}

}
