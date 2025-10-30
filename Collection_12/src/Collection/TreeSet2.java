package Collection;

import java.util.TreeSet;

public class TreeSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		TreeSet<Integer> numbers = new TreeSet<>();
		 numbers.add(50);
	     numbers.add(20);
	     numbers.add(40);
	     numbers.add(10);
	     numbers.add(30);
	     
	     System.out.println(numbers);
	     System.out.println("The number of Size of the treeSet is "+numbers.size());
		
	}

}


































/*
 * public static void main(String[] args) {
 * 
 * // 1. Create a TreeSet to store Integer objects. // A TreeSet stores unique
 * elements and automatically sorts them in ascending order. Set<Integer>
 * numbers = new TreeSet<>();
 * 
 * // 2. Add five different numbers to the set in a non-sequential order.
 * System.out.println("Adding five numbers to the set..."); numbers.add(50);
 * numbers.add(20); numbers.add(40); numbers.add(10); numbers.add(30);
 * 
 * // 3. (Optional) Add a duplicate number to demonstrate uniqueness. // This
 * line will have no effect on the set's size or contents.
 * System.out.println("Attempting to add '20' again..."); numbers.add(20);
 * 
 * // 4. Print the entire TreeSet. // The output will show the numbers in a
 * sorted order. System.out.println("\nTreeSet contents (sorted):");
 * System.out.println(numbers);
 * 
 * // 5. Check the size of the set. It should still be 5.
 * System.out.println("\nSize of the set: " + numbers.size()); } }
 */
