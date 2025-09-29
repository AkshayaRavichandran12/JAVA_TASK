package Tasks;
class Example extends Thread{
	private String TaskName;
	private int Time;
	Example(String name,int time){
		this.TaskName = name;
		this.Time = time;
	}
	@Override
	public void run() {
		for(int i = 1; i<=5; i++) {
			System.out.println(TaskName+" : "+i);
			try {
				Thread.sleep(Time);
			}
			catch(Exception e ) {
				System.out.println(e);
			}
		}
	}
}
public class ThreeThreadex {

	public static void main(String[] args) {
		Example t1 = new Example("Task 1",300);
		Example t2 = new Example("Task 2",500);
		Example t3 = new Example("Task 3",900);
		t1.start();
		t2.start();
		t3.start();

	}

}