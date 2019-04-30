package com.test.util;

import java.util.function.Function;

public class FunctionalProgramming {

	public double funcProg1(int a) {

		Function<Integer, Integer> funct1 = n -> n * n;
		Function<Integer, Integer> funct2 = n -> n + n;
		double computeValue = funct1.andThen(funct2).apply(a);
		return computeValue;
	}

	public static int add(int x) {
		return x + 1;
	}

	public String concat(String x) {
		return x + 3;
	}

	
	public String funcProg2(int a) {

		Function<Integer, Integer> funct1 =FunctionalProgramming::add;
		Function<String, String> funct2 = new FunctionalProgramming()::concat;
		return funct2.apply(funct1.apply(a)+"");
		
	}
	
	public int funcProg3(int a) {

		Function<Integer, Integer> funct1 =FunctionalProgramming::add;
		Function<Integer, Integer> funct2 = x->x*x;
		Function<Integer,Integer> compute=funct1.compose(funct2);
		int value=compute.apply(a);
		
		return value;
	}
		
	
	
	
	
	
}
