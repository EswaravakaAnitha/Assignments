package package1;


class India {
	public void Locations() {
		System.out.println("Atos have some branches in India");
	}
}
class Chennai extends India{
	public void Locations() {
		System.out.println("There is a branch in Chennai location");
	}
}
class Bangalore extends India{
	public void Locations() {
		System.out.println("There is a branch in Bangalore location");
	}
}
class Mumbai extends India {
	public void Locations() {
		System.out.println("There is a branch in Mumbai location");
	}
}
class Pune extends India {
	public void Locations() {
		System.out.println("There is a branch in Pune location");
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		
		India place=new India();
		India place1=new Chennai();
		India place2=new Bangalore();
		India place3=new Mumbai();
		India place4=new Pune();
		
		place.Locations();
		place1.Locations();
		place2.Locations();
		place3.Locations();
		place4.Locations();
	}

}
