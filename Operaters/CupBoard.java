class CupBoard{
static boolean stausOfCupBoard = false;

public static void main (String[] args){
	System.out.println("checking the status of cupboard wheather its open or close");
	boolean status = CupBoard.check();
    System.out.println(status);
	
		CupBoard.turnON();
		boolean status1 = CupBoard.check();
		System.out.println(status1);
	
			CupBoard.turnOff();
			boolean status2 = CupBoard.check();
			System.out.println(status2);
}
static boolean check(){
System.out.println("checking the status of cupboard");
return stausOfCupBoard;
}

static void turnON(){
System.out.println("open the the door");
stausOfCupBoard = true;
}

static void turnOff(){
System.out.println("close the door");
stausOfCupBoard = false;	
}
}

