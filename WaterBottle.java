class WaterBottle{
static String brand = ("tteu");
static int price = 34;
static float liter = 3.4f;
static boolean bottle = true;

public static void main(String[] args){

String type = ("drinking");
long price = 234321l;
byte capacity = 4;
short length = 3;

System.out.println("brand is :" + WaterBottle.brand);
System.out.println("type is :" + type);
System.out.println("price is :" + WaterBottle.price);
System.out.println("liter is :" + WaterBottle.liter);
System.out.println("capacity is :" +  capacity);
System.out.println("bottle is :" + WaterBottle.bottle);
System.out.println("length is :" + length);


WaterBottle.bottleIsNotThere();
waterBootleType();
brokenBottle();
itIsDamaged();

}


static void bottleIsNotThere(){
System.out.println(" bottle is there ");	
	
}
 
static void waterBootleType(){
System.out.println("stell");
}

static void brokenBottle(){
System.out.println("no is it not broken");
}

static void itIsDamaged(){
System.out.println("yes");
}




}





// 20 class u need to call 8 static methods in each and need to call those methods 