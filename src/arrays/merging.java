package arrays;

public class merging {
	private static int i;

	public static void main(String[] args) {
		int[] arr1= {76,89,34,23,67,45};
		int[] arr2= {65,54,43,32,98,87};
		int len=arr1.length+arr2.length;
		
		int[] c=new int[len];
		
		for(int i=0;i<arr1.length;i++)
		{
			c[i]= arr1[i];
		}
			int j=0;
		for(int i=0;i<arr2.length;i++)
		{
			c[i]=arr2[j];
			j++;
		}
		for(int i=0;i<c.length;i++);
		{
			System.out.println(c[i]);
		}
		
	}

}
