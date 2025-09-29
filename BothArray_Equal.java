package Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class BothArray_Equal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first Array Size");
		int size = scan.nextInt();
		int n[] = new int[size];
		
		System.out.println("Enter the values");
		for(int i=0;i<size;i++) {
			n[i] = scan.nextInt();
		}
		System.out.println("Enter the second Array Size");
		int size1 = scan.nextInt();
		int n1[] = new int[size1];
		
		System.out.println("Enter the values");
		for(int i=0;i<size1;i++) {
			n1[i] = scan.nextInt();
		}
		
		if(Arrays.equals(n, n1)) {
			System.out.println(" Both are Equal");
		}
		else {
			System.out.println(" Both are not Equal");
		}

	}

}
