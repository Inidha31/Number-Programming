package arrays;

public class LinearSearch {
	public static void main(String[] args) {
		int[] a= {67,99,43,56,90};
		int key=99;
		int i=0;
		while(i<a.length)
		if(key==a[i])
		{
			System.out.println("present"+i+"position");
			break;
		}
		if(i==a.length)
		{
			System.out.println("Not present");
		}
	}
}