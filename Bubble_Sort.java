package package1;

public class Bubble_Sort {

	public static void main(String[] args) {
		int [] ar= {12,23,13,42,14,64,11,32,98};
		for(int i=0;i<ar.length;i++)
		{
			for(int j=1;j<ar.length-1;j++)
			{
				if(ar[j]<ar[j-1])
				{
					int var=ar[j];
					ar[j]=ar[j-1];
					ar[j-1]=var;
					
				}
			}
		}
		for(int elem:ar)
		{
			System.out.print(elem+" ");
		}
	}

}
