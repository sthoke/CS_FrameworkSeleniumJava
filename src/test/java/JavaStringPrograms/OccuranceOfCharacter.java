package JavaStringPrograms;

public class OccuranceOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s = "shubham";
       int totalLength = s.length();
  System.out.println(totalLength);
       int totalLengthAfterRemovingh = s.replace("h","").length();
      
       System.out.println(totalLengthAfterRemovingh);
       
       int Totalcount = totalLength-totalLengthAfterRemovingh;
       System.out.println(Totalcount);
	}

}
