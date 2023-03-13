package arrays;

public class EvenNumber {
	public static void main(String[] args) {
		int[] a= {10,8,9,5,4,0};
			for(int i=0;i<a.length;i++)
			{
				if(a[i]%2==0)
				System.out.println("Even elements" +a[i]);
			}
	}

}
