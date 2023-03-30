public class P8HierarchicalInheritance {
    public static void main(String[] args) {
        Fish gold=new Fish();
        gold.eat();
        gold.breath();
        gold.swim();

        Kitty snow=new Kitty();
        snow.eat();
        snow.breath();
        snow.meow();

        Bird sparrow=new Bird();
        sparrow.eat();
        sparrow.breath();
        sparrow.fly();
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

class Fish extends Animal{
    void swim(){
        System.out.println("Swims");
    }
}

class Kitty extends Animal{
    void meow(){
        System.out.println("Meows");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("Flys");
    }
}