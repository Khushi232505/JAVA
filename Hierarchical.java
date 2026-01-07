public class HierarchicalExample {
    public static void main(String[] args) {
        Car c = new Car();
        c.fuel();   
        c.wheels();

        Bike b = new Bike();
        b.fuel();   
        b.wheels();

        Truck t = new Truck();
        t.fuel();   
        t.wheels();
    }
}


class Vehicle {
    void fuel() {
        System.out.println("Every vehicle needs fuel to run");
    }
}


class Car extends Vehicle {
    void wheels() {
        System.out.println("Car has 4 wheels");
    }
}


class Bike extends Vehicle {
    void wheels() {
        System.out.println("Bike has 2 wheels");
    }
}

class Truck extends Vehicle {
    void wheels() {
        System.out.println("Truck has 6 wheels");}
    }
