package ArrayPrograms;

public class findLargestAndLowestNumber {

	public static void main(String[] args) {
		//  Initialize the array
		
				int a[]={30,20,10,25,35,35,50,50};
				int K=2;
				for(int i=0;i<a.length-1;i++)
				{
					for(int j=i+1;j<a.length;j++)//27<68
					{
						if(a[j]>a[i])//
						{
							int temp = a[i];
							a[i]=a[j];
							a[j]=temp;
						}
					}
					if(i==K-1)
					{
						System.out.println(K  + " rd largest element is: "+ a[i]);
					}
				}

			}

		
	}


