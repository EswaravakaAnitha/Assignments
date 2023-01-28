package package1;

public class Pattern_programming_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=15;
		for(int i=0;i<n;++i) {
			/*for(int j=0;j<n;++j) {
				if(i-j>=(n-1)/2||i+j<=(n-1)/2||j-i>=(n-1)/2||i+j>=(n-1)+(n-1)/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();*/
		      for(int k=0;k<n;++k) {
		    	  if(i+k<(n+1)/2||k==0||i==(n-1)||k-i>=(n-1)/2||k==(n-1)) {
		    		  System.out.print("*");
		    	  }
		    	  else
		    	  {
		    		  System.out.print(" ");
		    	  }
		      }
		      System.out.println();
		}

	}

}
