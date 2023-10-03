package NumberPrograms;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num=153;
		int rem;
		int result=0;
		int temp=num;
		while(num>0)
		{
			rem=num%10;
			result=result+(rem*rem*rem);
			num=num/10;
		}
		if(result==temp)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
		System.out.println("Not a Armstrong Number");
		}
	}

}
