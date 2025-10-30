package Collection;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> number = new LinkedList<>();
		
		number.add(45);
		number.add(546);
		number.add(89);
		number.add(546); // Accept delicate values
		number.add(67);
		
		System.out.println(number);
	}

}
