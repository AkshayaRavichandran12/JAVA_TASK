package Tasks;

import java.util.Scanner;

public class Calculate_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number 1:");
    int num1 = scan.nextInt();
    System.out.println("Enter a operator('+,-,*,/,%)");
    char c = scan.next().charAt(0);
    System.out.println("Enter a num 2:");
    int num2 = scan.nextInt();
    int res = 0;
    switch(c) {
    case '+':
    	res+= num1 + num2;
    case '-' :
    	res+= num2-num1;
    	break;
    case '*' :
    	res+= num2*num1;
    	break;
    case '/' :
    	res+= num2/num1;
    	break;
    case '%' :
    	res+= num2%num1;
    	break;
    	default:
    		System.out.println("Invalid operator...");
    	 
    }
    System.out.println("Result is:"+res);
	}

}
