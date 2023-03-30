public class P7MultilevelInheritance {
    public static void main(String[] args) {
        Cat persian=new Cat();
        persian.eat();
        persian.breath();
        persian.walk();
        persian.meows();
        persian.color="white";
        System.out.println(persian.color);
    }
}

class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breath(){
        System.out.println("breathes");
    }
}

class Mammal extends Animal{
    String legs;

    void walk(){
        System.out.println("Walks");
    }
}

class Cat extends Mammal{
    String breed;

    void meows(){
        System.out.println("Meows");
    }
}