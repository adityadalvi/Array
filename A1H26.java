
public class A1H26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] S1={'a','b','c','d','e'};
		char[] S2={'w','x','y','z','p','q','r','s'};
		char[] S3=new char[S1.length+S2.length];
		int ind=0;
		for (int i = 0; i < S1.length||i<S2.length; i++)
		{
			if(i<S1.length)
			{
				S3[ind++]=S1[i];
			}
			if(i<S2.length)
			{
				S3[ind++]=S2[i];
			}
		}
		for (int i = 0; i < S3.length; i++) 
		{
			System.out.print(S3[i]+" ");
		}

	}

}
