package Tasks;
import java.util.Scanner;

public class Ifstmt {

	public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
      System.out.println("Enter a number:");
      int num=scan.nextInt();
      if(num > 0) {
    	  System.out.println( num+ "is Positive");
      }
      else if(num < 0){
    	  System.out.println(num+ "is Negative");
      }else {
    	  System.out.println("The num is Zero");
      }

	}

}
