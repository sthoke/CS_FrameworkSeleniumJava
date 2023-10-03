package ArrayPrograms;

public class CopyElementsFromOneArrayToAnotherArray {

	public static void main(String[] args) {
		
	//initialize array
		int arr1[] =new int[] {1,2,3,4};
	//creating another array with same size
		int arr2[] = new int[arr1.length];
	//Copying elements from one array to another array
		for(int i=0;i<arr1.length;i++)
		{
    //	For copying second array equals to first		
			arr2[i] = arr1[i];
		}
		System.out.println("Display elements of the second array");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i] +" ");
		}

	}

}
