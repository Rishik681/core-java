class Bank{
 
public static void main(String [] args){

System.out.println("tell me account details");
   String name = "rishi";
    Bank.accountDetails(name);

		  System.out.println("tell me acc number");
			long no = 7567932l;
			long no1 = 6387919;
			Bank.accountNumber( no, no1);
			
				 System.out.println("tell me balance");
				 double bal = 3542156;
				 double bal1 = 5472890;
				 double bal2 = 7639208;
				 Bank.accountBalance(bal,bal1,bal2);
				   
				   System.out.println("tell me bank phone number");
				   short nu = 34;
				   short nu1 = 45;
				   short nu2 = 63;
				   short nu3 = 07;
			       Bank.phoneNumber(nu,nu1,nu2,nu3);
	}
   static void accountDetails(String name){
	System.out.println("name");
   }
   
   static void accountNumber(long no ,long no1){
   System.out.println("no");
   System.out.println("no1");
   }

   static void accountBalance(double bal,double bal1,double bal2){
	   System.out.println("bal");
	   System.out.println("bal1");
	   System.out.println("bal2");
   }
   static void phoneNumber(short nu,short nu1,short nu2,short nu3){
	   System.out.println("nu");
	   System.out.println("nu1");
	   System.out.println("nu2");
	   System.out.println("nu3");
   }
   
}