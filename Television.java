class Television {

    static String brand = "Samsung";
    static String type = "Smart TV";
    static int size = 55;
    static String display = "4K";
    static String operatingSystem = "Tizen";
	
	
	
	static void powerOn() {
    System.out.println("TV is ON");
}

static void powerOff() {
    System.out.println("TV is OFF");
}

static void increaseVolume() {
    System.out.println("Volume increased");
}

static void decreaseVolume() {
    System.out.println("Volume decreased");
}

static void changeChannel() {
    System.out.println("Channel changed");
}
	
	public static void main(String[] args){
	
	String color = "Black";
        int price = 60000;
        int volume = 20;
        int channel = 5;
        boolean wifi = true;
	
	
	System.out.println("brand is :" + Television.brand);
System.out.println("type is :" + Television.type);
System.out.println("size is :" + Television.size);
System.out.println("color is :" + color);
System.out.println("display is :" + Television.display);
System.out.println("price is :" + price);
System.out.println("display :" + Television.operatingSystem);
System.out.println("volume is :" + volume);
System.out.println("channel is :" + channel);
System.out.println("wifi is :" + wifi);




	}
	
	
	}