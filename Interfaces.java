public class Interfaces{
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        car.stop();
        car.accelerate();

    }
}

interface  Vehicle{
    void start();

    void stop();

    default void accelerate(){
        System.out.println("Moving Forward");
    }
    static void applyBreak(){
        System.out.println("Car Stopped");
    }
}

class Car implements Vehicle{
    @Override
    public void start(){
        System.out.println("Car Started");
    }

    @Override
    public void stop(){
        System.out.println("Car Stopped");
    }
}
