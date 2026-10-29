class ATM{

static public void main(String[] args){
long pinCode = 64792073l;
//System.out.println(pinCode);
long code = 657321l;
System.out.println(ATM.checkTheValidPerson(pinCode));
}
static String checkTheValidPerson(long code){
System.out.println(code);
if (code == 74782350){
	return "dhiuhi ";
}else if (code == 64792073l){
	return  "this code belongs to person 2";
}else {
	return "its not match to any person";
}


}
}