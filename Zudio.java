class Zudio{

public static void main(String[] args){


Zudio.whatIsTheBill();
Zudio.iHaveMyDiscountCoupon();
Zudio.whatTimeDoesShopWillClosed();
// with return values
		System.out.println("where is the mens collection");
		String address = Zudio. whereIsMensCollection();
		System.out.println("whereIsMensCollection is :" + address);

			System.out.println("when are the scoks are coming");
			int date = Zudio.whenTheNewStocksAreComing();
			System.out.println("whenTheNewStocksAreComing is :" + date);

				System.out.println(" can u give my size of pant");
				float size = Zudio.whatIsUrSize();
				System.out.println("whatIsUrSize is :" + size);

}
static void whatIsTheBill(){
System.out.println("the total bill is 2300");
}
static void iHaveMyDiscountCoupon(){
System.out.println(" can tell ur discount cuopon number");
}
static void whatTimeDoesShopWillClosed(){
System.out.println("the shop will closed by  11pm");
}

static String whereIsMensCollection(){
String address = "second floor";
return address;
}

static int whenTheNewStocksAreComing(){
int date = 29;
return date;
}
static float whatIsUrSize(){
float size = 34.5f;
return size;
}
}