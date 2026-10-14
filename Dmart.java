class Dmart{

public static void main(String[] args){

Dmart.name();
Dmart.displayProduct();
Dmart.checkStocks();
Dmart.shirtRate();


System.out.println("what is the price of 1kg rice");
int costOfRice = Dmart.whatsThePriceOfRice();
System.out.println("whatsThePriceOfRice is :" + costOfRice);

System.out.println("i have a discount coupon");
float coupon = Dmart.iHaveDiscountCoupon();
System.out.println("iHaveDiscountCoupon is :" + coupon);

System.out.println(" this is dmart");
boolean dmart = Dmart.thisIsDmart();
System.out.println("thisIsDmart is :" + dmart);

System.out.println(" can i no the bill ");
double bill = Dmart.whatTheTotalBill();
System.out.println("whatTheTotalBill is :" + bill);

}
static void name(){
System.out.println("Dmart");
}
static void displayProduct(){
System.out.println("displaying product");
}
static void checkStocks(){
System.out.println("checking the stocks");
}
static void shirtRate(){
System.out.println("shirt rate is 340");
}
static int whatsThePriceOfRice(){
int price = 234;
return price;
}
static float iHaveDiscountCoupon(){
float coupon = 54.3f;
return coupon;
}
static boolean thisIsDmart(){
boolean dmart = true;
return dmart;
}
static double whatTheTotalBill(){
double bill = 233516;
return bill;
}

}