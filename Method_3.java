package package1;//Method Overloading
class Launch_3
{
	void add(int a,int b)
	{
		int res=a+b;
		System.out.println(res);
	}
	void add(float a,float b)
	{
		float res=a+b;
		System.out.println(res);
	}
	void add(int a,float b)
	{
		float res=a+b;
		System.out.println(res);
	}
	void add(float a,int b)
	{
		float res=a+b;
		System.out.println(res);
	}
	void add(double a,float b)
	{
		double res=a+b;
		System.out.println(res);
	}
	void add(float a,double b)
	{
		double res=a+b;
		System.out.println(res);
	}
	void add(int a,double b)
	{
		double res=a+b;
		System.out.println(res);
	}
	
}
public class Method_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Launch_3 ol=new Launch_3();
		ol.add(34,43);
		ol.add(23.4f,43.6f);
		ol.add(12, 23.4);
		ol.add(34.6, 45.6f);			

	}

}
