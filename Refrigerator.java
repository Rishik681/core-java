class  Refrigerator{


 static String brand = "LG";
    static String type = "Double Door";
    static int capacity = 500;
    static String cooling = "Frost Free";
    static int doors = 2;


	
	
	static void powerOn() {
		System.out.println("Refrigerator is ON");
	}
	
static void powerOff() {
	System.out.println("Refrigerator is OFF");
}
static void cool() {
    System.out.println("Refrigerator is cooling");
}

static void openDoor() {
    System.out.println("Door is opened");
}

static void closeDoor() {
    System.out.println("Door is closed");
}








	public static void main(String[] args){
	
	   String color = "Silver";
        int price = 55000;
        int temperature = 4;
        int shelves = 4;
        boolean inverter = true;
	
		System.out.println("brand is :" + Refrigerator.brand);
		System.out.println("type is :" + Refrigerator.type);
		System.out.println("capacity is :" + Refrigerator.capacity);
		System.out.println("color is :" + color);
		System.out.println("cooling is :" + Refrigerator.cooling);
		System.out.println("price is :" + price);
		System.out.println("doors :" + Refrigerator.doors);
		System.out.println("temperature is :" + temperature);
		System.out.println("shelves is :" + shelves);
		System.out.println("inverter is :" + inverter);
		
		Refrigerator.powerOn();
	    Refrigerator.powerOff();
		Refrigerator.cool();
	
	}
	
	}
	
	