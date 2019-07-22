package ibiz.example.java.util;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FunctionalUtil {
	
	/**
	 * Thread 생성할 때 주로 사용하는 함수형 인터페이스.
	 */
	public void runnableFunction() {
		Runnable r = () -> System.out.println("test");
		r.run();
	}
	
	/**
	 * parameter를 받지 않고 return 값만 존재
	 * @return
	 */
	public String SupplierFunction() {
		Supplier<String> s = () -> "Supplier Test.....";
		return s.get(); 
	}
	
	/**
	 * parameter를 받고 return은 존재하지 않음.
	 * @param str
	 */
	public void ConsumerFunction(String str) {
		Consumer<String> c = string -> System.out.println(string);
		c.accept(str);
	}
	
	/**
	 * 
	 * @param intStr
	 * @return
	 */
	public int functionFucntion(String intStr) {
		Function<String, Integer> f = str -> Integer.parseInt(str);
		return f.apply(intStr);
	}
	
	/**
	 * return 타입이 boolean값으로 고정
	 * @param str
	 * @return
	 */
	public boolean predicateFunction(String str) {
		Predicate<String> p = strint -> strint.isEmpty();
		return p.test(str);
	}
	
	/**
	 * parameter, return 타입이 같아야한다.
	 * @param str
	 * @return
	 */
	public String unaryOperatorFunction(String str) {
		UnaryOperator<String> u = string -> string + " operator";
		return u.apply(str);
	}
	
	/**
	 * 동일한 타입의 parameter 2개와 같은 타입의 return
	 * @param str1
	 * @param str2
	 * @return
	 */
	public String binaryOperatorFunction(String str1, String str2) {
		BinaryOperator<String> b = (string1, string2) -> string1 + " " + string2;
		return b.apply(str1, str2);
	}
	
	/**
	 * 서로 다른 타입의 2개의 parameter를 받아 또 다른 타입으로 return
	 * @param integer
	 * @param str
	 * @return
	 */
	public String biFunctionFucntion(int integer, String str) {
		BiFunction<Integer, String, String> bf = (num, string) -> String.valueOf(num) + string;
		return bf.apply(integer, str);
	}
	
	/**
	 * 객체간 우선순위를 비교할때 사용하는 인터페이스.
	 * 1회성 구현을 많이 하는 interface
	 * @param str1
	 * @param str2
	 * @return
	 */
	public int comparatorFunction(String str1, String str2) {
		Comparator<String> c = (string1, string2) -> string1.compareTo(string2);
		return c.compare(str1, str2);
	}
	
	public String stringFunction(String[] stringArray) {
		return String.format("%s_%s_%s_log.log", stringArray);
	}
}
