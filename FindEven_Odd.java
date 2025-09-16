package Tasks;

public class FindEven_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int Sumeven=0, Sumodd=0;
     for (int i=1; i<=100;i++) {
    	 if(i%2==0) {
    		 Sumeven+=i;
    	 }else {
    		 Sumodd+=i;
    	 }
     }
     System.out.println("Sum of Even num between 1 to 100:"+Sumeven);
     System.out.println("Sum of Odd num between 1 to 100:"+Sumodd);
     
	}

}
