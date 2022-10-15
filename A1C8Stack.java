//Write a program to implement stack methods using array. (Jun Monthly) (Variations)

class Stack
{
	int[] a=new int[5];
	int ind=0;
	public void push(int num)
	{
		if(ind>=a.length)
		{
			System.out.println("Overflow");
			System.exit(0);
		}
		else
		{
			a[ind++]=num;
		}
	}
	public int pop()
	{
		if(ind<=0)
		{
			System.out.println("Underflow");
			System.exit(0);
		}
		ind--;
		return a[ind];
	}
}
public class A1C8Stack
{
	public static void main(String[] args)
	{
		Stack s=new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		//s.push(60);
		//s.push(60);

		
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
	}
}

