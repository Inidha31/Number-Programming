package arrays;
import java.util.ArrayList;
public class addition {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(5);
		al.add(12);
		al.add("tabrez");
		al.add('c');
		System.out.println(al);
		System.out.println(al.get(4));
		System.out.println(al.remove(2));
		System.out.println(al);
		System.out.println(al.contains("inidha"));
	}

}
