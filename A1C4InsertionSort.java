import java.util.Iterator;
import java.util.concurrent.ForkJoinPool;

import javax.swing.text.StyledEditorKit.ForegroundAction;

//Write a program sort array elements in using insertion sort.

public class A1C4InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {7,8,3,1,2};//{1,3,7,8,2}
		for (int i = 1; i < a.length; i++) 
		{
			int temp=a[i];
			int j=i-1;
			while(j>=0&&temp<a[j])
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}

		
	}

}



