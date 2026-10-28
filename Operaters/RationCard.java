class RationCard{

public static void main(String[] args){
String rationType = "bpl";

RationCard.checkTheValidPerson(rationType);

}
static void checkTheValidPerson(String card){
System.out.println(card);
if (card == "bpl"){
	System.out.println("this belongs to person1 card");
}else if (card == "apl"){
	System.out.println("this belongs to person2 card");
}else if (card == "cpl"){
	System.out.println("this belongs to person3 card");
}else{
	System.out.println("this does'nt match");
}
}
}