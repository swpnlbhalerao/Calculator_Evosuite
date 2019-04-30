package com.test.Calculator;

import com.test.DigitalCalculator.DigitalCalculator;
import com.test.util.StreamApi;

public class Calculator {

    private static  CalcInterface calcInterface;
    
    
			public Calculator(CalcInterface calcInterface) {
				this.calcInterface=calcInterface;
			}
	
	public static void main(String[] args) {
		
	/*	double num1, num2;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first number:");

		num1 = scanner.nextDouble();
		System.out.print("Enter second number:");
		num2 = scanner.nextDouble();

		System.out.print("Enter an operator (+, -, *, /): ");
		char operator = scanner.next().charAt(0);

		scanner.close();*/

		//double result = getResult(num1, num2, operator);
//		System.out.println("Result of the " + num1 +" "+ operator+ " " + num2 + " operation :: " + result);
		
		//RunCalc.perform(num1,num2, operator);
		
		
		/*LamdaExpression l=new LamdaExpression();
		int functionReturn =l.functionEx(-114);*/
		/*LamdaExpression l=new LamdaExpression();
		 int int0 = l.LambaSquareFunc(4264225);
		System.out.println(int0);*/
		
		
		/*StreamApi s=new StreamApi();
		System.out.println(s.funcProg1());*/
	
	}
	
	public static double performExpotenial(double num1, double num2){
		DigitalCalculator d=new DigitalCalculator();
		double value=d.calculateLog(num1, num2);
		if(value>0){
			System.out.println("Expotenital input is validated");
		}
		return value;
		
	}
	
	public static double perform(double num1, double num2, char operator){
		return calcInterface.calculateService(num1, num2)*num1;
	}

	public static double getResult(double num1, double num2, char operator) {
		double output = 0;
		switch (operator) {
		case '+':
			output = num1 + num2;
			break;

		case '-':
			output = num1 - num2;
			break;

		case '*':
			output = num1 * num2;
			break;

		case '/':
			output = num1 / num2;
			break;

		/*
		 * If user enters any other operator or char apart from +, -, * and /,
		 * then display an error message to user
		 * 
		 */
		default:
			System.out.println("You have entered wrong operator "+operator);
			return output;
		}
		return output;

	}

}
