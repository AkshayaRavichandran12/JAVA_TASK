package Tasks;

class Vehicle{
	public void Move() {
		System.out.println("move to the next place");
	}
}
class bike extends Vehicle{
	public void Move() {
		System.out.println("Not to move this place");
	}
}
public class OverRide {

	public static void main(String[] args) {
	Vehicle obj =  new bike();
	obj.Move();

	}

}
