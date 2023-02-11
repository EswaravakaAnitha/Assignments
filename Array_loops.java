package package1;

import java.util.Scanner;

public class Array_loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner marks=new Scanner(System.in);
		int[] ar=new int[5];
		for(int i=0;i<ar.length;i++)
		{
			System.out.println("Please enter the marks of the students"+i);
			ar[i]=marks.nextInt();
		}
		System.out.println("Marks of the 5 students as follows");
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]+" ");
		}

	}

}
