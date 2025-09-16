package Tasks;

class printex{
	public void print(int a ) {
		System.out.println("integer:"+a);
		
	}
	public void print(String b) {
		System.out.println("String:"+b);
	}
	
	public void print(double c) {
		System.out.println("Double:"+c);
	}
	}

public class overload {

	public static void main(String[] args) {
		
    printex obj = new printex();
    obj.print(456);
   obj.print("Akshu");
   obj.print(78.897);
	}
}
