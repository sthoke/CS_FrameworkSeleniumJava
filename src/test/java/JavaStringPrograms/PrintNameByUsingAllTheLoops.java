package JavaStringPrograms;

public class PrintNameByUsingAllTheLoops {

	public static void main(String[] args) {
		// 1. Print name 5 times by using for loop
	
//		for(int i=0;i<5;i++) 
//		{
//			System.out.println("Shubham");
//		}
//		// 2. Print name 5 times by using while loop
//		int i = 0;
//		while(i<5)
//		{
//			System.out.println("Shubham");
//			i++;
//		}
		int i = 0;
		 
        do {
 
            // Body of loop that will execute minimum
            // 1 time for sure no matter what
            System.out.println("Shubham");
            i++;
        }
 
        // Checking condition
        // Note: It is being checked after
        // minimum 1 iteration
        while (i < 5);
    }
		
	}


