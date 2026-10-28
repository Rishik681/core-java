class ATM{

static public void main(String[] args){
long pinCode = 64792073l;
//System.out.println(pinCode);

ATM.checkTheValidPerson(pinCode);
}
static void checkTheValidPerson(long code){
System.out.println(code);
if (code == 74782350){
	System.out.println("this code bvelongs to person 1");
}else if (code == 64792073l){
	System.out.println("this code belongs to person 2");
}else {
	System.out.println("its not match to any person");
}
}
}