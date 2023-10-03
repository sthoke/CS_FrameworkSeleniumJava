package JavaStringPrograms;

public class Practice {

public static void main(String[] args) {
	
String str =" Shubham";
int totalLength =str.length();
System.out.println(totalLength);
int totalLengthAfterremoveh =str.replace("h", "").length();
System.out.println(totalLengthAfterremoveh);
int Total = totalLength-totalLengthAfterremoveh;
System.out.println(Total);
	}
}
