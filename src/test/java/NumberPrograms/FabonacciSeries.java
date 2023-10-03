package NumberPrograms;

import java.util.Scanner;

public class FabonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int term;
        int a=0;
        int b=1;
        int c;
        System.out.println("Enter term");
        Scanner r = new Scanner(System.in);
        term = r.nextInt();
        for(int i=0;i<=term;i++)
        {
   	System.out.println(a);
        	c=a+b;
        	a=b;
        	b=c;
        	
        }
	}

}
