class Adapter{

public static void main(String [] args){

Adapter.brand();
Adapter.voltage();
Adapter.IsOnlyUseForLaptop();

System.out.println("is adapter are only use for laptop");
String adapterForMobile = Adapter.itCanBeUseForMobile();
System.out.println("adapter is water proof :" + adapterForMobile);



}

static void brand(){
System.out.println("apple");
}
static void voltage(){
System.out.println("4");
}
static void IsOnlyUseForLaptop(){
System.out.println("yes its only use for laptop");
}

static String  itCanBeUseForMobile(){
	
String  a=	"no adapter can use for both laptop and mobile";
	return a;
}



}