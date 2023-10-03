package JavaStringPrograms;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
public class RemoveDuplicateCharsFrmString {
	public static void main(String[] args) {
		String str = "Shubham";
	Set<Character> set = new LinkedHashSet();
		for(int i=0;i<str.length();i++)
		{
			set.add(str.charAt(i));
		}
		for(Character c:set)
		{
			System.out.print(c);
		}
	}
	}
//	for(data_type variable : array | collection)   {     //body of for-each loop  }
//	"	The Java for-each loop traverses the array or collection until the last element. 
//		For each element, it stores the element in the variable and executes the body of the for-each loop."
	
		
		
		
		
		
		
		
		
		

