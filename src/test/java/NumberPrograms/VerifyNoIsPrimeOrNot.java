package NumberPrograms;

public class VerifyNoIsPrimeOrNot {

	public static void main(String[] args) {

	int num=11;
//	Another integer variable temp is initialized to 0. This variable will be used to keep track of how many divisors num has.
	int temp = 0;
//	A for loop is used to iterate through potential divisors of the number. The loop starts from i = 2 and continues while i is less than num - 1.
	for(int i=2;i<num-1;i++)
		 {
//		Inside the loop, the code checks if num is divisible by 2 with no remainder (i.e., num % 2 == 0).
//		If this condition is satisfied, it means that num is even and therefore not prime.
//		The temp variable is incremented by 1
			  if(num%i==0)
			  {
//				  The if statement after the loop checks if temp is still 0. If it is, it means that no divisors were found in the loop, 
//				  and the number is prime.
			   temp=temp+1;
			  }
		 }
//	If temp is indeed 0, the code prints out "Number is prime: " followed by the value of num.
//
//	If temp is not 0, it means that at least one divisor was found in the loop, so the number is not prime.
		if(temp==0)
		   {
			   System.out.println("Number is prime :" +num);
			
		    }
		else
		    {
		
			System.out.println("Number is not prime :" +num);
		
		    }
		
	}
	}
		