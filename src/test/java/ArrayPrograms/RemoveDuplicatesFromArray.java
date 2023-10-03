package ArrayPrograms;


import java.util.HashSet;


public class RemoveDuplicatesFromArray {
	    public static void main(String[] args) {
	        int [] a =  {10,30,30,10,15,13,34,15};
HashSet<Integer> set = new HashSet<Integer>(); 
for(int i=0;i<a.length;i++)
{
	set.add(a[i]);
}
System.out.println(" " + set);
	    }
}

