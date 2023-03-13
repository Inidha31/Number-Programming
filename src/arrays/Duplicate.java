package arrays;

public class Duplicate {
	public static void main(String[] args) {
		int[]a= {44,78,56,45,23,12,78};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j])
					System.out.println("DUPLICATES ARE :"+a[i]);
					
				}
			}
		}
	}
