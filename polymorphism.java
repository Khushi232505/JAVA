public class polymorphism {
    static void sum(int a, int b){
        System.out.println(a+b);
    }
    
    static void sum(float a, float b){
        System.out.println(a+b);
    }

    static void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        Circle circle = new Circle(6.5f);
        circle.area();
    }
}

class Shape{
    void area(){
        System.out.println("Area ");
    }
}

class Circle extends Shape{
    float r;

    Circle(float r){
        this.r = r;
    
    }
    void area(){
        System.out.println(Math.PI*r*r);
    }

}
