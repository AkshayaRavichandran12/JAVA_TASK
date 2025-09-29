package Tasks;
class Person{
	
	String Name;
	int Age;
       Person(String Name , int Age) {
		this.Name = Name;
		this.Age = Age;
	}
       public void displayPersonInfo() {
    	   System.out.println("Name  :" + Name);
    	   System.out.println("Age :" + Age);
       }
       
}
class Employee1 extends Person{
     int EmpId;
     String Department;
	Employee1(String Name, int Age , int EmpId , String Department) {
		super(Name, Age);
		
		this.EmpId = EmpId;
		this.Department = Department;
		
	}
	public void Employeeinfo() {
	    displayPersonInfo();
	    
	    System.out.println("EmpId :" + EmpId);
	    System.out.println("Department:" +Department);
	}
	
}
 public class Inherit_const {
 public static void main(String[] args) {
   Employee1 obj = new Employee1("Akshu", 25, 101, "BCA");
	obj.Employeeinfo();
	
}
}
