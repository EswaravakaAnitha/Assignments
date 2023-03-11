package package1;

import java.util.Scanner;

public class Irre_array_loops_marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner marks=new Scanner(System.in);
		int [][] ar=new int[3][4];
		ar[0]=new int[3];
		ar[1]=new int[4];
		ar[2]=new int[5];
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				
				System.out.println("Enter the marks of class"+i+"student"+j);
				ar[i][j]=marks.nextInt();
			}
		}
		System.out.println("The marks of students  are as follows");
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}

