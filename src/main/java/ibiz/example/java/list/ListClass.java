package ibiz.example.java.list;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ListClass {
	@Test
	public void list() {
		List<String> list = new ArrayList<String>(2);
		System.out.println("list size :: " + list.size());
		System.out.println("list :: " + list.toString());
		list.add("a");
		System.out.println("list :: " + list.toString());
		list.add("b");
		System.out.println("list :: " + list.toString());
		list.add("c");
		System.out.println("list :: " + list.toString());
	}
	
	@Test
	public void test() {
		double a = 200000000;
		double b = 150000000;
		double min = Math.min(a, b);
		System.out.println(min);
	}
}
