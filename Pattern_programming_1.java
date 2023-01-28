package package1;

public class Pattern_programming_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		for(int i=0;i<n;++i) {
			for(int j=0;j<n;++j) {
				if(j==0||j==(n-1)||i==j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
		}
			for(int l=0;l<n;++l) {
				if(i==l||i+l==(n-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
		}
			for(int m=0;m<n;++m) {
				if(m==0||i+m==(n-1)/2||i-m==(n-1)/2){
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
	

	




