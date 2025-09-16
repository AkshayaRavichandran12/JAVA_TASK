package Tasks;

public class class_object {
//types of variable
	//1.instance variable
	

    String name = "Malar";//instance variable
    int id=5;//instane variable
    double salary = 987654;
    int bonus = 9000;
    public static void main(String[] args) {
     //car class
    	//obj audi,bnw,merc,tata,kia
    	//classname obj=new classname();//new is used to create obj explicitly
    	class_object obj = new class_object();//com
    	class_object obj1 = new class_object();
    	
    	System.out.println(obj.id);
    	System.out.println(obj.name);
    	System.out.println(obj1.salary);
    	System.out.println(obj1.bonus);
}
}
    	
//    	public class cls_obj{
//    		String emp_name;
//    		int emp_id;
//    		public static void main(String [] args) {
//    			cls_obj obj = new cls_obj();
//    			System.out.println(obj.emp_id=00);
//    			System.out.println(obj.emp_name = "malar");
//    		}
//    		
//    		
//    	
//    
//	
//
//    	}
