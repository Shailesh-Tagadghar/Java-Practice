public class Person {

	String name="Ramesh";
	String dob="15 Dec 2001";
	// private String var1;
	
	
	public void showDetails(){
		System.out.println(name+" was born on: "+dob);
	}	
	
	public static void main(String[] args) {
		Employee e=new Employee();
		System.out.println(e.name);
		System.out.println(e.dob);
		e.showDetails();
//		System.out.println(e.var1);
		e.designation="Trainee";
		e.salary=15000;
		e.work();
	}
}

class Employee extends Person {
	//child can access all properties of parent, except PRIVATE
	//can't access the private members of parent
	
	//child class can define its own properties and methods - UNIQUE members of child
	//parent can't access UNIQUEembers of child
	String designation;
	int salary;
	
	public void work() {
		System.out.println(name+" is working as "+designation);
	}
	
}