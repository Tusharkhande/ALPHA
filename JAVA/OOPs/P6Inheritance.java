public class P6Inheritance {
    public static void main(String[] args) {
        Fish f=new Fish();
        f.eat();
        f.breath();
        f.swim();
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
    String fins;

    void swim(){
        System.out.println("swims");
    }

}