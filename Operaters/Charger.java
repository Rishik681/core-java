class Charger{



public static void main(String[] args){
String type = "c pin";
//System.out.println(type);

Charger.checkTheCharger(type);
}
static void checkTheCharger(String type){
System.out.println(type);
if(type == "t pin"){
	System.out.println("pin is matching for chargercable1");
}else if (type == "z type"){
	System.out.println("pin is matching for chargercable2");
}else if (type == "c pin"){
	System.out.println("pin is matching for chargercable3");
}else{
	System.out.println("not matching any chargercable");
}
}
}