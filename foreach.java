package package1;

public class foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{10,20},{39,45,67}};
		for(int ar[]:a)
		{
			for(int var:ar)
			{
				System.out.print(var+" ");
			}
			System.out.println();
		}

	}

}
