package JavaStringPrograms;

import java.util.HashMap;
import java.util.Map;


public class CountDuplicatesAndRemoveDuplicates {
	public static void main(String[] args) {
		
	        String input = "hello world";
//	        It declares a map called charCountMap that will store characters as keys and their respective counts as values.
//	        The map is initialized as an empty HashMap.
	        Map<Character, Integer> charCountMap = new HashMap<>();

	        // Count characters
//	     The program iterates through each character in the input string using a for-each loop.
	        for (char c : input.toCharArray()) {
	        	
//	        Inside the loop, it checks if the character c is a letter using Character.isLetter(c). 
//	   This ensures that only alphabetic characters are counted, and non-letter characters like spaces or punctuation are ignored.     	
	            if (Character.isLetter(c))
	            {
	            	
	                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
//	 For each letter character, it updates its count in the charCountMap. 
//	It uses charCountMap.getOrDefault(c, 0) to retrieve the current count of the character and adds 1 to it. 
//	If the character is not yet in the map, it defaults to 0 and then adds 1 to it.               
	                
	                
	            }
	        }

	        // Print characters with counts
	        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
	            if (entry.getValue() > 1) {
	                System.out.println("Character: " + entry.getKey() + ", Count: " + entry.getValue());
// After counting the characters, the program iterates through the entries (key-value pairs) in the charCountMap using a for-each loop.
//	 It checks if the count (entry.getValue()) of each character is greater than 1, indicating that it's a duplicate character.
//If the count is greater than 1, it prints out the character and its count using 
	            }
	        }
	    }
	}
