package string_array_5;

public class String_array {

	public static void main(String[] args) {
		
		String name = "Gokul";
		char[] count = name.toCharArray();
		System.out.println("Total number of character is" +count.length);
		
		
		 //  Check if a string is empty
        System.out.print("\n2. Enter a string to check if empty: ");
        String str2 = "Gokul";
        System.out.println("Is empty? " + str2.isEmpty());
        
        //  Convert string to uppercase
        System.out.print("\n3. Enter a string to convert to uppercase: ");
        String str3 = "gokul";
        System.out.println("Uppercase: " + str3.toUpperCase());
        
        //  Convert string to lowercase
        System.out.print("\n4. Enter a string to convert to lowercase: ");
        String str4 = "GOKUL";
        System.out.println("Lowercase: " + str4.toLowerCase());

        
        //  Concatenate two strings
        System.out.print("\n5. Enter first string: ");
        String str5a = "bi";
        System.out.print("Enter second string: ");
        String str5b = "cycle";
        System.out.println("Concatenated: " + str5a.concat(str5b));
        
        //  Find length of a string
        System.out.print("\n6. Enter a string to find length: ");
        String str6 = "encyclopedia";
        System.out.println("Length: " + str6.length());
        
        //  Check if string contains substring
        System.out.print("\n7. Enter main string: ");
        String str7a = "bicycle";
        System.out.print("Enter substring to search: ");
        String str7b = "cycle";
        System.out.println("Contains substring? " + str7a.contains(str7b));
        
        //  Replace characters in string
        System.out.print("\n8. Enter a string: ");
        String str8 = "MAIN";
        System.out.print("Enter character to replace: ");
        char oldChar = 'M';
        System.out.print("Enter new character: ");
        char newChar = 'G';
        System.out.println("Modified string: " + str8.replace(oldChar, newChar));
        
        //  Check if two strings are equal
        System.out.print("\n9. Enter first string: ");
        String str9a = "cycle";
        System.out.print("Enter second string: ");
        String str9b = "CYCLE";
        System.out.println("Strings equal? " + str9a.equals(str9b));
        
		
        // reverse anaarray
        System.out.print("\n10. Reverse an aarray ");
        int arr[] = {10, 20, 30, 40, 50};

        int n=arr.length;
        for(int i=n-1; i>=0; i--)
          System.out.print(arr[i]+" "); 
        
       // sum of array in elements
        System.out.print("\n11. sum of array in elements ");
        int arr1[]= {10, 20, 30};
        int sum = 0;

        for(int i=0; i<arr1.length; i++)
        {
          sum = sum + arr1[i];
        }

        System.out.print("The sum of all elements in an array"+sum);
        
        System.out.print("\n12. Find spefic element in array in ");
        int[] numbers = {1, 2, 3, 4, 5};
        int searchNumber = 3;
        boolean found = false;
        for (int num : numbers) {
            if (num == searchNumber) {
                found = true;
                break; // Value found, no need to continue searching
            }
        }
        System.out.println("Value " + searchNumber + " found: " + found);
        
        System.out.print("\n12. The maximum value of  array element  ");
        int arr2[] = {12, 13, 1, 10, 34, 10};

        int max = arr2[0];

        for(int i=0; i<arr2.length; i++)
        {
          if(max < arr2[i])
          {
             max = arr2[i];
          }

        }

       System.out.print("The maximum value of  array element is "+ max); 
	}
}
