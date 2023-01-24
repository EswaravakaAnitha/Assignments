package package1;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Pattern_programming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		for(int i=0;i<n;++i)
		{
			//A pattern
			for(int j=0;j<n;++j) 
			{
				if(j==0&&i>0||j==(n-1)/2&&i>0||i==(n-1)/2&&j<(n-1)/2||i==0&&j>0&&j<(n-1)/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//I pattern
			for(int k=0;k<n;++k)
			{
				if(i==0||i==n-1||k==(n-1)/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//C pattern
			for(int l=0;l<n;++l)
			{
				if(l==n/4&&i>0&&i<(n-1)||i==0&&l>n/4||i==n-1&&l>n/4)
				{
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
