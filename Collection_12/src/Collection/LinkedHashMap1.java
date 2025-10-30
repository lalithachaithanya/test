package Collection;

import java.util.LinkedHashMap;


public class LinkedHashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer , String> employeeMap = new LinkedHashMap<>();
		employeeMap.put(101, "Alice Johnson"); 
		employeeMap.put(105, "Bob Smith");
		employeeMap.put(103, "Charlie Brown"); 
		employeeMap.put(102, "Diana Prince");
		employeeMap.put(104, "Edward Jones");
		System.out.println("Employee Details "+ employeeMap);
	}
	

}




/*
 * public class LinkedHashMapExample {
 * 
 * public static void main(String[] args) {
 * 
 * // 1. Create a LinkedHashMap with Integer keys and String values. //
 * LinkedHashMap maintains the order in which elements are inserted.
 * Map<Integer, String> employeeMap = new LinkedHashMap<>();
 * 
 * // 2. Add five key-value pairs to the map.
 * System.out.println("Adding five employees to the map...");
 * employeeMap.put(101, "Alice Johnson"); employeeMap.put(105, "Bob Smith");
 * employeeMap.put(103, "Charlie Brown"); employeeMap.put(102, "Diana Prince");
 * employeeMap.put(104, "Edward Jones");
 * 
 * // 3. Print the entire LinkedHashMap. // The output will show the key-value
 * pairs in the order they were added.
 * System.out.println("\nLinkedHashMap contents (maintaining insertion order):"
 * ); System.out.println(employeeMap);
 * 
 * // 4. Get a specific value from the map. String employeeName =
 * employeeMap.get(103); System.out.println("\nEmployee with ID 103: " +
 * employeeName);
 * 
 * // 5. Iterate through the map to explicitly show the order.
 * System.out.println("\nIterating through the map to demonstrate order:"); for
 * (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
 * System.out.println("Key: " + entry.getKey() + ", Value: " +
 * entry.getValue()); } } }
 */