class Metro{

public static void main(String [] args){
Metro.isMetroComing();
Metro.color();
Metro.destination();
Metro.closingTime();


System.out.println("can i no the price for ticket");
long price = Metro. whatIsThePrice();
System.out.println("whatIsThePrice is :" + price);

System.out.println("what is the train timing for mysorerd");
int train = Metro.trainTime();
System.out.println("trainTime is :" + train);

System.out.println("which stop is coming");
String station = Metro.whichStationIsNext();
System.out.println(" whichStationIsNext is :" + station);
}




static void isMetroComing(){
System.out.println("yes it coming");
}
static void color(){
System.out.println("green,purple");
}
static void destination(){
System.out.println("mysore");
}
static void closingTime(){
System.out.println("mid night");
}

static long whatIsThePrice(){
long price = 3453l;
return price;
}
static int trainTime(){
int time = 3;
return time;
}
static String whichStationIsNext(){
String station = "majestic";	
return station ;
}
}