package NumberPrograms;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int num=5;
         int fact=1;
         for(int i=1;i<=num;i++)
         {
        	 fact=fact*i;//1*1=1,1*2=2,2*3=6,6*4=24,24*5=120
         }
         System.out.println("factorial of num is"+fact);
	}

}
