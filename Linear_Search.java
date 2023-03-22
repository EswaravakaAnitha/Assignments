package package1;

import java.util.Scanner;

public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []ar= {19,34,62,12,3,56,21,97};
		boolean Output=false;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the key to be searched");
		int key=scan.nextInt();
		
		for(int i=0;i<ar.length;i++)
		{
			if(key==ar[i])
			{
				System.out.println("key " +key+  " found at index " +i);
				Output=true;
				break;
			}
		}
		if(Output==false)
		{
		System.out.println("Key not found" );
		}
		

	}

}
