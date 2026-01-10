public class OOPIntro {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("ASUS Vivobook", "Black", 24) ;
        laptop1.move();
        System.out.println(laptop1.color);
        // System.out.println(laptop1.name);
        System.out.println(laptop1.version);
    }
}

class Laptop {
    String name;
    String color;
    int version;

    // Constructor
    Laptop(String laptopName, String laptopColor, int laptopVersion) {
        name = laptopName;
        color = laptopColor;
        version= laptopVersion;
    }

    // Method
    void move() {
        System.out.println(name + " Laptop is working!");
    }
}
