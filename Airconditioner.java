class AirConditioner {

public static void main(String[] args) {

        AirConditioner.turnOn();
        AirConditioner.setTemperature();
        AirConditioner.increaseTemperature();
        AirConditioner.decreaseTemperature();
        AirConditioner.changeMode();
        AirConditioner.adjustFanSpeed();
        AirConditioner.setTimer();
        AirConditioner.turnOff();
    }

    static void turnOn() {
        System.out.println("AC is turned on");
    }

    static void setTemperature() {
        System.out.println("Temperature is set");
    }

    static void increaseTemperature() {
        System.out.println("Temperature increased");
    }

    static void decreaseTemperature() {
        System.out.println("Temperature decreased");
    }

    static void changeMode() {
        System.out.println("AC mode changed");
    }

    static void adjustFanSpeed() {
        System.out.println("Fan speed adjusted");
    }

    static void setTimer() {
        System.out.println("Timer is set");
    }

    static void turnOff() {
        System.out.println("AC is turned off");
    }

    
}