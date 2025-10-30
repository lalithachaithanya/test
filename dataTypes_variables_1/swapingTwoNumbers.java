package dataTypes_variables_1;

public class swapingTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String tempVariable;
		
		int numberOne = 10;
		int numberTwo = 20;
		
		System.out.println("Before swaping  numberOne = " + numberOne +  " numberTwo = " + numberTwo);
				
		int temp = numberOne;
		numberOne = numberTwo;
		numberTwo = temp;
		
	    System.out.println("After swaping numberOne = "+ numberOne +  " numberTwo = " + numberTwo);
		
		
	}

}
