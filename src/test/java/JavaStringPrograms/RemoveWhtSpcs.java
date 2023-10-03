package JavaStringPrograms;

public class RemoveWhtSpcs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str =" M  ili  n d";
//       String strTrim = str.trim();
//    trim method is used for removing space before string or after string
//      System.out.println(strTrim);
       String str1 = str.replaceAll("\\s", "");
       System.out.println(str1);
      
      
	}

}
