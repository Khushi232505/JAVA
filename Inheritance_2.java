
public class Inheritance2 {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        mobile.makeCall();
    }
}

class Device{
    void powerOn(){
        System.out.println("Powering On...");
    }
    void powerOff(){
        System.out.println("Powering Off..");
    }
}

class Phone extends Device{
    void makeCall(){
        System.out.println("Calling...");
    }
}

class Mobile extends Phone{
    void takePic(){
        System.out.println("Taking Picture...");
    }
}

