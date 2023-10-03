package JavaStringPrograms;

public class FindHowManyCharsArePresentInGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Shubham is a good boy";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) != ' ')//it checks is there any caharcter =space
			{
				count++;
			}
		}
		System.out.println(count);
}
}
