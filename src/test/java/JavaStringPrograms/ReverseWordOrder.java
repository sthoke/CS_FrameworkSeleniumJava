package JavaStringPrograms;

public class ReverseWordOrder {

	public static void main(String[] args) {
 String str ="Shubham is a good boy.";
 String [] arr = str.split(" ");  // The split() method splits a string into an array of substrings
 for(int r= arr.length-1;r>=0;r--)
 {
	 System.out.print(arr[r]+" ");
 }
	}
}

