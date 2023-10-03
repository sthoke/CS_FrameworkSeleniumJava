//STEP 1:START
//STEP 2:DEFINE STRING String str = "The best of two worlds";
//STEP 3:SET count=0
//STEP 4:SET i=0 REPEAT STEP 5 TO 6 UNTIL i<str.length();
//STEP 5:if(str.charAt(i) !=' ' THEN COUNT=COUNT+1;
//STEP 6:I=I+1					
//STEP 7:PRINT COUNT
//STEP 8:END


package NumberPrograms;

public class TotalNoCharsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "The best of two worlds";
		int count = 0;
		// Count each character except space
		for(int i=0;i<str.length();i++)
		{
//So, the condition str.charAt(i) != ' ' checks if the current character is not a space character.
			if(str.charAt(i) !=' ' )
		count++;
//			If the condition is true (meaning the current character is not a space), the count variable is incremented using the count++ statement.
//			If the condition is false (meaning the current character is a space), the count variable remains unchanged.
//			After this loop runs for all characters in the string, the count variable will hold the total count of non-space characters in the string
		}
		System.out.println("Total number of characters in string :" + count);
		

	}

}
