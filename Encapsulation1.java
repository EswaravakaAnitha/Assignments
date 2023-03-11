package package1;

public class Encapsulation1 {

	public static void main(String[] args) {
		Encapsulation emp1=new Encapsulation();
		emp1.setFirstname("Eswaravaka");
		emp1.setLastname("Anitha");
		emp1.setId(32);
		emp1.setSalary(15000);
		emp1.setAge(22);
		
		System.out.println("First Name: "+emp1.getFirstname());
		System.out.println("Last Name: "+emp1.getLastname());
		System.out.println("ID: "+emp1.getId());
		System.out.println("Salary: "+emp1.getSalary());
		System.out.println("Age: "+emp1.getAge());

	}

}
