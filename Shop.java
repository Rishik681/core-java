class Shop {
    public static void main(String[] args) {
        System.out.println("tell me shop name");
        String name = "fresh mart";
        Shop.shopName(name);

			System.out.println("tell me item codes");
			long c1 = 8901234L;
			long c2 = 8905678L;
			Shop.itemCode(c1, c2);

				System.out.println("tell me item prices");
				double p1 = 25.5;
				double p2 = 99.99;
				double p3 = 149.0;
				Shop.itemPrice(p1, p2, p3);

					System.out.println("tell me stock quantities");
					short q1 = 50;
					short q2 = 120;
					short q3 = 75;
					short q4 = 30;
					Shop.stock(q1, q2, q3, q4);
    }

    static void shopName(String name) {
        System.out.println(name);
    }

    static void itemCode(long c1, long c2) {
        System.out.println(c1);
        System.out.println(c2);
    }

    static void itemPrice(double p1, double p2, double p3) {
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }

    static void stock(short q1, short q2, short q3, short q4) {
        System.out.println(q1);
        System.out.println(q2);
        System.out.println(q3);
        System.out.println(q4);
    }
}