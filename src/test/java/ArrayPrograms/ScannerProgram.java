package ArrayPrograms;

import java.util.Scanner;

public class ScannerProgram {
//Program for percentage of Marks
	public static void main(String[] args) {
		int English,Chemistry,Physics,Maths,Computer,Total;
		float Average,Percentage;
Scanner sc = new Scanner(System.in);
System.out.println("Please enter the five subjects marks :");
 English= sc.nextInt();
 Maths  = sc.nextInt();
 Physics= sc.nextInt();
 Computer =sc.nextInt();
 Chemistry =sc.nextInt();
 
   Total   = English+Chemistry+Physics+Maths+Computer;
   Average =Total/5;
Percentage =(Total* 100)/500;
System.out.println("Total Marks =" + Total);
System.out.println("Average Marks =" +Average);
System.out.println(" Percentage Marks =" + Percentage);

 

	}

}
