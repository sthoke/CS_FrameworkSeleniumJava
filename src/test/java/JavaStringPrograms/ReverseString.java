package JavaStringPrograms;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Aai Baba";
		String rev ="";
		int length = s.length();
		for(int i=length-1;i>=0;i--)   // i greater than equal to zero
		   {
			   rev = rev+s.charAt(i);
		   }
		
         System.out.print(rev);
	}

}
