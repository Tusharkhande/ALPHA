public class P11MethodOverriding {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("Eats Anything");
    }
}

class Cat extends Animal{
    void eat(){
        super.eat();
        System.out.println("Eats Chapati");
    }
}