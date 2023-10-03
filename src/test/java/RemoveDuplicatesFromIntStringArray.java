import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromIntStringArray {
	private static void removeDupIntegerArr(int[]arr) {
		Set<Integer> S1 = new HashSet<Integer>();
		for(int it: arr)
		{
			S1.add(it);
		}
		System.out.println(S1);
	}
	private static void removeDupStringArr(String[]arr) {
		Set<String> S2 = new HashSet<String>();
		for(String ip: arr)
		{
			S2.add(ip);
		}
		System.out.println(S2);
	}

	public static void main(String[] args) {
      int [] removeDupIntArr = {10,12,10,11,20,20};
      String [] removeDupStrArr = {"MS","KL","VK","MS","JADDU","ASH"};
      removeDupIntegerArr(removeDupIntArr);
      removeDupStringArr(removeDupStrArr);
	}

}
