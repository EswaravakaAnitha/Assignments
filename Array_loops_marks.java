package package1;

import java.util.Scanner;

public class Array_loops_marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner marks=new Scanner(System.in);
		int [][] ar=new int[3][4];
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				
				System.out.println("Enter the marks of class"+i+"student"+j);
				ar[i][j]=marks.nextInt();
			}
		}
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				System.out.println(ar[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
