package arrays;

public class Replacement2 {
	public static void main(String[] args) {
		int[] a= {5,2,6,4,1,3};
		int no=0;
		int evensum=0;
		int[] b=new int[a.length];
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				evensum=evensum+a[i];
		}
			b[i]=a[i];
			b[1]=no;
			b[2]=0;
			b[3]=0;		
			{
				System.out.println(b[i]);
				System.out.println("sum is:"+evensum);
			}
	}

}
}