class CarShowroom {
 public static void main(String[] args) {

        CarShowroom.enterShowroom();
        CarShowroom.selectCar();
        CarShowroom.testDrive();
        CarShowroom.checkPrice();
        CarShowroom.applyDiscount();
        CarShowroom.bookCar();
        CarShowroom.makePayment();
        CarShowroom.deliverCar();
    }
    static void enterShowroom() {
        System.out.println("Customer entered the showroom");
    }

    static void selectCar() {
        System.out.println("Car is selected");
    }

    static void testDrive() {
        System.out.println("Test drive completed");
    }

    static void checkPrice() {
        System.out.println("Price details checked");
    }

    static void applyDiscount() {
        System.out.println("Discount applied");
    }

    static void bookCar() {
        System.out.println("Car is booked");
    }

    static void makePayment() {
        System.out.println("Payment completed");
    }

    static void deliverCar() {
        System.out.println("Car is delivered");
    }

   
}