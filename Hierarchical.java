package Tasks;

class Vehicle1{
	String brand = "TaTa";
	int price = 1000;
	public void displayinfo() {
		System.out.println("Brand is " + brand  + "price is"+ price);
	}
}
class car extends Vehicle1{
	 int numofdoor = 5;
	 public void showCarDetails() {
		System.out.println("Number of door is" + numofdoor);
	}
}
class bike1 extends Vehicle1{
	 boolean hasgear = true;
	 public void showBikeDetails() {
		System.out.println("Hasgear is " +hasgear) ;
	}
}

class loadcapacity extends Vehicle1{
	  String loadcapacity = "Strong";
	  public void showTruckDetails() {
		  System.out.println("loadCapacity is" + loadcapacity);
	  }
}
public class Hierarchical extends Vehicle1 {
	public static void main(String [] args) {
		Vehicle1 obj = new Vehicle1();
		obj.displayinfo();
		car obj1 = new car();
		obj1.showCarDetails();
		bike1 obj2 = new bike1();
		obj2.showBikeDetails();
		loadcapacity obj3 = new loadcapacity();
		obj3.showTruckDetails();
	}
   
	
}
