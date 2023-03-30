public class P9HybridInheritance {
    public static void main(String[] args) {
        PersianCat p=new PersianCat();
        p.eat();
        p.breath();
        p.meow();
        p.purr();

        Shark s=new Shark();
        s.eat();
        s.breath();
        s.swim();
        s.carni();
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

class Shark extends Fish{
    void carni(){
        System.out.println("Carnivore");
    }
}
//2nd derived class 
class Kitty extends Animal{
    void meow(){
        System.out.println("Meows");
    }
}

class PersianCat extends Kitty{
    void purr(){
        System.out.println("Loves Purring");
    }
}