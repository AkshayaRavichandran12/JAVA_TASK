package Tasks;

public class Encapsi {
	private String name;
	private int Rollnum;
	private int marks;
	
	public String getName() {
		return name;
	}
	public int getNum() {
		return Rollnum;
	}
	public int getMarks() {
		return marks;
	}
	public void setName(String nickname) {
		this.name=nickname;
	}
	public void setNum(int num) {
		this.Rollnum=num;
	}
	public void setMarks(int result) {
		this.marks=result;
	}

	public static void main(String[] args) {
		Encapsi obj = new Encapsi();
		obj.setName("Akshu");
		obj.setNum(45);
		obj.setMarks(90);
		System.out.println(obj.getName());
        System.out.println(obj.getNum());
        System.out.println(obj.getMarks());
	}

}
