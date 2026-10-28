class Vechile{

static public void main(String[] args){
 String typeOfVehicle = "petrol";
 
 Vechile.checkTheVechile(typeOfVehicle);
}
static void checkTheVechile(String type){
	System.out.println(type);
if(type == "desiel"){
System.out.println("it is matching for car ");
}else if (type == "petrol"){
	System.out.println("it is matching for bike");
}else{
	System.out.println("its not matching for any vehcile");
}
}
}