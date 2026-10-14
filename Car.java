class Car {
    public static void main(String[] args) {
        System.out.println("tell me car brand");
        String brand = "toyota";
        Car.carBrand(brand);

			System.out.println("tell me registration numbers");
			long reg = 9876543L;
			long reg1 = 1234567L;
			Car.regNumber(reg, reg1);

				System.out.println("tell me prices");
				double p1 = 850000;
				double p2 = 1250000;
				double p3 = 2100000;
				Car.price(p1, p2, p3);
				
					System.out.println("tell me speeds");
					short sp1 = 60;
					short sp2 = 80;
					short sp3 = 100;
					short sp4 = 120;
					Car.speed(sp1, sp2, sp3, sp4);
    }

    static void carBrand(String brand) {
        System.out.println(brand);
    }

    static void regNumber(long reg, long reg1) {
        System.out.println(reg);
        System.out.println(reg1);
    }

    static void price(double p1, double p2, double p3) {
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }

    static void speed(short sp1, short sp2, short sp3, short sp4) {
        System.out.println(sp1);
        System.out.println(sp2);
        System.out.println(sp3);
        System.out.println(sp4);
    }
}