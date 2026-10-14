class FoodStall{
public static void main(String[] args){
	FoodStall.canUgiveMeOnePlateDose();
	FoodStall.whatIsToatlBill();
	FoodStall.isUrFoodStallOpenTillNight();
// with return value


System.out.println("can u tell the menu");

System.out.println("can u tell today special");
System.out.println("at the time does ur stall will open");



}

static void canUgiveMeOnePlateDose(){
System.out.println(" ur order will be ready in 5minutes");
}
static void whatIsToatlBill(){
System.out.println("ur total bill is 500");
}
static void isUrFoodStallOpenTillNight(){
System.out.println(" yes we are open till night")
}
static String giveMenu(){
String menu = " yes  i will give you menu";
return menu;
}
static String todaysSpecail(){
String special = "onion pizza";
return special;
}
static int openingTime(){
int time = 12;
return time;
}
}



