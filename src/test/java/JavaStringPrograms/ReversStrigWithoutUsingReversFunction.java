package JavaStringPrograms;

public class ReversStrigWithoutUsingReversFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="Shubham" ;
		char [] charArray =str.toCharArray();
		int Length=charArray.length;
		for(int i=Length-1;i>0;i--)
		{
			System.out.println(charArray[i]);
		}

	}

}
