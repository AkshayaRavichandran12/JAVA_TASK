package Tasks;

import java.util.Scanner;

public class Sum_Average {
	public static void main(String []  args) {
   int sum = 0;
   float Avg;
   Scanner scan = new Scanner(System.in);
   System.out.println("Enter your Size");
   int size = scan.nextInt();
   int n[] = new int[size];
   System.out.println("Enter your values");
   

	for(int i=0; i<size;i++) {
		n[i] = scan.nextInt();
		sum+= n[i];
	}
		System.out.println("sum"+sum);
		Avg =  (float) sum/size;
		System.out.println("Avg value is"+Avg);
		
	
}
}
