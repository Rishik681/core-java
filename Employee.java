class Employee {
    public static void main(String[] args) {
        System.out.println("tell me employee name");
        String name = "priya";
        Employee.empName(name);

        System.out.println("tell me employee ids");
        long id = 450012L;
        long id1 = 450013L;
        Employee.empId(id, id1);

        System.out.println("tell me salaries");
        double s1 = 45000;
        double s2 = 52000;
        double s3 = 61000;
        Employee.salary(s1, s2, s3);

        System.out.println("tell me working hours");
        short h1 = 8;
        short h2 = 9;
        short h3 = 7;
        short h4 = 6;
        Employee.hours(h1, h2, h3, h4);
    }

    static void empName(String name) {
        System.out.println(name);
    }

    static void empId(long id, long id1) {
        System.out.println(id);
        System.out.println(id1);
    }

    static void salary(double s1, double s2, double s3) {
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }

    static void hours(short h1, short h2, short h3, short h4) {
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
        System.out.println(h4);
    }
}