package com.test.util;

import java.util.ArrayList;
import java.util.List;

public class LamdaExpression {

	public double LambaSquareFunc(int a) {
		interface1 calSq = (int x) -> {
			return x * x;
		};

		double sqValue = calSq.compute(a);

		return sqValue;
	}

	public double LambdaAdd(int a, int b) {

		interface2 add = (x, y) -> x + y;
		double addResult = add.operation(a, b);
		return addResult;

	}

	public double LambdaMultiply(int a, int b) {

		interface2 multiply = (x, y) -> x * y;
		double multiplyResult = multiply.operation(a, b);
		return multiplyResult;

	}

	public void LambaExpForAL() {

		List<Integer> intList = new ArrayList<Integer>();
		int i = 0;
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);

		intList.forEach((n) -> {
			System.out.println(n);
		});

	}

	/*
	 * public int functionEx(int a) {
	 * 
	 * Function<Integer, Integer> half = number -> number / 2; double halfValue
	 * = half.apply(a); System.out.println(halfValue);
	 * 
	 * BiFunction<Integer, Integer, Integer> multiply = (x, y) -> x * y; int
	 * mutliplyValue = multiply.apply((int) halfValue, a);
	 * System.out.println(mutliplyValue);
	 * 
	 * Function<Integer, Integer> times2 = e -> e * 2; Function<Integer,
	 * Integer> squared = e -> e * e; int composeValue =
	 * times2.compose(squared).apply(mutliplyValue); return composeValue;
	 * 
	 * 
	 * }
	 */

}

interface interface1 {
	public double compute(int x);

}

interface interface2 {
	public double operation(int x, int y);

}