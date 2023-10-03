//public static int getSecondSmallest(Integer[] a, int total) {: This line defines a method named getSecondSmallest that takes an array of Integer objects a and an integer total as parameters. It has a return type of int, which means it will return an integer value.
//
//List<Integer> list = Arrays.asList(a);: This line converts the input array a into a List<Integer> named list using the Arrays.asList method.
//
//Collections.sort(list);: This line sorts the list in ascending order using the sort method from the Collections class.
//
//int element = list.get(1);: This line retrieves the element at index 1 from the sorted list. Since the list is now sorted, index 1 points to the second smallest element.
//
//return element;: This line returns the second smallest element.
//
//public static void main(String args[]) {: This line defines the main method, which is the entry point of the program.
//
//Integer a[] = {1, 2, 5, 6, 3, 2};: This line declares and initializes an array named a with the given Integer values.
//
//Integer b[] = {44, 66, 99, 77, 33, 22, 55};: This line declares and initializes another array named b with the given Integer values.
//
//System.out.println("Second Smallest: " + getSecondSmallest(a, 6));: This line calls the getSecondSmallest method with the array a and the total number of elements 6 as arguments. It then prints the result, which is the second smallest element in the array a.


package ArrayPrograms;

import java.util.*;  
public class SecondSmallestInArrayExample1{  
public static int getSecondSmallest(Integer[] a, int total){  
List<Integer> list=Arrays.asList(a);  
Collections.sort(list);  
int element=list.get(1);  
return element;  
}  
public static void main(String args[]){  
Integer a[]={1,2,5,6,3,2};  
Integer b[]={44,66,99,77,33,22,31};  
System.out.println("Second Smallest: "+getSecondSmallest(a,6));  
System.out.println("Second Smallest: "+getSecondSmallest(b,7));  
}}  
