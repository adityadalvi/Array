//Array object
public class A1H24StudentArrayObject {
	int id;
	String name;
	int marks;
	A1H24StudentArrayObject(int id,String name,int marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	
	public static void main(String[] args) 
	{
		
		A1H24StudentArrayObject s1=new A1H24StudentArrayObject(1,"A",87);
		A1H24StudentArrayObject s2=new A1H24StudentArrayObject(1,"B",89);
		A1H24StudentArrayObject s3=new A1H24StudentArrayObject(1,"C",85);
		A1H24StudentArrayObject s4=new A1H24StudentArrayObject(1,"D",99);
		
		A1H24StudentArrayObject[] a= {s1,s2,s3,s4};
		
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i+1; j < a.length; j++)
			{
				if(a[i].marks>a[j].marks)
				{
					A1H24StudentArrayObject temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(a[0].id+" "+a[0].name+" "+a[0].marks);
	}
	

}
/*
int id;
	String name;
	int marks;
	A1H24StudentArrayObject(int id,String name,int marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A1H24StudentArrayObject s1=new A1H24StudentArrayObject(101,"Aditya",95);
		A1H24StudentArrayObject s2=new A1H24StudentArrayObject(102,"Shree",93);
		A1H24StudentArrayObject s3=new A1H24StudentArrayObject(103,"Gomu",96);
		A1H24StudentArrayObject s4=new A1H24StudentArrayObject(104,"Somu",99);
		
		A1H24StudentArrayObject[] a= {s1,s2,s3,s4};
		
		for (int i = 0; i <a.length; i++)
		{
			for (int j = 0; j < a.length; j++) 
			{
				if(a[i].marks>a[j].marks)
				{
					A1H24StudentArrayObject temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++)
		{
			System.out.println(a[i].id+" "+a[i].name+" "+a[i].marks);
		}
	}
*/
