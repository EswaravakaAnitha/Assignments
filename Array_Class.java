package package1;

import java.util.Arrays;

public class Array_Class {

	public static void main(String[] args) {
		int [] ar= new int[4];
		for(int elem:ar)
		{
			System.out.print(elem);
		}
		System.out.println();
		
		Arrays.fill(ar, 5);//Adding a number in an array
		for(int elem:ar)
		{
			System.out.print(elem);
		}
		System.out.println();
		
		int [] a= {12,42,0,0,0,23};
		Arrays.fill(a, 2, 5, 10);//Adding a number in an array index based
		for(int elem:a)
		{
			System.out.print(elem+" ");
		}
		System.out.println();
		
		Arrays.sort(a);//Sorting an Array
		for(int elem:a)
		{
			System.out.print(elem+" ");
			
		}
		System.out.println();
		int binary=Arrays.binarySearch(a, 32);//Binary search in an array
		System.out.println(binary);
		
	}

}
