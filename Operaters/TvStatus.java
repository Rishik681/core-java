class TvStatus{
static boolean tvStatus = false; // ture

	public static void main(String [] args){
		
		
		System.out.println("check the status of tv wheater it is off or on");
		boolean status = TvStatus.check();
		//sout   f
		System.out.println(status);
		

		TvStatus.turnOn();
	 
		boolean status1 = TvStatus.check();
		System.out.println(status1);
			
			
		TvStatus.tuenOff();
		boolean status2 = TvStatus.check();
		System.out.println(status2) ;
	
	}
	
	
static boolean check(){
	System.out.println("checking tv status...");
	return tvStatus;
}


static void turnOn(){
	System.out.println("tv is turring on");
	tvStatus = true;//re initi
	
}


static void tuenOff(){
	System.out.println("TV turinng oFF");
	tvStatus = false;//re - liliti
	
}






}