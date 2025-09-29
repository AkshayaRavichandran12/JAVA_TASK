package Tasks;

public class Odd_EvenPattern {

	public static void main(String[] args) {
		int even = 2;
		int odd = 1;
		int rows = 5;
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
			    if(i%2==0) {
			    	System.out.print(odd+ " ");
			    	odd+=2;
			    }
			    else {
			    	System.out.print(even+ " ");
			    	even+=2;
			    }
			   
			}
			System.out.println();
		}
        System.out.println();
		//odd even  Pattern
		for(int i=1;i<rows;i++) {
			for(int j=1;j<=i;j++) {
			    if(i%2==0) {
			    	System.out.print(even + "  ");
			    	even+=2;
			    }
			    else {
			    	System.out.print(odd+ " ");
			    	odd+=2;
			    }
			   
			}
			System.out.println();
		}
	}

}
