
public class Inheritance1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        
    }
}

class Animal{
    void eat(){
        System.out.println("Animal Eat");
    }
    void sound(){
        System.out.println("Makes Sound");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog Barks");
    }
}

class Puppy extends Dog{
    void weep(){
    System.out.println("Puppy Weeps");
    }
}

class Cat{
    void meow(){
        System.out.println();
    }
}
