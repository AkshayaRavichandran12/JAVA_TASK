package Tasks;

abstract class Shape{
	abstract void area();
	public void displayshape() {
		System.out.println("Abstract example");
	}
}
	class myclass extends Shape{

		@Override
		void area() {
		  System.out.println("circle");
			
		}
		
	}
	
	class myclass2 extends Shape{

		@Override
		void area() {
           System.out.println("Rectangle");			
		}
		
	}
	

public class Abstractex {

	public static void main(String[] args) {
     Shape obj =  new myclass();
     Shape obj2 = new myclass2();
     obj.displayshape();
     obj.area();
     obj2.area();
     
	}

}
