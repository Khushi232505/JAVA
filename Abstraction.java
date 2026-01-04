public class Abstraction {
    public static void main(String[] args) {
        Car car = new BMW();
        car.drive();
        
    }
}

abstract class Car{
    abstract void drive();
    abstract void accelerate();

    void applyBreak(){
        System.out.println("Car stopped");
    }
        // System.out.println("Driving");


    }


class BMW extends Car{
    void drive(){
        System.out.println("BMW driving ");
    }

    void accelerate(){
        System.out.println("Moving Forward..");
    }
}
