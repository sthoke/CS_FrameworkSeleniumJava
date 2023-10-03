
package ArrayPrograms;
 
public class SecondLargestInArrayExample1{  
	public static void main(String[] args) 
	{
    int[] arr = {10,20,30,40,50,40,50,50};

    int max = Integer.MIN_VALUE;
    int thirdMax = Integer.MIN_VALUE;

    for (int num : arr) {
        if (num > max) {
        	thirdMax = max;
            max = num;
        } else if (num > thirdMax && num != max) {
        	thirdMax = num;
        }
    }

    if (thirdMax != Integer.MIN_VALUE) {
        System.out.println("third highest number: " + thirdMax);
    } else {
        System.out.println("There is no second highest number in the array.");
    }
}
}
