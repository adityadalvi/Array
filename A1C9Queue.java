//9. Write a program to implement queue methods using array. (Shankar Jadhav Nov 2020)(Variations)

//task-code without using count
class queue
{
	int[] a=new int[5];
	int i1=0;
	int i2=0;
	int cnt=0;
	public void push(int num)
	{
		if(cnt>=a.length)
		{
			System.out.println("Overflow");
			System.exit(0);
		}
		else
		{
			a[i1++]=num;
			if(i1==5)
			{
				i1=0;
			}
			cnt++;
		}
	}
	public int pop()
	{
		if(cnt<=0)
		{
			System.out.println("Underflow");
			System.exit(0);
			return 0;
		}
		else
		{
			int oldi2=i2;
			i2++;
			cnt--;
			return a[oldi2];
		}
	}
	
	
}



public class A1C9Queue {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		queue q=new queue();
		
		q.push(10);
		q.push(20);
		q.push(30);
		q.push(40);
		q.push(50);
		//q.push(60);
		
		
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
		//System.out.println(q.pop());
		
	}
		
	

}



