// First interface
interface Vehicle {
    void drive();
    void fuel();
}

// Second interface
interface Electric {
    void chargeBattery();
    void showBatteryStatus();
}

// Class implementing both interfaces
class TeslaCar implements Vehicle, Electric {
    private int battery = 100;

    @Override
    public void drive() {
        System.out.println("TeslaCar is driving silently...");
        battery -= 10;
    }

    @Override
    public void fuel() {
        System.out.println("TeslaCar does not use petrol/diesel, it runs on electricity.");
    }

    @Override
    public void chargeBattery() {
        System.out.println("Charging TeslaCar battery...");
        battery = 100;
    }

    @Override
    public void showBatteryStatus() {
        System.out.println("Battery level: " + battery + "%");
    }
}

// Main class
public class MultipleInheritanceTesla {
    public static void main(String[] args) {
        TeslaCar car = new TeslaCar();

        car.drive();
        car.showBatteryStatus();
        car.fuel();
        car.chargeBattery();
        car.showBatteryStatus();
    }
}
