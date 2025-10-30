package Oops_9;

public class Calculator {


	
	public int add(int a , int b) {
		
		
		return a+b;
	}
	
	public int add(int a, int b, int c) {
		
		
	return a+b+c;
	}
	
	public double add(double a , double b) {
		
		return a+b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator calculator = new Calculator();
		System.out.println(calculator.add(4, 5));
		
		System.out.println(calculator.add(4, 5, 6));
		System.out.println(calculator.add(65667, 695968954));
	}

}
