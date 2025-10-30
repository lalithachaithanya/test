package Collection;

import java.util.*;
public class HashSet1 {

	public static void main(String[] args) {
		
		HashSet<String>  cities = new HashSet<String>();	
		
		cities.add("Bengaluru");
		cities.add("Chennai");
		cities.add("pune");
		cities.add("Delhi");
		cities.add("kochi");
		cities.add("hyderabad");
		cities.add("hyderabad");
		
		
		System.out.println("Set of cities" +cities);
	}
}
