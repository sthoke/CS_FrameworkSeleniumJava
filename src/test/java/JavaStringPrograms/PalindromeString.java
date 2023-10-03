package JavaStringPrograms;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String s ="madam";
	String rev ="";
	int length = s.length();
	for(int i=length-1;i>=0;i--)
	 {
		rev = rev+s.charAt(i);
	 }
	 if(s.equals(rev))
	 {
		 System.out.println("String is palindrome");
	 }
	 else
	 {
		 System.out.println("String is not palindrome");
	 }

	}

}
