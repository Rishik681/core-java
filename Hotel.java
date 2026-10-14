class Hotel {
public static void main(String[] args) {

        Hotel.checkAvailability();
        Hotel.bookRoom();
        Hotel.checkIn();
        Hotel.orderFood();
        Hotel.requestCleaning();
        Hotel.extendStay();
        Hotel.generateBill();
        Hotel.checkOut();
    }
    static void checkAvailability() {
        System.out.println("Rooms checked");
    }

    static void bookRoom() {
        System.out.println("Room booked");
    }

    static void checkIn() {
        System.out.println("Guest checked in");
    }

    static void orderFood() {
        System.out.println("Food ordered");
    }

    static void requestCleaning() {
        System.out.println("Cleaning requested");
    }

    static void extendStay() {
        System.out.println("Stay extended");
    }

    static void generateBill() {
        System.out.println("Bill generated");
    }

    static void checkOut() {
        System.out.println("Guest checked out");
    }

    
}