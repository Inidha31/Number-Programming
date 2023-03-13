package arrays;

public class sum {
	public static void main(String[] args) {
		int[] a= {77,66,99,44,55};
		 int sum=0;
		 for(int i=0;i<a.length;i++)
		 {
			 sum+=a[i];
			 System.out.println("Array Element sum:"+sum);
			 System.out.println("Average:"+sum/a.length);
		 }
	}

}
