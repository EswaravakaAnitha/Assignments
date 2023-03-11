package package1;
class Launch_4
{
	void display(int a)
	{	
		System.out.println(a);
	}
	void display(float b)
	{	
		System.out.println(b);
	}
	void display(String name)
	{	
		System.out.println(name);
	}
}
public class Method_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Launch_4 disp=new Launch_4();
		disp.display(32.7f);
		disp.display(87);
		disp.display("Anitha");

	}

}
