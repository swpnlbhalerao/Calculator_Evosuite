package com.test.util;

public class RecursionFunction {
	public int factorial(int no) {

		if (no == 0 || no == 1) {
			return no;
		} else {
			return no * factorial(no - 1);
		}
	}
}
