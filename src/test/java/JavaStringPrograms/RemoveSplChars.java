package JavaStringPrograms;

public class RemoveSplChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="@#%&*Shubham";
		String plainStr =str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(plainStr);

	}

}
