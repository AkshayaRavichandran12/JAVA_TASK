package Tasks;
 
abstract class Employee{
	abstract void calculatesalary();
	public void displayrole() {
		System.out.println("display Employee salaryy");
	}
}
class Manager extends Employee{

	@Override
	void calculatesalary() {
		
		System.out.println("calculating the salary");
	}
	
}

public class Abt2 {

	public static void main(String[] args) {
		 Employee obj =  new Manager();
		 obj.displayrole();
		 obj.calculatesalary();
		 
		 
	}

}
