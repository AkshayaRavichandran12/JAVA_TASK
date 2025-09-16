package Tasks;

public class Student {
   String stuName;
   int stuRollNum;
   String stuGrade;
   Student(){//default
	   System.out.println(stuName + stuRollNum + stuGrade);
   }
   
   //parameter
    Student(String name , int Rollnum, String Grade){
    this.stuName  = name;
    this.stuRollNum = Rollnum;
    this.stuGrade = Grade;
    }
   public void displyinfo() {
	   System.out.println("student name is " +stuName);
	   System.out.println( "Student Rollnum is"+stuRollNum);
	   System.out.println("student grade is " + stuGrade);
   }
   Student(Student copy){
	   this.stuName = copy.stuName;
	   this.stuRollNum = copy.stuRollNum;
	   this.stuGrade = copy.stuGrade;
	   
   }
    public static void main(String[] args) {
    Student obj = new Student();
	Student obj1 = new Student("Akshu" , 101 ,  "A");
	obj1.displyinfo();
	Student obj2 = new Student(obj1);
	obj2.displyinfo();
	
}
}
