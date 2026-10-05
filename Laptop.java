class Laptop{

static String brand = "Dell";
    static String processor = "Intel i5";
    static int ram = 16;
    static int storage = 512;
    static String operatingSystem = "Windows";
	
	
	static void powerOn() {
    System.out.println("Laptop is ON");
}

static void powerOff() {
    System.out.println("Laptop is OFF");
}

static void openBrowser() {
    System.out.println("Browser opened");
}

static void playVideo() {
    System.out.println("Video is playing");
}

static void charge() {
    System.out.println("Laptop is charging");
}

public static void main(String[] args){

String color = "Silver";
        int price = 60000;
        double screenSize = 15.6;
        int battery = 80;
        boolean touchscreen = false;




System.out.println("brand is :" + Laptop.brand);
System.out.println("processor is :" + Laptop.processor);
System.out.println("ram is :" + Laptop.ram);
System.out.println("color is :" + color);
System.out.println("storage is :" + Laptop.storage);
System.out.println("price is :" + price);
System.out.println("operatingSystem is :" + Laptop.operatingSystem);
System.out.println("screenSize is :" + screenSize);
System.out.println("battery is :" + battery);
System.out.println("touchscreen is :" + touchscreen);


}






}