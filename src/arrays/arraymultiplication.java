package arrays;

public class arraymultiplication {
	public static void main(String[] args) {
		int[] a= {1,2,3};
		
		int[] b= {4,5,6};
		
		int[] c= new int[a.length];
		
		for(int i = 0; i<c.length; i++)
		{
		c[i] =a[i] * b[i];
		}
		for(int i = 0; i<c.length; i++)
		{
			System.out.println(c[i]);
		}
	}

}
