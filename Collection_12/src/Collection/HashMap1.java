package Collection;

import java.util.HashMap;

public class HashMap1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashMap< String, Integer> number = new HashMap();
		
		HashMap<String, Integer> studentScores = new HashMap<>();
		
		studentScores.put("alex", 90);
		studentScores.put("max", 34);
		studentScores.put("paul", 56);
		studentScores.put("tom", 97);
		studentScores.put("david", 56);
		
		System.out.println(studentScores);
		
	}

}


















/*
 * public class HashMapDemo { public static void main(String[] args) {
 * Map<String, String> capitalCities = new HashMap<>();
 * 
 * // Add key-value pairs capitalCities.put("England", "London");
 * capitalCities.put("Germany", "Berlin"); capitalCities.put("Norway", "Oslo");
 * capitalCities.put("USA", "Washington DC");
 * 
 * System.out.println("HashMap: " + capitalCities);
 * 
 * // Get a value String capitalOfNorway = capitalCities.get("Norway");
 * System.out.println("Capital of Norway: " + capitalOfNorway);
 * 
 * // Remove a key-value pair capitalCities.remove("Germany");
 * System.out.println("After removing Germany: " + capitalCities);
 * 
 * // Check if a key exists System.out.println("Contains USA? " +
 * capitalCities.containsKey("USA"));
 * 
 * // Iterate over the map System.out.println("Iterating over the map:"); for
 * (Map.Entry<String, String> entry : capitalCities.entrySet()) {
 * System.out.println("Country: " + entry.getKey() + ", Capital: " +
 * entry.getValue()); } } }
 */