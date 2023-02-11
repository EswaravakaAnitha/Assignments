package package1;

import java.util.Scanner;

public class reg_Array_loops_marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ani=new Scanner(System.in);
		int ar[][][]=new int[3][4][5];
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				for(int k=0;k<ar[i][j].length;k++)
				{
					System.out.println("Enter marks of college"+i+"class"+j+"students"+k);
					ar[i][j][k]=ani.nextInt();
				}
			}
		}
		System.out.println("Marks of the students");
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				for(int k=0;k<ar[i][j].length;k++)
				{
					System.out.println(ar [i][j][k]);
				}
			}
		}
	}
}



