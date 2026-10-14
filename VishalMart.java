class VishalMart{

public static void main(String [] args){

System.out.println("what is the price of atta");
int price = VishalMart.thePriceOfAtta();
System.out.println("thePriceOfAtta is :" + price);

System.out.println("can i no where is sugar");
String place = VishalMart.whereIsSugar();
System.out.println("whereIsSugar is :" + place);

System.out.println("when are the new stocks  aremcoming");
int date = VishalMart.whenDoesStocksAreComing();
System.out.println("whenDoesStocksAreComing is :" + date);

//
VishalMart.whereIsUrsNewMartOpening();
VishalMart.whatIsTheTotalBill();
VishalMart.whatIsTheClosingTime();
}
static int thePriceOfAtta(){
int price = 65;
return price;
}
static String whereIsSugar(){
String place = "in 2nd floor";
return place;
}
static int whenDoesStocksAreComing(){
int date = 21;
return date;
}
// without returnvalue and paramteres
static void whereIsUrsNewMartOpening(){
	System.out.println("its opening near new york");
}
static void whatIsTheTotalBill(){
	System.out.println("the total bill is 2000");
}
static void whatIsTheClosingTime(){
	System.out.println("mid night 12");
}
}