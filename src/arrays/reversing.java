package arrays;
import java.util.Scanner;
public class reversing {
	static Scanner  s = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the given");
		int[] a= {99,88,77,66,55,33,22};
		int[] c= new int[s.nextInt()];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enetr the element");
			a[i] = s.nextInt();
		}
		System.out.println(" Before reversing");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			System.out.println("*****************");
		}
		System.out.println("After reversing");
		for(int i=a.length;i>0;i--)
		{
			System.out.println(a[i]);
		}
		
		
	}

}
