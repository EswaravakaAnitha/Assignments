package package1;
class Launch
{
	int a, b, c;
	
	void add()
	{
		a=10;
		b=20;
		c=a+b;
		System.out.println(c);
	}	
	
}

public class Method_1 {

	public static void main(String[] args) {
		
		Launch calc=new Launch();
		
		calc.add();

	}

}