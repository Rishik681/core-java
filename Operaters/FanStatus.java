class FanStatus{

static boolean fanStatus = false;

public static void main (String [] argas){
		System.out.println("check the status of fan wheather its on or off ");
		boolean status = FanStatus.check();
		System.out.println(status);
		
			FanStatus.turnOn();
			boolean status1 = FanStatus.check();		
			System.out.println(status1);
			
				FanStatus.turnoff();
				boolean status2 = FanStatus.check();		
				System.out.println(status2);

			
}

static boolean check(){
System.out.println("checking status of fan");
return fanStatus;
}

static void turnOn(){ // re inistalation
	System.out.println("turning on the fan");
	fanStatus = true;
	
}

static void turnoff(){  // re inistalation
	System.out.println("turning of the fan");
	fanStatus = false;
	
}
}