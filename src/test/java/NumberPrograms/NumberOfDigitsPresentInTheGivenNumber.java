package NumberPrograms;

import java.util.Scanner;

public class NumberOfDigitsPresentInTheGivenNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number :");
		int num =sc.nextInt();
		int digitCount=0;
		while(num>0)
		{
			digitCount++;
			num=num/10;
		}
		System.out.println("Number of Digits :" +digitCount);
	}

}
