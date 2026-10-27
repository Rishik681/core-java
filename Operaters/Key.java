class Key{



	static public void main(String[] h){
	String password = "123@person";
	System.out.println(password);

	Key.checkPassword(password);

	}

	static void checkPassword(String pin){
	//else if ladder

	System.out.println( pin);
	if(pin == "123@123"){
		
		System.out.println("password is matching person 1");
	}else if(pin == "123@Person"){
		System.out.println("password is matching person 2");
	}else if(pin == "123@person"){
		System.out.println("password is matching person 3");
	}else{
		System.out.println("not matching any person");
	}

	}

}
//ai   chat.com-------   marrr