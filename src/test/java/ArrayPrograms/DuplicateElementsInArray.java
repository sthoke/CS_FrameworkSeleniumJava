package ArrayPrograms;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		
	char[] arr = { 'h', 'e', 'l', 'l', 'o', 'o', 'o','y'};
	int count;      // declare the variable  
		
	for (int i = 0; i < arr.length; i++) // Apply loop to iterate char Array
		{  
			count = 1;             // Assign the value of count as 1 and in will change the value to one at every iteration
			for (int j = i + 1; j < arr.length; j++)       // the for comparison purpose use another loop it will consider the value by skipping 1st element of array
			{      
				   if (arr[i]==arr[j])       // compare the char Array of 1st iteration to char array of next
				       {  
					      count++;
					      arr[j] = '0'; // once you find the value then change its value to 0 character 
				        }
			 }
			if(arr[i]!='0')    // in this if the value is not equal to 0 then get the count and show the duplicate value
			     { 
				
				  System.out.println(arr[i] + " is " + count + " Time in a char Array");
			     }

		}
	
}
	
}