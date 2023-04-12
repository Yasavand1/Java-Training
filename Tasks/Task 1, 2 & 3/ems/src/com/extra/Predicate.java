package com.extra;


import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;



public class Predicate {

	public static void main(String[] args) {
		BiPredicate<String, String> res = (un, pw) -> un.equals(pw);
		System.out.println(res.test("abc", "abc"));

		if (res.test("Priya", "Priya")) {
			System.out.println("Welcome ");
		} else {
			System.out.println("Welcome Guest");
		}
				
		BiPredicate<Long, Long> p1 = (x, y) -> x > y;
		BiPredicate<Long, Long> p2 = (x, y) -> x == y;
		
		System.out.println(p1.test(10l, 10l));
		
		
		Supplier<String> s = () -> {
			return "Priya";
		};
		System.out.println(s.get());

		Supplier<Integer> s1 = () -> {
			return 123;
		};
		System.out.println(s1.get());
		
		Function<Integer,String> evenorodd = (num)->{
			if(num%2 == 0) {
			return num + " is even .";
			}
			else
			{
				return num + " is odd";
			}
			
		};
		System.out.println(evenorodd.apply(52));
		
		
	}

}
