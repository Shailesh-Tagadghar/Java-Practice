public class ConstrctorDemo {
	public static void main(String[] args) {
//		Parent p1 = new Parent();//parent: zero constructor
//		Child c1 = new Child();
		
		// Child c2 = new Child("Raj","1 jan 2005","Trainee");
	}
}

class Parent {	
	String name="Ramesh";
	String dob="15 Dec 2001";
	
	Parent(String name, String dob){
		this.name=name;
		this.dob=dob;
		System.out.println("parent class: param");
	}	
	Parent(){
		System.out.println("parent: zero constructor");
	}	
}
class Child extends Parent {	
	String designation;	
	Child(String name, String dob,String designation){
//		super();// call to parent class zero construct
//		this.name=name;		
//		this.dob=dob;
		super(name,dob);//call to A PARENT CLASS PARAMAT CONSCTR
		this.designation=designation;
		System.out.println("child class: param");		
	}		
	Child(){
		super();
		System.out.println("Child: zero constructor");
	}
}
