class Stodent {
    public static void main(String[] args) {
        System.out.println("tell me student name");
        String name = "arun";
        Stodent.studentName(name);

        System.out.println("tell me roll numbers");
        long roll = 1023456L;
        long roll1 = 1023457L;
        Stodent.rollNumber(roll, roll1);

        System.out.println("tell me marks");
        double m1 = 88.5;
        double m2 = 92.0;
        double m3 = 79.5;
        Stodent.marks(m1, m2, m3);

        System.out.println("tell me age and class");
        short age = 16;
        short std = 10;
		short age1 = 23;
		short std1 = 12;
        Stodent.ageAndClass(age, std,age1,std1);
    }

    static void studentName(String name) {
        System.out.println(name);
    }

    static void rollNumber(long roll, long roll1) {
        System.out.println(roll);
        System.out.println(roll1);
    }

    static void marks(double m1, double m2, double m3) {
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
    }

    static void ageAndClass(short age, short std,short age1,short std1) {
        System.out.println(age);
        System.out.println(std);
		System.out.println(age1);
		System.out.println(std1);
    }
}