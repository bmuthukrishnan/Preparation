package bmk.pkg;

import java.util.Random;
import java.util.function.BiFunction;

class Arithmetic {
	public static int add(int a, int b) {
		return a + b;
	}

	public static float add(int a, float b) {
		return a + b;
	}

	public static float add(float a, float b) {
		return a + b;
	}
}

public class InstanceMethodReference {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> adder1 = Arithmetic::add;
		BiFunction<Integer, Float, Float> adder2 = Arithmetic::add;
		BiFunction<Float, Float, Float> adder3 = Arithmetic::add;
		BiFunction<Integer, Integer, Integer> fun = (a, b) -> (a / b);
		Integer intr = fun.apply(5, 13);
		System.out.println(" Output = "+intr);
		int result1 = adder1.apply(10, 20);
		float result2 = adder2.apply(10, 20.0f);
		float result3 = adder3.apply(10.0f, 20.0f);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
//		Random r = new Random();
//		r.ints().limit(15).forEach(System.out::println);
	}
}