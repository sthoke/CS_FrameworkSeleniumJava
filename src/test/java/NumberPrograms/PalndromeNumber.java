package NumberPrograms;

public class PalndromeNumber {

	public static void main(String[] args) {
		

		int num=121;
		int rem;
		int rev=0;
//		A temporary variable temp is used to store the original value of num.
		int temp;
		temp=num;
//		Inside the while loop, the code reverses the digits of num and stores the result in the variable rev
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
			
		}
//		If the reversed number rev is equal to the original number num, it prints "Palindrome." Otherwise, it prints "Not Palindrome."
		if(num == rev) {
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
			
	}
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		