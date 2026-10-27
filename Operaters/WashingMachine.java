class WashingMachine{
static boolean statusOfMachine = false;

public static void main(String [] args){

	System.out.println("check the status of washingmachine wheather its on or off ");
	boolean status = WashingMachine.check();
	System.out.println(status);

		WashingMachine.turnOn();
		boolean status1 = WashingMachine.check();
		System.out.println(status);
		
			WashingMachine.turnOff();
			boolean status2 = WashingMachine.check();
			System.out.println(status);


}

static boolean check(){
System.out.println("checking status of washingmachine");
return statusOfMachine;

}

static void turnOn(){
	System.out.println("turning on the machine");
	statusOfMachine = true;
}

static void turnOff(){
	System.out.println("turning off the machine");
	statusOfMachine = false;
	
}





}