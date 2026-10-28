class Passport{

public static void main(String[] args){
String name = "rishik";

Passport.checkTheValidPerson(name);
}
static void checkTheValidPerson(String name){
System.out.println(name);
if (name == "rahul"){
System.out.println("this  name belongs to person4");
}else if (name == "gagana"){
	System.out.println("this name belongs to person2");
}else if (name == "rishik"){
	System.out.println("this name belongs to person1");
}else{
	System.out.println("this name did not match to any person");
}
}

}