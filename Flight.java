class Flight {
public static void main(String[] args) {

        Flight.bookTicket();
        Flight.checkIn();
        Flight.selectSeat();
        Flight.boardFlight();
        Flight.takeOff();
        Flight.serveMeal();
        Flight.land();
        Flight.cancelTicket();
    }
    static void bookTicket() {
        System.out.println("Ticket is booked");
    }

    static void checkIn() {
        System.out.println("Check-in completed");
    }

    static void selectSeat() {
        System.out.println("Seat is selected");
    }

    static void boardFlight() {
        System.out.println("Passengers are boarding");
    }

    static void takeOff() {
        System.out.println("Flight has taken off");
    }

    static void serveMeal() {
        System.out.println("Meal is served");
    }

    static void land() {
        System.out.println("Flight has landed");
    }

    static void cancelTicket() {
        System.out.println("Ticket is cancelled");
    }

    
}