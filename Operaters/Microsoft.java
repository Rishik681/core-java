class Microsoft{

public static void main(String[] ksd){

int a = 12;
System.out.println(a);
//String result = Microsoft.check(a);
System.out.println(Microsoft.check(a));

}


static String     check(int a){
	System.out.println("Cheching no");
	if(a == 10){
		return  "no is 10";
		
		
	}else{
		 return "no is not 10";
	}
	

	

}

}