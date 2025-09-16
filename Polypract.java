package Tasks;

public class Polypract {
	
	public int calculateMarks(int sub1,int sub2) {
		return sub1+sub2;
		
	}
	public int calculateMarks(int sub1,int sub2,int sub3) {
		return sub1+sub2+sub3;
	}
	public double calculateMarks(double su1,double su2) {
		return su1+su2;
	}
	public static void main(String[] args) {
		Polypract obj=new Polypract();
		System.out.println(obj.calculateMarks(12,88));
		

	}

}
