package arrays;

public class missingNumber {
	public static void main(String[] args) {
		int[] a= {10,20,40,50};
		int no = 30;
		int temp = a[2];
		a[2] = no;
		int[] b = new int[a.length+1];
		for(int i=0; i<2; i++)
		{
			b[i] = a[i];
		}
		b[2] = no;
		b[3]= 40;
		for(int i=4; i<b.length; i++)
		{
			b[i] = a[i-1];
		}
		for(int i=0; i<b.length; i++)
		{
			System.out.println(b[i]);
		}
	}

}
