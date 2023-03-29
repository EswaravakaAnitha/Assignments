package package1;

public class String_Concept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="Anitha";
		System.out.println(a);

		String obj=new String("Anitha");
		obj.concat("Eswaravaka");
		System.out.println(obj);//String is immutable
		
		System.out.println(a==obj);//op=false;because it wont see the contenct in the string it sees the objects
										//(here objects ar different
		System.out.println(a.equals(obj));
		//op=true;because it wont see the objects in the string it sees the content
		//(here content ar different
		
		StringBuilder o=new StringBuilder("Anitha");
		o.append("Eswaravaka");
		System.out.println(o);//op=AnithaEswar
		
		
		StringBuilder b=new StringBuilder("Aparna");
		StringBuilder c=new StringBuilder("Aparna");
		System.out.println(b==c);//false
		System.out.println(b.equals(c));//false
		//StringBuilder class equals() compare the reference(Address of object)not the content of StringBuilder.

		String ani=new String("Anitha");
		String tha=ani.intern();
		System.out.println(tha);
		
		
		String d="Eswaravaka";
		d.concat("Anitha");
		System.out.println(d);
		
		String r=new String("Rajesh");
		String r1="Rajesh";
		System.out.println(r==r1);
		
		
		
		}
	

}
