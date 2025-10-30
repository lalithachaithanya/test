package Collection;

import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer , String> salary= new  TreeMap<>();
		
		salary.putFirst(10000, "emp1");
		salary.putFirst(40000, "emp2");
		salary.putFirst(67000, "emp4");
		salary.putFirst(19000, "emp6");
		salary.putFirst(10000, "emp5");
		
		System.out.println(salary);
	}

}



























/*
 * //1. Create a TreeMap with Integer keys and String values. // TreeMap stores
 * key-value pairs in ascending order of the keys. Map<Integer, String>
 * employeeMap = new TreeMap<>();
 * 
 * // 2. Add five key-value pairs to the map in an unsorted order.
 * System.out.println("Adding five employees to the map...");
 * employeeMap.put(105, "Bob Smith"); employeeMap.put(101, "Alice Johnson");
 * employeeMap.put(103, "Charlie Brown"); employeeMap.put(102, "Diana Prince");
 * employeeMap.put(104, "Edward Jones");
 * 
 * // 3. Print the entire TreeMap. // The output will show the key-value pairs
 * sorted by their integer keys.
 * System.out.println("\nTreeMap contents (sorted by key):");
 * System.out.println(employeeMap);
 * 
 * // 4. Iterate through the map to explicitly show the sorted order.
 * System.out.println("\nIterating through the map to demonstrate sorted order:"
 * ); for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
 * System.out.println("Key: " + entry.getKey() + ", Value: " +
 * entry.getValue()); } }
 */